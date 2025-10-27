package test;
import java.util.Scanner;


public class Test {

	public static void main(String[] args) {
		
		int num1 = 7;
		int num2 = 3;

		int[] arr = {
				num1 + num2,
				num1 - num2,
				num1 * num2,
				num1 / num2
		};

		for (int i = 0; i <4 ; i++) {

					System.out.println(arr[i]);
		}
