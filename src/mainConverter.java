package conversionCode;

import java.io.File;

/**
 * Main class that allows a user to specify the desired files to read/write to create the converted
 * Dimacs expression into the desired language. Can read arguments from the command line to specify
 * the file destinations.
 */
public class mainConverter {

  /**
   * Forward-facing public method that allows the user to specify path names from the command line.
   * @param args Strings containing the path name for the desired files to be read from. The first
   *             String should be the path name for the source file, the second string should be
   *             the String containing the path name for the ACL2s destination file, and the third
   *             String containing the path name for the Racket destination file
   */
  public static void main(String[] args) {
    File source = new File(args[0]);
    File destination = new File(args[1]);
    File destination2 = new File(args[2]);
    dimacsCNFConverter toACL2s = new ACL2sConverter(source, destination);
    dimacsCNFConverter toRacket = new RacketConverter(source, destination2);
    toACL2s.getCNF();
    toRacket.getCNF();
  }
}
