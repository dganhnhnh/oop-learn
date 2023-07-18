public class BankAccount 
extends Printable
{
    private String owner;
    private double balance;
    public BankAccount(){owner = "no name";}
    public BankAccount(String owner, double balance){
        this.owner=owner;
        this.balance = balance;
    }
    @Override
    public String toString(){
        return new String("owner: "+owner+", balance: "+balance);
    }
}
