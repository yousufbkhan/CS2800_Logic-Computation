package conversionCode;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
import java.util.Scanner;

/**
 * Abstract class that takes a file that contains an expression formatted in CNF Dimacs and
 * then creates the equivalent expression in the desired coding language. Meant to be extended
 * by other classes to create that languages equivalent expression.
 */
abstract public class dimacsCNFConverter {

  private final PrintWriter outputFile;
  private final File inputFile;
  private final StringBuilder outputBuilder;
  private String outputString;
  protected String startingExpression;
  protected String endingParenthesis;
  protected final HashMap<String, String> varsMap;

  /**
   * Default abstract class constructor that accepts a source and destination file and initializes
   * all of the class's fields.
   * @param source File that contains the initial Dimacs CNF expression that is to be converted
   * @param destination File to which the converted expression with be written to
   * @throws IllegalArgumentException if either of the given files do not exist/cannot be found
   */
  public dimacsCNFConverter(File source, File destination) throws IllegalArgumentException {
    this.outputBuilder = new StringBuilder();
    this.varsMap = new HashMap<>();
    this.outputString = "";
    this.startingExpression = "(thm (implies (and";
    this.endingParenthesis = ")))";
    try {
      this.outputFile = new PrintWriter(Objects.requireNonNull(destination));
      this.inputFile = Objects.requireNonNull(source);
    } catch (FileNotFoundException e) {
      throw new IllegalArgumentException("Improper file name.");
    }
  }

  /**
   * Function that is called to generate the converted expression in the desired language.
   * Functions by looping through each line within the source file and adding the converted line to
   * the final output string at each iteration of the loop. Then calls {@code this.finalizeOutput}
   * to finalize the output string and writes the final string to the output file.
   */
  public void getCNF() {
    try {
      Scanner scan = new Scanner(this.inputFile);
      while (scan.hasNext()) {
        String line = scan.nextLine();
        if (!line.startsWith("c") && !line.startsWith("p")) {
          this.addNewClause(line);
        }
      }
    } catch (FileNotFoundException e) {
      throw new IllegalArgumentException("Improper file name.");
    }

    this.outputBuilder.append(this.endingParenthesis);

    this.outputString = this.outputBuilder.toString();
    this.finalizeOutput();

    this.outputFile.print(this.outputString);
    this.outputFile.close();
  }

  /**
   * Helper functions that finalizes the String output with any extra portions that need to exist
   * to have the expression work within the desired coding language. The default function adds the
   * necessary boolp expressions such that the expressions is formatted for ACL2s;
   */
  protected void finalizeOutput() {
    StringBuilder boolp = new StringBuilder("(implies (and ");

    for (Map.Entry<String, String> mapElement : this.varsMap.entrySet()) {
      boolp.append("\n(boolp ").append(mapElement.getValue()).append(")");
    }
    boolp.append(")\n");
    this.outputString = this.outputString.replace("(implies ", boolp.toString());
  }

  /**
   * Helper function that evaluates a line from the Dimacs expression and converts it into a String
   * containing the variables combined by an OR statement and appends it to the overarching AND
   * statement that contains all of the OR's.
   * @param line String containing the clause for the current line of the Dimacs expression
   */
  private void addNewClause(String line) {
    Scanner scan = new Scanner(line);
    if (this.outputBuilder.length() == 0) {
      this.outputBuilder.append(this.startingExpression);
    }
    this.outputBuilder.append("(or");
    while (scan.hasNext()) {
      String var = scan.next();
      if (var.equals("0")) {
        this.outputBuilder.append(")");
        break;
      } else if (var.contains("-")) {
        this.checkVariable(var.substring(1));
        this.outputBuilder.append(" (not ").append(this.varsMap.get(var.substring(1))).append(")");
      } else {
        this.checkVariable(var);
        this.outputBuilder.append(" ").append(this.varsMap.get(var));
      }
    }
    this.outputBuilder.append("\n");
  }

  /**
   * Helper function that checks to see if a given variable is already accounted for by the code
   * and if it isn't, then add that variable to the variable Map.
   * @param var String containing the variable that needs to be checked against/added to the Map
   */
  protected void checkVariable(String var) {
    if (!this.varsMap.containsKey(var)) {
      this.varsMap.put(var, "'" + var);
    }
  }
}