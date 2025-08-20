package Unit4.Practice.Chapter1Thru6;

import java.util.Scanner;

public class CreateSpaService2 
{
    public static void main(String[] args) 
    {
        
        SpaService firstService = new SpaService();
        SpaService secondService = new SpaService();
        SpaService thirdService = new SpaService("facial", 22.99); //this will use the overloaded constructor

        firstService = getData(firstService);
       // secondService = getData(secondService); This was commented out because of the Constructor recieved in SpaService.java

        System.out.println("First service detail:"); //uses detaul from the interactive input
        System.out.println(firstService.getServiceDescription() + 
        " $" + firstService.getPrice());
        
        System.out.println("Second service detail:"); //used from the default constructor
        System.out.println(secondService.getServiceDescription() +
        " $" + secondService.getPrice());

        System.out.println("Third service details"); //used the assigned arguments from the two parameter construtor
        System.out.println(thirdService.getServiceDescription() + 
        " $" + thirdService.getPrice());


    }

    public static SpaService getData(SpaService service)
    {
        String serviceDescription;
        double price;
        Scanner kb = new Scanner(System.in);

        System.out.print("Enter service >> ");
        serviceDescription = kb.nextLine();
        System.out.print("Enter price >> ");
        price = kb.nextDouble();
        kb.nextLine();

        service.setServiceDescription(serviceDescription);
        service.setPrice(price);
        return service;
    }
    
}
