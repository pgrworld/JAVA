package pentakota;
class Account
{
String accno;
String accName;
String accType;
int bal = 1000;
Account(String accNo,String accName,String accType)
{
	this.accno=accNo;
	this.accName=accName;
	this.accType=accType;
}
}

class Transcation
{
String tx_id;
String tx_Type;
Transcation(String tx_id,String tx_Type)
{
	this.tx_id = tx_id;
	this.tx_Type = tx_Type;
}

public void deposit(Account acc, int dep_Amt)
{
	int initial_Amt=acc.bal;
	int total_Avl_Amt = initial_Amt+dep_Amt;  
	acc.bal = total_Avl_Amt;
	System.out.println("Transaction Details");
	System.out.println("...........");
}
}

class Test{
	public static void main(String[] args){
		Account acc = new Account("abc123","Durga","software");
		Transcation tx = new Transcation("T-111","Deposit");
		tx.deposit(acc,5000);
		
	}
}








