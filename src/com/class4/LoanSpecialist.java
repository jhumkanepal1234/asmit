/* you are a loan specialist and you need to ask user what is the amount of loan is needed.
 * If loan is less than 200,000 then you would lend the money otherwise you would reject the client.
 */

package com.class4;
import java.util.Scanner;
public class LoanSpecialist {

	public static void main(String[] args) {
	Double loan;
	
	Scanner input= new Scanner(System.in);
			System.out.println("Please enter the loan amount");
	loan = input.nextDouble();

    if (loan<200000) {
        System.out.println("Lend the money");
    }else {
        System.out.println("Do not lend the money");
	
    }
	}

}
