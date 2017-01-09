package com.programming.project;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		Scanner tastatur = new Scanner(System.in);
		
		boolean running = true;
		boolean running1 = true;
		String s = "";
		
		System.out.println("You find yourself stranded in the woods");
		System.out.println("There's a chest and a fire close by");
		while(running){
			System.out.println("\nWhat do you want to do?");
			s = tastatur.next();
			if(s.equals("Search") || s.equals("search")){
				System.out.println("Search what?");
				s = tastatur.next();
				if(s.equals("chest") || s.equals("Chest")){
					if(running1){
						System.out.println("You find a backpack, a knife, an unlit torch and a bucket. You put them into the backpack.");
						running1 = false;
					}else{
						System.out.println("Theres is nothing in the chest");
					}
				}else {
					System.out.println("You can not search " + s + "!");
				}
			}else if(s.equals("Look") || s.equals("look") || s.equals("See") || s.equals("see")){
				System.out.println("Where do you want to look?");
				s = tastatur.next();
				if(s.equals("Fire") || s.equals("fire")){
					System.out.println("The fire is slowly dying");
				}else if(s.equals("Around") || s.equals("around")){
					System.out.println("You're sorrounded by tall oak trees with green leaves on their thick branches. "
							+ "There is small beams of light shining through the trees majestic crowns. The trees open a little to north and a vague path can be seen");
				}else{
					System.out.println("You can not look at " + s + "!");
				}
			}else if(s.equals("Go") || s.equals("go") || s.equals("Walk") || s.equals("walk")){
				System.out.println("Where do you want to " + s + "?");
				s = tastatur.next();
				if(s.equals("North") || s.equals("north")){
					
				}else{
					
				}
			}else{
					System.out.println("WHAT ARE YOU TRYING TO DO!");
			}
		}
	}
}
