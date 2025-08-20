package Unit12.Codeit;

import java.util.*;
public class IndirectRecursionDemo {

    public static void main(String[] args) {
        Scanner kb = new Scanner(System.in);
        int num;
        System.out.print("Enter an integar >>");
        num = kb.nextInt();
        method1(num);
    }

    public static void method1(int num)
    {
        if(num > 0)
        {
            System.out.print(num + " ");
            method2(num - 1);
        }
    }
    public static void method2(int num)
    {
        if(num > 0)
        {
            System.out.print(num + " ");
            method1(num - 1);
        }

    }
}
