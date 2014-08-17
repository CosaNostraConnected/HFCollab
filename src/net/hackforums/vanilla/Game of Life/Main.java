package com.simon987;

import java.util.Random;
import java.util.Scanner;



public class Main {
	
	static int sizeX = 0;
	static int sizeY = 0;

    /**
     * The main method of the program
     * @param args The cl arguments (unused)
     */
	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Seed:");
		String seed = scanner.nextLine();
		
		System.out.println("SizeX: (Max: 24)");
		sizeX = scanner.nextInt();
		
		System.out.println("SizeY: (Max: 80)");
		sizeY = scanner.nextInt();

        //Create a Random object using the povided seed
        Random rand = new Random(seed.hashCode());
        //Create the grid
		Grid grid = new Grid(sizeY,sizeX,rand);
		
		
		System.out.println("Speed:(In ms)");
		int speed = scanner.nextInt();



		grid.display();
		
		//game loop
		while(true){
			Game.next(grid);
			if(sizeX != 24)
			System.out.print("\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n");
			grid.display();
			try {
				Thread.sleep(250);
				} catch (InterruptedException e) {
				}
		}
	}
}