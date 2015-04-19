/**
 * Name: Jou Dan-Haur
 * ID: U10316046
 * Ex: 11.10
 */
import java.util.Scanner;
public class Test {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		
		MyStack MyStack1 = new MyStack();
		
		for(int i = 0; i < 5; i++){
			System.out.print("Please enter a string : ");
			String scanner = input.next();
			MyStack1.push(scanner);
		}
		
		while(!MyStack1.isEmpty()){
			System.out.print(MyStack1.pop()+" ");
		}
	}

}
