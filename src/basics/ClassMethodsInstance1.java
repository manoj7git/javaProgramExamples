package basics;

public class ClassMethodsInstance1 {
	private int acNumber;
	public void SetAccountNum(int number){
		acNumber = number;
	}
	public int GetAccountNum(){
		return acNumber;
	}
	
	
	public void displayAccNum(){
		System.out.printf("Account Number entered is: " +GetAccountNum());
	}

}
