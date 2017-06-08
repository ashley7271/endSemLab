package endSemLab;

import java.util.Scanner;

public class BallotUI
{
    // instance variables 
    public Scanner keyboard;
    public BallotManager ballot=new BallotManager("Ashley","Messi","Suarez","Neymar");
    public String votingMessage;

    
    public BallotUI()
    {
        keyboard = new Scanner(System.in);
    }
    public void menu()    
    {
        int command = -1;
        while(command != 0)        
        {
            displayMainMenu();
            command = getCommand();
            execute(command);
        }
    }
    
	private void displayMainMenu()
    {
        System.out.println("Options are");
        System.out.println("    To vote for Ashley          Enter 1");
        System.out.println("    To vote for Messi          Enter 2");
        System.out.println("    To vote for Suarez           Enter 3"); 
        System.out.println("    To vote for Neymar          Enter 4");
        System.out.println("To close the election    Enter 0");
    }
    private int getCommand()
    {
        System.out.print("Enter Choice: ");
        return keyboard.nextInt();
    }
    private void execute(int command)
    {
        if(command == 1)
        {
        	ballot.candidate1.incrementVoteCount();
        }
        else if(command == 2)
        {
        	ballot.candidate2.incrementVoteCount();
        }
        else if(command == 3)
        {
        	ballot.candidate3.incrementVoteCount();
        }
        else if(command == 4)
        {
        	ballot.candidate4.incrementVoteCount();
        }            
        else if(command == 0)
        {
            System.out.println(" Stopping Elections with result");
            ballot.reportResults();
        }
        else
        {
            System.out.println("Unknown Choice! Choose correct choice!");
            
        }

    }
  
}
   