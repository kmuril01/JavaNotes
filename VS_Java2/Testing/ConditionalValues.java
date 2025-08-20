package GeMetrixTesting;

public class ConditionalValues {

    int d = 1;
    // insert conditional values here
    while(d<=31)
    {
        if (d == 15) {
            d++;
            break;
        } else {
            System.out.println(d);
            d++;
        }
    }

}
