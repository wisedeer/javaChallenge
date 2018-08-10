package genericRoot;

import java.util.Scanner;

public class Main {

	public static void main(String[] args){
		//Read integer and pass it to genRoot function
		Scanner sc = null;
		int input =0;
		while(true){
			sc = new Scanner(System.in);
			input = sc.nextInt();
			if(input<0){
				break;
			}
			int output = genRoot(input);
			System.out.println(Integer.toString(output));
		}
		sc.close();
	}

	static int genRoot(int input){
		int result = 0;
		int resultSum = 0;
		
		if(input == 0){
			return input;
		}

		result = input/10;
		if(result!=0){
			while(input!=0){
				resultSum += input%10;
				input /= 10;
			}			
		} else {
			return input%10;
		}

		return genRoot(resultSum += input%10);
	}

}
