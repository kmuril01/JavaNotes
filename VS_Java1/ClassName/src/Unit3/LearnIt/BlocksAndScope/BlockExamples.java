package Unit3.LearnIt.BlocksAndScope;

public class BlockExamples 
{
public static void main(String[] args) 
//Outer block starts with an opening brace
    {
    int aNumber = 10; //aNumber is declared in the main (comes in to existence)
    System.out.println("In main(), aNumber is " + aNumber ); //aNumber retains value of 10
    firstMethod();
    System.out.println("Back in main(), aNumber is " + aNumber);//aNumber retains value of 10
    secondMethod(aNumber);
    System.out.println("Back in main() again, a number is " + aNumber);//aNumber retains value of 10
    methodWithNestedBlocks();
    twoDeclarations();

    }  
public static void firstMethod()
    {
    int aNumber = 77; 
    System.out.println("In firstMethod(), aNumber is " + aNumber);
    }
 public static void secondMethod(int aNumber)//aNumber also reside at a different memory address from the one in main (declared locally)
    {
    System.out.println("In secondMethod(), at first " + "aNumber is " + aNumber);
    aNumber = 862;
    System.out.println("In secondMethod(), after an assignment " + 
    "aNumber is " + aNumber);
    }
 public static void methodWithNestedBlocks()
    { //this is the start of an outer block
    int aNumber = 10; //aNumber comes in to existence
    System.out.println("In outer block, aNumber is "+ aNumber);
        { //inner block starts
            int anotherNumber = 512; //anoterNumber comes into existence
            System.out.println("In inner block, aNumber is " + aNumber + " and another number is " + anotherNumber);
        } //inner block ends
        System.out.println("In other block, aNumber is " + aNumber);
    } //outer block ends and aNumber ceases to exist; it goes out of scope

//You can decalre a variable with the same name multiple time as long as each declaration is in it's own nonoverlapping block.
 public static void twoDeclarations()
 {
    {
        int someVar = 7; //this variable will go out of scope in the next closing
        System.out.println("This is the first declare of someVar "+ someVar);
    }
    { //Don't declare blocks for no reason. A new block starts here only to demo scope
    /*It recommended to not declare variables with the same name 
     *in the same method even though it is legal */
        int someVar = 845; //this variable is totally different from the one previous block even though their identifers are the same
        System.out.println("This is the second declare of someVar " + someVar);
    }
 }

   
    /* The following is illegal */
    /* Question Answer: You cannot declare two variables with the same name within a block. */

    /* invalid redeclaration
     * public static void invalidRedeclarationMethod()
     * {
     *    int aValue = 35;
     *    int aValue = 44; // invalid redeclare becuase it is in the same block and the first declare
     *    {
     *       int anotherValue = 0;
     *       int aValue = 10; //invlalid redeclare even though it is in a new block because it still inside the first block.
     *   }
     * }
    */
    
    /* Invalid Statement
    
    * public static void methodWithInvalidStatments()
    * { //Outer block
    *    anumber = 75; //illegal statement; this variable has not been declared yet
    *    int aNumber = 22;
    *    aNumber = 6;
    *    anotherNumber = 489; //illegal statement; this variable has been declared yet
    *    { inner block
    *        anotherNumber = 165; //illegal statement; this variable has been declared yet
    *        int anoterNumber = 99;
    *        anoterNumber = 2;
    *    } //end of inner
    *    aNumber = 50;
    *    anotherNumber =34;//illegal statement; this variable was declared in the inner block and has gone out of scope
    * } // end of inner
    * aNumber = 29; //illegal statement; this variable has gone out of scope
    */
}