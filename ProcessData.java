import java.util.Scanner;
class ProcessData
{
	private int i,j, count=1,rowCount=1;
	private Scanner sc;
	private int theatre1[][],theatre2[][],theatre3[][],theatre4[][],theatre5[][];
	private int earnTheatre1=0,earnTheatre2=0,earnTheatre3=0,earnTheatre4=0,earnTheatre5=0;
	private int theatreNum;
	private String title1,title2,title3,title4,title5;
	ProcessData()
	{
		sc=new Scanner(System.in);
		//initializing seats of theatre
		theatre1=new int[10][20];//[10]=> 10 rows & [20]=>seats(columns)
		theatre2=new int[10][20];// --same--
		theatre3=new int[10][20];// --same--
		theatre4=new int[5][20];// --same--
		theatre5=new int[5][20];// --same--
	}
	
	void salesReport()
	{
		System.out.println("****SALES REPORT****");
		System.out.println(":::Theatre 1 Sales Report:::");
		System.out.println("Movie Title: "+title1);
		System.out.println("Sales figure: "+earnTheatre1);
		System.out.println("::::::::::::::::::::::::::::");

		System.out.println(":::Theatre 2 Sales Report:::");
		System.out.println("Movie Title: "+title2);
		System.out.println("Sales figure: "+earnTheatre2);
		System.out.println("::::::::::::::::::::::::::::");

		System.out.println(":::Theatre 3 Sales Report:::");
		System.out.println("Movie Title: "+title3);
		System.out.println("Sales figure: "+earnTheatre3);
		System.out.println("::::::::::::::::::::::::::::");

		System.out.println(":::Theatre 4 Sales Report:::");
		System.out.println("Movie Title: "+title4);
		System.out.println("Sales figure: "+earnTheatre4);
		System.out.println("::::::::::::::::::::::::::::");

		System.out.println(":::Theatre 5 Sales Report:::");
		System.out.println("Movie Title: "+title5);
		System.out.println("Sales figure: "+earnTheatre5);
		System.out.println("::::::::::::::::::::::::::::");

		System.out.println(":::Total sale from all Theatres:::");
		System.out.println("Sales figure: "+(earnTheatre1+earnTheatre2+earnTheatre3+earnTheatre4+earnTheatre5));
		System.out.println("::::::::::::::::::::::::::::");
	}
	void updateMovieTitle()
	{
		System.out.println("****UPDATE MOVIE TITLE****");
		System.out.println("Enter theatre number:");
		count=sc.nextInt();
		if(count>0 && count<6)
		{
			System.out.println("Enter new title:");
			if(count==1)
			{
				sc.nextLine();
				title1=sc.nextLine();
				System.out.println("Movie title for Theatre number "+count+" is updated as "+title1);
			}
			else if(count==2)
			{
				sc.nextLine();
				title2=sc.nextLine();
				System.out.println("Movie title for Theatre number "+count+" is updated as "+title2);
			}
			else if(count==3)
			{
				sc.nextLine();
				title3=sc.nextLine();
				System.out.println("Movie title for Theatre number "+count+" is updated as "+title3);
			}
			else if(count==4)
			{
				sc.nextLine();
				title4=sc.nextLine();
				System.out.println("Movie title for Theatre number "+count+" is updated as "+title4);
			}
			else if(count==5)
			{
				sc.nextLine();
				title5=sc.nextLine();
				System.out.println("Movie title for Theatre number "+count+" is updated as "+title5);
			}

		}
		else
		{
			System.out.println("**Error: not a valid theatre.**");
		}
	}
	void bookSeat()
	{
		
		System.out.println("**Book Ticket**");
		System.out.println("Enter Theatre Number(from 1 to 5) where you want to watch movie: ");
		theatreNum=sc.nextInt();
			


			if(theatreNum==1) 
			{
				//displaying seats(vacant or full)
				rowCount=1;
				for(i=0;i<theatre1.length;i++)
				{
					System.out.print("Row:"+rowCount+"=>");
					rowCount++;
					count=1;
					for(j=0;j<theatre1[i].length;j++)
					{
						if(theatre1[i][j]==0)
						{
							System.out.print(count+":E  ");
							count++;
						}
						else
						{
							System.out.print(count+":F  ");
							count++;
						}
						
					}//end of inner for
					System.out.print("\n");
				}//end
				rowCount=0;
				count=0;
				System.out.println("enter row (to book seat)");
				rowCount=sc.nextInt();
				System.out.println("Enter seat no. from row "+rowCount);
				count=sc.nextInt();
				if(theatre1[rowCount-1][count-1]==0)
				{
					if(rowCount>0 && rowCount<=5)
					{
						theatre1[rowCount-1][count-1]=1;
						earnTheatre1=earnTheatre1+240;
						System.out.println("Ticket booked successfully...");
					}
					else if(rowCount>5 && rowCount<=10)
					{
						theatre1[rowCount-1][count-1]=1;
						earnTheatre1=earnTheatre1+350;	
						System.out.println("Ticket booked successfully...");
					}	
					else
					{
						System.out.println("Unsuccessfully...wrong seat.");
					}	
				}
				else
				{
					System.out.println("Unsuccessfully...As the seat is already booked.");
				}
			}
			else if(theatreNum==2) 
			{
				//displaying seats(vacant or full)
				rowCount=1;
				for(i=0;i<theatre2.length;i++)
				{
					System.out.print("Row:"+rowCount+"=>");
					rowCount++;
					count=1;
					for(j=0;j<theatre2[i].length;j++)
					{
						if(theatre2[i][j]==0)
						{
							System.out.print(count+":E  ");
							count++;
						}
						else
						{
							System.out.print(count+":F  ");
							count++;
						}
						
					}//end of inner for
					System.out.print("\n");
				}//end
				rowCount=0;
				count=0;
				System.out.println("enter row (to book seat)");
				rowCount=sc.nextInt();
				System.out.println("Enter seat no. from row "+rowCount);
				count=sc.nextInt();
				if(theatre2[rowCount-1][count-1]==0)
				{
					if(rowCount>0 && rowCount<=5)
					{
						theatre2[rowCount-1][count-1]=1;
						earnTheatre2=earnTheatre2+240;
						System.out.println("Ticket booked successfully...");
					}
					else if(rowCount>5 && rowCount<=10)
					{
						theatre2[rowCount-1][count-1]=1;
						earnTheatre2=earnTheatre2+350;	
						System.out.println("Ticket booked successfully...");
					}	
					else
					{
						System.out.println("Unsuccessfully...wrong seat.");
					}	
				}
				else
				{
					System.out.println("Unsuccessfully...As the seat is already booked.");
				}

			}
			else if(theatreNum==3) 
			{
				//displaying seats(vacant or full)
				rowCount=1;
				for(i=0;i<theatre3.length;i++)
				{
					System.out.print("Row:"+rowCount+"=>");
					rowCount++;
					count=1;
					for(j=0;j<theatre3[i].length;j++)
					{
						if(theatre3[i][j]==0)
						{
							System.out.print(count+":E  ");
							count++;
						}
						else
						{
							System.out.print(count+":F  ");
							count++;
						}
						
					}//end of inner for
					System.out.print("\n");
				}//end
				rowCount=0;
				count=0;
				System.out.println("enter row (to book seat)");
				rowCount=sc.nextInt();
				System.out.println("Enter seat no. from row "+rowCount);
				count=sc.nextInt();
				if(theatre3[rowCount-1][count-1]==0)
				{
					if(rowCount>0 && rowCount<=5)
					{
						theatre3[rowCount-1][count-1]=1;
						earnTheatre3=earnTheatre3+240;
						System.out.println("Ticket booked successfully...");
					}
					else if(rowCount>5 && rowCount<=10)
					{
						theatre3[rowCount-1][count-1]=1;
						earnTheatre3=earnTheatre3+350;	
						System.out.println("Ticket booked successfully...");
					}	
					else
					{
						System.out.println("Unsuccessfully...wrong seat.");
					}	
				}
				else
				{
					System.out.println("Unsuccessfully...As the seat is already booked.");
				}
			}
			else if(theatreNum==4) 
			{

				//displaying seats(vacant or full)
				rowCount=1;
				for(i=0;i<theatre4.length;i++)
				{
					System.out.print("Row:"+rowCount+"=>");
					rowCount++;
					count=1;
					for(j=0;j<theatre4[i].length;j++)
					{
						if(theatre4[i][j]==0)
						{
							System.out.print(count+":E  ");
							count++;
						}
						else
						{
							System.out.print(count+":F  ");
							count++;
						}
						
					}//end of inner for
					System.out.print("\n");
				}//end
				rowCount=0;
				count=0;
				System.out.println("enter row (to book seat)");
				rowCount=sc.nextInt();
				System.out.println("Enter seat no. from row "+rowCount);
				count=sc.nextInt();
				if(theatre4[rowCount-1][count-1]==0)
				{
					System.out.println("val:"+theatre4[rowCount-1][count-1]);
					if(rowCount>0 && rowCount<=3)
					{
						theatre4[rowCount-1][count-1]=1;
						earnTheatre4=earnTheatre4+500;
						System.out.println("Ticket booked successfully...");
					}
					else if(rowCount>3 && rowCount<=5)
					{
						theatre4[rowCount-1][count-1]=1;
						earnTheatre4=earnTheatre4+700;	
						System.out.println("Ticket booked successfully...");
					}	
					else
					{
						System.out.println("Unsuccessfully...wrong seat.");
					}	
				}
				else
				{
					System.out.println("Unsuccessfully...As the seat is already booked.");
				}
			}
			else if(theatreNum==5) 
			{
				//displaying seats(vacant or full)
				rowCount=1;
				for(i=0;i<theatre5.length;i++)
				{
					System.out.print("Row:"+rowCount+"=>");
					rowCount++;
					count=1;
					for(j=0;j<theatre5[i].length;j++)
					{
						if(theatre5[i][j]==0)
						{
							System.out.print(count+":E  ");
							count++;
						}
						else
						{
							System.out.print(count+":F  ");
							count++;
						}
						
					}//end of inner for
					System.out.print("\n");
				}//end
				rowCount=0;
				count=0;
				System.out.println("enter row (to book seat)");
				rowCount=sc.nextInt();
				System.out.println("Enter seat no. from row "+rowCount);
				count=sc.nextInt();
				if(theatre5[rowCount-1][count-1]==0)
				{
					if(rowCount>0 && rowCount<=3)
					{
						theatre5[rowCount-1][count-1]=1;
						earnTheatre5=earnTheatre5+500;
						System.out.println("Ticket booked successfully...");
					}
					else if(rowCount>3 && rowCount<=5)
					{
						theatre5[rowCount-1][count-1]=1;
						earnTheatre5=earnTheatre5+700;	
						System.out.println("Ticket booked successfully...");
					}	
					else
					{
						System.out.println("Unsuccessfully...wrong seat.");
					}	
				}
				else
				{
					System.out.println("Unsuccessfully...As the seat is already booked.");
				}
			}
			else
			{
				System.out.println("**Error:Not a valid theatre.**");	
			}

	}
}