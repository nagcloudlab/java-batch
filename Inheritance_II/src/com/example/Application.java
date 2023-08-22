package com.example;

public class Application {
	
	public static void main(String[] args) {
		
		God god=new God();
		
		Human human=new Male();
		Animal animal=new Animal();
		
		//god.manageHuman(human);
		god.manageLT(human);
		System.out.println();
		//god.manageAnimal(animal);
		god.manageLT(animal);
		
		System.out.println();
		
		Robot robot=new Robot();
		god.manageLT(robot);
		
		//LivingThing livingThing=new LivingThing();
		//god.manageLT(livingThing);
		
		
	}

}
