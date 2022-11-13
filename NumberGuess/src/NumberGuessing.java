import java.util.Scanner;
public class NumberGuessing {

	public static void main(String[] args) {
		

		int attempt=1;
		int userguessnumber=0;
		int compinput=(int)(Math.random()*99+1);
		//System.out.println(compinput);
		Scanner sc= new Scanner(System.in);
		System.out.println("Welcome to the Number Guessing Game\n"+
		"You have total 10 number of attempts to guess the number\n" );
		do{
			System.out.println("\nEnter a guess number between 1 to 100");
			if(sc.hasNextInt()){
				userguessnumber=sc.nextInt();
				if(userguessnumber==compinput){
					System.out.println("\nWELL DONE, YOU GUESSED THE RIGHT NUMBER");
					System.out.printf("\nCONGRATS!, You have guessed the number in %d attempts\n",attempt);
					int score=((11-attempt)*10);
					System.out.printf("\nYour score is %d out of 100",score);
					break;
				}
				else if(userguessnumber < compinput){
					System.out.println("The number you guessed is smaller than original number");
					
				}
				else if(userguessnumber > compinput){
					System.out.println("The number you guessed is bigger than original number");
				}
				if(attempt==10){
					System.out.println("You have exceeded the maximum attempt. Try Again");
					break;
				}
				attempt++;
			}
			else{
				System.out.println("The number is exceeds the limit");
				break;
			}
		}
		while (userguessnumber!=compinput);
	}

}
