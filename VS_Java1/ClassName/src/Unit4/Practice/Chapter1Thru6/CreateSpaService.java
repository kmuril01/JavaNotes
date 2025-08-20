package Unit4.Practice.Chapter1Thru6;

import java.util.Scanner;

public class CreateSpaService 
{
    public static void main(String[] args) 
    {
        String service;
        double price;
        
        SpaService firstService = new SpaService();
        SpaService secondService = new SpaService();
        Scanner kb = new Scanner(System.in);

        System.out.print("Enter service >> ");
        service = kb.nextLine();
        System.out.print("Enter price >> ");
        price = kb.nextDouble();

        firstService.setServiceDescription(service);
        firstService.setPrice(price);

        kb.nextLine();
        System.out.print("Enter service >> ");
        service = kb.nextLine();
        System.out.print("Enter price >> ");
        price = kb.nextDouble();
        secondService.setServiceDescription(service);
        secondService.setPrice(price);

        System.out.println("First service detail:");
        System.out.println(firstService.getServiceDescription() + 
        " $" + firstService.getPrice());
        
        System.out.println("Second service detail:");
        System.out.println(secondService.getServiceDescription() +
        " $" + secondService.getPrice());

    }
    
}
