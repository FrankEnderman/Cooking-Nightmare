package pack;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		System.out.println("starting cooking nightmare 1.2 Alpha");
		int EggAmount;
		int EggMin = 1;
		int flourAmount;
		int flourMin = 100;
		int MilkMin = 100;
		int MilkAmount;
		int RiceAmount;
		int RiceMin = 3;
		System.out.println("how many eggs do you have?");
		Scanner userInput;
		userInput = new Scanner(System.in);
		EggAmount = userInput.nextInt();
		System.out.println("you have " + EggAmount + " eggs in your stash");
		System.out.println("how much milk do you have?");
		Scanner userInput1;
		userInput1 = new Scanner(System.in);
		MilkAmount = userInput1.nextInt();
		System.out.println("you have " + MilkAmount + " milk in your stash");
		System.out.println("how many flour do you have?");
		Scanner userInput11;
		userInput11 = new Scanner(System.in);
		flourAmount = userInput11.nextInt();
		System.out.println("you have " + flourAmount + " grams of flour in your stash");
		System.out.println("how many KGs of rice do you have?");
		Scanner userInput111;
		userInput111 = new Scanner(System.in);
		RiceAmount = userInput111.nextInt();
		
		System.out.println("you have " + RiceAmount + " kilos of rice in your stash");
		if (EggAmount < EggMin || EggAmount < EggMin || flourAmount < flourMin || MilkAmount < MilkMin || RiceAmount < RiceMin) {
			System.out.println("no food today :(");
		} else {
			System.out.println("food!!! :D");
		}
	
		}
	}
