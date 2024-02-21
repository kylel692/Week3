package com.promineotech;
import java.util.*;
public class ClassWeek2 {
	
	public static void main(String[] args) {
	//
	// BOOLEANS and CONDITIONALS:
	//
	
	// 1. Variable Declaration:
	//		a. Create a variable named age and assign it a value of 14
	Scanner userData= new Scanner(System.in);
	int age = 17;
	boolean hasLicense = false;
	// 2. Print a Boolean Expression:
	//		a. Print the boolean expression age >= 16 to the console and note the results.
	//		a. Change the value of age to 18 and print again.

	
	// 3. Can you drive?
	//		a. Using a conditional, print one of the following:
	//				i. "You can drive" if age is greater than or equal to 16
	//				ii. "You cannot drive" otherwise
	//
	//		a. Change the value of age and rerun to see the result
	if (hasLicense == true && age >= 16) {
		System.out.println("You can drive!!");
	} else {
		System.out.println("You cannot drive");
	}

	
	// 4. Update Solution to Question 3 as follows:
	//		a. Add a new variable called hasLicense before the conditional.
	//		b. Change the boolean expression in the conditional to additionally 
	//				include the need for hasLicense to be true.
	//		c. Try changing the values of age and hasLicense and note the different results.

	
	
	// 5. Milk?
	//		a. Create two new variables - costOfMilk and thirstLevel
	//		b. Create a new conditional that prints "Milk Please" if costOfMilk is less than 2.50 
	//				or if thirstLevel is greater than 6 and prints "No Thanks" otherwise.
	//		c. Change the values and note the different results.
	double costOfMilk = 12.00;
    int thirstLevel = 9;
	if((thirstLevel >= 3) && costOfMilk <= 2.50 || thirstLevel >= 6) {
		System.out.println("Milk Please");
	} else {
		System.out.println("No Thanks");
	}

	
	// 6. Cookie Distribution: 
	//			Note:  You will evenly distribute all of the cookies to the children 
	//					and as the adult you get to keep the remaining cookies for yourself.
	//
	//		a. Create two variables called numberOfCookies and numberOfChildren.
	//		b. Initialize the two variables to integer values.
	//		b. Use a conditional to print the following based on the following conditions:
	//				i. If there are 0 cookies remaining, print "Sad Face"
	//				ii. If there are less than 2 cookies, print "Yes!"
	//				iii. If there are less than 5 cookies, print "Whoohoooo!"
	//				iv. If there are 5 or more cookies, print "Jackpot!"
	int numberOfCookies = 8;
	int numberOfChildren = 3;
	int remainingCookies = numberOfCookies % numberOfChildren;
	System.out.println(remainingCookies);
	switch(remainingCookies) {
		case 0:
			System.out.println(":(");
		break;
		case 1:
		case 2:
			System.out.println("yes!");
		break;
		case 3:
		case 4:
			System.out.println("WHOOOHOOOO");
		break;
		default:
			System.out.println("Jackpot!");		
	}
	
			
	// 7.  Loyalty Member Program:
	//		a. Create a variable called loyaltyMemberStatus and assign the value "SILVER"
	//		b. Create a variable called loyaltyMemberDiscount and assign the value 0.0
	//		c. Using a switch, set the value of loyaltyMemberDiscount based on 
	//				the following loyaltyMemberStatus scale: 
	//				i. "SILVER" is 0.10
	//				ii. "GOLD" is 0.15
	//				iii. "PLATINUM" is 0.25
	String loyaltyMemberStatus = "SILVER";
	double loyaltyMemberDiscount;
	double billTotal = 686.86;
	switch (loyaltyMemberStatus) {
		case "SILVER":
			loyaltyMemberDiscount = 0.10;
		break;
		case "GOLD":
			loyaltyMemberDiscount = 0.15;
		break;
		case "PLATINUM":
			loyaltyMemberDiscount = 0.25;
		break;
		default:
			loyaltyMemberDiscount = 0.0;
	}
	System.out.println("Your total today is " + billTotal + "$");
	double adjustedTotal = billTotal - (billTotal * loyaltyMemberDiscount);
	if(adjustedTotal >= 500.00) {
		switch (loyaltyMemberStatus) {
			case "SILVER":
				loyaltyMemberStatus = "GOLD";
			break;
			case "GOLD":
				loyaltyMemberStatus = "PLATINUM";
			break;
		}
	}
	System.out.println("With your loyalty member savings you'll be paying " + adjustedTotal + "$");
	if(adjustedTotal >= 500.00) {
		System.out.println("And you've now qualified for " + loyaltyMemberStatus + " loyalty discounts!");
	}
	
	// 8. Using the Loyalty Member Program variables from Question 7, do the following:
	//		a. Create a variable called billTotal and assign a value
	//		b. Create a variable called adjustedTotal and assign it the billTotal minus 
	//				the loyaltyMemberDiscount percent of the billTotal
	//		c. If the adjustedBillTotal is greater than $500 upgrade the 
	//				loyaltyMemberStatus from SILVER to GOLD or from GOLD to PLATINUM


	
	// 9. Login -- username & password:
	//		a. Create two variables, username and password
	//		b. Create a conditional that prints one of the following:
	//				i. "login successful" if the username is "Tommy123" and the password is "12345"
	//				ii. "access denied" otherwise
	
	//Scanner userData established on line 12.
	System.out.print("Please enter Username: ");
	String username = userData.nextLine();
	System.out.print("Please enter Password: ");
	String password = userData.nextLine();
	if(username.equals("Kyle") && password.equals("1234")){
		System.out.println("Welcome, " + username);
	} else {
		System.out.println("Stop! You've violated the law. Pay the court its fine or serve your sentence");
	}
	
	//
	// LOOPS:
	//
	
	// 10. Write a for loop that prints each number from 0 to 9
	for(int startNum = 0; startNum <= 9; startNum++) {
		if(startNum == 9) {
			System.out.println(startNum + " ");
		} else {
			System.out.print(startNum + " ");
		}
	}
	
	
	// 11. Write a for loop that prints each number from 10 to 0 backwards
	for(int startNum2 = 10; startNum2 >= 0; startNum2--) {
		if(startNum2 == 0) {
			System.out.println(startNum2 + " ");
		} else {
		System.out.print(startNum2 + " ");
		}
	}
	
	
	// 12. Write a for loop that prints every other number from 0 to 100
	for(int countingToHundred = 0; countingToHundred <= 100; countingToHundred++) {
		if((countingToHundred % 2) == 0) {
			if(countingToHundred == 100) {
				System.out.println(countingToHundred + " ");
			} else {
				System.out.print(countingToHundred + " ");
			}
		}
	}
	
	
	// 13. Write a for loop that iterates from 0 to 100 and prints 
	//			"EVEN" if the number is even and "ODD" if it's odd
	for(int EvensAndOdds = 0; EvensAndOdds <= 100; EvensAndOdds++) {
		if((EvensAndOdds % 2) == 0) {
			if(EvensAndOdds == 100) {
				System.out.println("EVEN");
			} else {
				System.out.print("EVEN ");
			}
		} else {
			System.out.print("ODD ");
		}
	}
	
	
	// 14. Write a while loop that starts at 100 and iterates backwards by 1 until it reaches 0
	//			within the loop, divide each number by 3 and print the remainder to the console.
	int startNum3 = 100;
		while(startNum3 >= 0) {
			System.out.print(startNum3 % 3 + " ");
			startNum3--;
		}
	}
}
