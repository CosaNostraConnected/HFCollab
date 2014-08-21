package net.hackforums.m1kep.primenumbergen;

import java.util.HashMap;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);

		int n;
		int p = 2;

		HashMap<Integer, Boolean> myMap = new HashMap<Integer, Boolean>();
		System.out.print("Enter the maximum number you would like to search for primes to: ");
		n = input.nextInt();

		for (int i = 2; i <= n; i++) {
			myMap.put(i, true);
		}
		System.out.println(myMap.keySet());
		System.out.println(Process.GetLargestKeyInHashMap(myMap));
		myMap.remove(25);
		System.out.println(Process.GetLargestKeyInHashMap(myMap));
	}
}
