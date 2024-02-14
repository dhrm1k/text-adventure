import java.util.*;

class main {
	public static void main(String args[]) {
		System.out.println("You are a robot on Worl0. I am the Watcher. I watch everything and no one even knows I exist. ");
		System.out.println("I will narrate you his story.");
		

		robo r1 = new robo();
		level0 l = new level0();
		l.stranded();	
		//r1.name();
		//r1.nameprint();
	}
}

class Otherstuff {
  int playerhp;

  int playerstats(int y){
    playerhp = 10;
    playerhp = playerhp - y;
    return playerhp;
  }
}
	
class robo {

	static String roboname;

	void name() {
		Scanner sc = new Scanner(System.in);	
		
		System.out.println("");
		System.out.println("What do you want your robo name? ");
		System.out.println("And for robo lord sake, please be creative: ");
		
		roboname = sc.nextLine();
	}

	void nameprint() {
			System.out.println("Your name is " + roboname);
	}


}

class level0 {

	Scanner sc = new Scanner(System.in);

		void stranded() {

			System.out.println("");
			System.out.println("");
			System.out.println("You are enjoying your regular day in this robo world.");
			System.out.println("Unlike a stupid planet called earth. This is different.");
			System.out.println("Machines have got their values figured out. People don't work here.");
			System.out.println("Contrary to a planet whose inhabitants are apes, here things work themselves.");
			System.out.println("");
			System.out.println("");

			System.out.println("You want to explore this world?[y/n] It's a static world. :)");
			char a = sc.next().charAt(0);
			
			if (a == 'y' || a == 'Y' ) {
					System.out.println("Correct choice");
					explore0(); //here is the line where the program goes ahead
			}		

			else {
				System.out.println("No you can do that. Try again.");
				
				do{
				System.out.println("Again, do you want to explore the world?[y/n] ");
				a = sc.next().charAt(0);

				//if statement start	
				if (a == 'y' || a == 'Y' ) {
					System.out.println("Correct choice");
										explore0(); //here is the line where program goes ahead when no after yes

					break;

				}
				//if statement end

				}

				while(a != 'y' || a != 'Y' );
			}

		}

	void explore0() {
		System.out.println();
		System.out.println();
		System.out.println("You roamed in the park. You are at a crossroad inside the park");
		crossroad(); //here is the line where the program goes ahead.
	}

	
		//having this generated once for good user experience.
	void text_of_crossroad() {
  		System.out.println("1. go north");
  		System.out.println("2. go south");
  		System.out.println("3. go east");
  		System.out.println("4. go west");
	}

	void crossroad() {

		//text_of_crossroad();
		boolean bool_west_check = false;
		//when demonstrating dont write west first.
do{
		System.out.println("1. go north");
  		System.out.println("2. go south");
  		System.out.println("3. go east");
  		System.out.println("4. go west");


  		int choice = sc.nextInt();

  switch(choice) {
    case 1:
    north();
    break;

    case 2:
    south();
    break;

    case 3:
    east();
    break;

    case 4:
    west();
    bool_west_check = true;

    break;

    default:
    System.out.println("That's not a direction mornon.");
    break;
  } 
} while(bool_west_check == false);

	}

	void north() {
		System.out.println();
		System.out.println("North is a lake. Ahh, water. That thing messes with the circuits.");
		System.out.println();
	}

	void south() {
			System.out.println();
			System.out.println("South is this guy. Trying to repair himself.");
			System.out.println("In our world, there are no genders by default.");
			System.out.println("But our creator, the last human, Bill Joy,");
			System.out.println("Wrote a library in us that generates random numbers, ");
			System.out.println("Ones ending in 0 are guys and ones in 1s are pretty ladies.");
			System.out.println();
	}

	void east() {
			System.out.println();
			System.out.println("You find some robots charging in free charging ports provided by park.");
			System.out.println();
	}

