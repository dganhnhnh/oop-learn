public class Test{
    public static void main(String args[]){
        BankAccount acc1 = new BankAccount();
        BankAccount acc2 = new BankAccount("Hana", 100);
        System.out.println(acc1.toString());
        System.out.println(acc2.printProperties());
    } 
}
