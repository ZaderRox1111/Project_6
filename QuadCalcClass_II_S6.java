package p6_package;

public class QuadCalcClass_II_S6
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
      // initialize table characters
      public static final char DASH = '-';
      public static final char DOUBLE_DASH = '=';
      public static final char PIPE = '|';
      public static final char CROSS = '+';
      
      // initialize line controls
      public static final int SOLID = 1001;
      public static final int BROKEN = 2002; 

      // initialize table string components
      public static final String PIPE_SPACE = "| ";
      public static final String SPACE_PIPE = " |";
      public static final String CROSS_SPACE = "+ ";
      
      // initialize table widths
      public static final int PRECISION = 2;
      public static final int TABLE_WIDTH = 44;
      public static final int NAME_BLOCK_WIDTH = 29;
      public static final int VALUE_BLOCK_WIDTH = 12;

      // initialize two endlines constant
      public static final int TWO_ENDLINES = 2;
      
      //Instantiate conIO class
      private static Console_IO_Class conIO = new Console_IO_Class();
      
      public static void main(String[] args)
         {
            // TODO Auto-generated method stub
            
            //declare all variables
             //denom, discrim, coef_A, coef_B, coef_C, discrimSqrt, complexFlag, singleRootFlag, rootOne, rootTwo, complexDisplay
            double denom, discrim, discrimSqrt, coef_A, coef_B, coef_C;
            double rootOne = 0, rootTwo = 0, complexDisplay = 0;
            boolean complexFlag = false, singleRootFlag = false;
            
            //Display a title
             //Method: printTitle
            printTitle("Quadratic Root Finding Program");
            
            //Get the coefficients from the user. Use three times
             //Method: promptForCoef
            coef_A = promptForCoef("Enter Coefficient A: ");
            coef_B = promptForCoef("Enter Coefficient B: ");
            coef_C = promptForCoef("Enter Coefficient C: ");
            
            //Calculate the denominator of the quadratic formula
             //Method: calcDenom
            denom = calcDenom(coef_A);
            
            //Calculate the discriminant
             //Method: calcDiscrim
            discrim = calcDiscrim(coef_A, coef_B, coef_C);
            
            //Determine if the discriminant shows complexity
            //Check if it is a negative number. It is complex if it is negative
             //set complexFlag to true
            if (discrim < 0)
               {
                  complexFlag = true;
               }
            
            //Otherwise determine if the discriminant shows one root
            //Check if the discriminant equals 0. One root if it equals 0
            //Calculate the square root of the discriminant
             //set singleRootFlag to true
             //Calculate the one root
              //Method: calcRoot
            else if (discrim == 0) 
               {
                  singleRootFlag = true;
                  
                  discrimSqrt = Math.sqrt(discrim);
                  
                  rootOne = calcRoot(coef_B, discrimSqrt, denom);
               }
            
            //Otherwise there is two roots
             //Calculate both roots; use calcRoot for both
             //IMPORTANT!!! Input discrimSqrt as negative for the second root
              //Method: calcRoot
            else 
               {
                  discrimSqrt = Math.sqrt(discrim);
                  
                  rootOne = calcRoot(coef_B, discrimSqrt, denom);
                  rootTwo = calcRoot(coef_B, -discrimSqrt, denom);
               }
            
            //Display the table
            //Begin by displaying the title of the table
             //Method: displayTableTitle
            displayTableTitle();
            
            //Next display the sub-titles
             //Method: displaySubTitles
            displaySubTitles();
            
            //Then display the data pieces for the table. There will be three for the three coefficients.
             //Method: displayDataLine
            displayDataLine("Coefficient A", coef_A, DOUBLE_DASH);
            displayDataLine("Coefficient B", coef_B, DASH);
            displayDataLine("Coefficient C", coef_C, DASH);
            
            //Check if there is a complexFlag. If true display a line saying that the roots are complex
             //Method: displayDataLine
            if (complexFlag)
               {
                  displayDataLine("Complex Roots", complexDisplay, DOUBLE_DASH);
               }
            
            //Otherwise check if there is a singleRootFlag. If true display the single root
             //Method: displayDataLine
            else if (singleRootFlag)
               {
                  displayDataLine("Single Root", rootOne, DOUBLE_DASH);
               }
            
            //Otherwise display both roots on separate lines
             //Method: displayDataLine
            else
               {
                  displayDataLine("Root One", rootOne, DOUBLE_DASH);
                  displayDataLine("Root Two", rootTwo, DASH);
               }
            
            //Finally display a single line to end the table
             //Method: displayLine
            displayLine(DOUBLE_DASH, BROKEN);
            
            //End program
             //Method: displayProgramEnd
            displayProgramEnd();

         }
      
      public static void printTitle( String title )
         {
            //Display the title with an underline under it
             //Method: printString, printEndline, printChars, .length()
            conIO.printString(title);
            conIO.printEndline();
            conIO.printChars(title.length(), DOUBLE_DASH);
            conIO.printEndlines(TWO_ENDLINES);
         }
      
      public static double promptForCoef( String prompt ) 
         {
            //Prompt for the coefficient from the user
            //Create coef variable to return at the end
             //Method: promptForDouble
            double coef;
            
            coef = conIO.promptForDouble(prompt);
            
            return coef;
         }
      
      public static double calcDenom( double coef_A )
         {
            //Calculate the denominator and return the result
            //Create result variable
             //2 * a = denominator
            double result;
            
            result = 2 * coef_A;
            
            return result;
         }
      
      public static double calcDiscrim( double coef_A, double coef_B, double coef_C )
         {
            //Calculate the discriminant
            //Create result variable
             //b * b - 4 * a * c = discriminant
            double discrim;
            
            discrim = coef_B * coef_B - 4 * coef_A * coef_C;
            
            return discrim;
         }
      
      public static double calcRoot( double coef_B, double discrimSqrt, double denom ) 
         {
            //Calculate the root
            //IMPORTANT!!! Enter the square root of the discriminant as negative for the second root when applicable
            //Create variable for the numerator and result
             //( -b + discrimSqrt ) / denom
             //numer / denom
            double root, numer;
            
            numer = -coef_B + discrimSqrt;
            root = numer / denom;
            
            return root;
         }
      
      public static void displayLine( char lineChar, int lineType ) 
         {
            //Display a line in a table
            //Check if the line is solid
             //If solid, then display a solid line using the line character in the parameters
            if (lineType == SOLID)
               {
                  conIO.printChar(PIPE);
                  conIO.printChars(TABLE_WIDTH -2, lineChar);
                  conIO.printChar(PIPE);
               }
            
            //Otherwise display a broken line using the line character
              //Method: printChar, printChars, printEndline
            else 
               {
                  conIO.printChar(PIPE);
                  conIO.printChars(NAME_BLOCK_WIDTH, lineChar);
                  conIO.printChar(PIPE);
                  conIO.printChars(VALUE_BLOCK_WIDTH, lineChar);
                  conIO.printChar(PIPE);
               }
         }
      
      public static void displayTableTitle()
         {
            //Display the title of the table, a line above, and a vertical space above the line
             //Method: displayLine, printString, printEndline
            conIO.printEndline();
            displayLine(DOUBLE_DASH, SOLID);
            conIO.printEndline();
            
            conIO.printChar(PIPE);
            conIO.printString("QUADRATIC ROOT RESULTS", TABLE_WIDTH -2, "CENTER");
            conIO.printChar(PIPE);
            conIO.printEndline();
         }
      
      public static void displaySubTitles()
         {
            //Display the sub titles of the table and a line above
             //Method: displayLine, printString, printEndline
            displayLine(DASH, SOLID);
            conIO.printEndline();
            
            conIO.printChar(PIPE);
            conIO.printString("VALUE NAME", NAME_BLOCK_WIDTH, "CENTER");
            conIO.printChar(PIPE);
            conIO.printString("VALUE", VALUE_BLOCK_WIDTH, "CENTER");
            conIO.printChar(PIPE);
            conIO.printEndline();
         }
      
      public static void displayDataLine( String name, double value, char lineChar )
         {
            //Display a line above the data, then display the data that will be in the line, along with the name
             //Method: displayLine, printString, printEndline
            displayLine(lineChar, BROKEN);
            conIO.printEndline();
            
            conIO.printString(PIPE_SPACE);
            conIO.printString(name, NAME_BLOCK_WIDTH -1, "LEFT");
            conIO.printString(CROSS_SPACE);
            conIO.printDouble(value, PRECISION, VALUE_BLOCK_WIDTH -2, "RIGHT");
            conIO.printString(SPACE_PIPE);
            conIO.printEndline();
         }
      
      public static void displayProgramEnd() 
         {
            //Display a message stating that the program has ended
             //Method: printString, printEndlines
            conIO.printEndlines(TWO_ENDLINES);
            conIO.printString("End Program");
         }
      
   }
