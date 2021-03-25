package p6_package;

public class QuadCalcClass_II_S5
   {

      //The overall purpose of this program is to accept coefficients from a user, then calculate and display the quadratic roots using the input.
      
      //Create all variables, constants, and initializations
      //Display a title
      //Receive three inputs from user
      //Calculate the denominator and discriminant
      //Determine root type and calculate the roots based off of this
      //Display the data by using a table
      //End Program
      
      //Create constants
      
      //Instantiate conIO class
      
      public static void main(String[] args)
         {
            // TODO Auto-generated method stub
            
            //declare all variables
             //denom, discrim, coef_A, coef_B, coef_C, discrimSqrt, complexFlag, singleRootFlag, rootOne, rootTwo, complexDisplay
            
            //Display a title
             //Method: printTitle
            
            //Get the coefficients from the user. Use three times
             //Method: promptForCoef
            
            //Calculate the denominator of the quadratic formula
             //Method: calcDenom
            
            //Calculate the discriminant
             //Method: calcDiscrim
            
            //Determine if the discriminant shows complexity
            //Check if it is a negative number. It is complex if it is negative
             //set complexFlag to true
            
            //Otherwise determine if the discriminant shows one root
            //Check if the discriminant equals 0. One root if it equals 0
            //Calculate the square root of the discriminant
             //set singleRootFlag to true
             //Calculate the one root
              //Method: calcRoot
            
            //Otherwise there is two roots
             //Calculate both roots; use calcRoot for both
             //IMPORTANT!!! Input discrimSqrt as negative for the second root
              //Method: calcRoot
            
            //Display the table
            //Begin by displaying the title of the table
             //Method: displayTableTitle
            //Next display the sub-titles
             //Method: displaySubTitles
            //Then display the data pieces for the table. There will be three for the three coefficients.
             //Method: displayDataLine
            
            //Check if there is a complexFlag. If true display a line saying that the roots are complex
             //Method: displayDataLine
            //Otherwise check if there is a singleRootFlag. If true display the single root
             //Method: displayDataLine
            //Otherwise display both roots on separate lines
             //Method: displayDataLine
            //Finally display a single line to end the table
             //Method: displayLine
            
            //End program
             //Method: displayProgramEnd

         }
      
      public static void printTitle( String title )
         {
            //Display the title with an underline under it
             //Method: printString, printEndline, printChars, .length()
         }
      
      public static double promptForCoeff( String prompt ) 
         {
            //Prompt for the coefficient from the user
             //Method: promptForDouble
            
            //return result
            //return put here to fix error
            return 0;
         }
      
      public static double calcDenom( double coef_A )
         {
            //Calculate the denominator and return the result
            //Create result variable
             //2 * a = denominator
            
            //return result
            //return put here to fix error
            return 0;
         }
      
      public static double calcDiscrim( double coef_A, double coef_B, double coef_C )
         {
            //Calculate the discriminant
            //Create result variable
             //b * b - 4 * a * c = discriminant
            
            //return result
            //return put here to fix error
            return 0;
         }
      
      public static double calcRoot( double coef_B, double discrimSqrt, double denom ) 
         {
            //Calculate the root
            //IMPORTANT!!! Enter the square root of the discriminant as negative for the second root when applicable
            //Create variable for the numerator and result
             //( -b + discrimSqrt ) / denom
             //numer / denom
            
            //return result
            //return put here to fix error
            return 0;
         }
      
      public static void displayLine( char lineChar, int lineType ) 
         {
            //Display a line in a table
            //Check if the line is solid
             //If solid, then display a solid line using the line character in the parameters
            //Otherwise display a broken line using the line character
              //Method: printChar, printChars, printEndline
         }
      
      public static void displayTableTitle()
         {
            //Display the title of the table, a line above, and a vertical space above the line
             //Method: displayLine, printString, printEndline
         }
      
      public static void displaySubTitles()
         {
            //Display the sub titles of the table and a line above
             //Method: displayLine, printString, printEndline
         }
      
      public static void displayDataLine( String name, double value, char lineChar )
         {
            //Display a line above the data, then display the data that will be in the line, along with the name
             //Method: displayLine, printString, printEndline
         }
      
      public static void displayProgramEnd() 
         {
            //Display a message stating that the program has ended
             //Method: printString, printEndline, printEndlines
         }
      
   }
