import java.util.Scanner;
class Cineplex
{
	private int choice=0;
	private Scanner sc;
	private ProcessData access;
	//default constr.
	Cineplex()
	{
		sc=new Scanner(System.in);
		access=new ProcessData();
		showMenu();
	}

	void showMenu()
	{
		do
		{
			//displaying menu
			System.out.println("------------------------------------------");
			System.out.println("1. Book a seat.");
			System.out.println("2. Edit the movie title.");
			System.out.println("3. View sales report.");
			System.out.println("4. Exit the program.");
			System.out.println("------------------------------------------");
			System.out.println("Enter your choice(form 1 to 4)");
			//reading choice:
			try
			{
				choice=sc.nextInt();
			}
			catch(Exception e)
			{
				System.out.println("**Error:Input must be an integer value**");
			}

			switch(choice)
			{
				case 1:
				{
					access.bookSeat();
					break;
				}
				case 2:
				{
					access.updateMovieTitle();
					break;
				}
				case 3:
				{
					access.salesReport();
					break;
				}
				case 4:
				{
					System.exit(1);
					break;
				}
				default:
				{
					System.out.println("** Error:Input must be from 1 to 4 **");
				}
			}//end of switch case;
			
		}while(choice!=4);

	}


}//end of Cineplex class;