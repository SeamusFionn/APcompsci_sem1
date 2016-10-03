import java.util.Scanner;
public class NotesDiagram {
	static int num, second;
	public static void main(String[]args) {
		//take input
		Scanner kb = new Scanner(System.in);
		System.out.println("Enter your number: ");
		num = kb.nextInt();
		System.out.println("enter your second number: ");
		second = kb.nextInt();
		//call methods
		multiply();
		print();
	}
	public static int multiply(){
		return num*second;
	}
	public static void print(){
		System.out.println(num + " * " + second + " = " + multiply());
	}
}