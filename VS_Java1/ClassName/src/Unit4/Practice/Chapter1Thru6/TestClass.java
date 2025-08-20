package Unit4.Practice.Chapter1Thru6;

/*
 * The figure also shows a TestClass that instantiates a MyClass object. 
 * The TestClass contains eight method calls.
 *
 * -The three valid calls are all to public methods. The call to the nonstatic
 *  method uses an object, and the two calls to the static method can use an object or not.
 *
 * -The five method calls after the comment in the TestClass class are all invalid. 
 *  Private methods cannot be called from outside the class, and nonstatic methods require an object
 *  public class MyClass 
 * 
 * {
 *   public static pubStatMethod();
 *   private static privStatMethod();
 *   public pubNonstatMethod();
 *   private privNonstatMethod();
 *   
 * } 
 *
 */
public class TestClass
{
    
    MyClass = new MyClass ();

    object.pubNonstatMethod(); //The public nonstatic method can be used from TestClass with a MyClass object

    object.pubStatMethod(); //The public static method can be used from TestClass with or without an object

    MyClass.pubStatMethod(); //The public static method can be used from TestClass with or without an object

    //None of the following work

    MyClass.privStatMethod(); //Test Class doesn't have access to the private method

    MyClass.pubNonstatMethod(); //The nonstatic method must be used with a MyClass obejct

    object.privStatMethod(); //An object can use a static or nonstatic method, but these methods are pricae and cannot be used here

    object.privNonstatMethod();//An object can use a static or nonstatic method, but these methods are pricae and cannot be used here

    MyClass.privNonstatMethod(); // This is wrong on two counts-the method is nonstatic, so it needs an object, and in any event, the method is private
}
