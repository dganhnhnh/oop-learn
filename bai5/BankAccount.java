public class BankAccount 
extends Printable
{
    private String owner;
    private double balance;
    public BankAccount(){owner = "no name";}
    public BankAccount(String o, double b){
        owner = o; balance = b;
    }
    @Override
    public String toString(){
        return new String("owner: "+owner+", balance: "+balance);
    }
}