	void west() {
			System.out.println();
			System.out.println("Wait, what. There's a letter there?");
			System.out.println("Some robot's motherboard might have gone nuts");
			System.out.println();

			//THIS IS WHERE THE PROGRAM PROCEEDS
			level1 nu = new level1();
			nu.read_letter();
			//proceed to level 1
	}	
}

class level1 {
	Scanner sc = new Scanner(System.in);

		void read_letter() {

			System.out.println("You want to open and read letter?[y/n] ')");
			char a = sc.next().charAt(0);


				if (a == 'y' || a == 'Y' ) {
					System.out.println("Correct choice");
					letter(); //here is the line where the program goes ahead
			}		

			else {
				System.out.println("No, please read that letter. I am robot. I think logically.");
				System.out.println("I will ask you again.");
				
				do{
				System.out.println("So, again, do you want to read the letter?[y/n] ");
				a = sc.next().charAt(0);

				//if statement start	
				if (a == 'y' || a == 'Y' ) {
					System.out.println("Correct choice");
					letter();	 //here is the line where program goes ahead when no after yes

					break;

				}
				//if statement end

				}

				while(a != 'y' || a != 'Y' );
		}

}


//method letter

		void letter() {
		System.out.println("In the letter is: ");

		System.out.println("+---------------------------------------------------------+");
        System.out.println("|From the guy who made you,                               |");
        System.out.println("|                                                         |");
        System.out.println("|Don't try to find me, the world thinks I am dead and     |");
        System.out.println("|that's for good. Whoever finds this. There's a bug in    |");
        System.out.println("|in the world I created. I am afraid it might fall in the |");
        System.out.println("|wrong hands. Yesterday, while tinkering and testing one  |");
        System.out.println("|of my personal project, I created a virus.               |");
        System.out.println("|                                                         |");
        System.out.println("| I am sorry to burden you, but it's you that needs to    |");
        System.out.println("| solve this problem.                                     |");
        System.out.println("|                                                         |");
        System.out.println("| If you tell anyone about this, your memory card will be |");
        System.out.println("| destroyed. Meet me in Area-69.                          |");
        System.out.println("|                                                         |");        
        System.out.println("| If you don't take any action then too your memory card  |");       
        System.out.println("| will be destoryed. I am smart, ain't I?                 |");        
        System.out.println("|                                                         |");         
        System.out.println("|                                                         |");
        System.out.println("|world's last human and your man,                         |");        
        System.out.println("|bill joy, xoxo                                           |");                
        System.out.println("+---------------------------------------------------------+");
        what_now(); 

		}

		void what_now() {

			level2 l2obj = new level2(); // level 2 object.

			System.out.println("What you want to do now? ");
			System.out.println("1. FORGET ABOUT THE LETTER");
			System.out.println("2. PLAN A JOURNEY TO AREA-69");


			//IF START 

			char a = sc.next().charAt(0);


				if (a == '2') {
					System.out.println("Correct choice");
				   l2obj.going_to();//here is the line where the program goes ahead
			}		

			else {
				System.out.println("No, I know you are not this boring.");
				System.out.println("When life gives you chances to go on adventures, do it.");
				System.out.println("These adventures is what is going to make your life fun.");
				
				do{
				System.out.println("So, again, do you want to go on a journey? ");
				a = sc.next().charAt(0);

				//if statement start	
				if (a == '2') {
					System.out.println("Correct choice");
						l2obj.going_to();	 //here is the line where program goes ahead when no after yes

					break;

				}
				//if statement end

				}

				while(a != 1 );
}

			//IF END

		}


 }

class level2 extends custom{  //used inheritance here
	
		Scanner sc = new Scanner(System.in);

	void going_to() {
		System.out.println("Area-69 is a place where no robot has dared to go.");
		System.out.println("So I better be well equipped if I am going there...");
		System.out.println("I will collect weapons on the way.");
		puzzle_to_weapons();// here is program proceeds
	}

