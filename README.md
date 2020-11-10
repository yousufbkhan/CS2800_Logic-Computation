# CS2800_Midterm_Project
Source code to convert a Dimacs CNF Expression into its ACL2s and Racket equivalent.

This is the CS2800: Logic & Computation Midterm Project for:
  Nan Chen, Yousuf Khan, Kelli Therrien, Marc Vanni
  
----------------------------------------------------------------------------------------------------------------------------------------------------------------------------------
# TestResultPDF

This folders contains three PDFs. Each PDF follows the format of "<Language> Test Results.pdf"
Each PDF contains all of the screenshots for that SAT Solver's test results.

----------------------------------------------------------------------------------------------------------------------------------------------------------------------------------
# src

This folder contains the main source code and all of the I/O Test Factors that were used to validate each of the SAT Solvers.
Within this folder, there is: 
  - InputFiles: contains the original CNF expressions, or Test Factors, that are the input files for code to in turn convert
  - OutputFile: contains the converted CNF expressions for ACL2s and Racket; they are named to signify which language it is for
  - conversionCode: contains the actual source code that can be used to convert more CNF expressions
  - test-factor-Racket.zip: .zip file containing all the converted expressions for Racket
  - test-factors-in-lisp.zip: .zip file containing all the converted expressions for ACL2s
See the end of this README for explanation on how to run the code

----------------------------------------------------------------------------------------------------------------------------------------------------------------------------------
# test

This folder contains the testing files used to validate the code.
Within this folder, there is:
  - ACL2sConverterTest.java: used to validate the ACL2sConverter.java class
  - RacketConverterTest.java: used to validate the RacketConverter.java class
  - testingFileOutputACL2s.lisp: used to validate the ACL2sConverter.java by comparing the class's output to this file's contents
  - testingFileOutputRacket.lisp: used to validate the RacketConverter.java by comparing the class's output to this file's contents
  
----------------------------------------------------------------------------------------------------------------------------------------------------------------------------------

The code functions by taking in three file paths through the command line. The first path name is the source file containing the CNF expression that needs to be converted. The second path name is the destination file for the converted ACL2s expression to be written to. And the third path name is the destination file for the converted Racket expression to be written to.
