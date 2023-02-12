package HW2;

public class Checking extends Account {
    private double overDraftLimit;

    public Checking(){
        super();
    }

    public Checking(int id,double balance){
        super(id,balance);
    }

    public void setOverDraftLimit(double overDraftLimit) {
        this.overDraftLimit = overDraftLimit;
    }


    @Override
    public void withdraw(double withdrawAmount) {
        if(getBalance() >= withdrawAmount){
            setBalance(getBalance()-withdrawAmount);
        } else if (overDraftLimit+getBalance() >= withdrawAmount) {
            setBalance(0);
            overDraftLimit +=getBalance();
            overDraftLimit -=withdrawAmount;
        } else{
            System.out.println("You have exceed your balance and your overdraft limit");
            System.out.println("Your Remaining Balance is : " + getBalance() + "$ and your OverDraft Limit Remaining is : "+overDraftLimit + "$");
        }

    }

    @Override
    public String toString() {
        return super.toString()+"Over Draft Limit :"+
                overDraftLimit+"\n";
    }
}