	void puzzle_to_weapons() {
		System.out.println();
		System.out.println("In this world, computation and smartness is key");
		System.out.println("To pay for weapons, you need to solve the following");
		game_for_weapons(); //here is program proceeds
	}

	void game_for_weapons() {
				System.out.println();
				System.out.println();
				char[] array1 = {'d', 'e', 'o', 'r', 'l', 'o', 'w', 'l', 'l', 'h'};
				System.out.println();
				System.out.println();
				//thought to use random class inbuilt from java

				for (int i = 0; i<array1.length; i++) {
					System.out.print(" " + array1[i] + " ");
				}

				int try_counter = 0;
				String guess_for_game;

				do {
					System.out.println();
					System.out.println("Hey, robot equipped with the best cpu, ");
					System.out.println("What is the word that you are seeing? Guess here: ");

					guess_for_game = sc.nextLine();

					String to_check = guess_for_game.toLowerCase();

					//breaks if the word is choosed correctly
					if ( (checkcontains(to_check, "helloworld") == true) || (checkcontains(to_check, "hello world") == true)){
						System.out.println("You guessed correctly.");
						System.out.println("The word was hello world");
						giving_weapons();//program will procced from here.
						break;
					}
					//checks if the word is choosen correctly above



					try_counter = try_counter + 1;
				}

				while(try_counter<=3);

				if (try_counter >= 4) {
					System.out.println("HINT: It's the first basic program everyone writes");
					System.out.println("in a programming language when they learn.");
										guess_for_game = sc.nextLine();

										try_counter = try_counter + 1;
				}

				if (try_counter >= 5) {
					System.out.println("It starts with hello and ends with letter 'd'.");
										guess_for_game = sc.nextLine();
										try_counter = try_counter + 1;

				}

				if (try_counter>=6) {
					System.out.println("You deserve to lose");
					System.out.println("Start the game again moron. ");
					System.out.println("Game over");
					System.out.println();
					System.out.println();
					System.out.println();

					System.out.println("Do you want to play again?[y/n]");

					char choose = sc.next().charAt(0);

					if (choose == 'y' || choose =='Y') {
					super.main(null);	// calling main method using the super keyword
					}

					else {
						System.out.println("Ok. Thanks for playing. Please do consider to run this code again");
						System.out.println("some time. Bye till then.");
					}

				}



	} //this bracket is of method end



		void giving_weapons() {
		System.out.println("You've proved yourself worty of the weapon");
		System.out.println();
		System.out.println("What weapon do you want?");
		System.out.println("You are at get-anything-weapon store. Do remember you only have two things");
		String[] weapon = new String[3];
		String[] tochecknothingrandom = {"gun", "donut", "ray", "sword", "spear", "axe", "armor", "energy gun", "a magic key", "watch"};

		for (int i =0; i<weapon.length; i++) {
			weapon[i] = sc.nextLine();
			
		}
		System.out.println(checkcontainsarrwithprint(weapon, tochecknothingrandom));
	}


}

class level3 {

}

class custom extends main{ //the super in level2 works because of this.
	boolean checkcontains(String t1, String t2) {
//  String t1 = ;
//  String t2 = ;

//  String string t1 = "Java";
//String substring t2 = "va";
boolean a = t1.contains(t2);

if (a == true) {
 return true;

//return boolean;
}

else {
  return false;
} 

}


//need to write boolean check contains but for array now

boolean checkcontainsarr(String t1[], String t2[]){
	//static int i = 0;
    for (int i = 0; i < t1.length; i++) {
        if (t1[i].equals(t2[i])) {
            return true;  // If a match is found, return true
        }
    }

    return false;  // If no match is found after checking all elements, return false

}



//

String checkcontainsarrwithprint(String t1[], String t2[]) {
	for(int i = 0; i<t1.length; i++) {
		if(checkcontainsarr(t1, t2) == false) {
			return t1[i] + " is not available. Think of something else.";
		}
		}
		return null;
}

//using the above function to get desired output

}