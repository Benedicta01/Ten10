import java.util.Scanner;

public class main {

public static void main(String[] args) {

Scanner scn = new Scanner(System.in);

System.out.print("Enter a number: ");

int n = scn.nextInt();

int sum = 0;

for (int i = 1; i <= n; i++) {

sum += i;

}

System.out.println("Sum till " + n + " is " + sum + ".");

scn.close(); // Always good to close scanner

}

}
