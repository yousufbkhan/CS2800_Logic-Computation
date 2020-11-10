package conversionCode;

import java.io.File;

/**
 * Class that extends {@code dimacsCNFConverter} such that the code formats the final expression
 * into its Racket equivalent.
 */
public class RacketConverter extends dimacsCNFConverter {

  /**
   * Default abstract class constructor that accepts a source and destination file and initializes
   * all of the class's fields by calling the super class and changing any necessary fields to
   * format to Racket.
   * @param source File that contains the initial Dimacs CNF expression that is to be converted
   * @param destination File to which the converted expression with be written to
   * @throws IllegalArgumentException if either of the given files do not exist/cannot be found
   */
  public RacketConverter(File source, File destination)
      throws IllegalArgumentException {
    super(source, destination);
    this.startingExpression = "(solve '(and ";
    this.endingParenthesis = "))";
  }

  /**
   * Overriding finalizeOutput() as the Racket equivalent expression does not need any appended
   * expressions. Therefore, the function is overwritten and left blank as it is a void function.
   */
  @Override
  protected void finalizeOutput() {

  }

  /**
   * Overriding checkVariable() as the Racket equivalent expression needs the variables to be
   * formatted as part of some String for the language to recognize it as such.
   * @param var String containing the variable that needs to be checked against/added to the Map
   */
  @Override
  protected void checkVariable(String var) {
    if (!this.varsMap.containsKey(var)) {
      this.varsMap.put(var, "var" + var);
    }
  }
}
