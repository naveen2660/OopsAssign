package oops;
public class BankAcc {                                   
	public static void main(String[] args) {
		
		bankAccount s1= new SavingsAcc(111,"Naveen",10000);
		bankAccount c1= new CurrentAcc(112,"Sai",25000);
		System.out.println("balance of s1 = : " + s1.getBalance());
		System.out.println("balance of c1 = : " + c1.getBalance());
		System.out.println("total cash in the bank = : " +(s1.getBalance()+c1.getBalance()));
		
	}
}

class bankAccount{                         
    int accNo;
    String holderName;
    String AccType;
    private double balance;

     public void bankAccount(){                            
        accNo=0;
        holderName="user";
        AccType="nil";
        balance=0;
    }
    public bankAccount(int accNo,String holderName,double balance){         
         this.accNo=accNo;
         this.holderName=holderName;
         this.AccType="AccType";
         this.balance=balance;
    }

    public double getBalance() {                    
        return balance;
    }
}

class SavingsAcc extends bankAccount{                   

    double fixedDeposit;

    public SavingsAcc(int accNo, String holderName, double balance) {
        super(accNo, holderName, balance);
        this.AccType="Savings";
        fixedDeposit=20000;
    }

    @Override
    public double getBalance() {                        
        return (super.getBalance()+fixedDeposit);
    }
}
class CurrentAcc extends bankAccount{                       
    double cashCredit;

    public CurrentAcc(int accNo, String holderName, double balance) {
        super(accNo, holderName, balance);
        this.AccType="Current";
        if (balance>10000)
            cashCredit=(.10*balance);
        else
            cashCredit=(.5*balance);
    }

    @Override
    public double getBalance() {
        return (super.getBalance()+cashCredit);
    }
}
