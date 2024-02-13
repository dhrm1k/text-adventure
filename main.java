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


		}


 }

class level2 {

}

class level3 {

}