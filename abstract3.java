abstract class payment{
    protected double amount;
    payment(double amount){
        this.amount=amount;
    }
    abstract void pay();
    void receipt(){
        System.out.println("receipt generated");
        System.out.println("amount paid:"+amount);
    }
    void showpaymentstatus(){
        System.out.println("payment sucessfull");
    } 
}
class upipayment extends payment{
    private String upiId;
    upipayment(double amount,String upiId){
        super(amount);
        this.upiId=upiId;
    }  
        void pay(){
            System.out.println("processing UPI payment...");
            System.out.println("UPI ID:"+upiId);
        }
}
    class cardpayment extends payment{
        private String cardNumber;
        cardpayment(double amount,String cardNumber){
            super(amount);
            this.cardNumber=cardNumber;
        }
        
        void pay(){
            System.out.println("processing card payment...");
            System.out.println("card Number:**** **** ****");
        }
    }
    public class Main{
        public static void main(String[]args){
            payment p1=new upipayment(550.50,"kumuthini");
            payment p2=new cardpayment(1250.50,"1239376985");
            p1.pay();
            p1.receipt();
            p1.showpaymentstatus();
            System.out.println();
            p2.pay();
            p2.receipt();
            p2.showpaymentstatus();
        }
    }
