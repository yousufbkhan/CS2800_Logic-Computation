package conversionCode;

import java.io.File;

/**
 * Class that extends {@code dimacsCNFConverter} such that the code formats the final expression
 * into its Racket equivalent.
 */
public class ACL2sConverter extends dimacsCNFConverter {

  /**
   * Class constructor that accepts a source and destination file and initializes all of the
   * class's fields by calling the super class.
   * @param source File that contains the initial Dimacs CNF expression that is to be converted
   * @param destination File to which the converted expression with be written to
   * @throws IllegalArgumentException if either of the given files do not exist/cannot be found
   */
  public ACL2sConverter(File source, File destination)
      throws IllegalArgumentException {
    super(source, destination);
  }

}
