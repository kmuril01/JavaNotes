package Unit9.HonorsExercise;

public class OutgoingPhoneCall extends PhoneCall {
    private int time; 


    public OutgoingPhoneCall(String phoneNumber, int time) {
        super(phoneNumber);
        this.time = time;
        this.price = 0.04 * time;  
    }


    public String getPhoneNumber() {
        return phoneNumber;
    }

    public double getPrice() {
        return price;
    }

    public void displayCallInfo() {
        System.out.println("Outgoing phone call " + phoneNumber + " at $0.04 per minute for " + time + " minutes. Total is $" + price);
    }
}
