package Unit9.HonorsExercise;

public class IncomingPhoneCall extends PhoneCall {


    public IncomingPhoneCall(String phoneNumber) {
        super(phoneNumber);
        this.price = 0.02;  // Fixed price for incoming call
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public double getPrice() {
        return price;
    }

    public void displayCallInfo() {
        System.out.println("Incoming phone call " + phoneNumber + " at $0.02 per call. Total is $" + price);
    }
}


