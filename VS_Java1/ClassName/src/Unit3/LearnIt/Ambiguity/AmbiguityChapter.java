package Unit3.LearnIt.Ambiguity;

/* You can risk creating ambigious situation if you overload methods
 * One example is is shown below
 * 
 * public static void computeBalance(double deposit)
 * public static void computeBalace(double withdrawal)
 * 
 * a program will not complie and if it did the program
 * will not know which method to use.
 * 
 * The following is more apporiate because the methods have different
 * types in their pararmeter list. However the two version could coexist if no
 * ambigous calls were ever made.
 * 
 * First verions: public static void caclculateInterest(int bal, double rate)
 * Second version: public static void caclculateInterest(double bal, int rate)
 * 
 * An overloaded method with different parameter list is not ambiguous on its own.
 * It only becomes that is you make an ambiguous method call.
 * 
 * You can overload correctly by providing differenbt parameter list for methods
 * with the same name. Methods with indentical names that have identical parameter
 * lists but different return types are not overload - they are illegal.
 * Example:
 * int aMethod(int x)
 * void aMethod(int x)   
 * 
 * 
 * 1. Don’t place a semicolon at the end of a method header. After you get used
 * to putting semicolons at the end of every statement, it’s easy to start putting
 * them in too many places. Method headers never end in a semicolon.
 *
 * 2. Don’t try to use a variable that is out of scope.
 *
 * 3. Don’t assume that a constant is still a constant when passed to a method’s 
 * parameter. If you want a parameter to be constant within a method, you must use 
 * final in the parameter list.
 * 
 * 4. Don’t try to overload methods by giving them different return types. If 
 * their identifiers and parameter lists are the same, then two methods are 
 * ambiguous no matter what their return types are.
 * 
 * Question Answer: 
 * When it is part of the same program as 
 * void myMethod(int age, String name), the following method would be ambiguous:
 * void myMethod(String name, int age)
 * A method that accepts an int parameter followed by a String is not 
 * ambiguous with a method that accepts the parameters in the reverse order.
 */

public class AmbiguityChapter
{
    public static void main(String[] args) 
    {

        System.out.println("Question Answer:");
        System.out.println("When it is part of the same program as");
        System.out.println("void myMethod(int age, String name), the following method would be ambiguous");
        System.out.println("void myMethod(String name, int age)");
        System.out.println("A method that accepts an int parameter followed by a String is not");
        System.out.println("ambiguous with a method that accepts the parameters in the reverse order.");
    }    
    
}