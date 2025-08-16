import java.util.Scanner;
@SuppressWarnings("resource")
class airport_System
{
    public static void main(String[] args) {
        System.out.println("\nWelcome user this is a coustomer help desk\nPlease mention your request");
        System.out.print("\n1.Boadring gate inquiry\t\t4.Currency Convertor\n2.Ticket verification\t\t5.Time Shift helper\n3.Ticket Cancellation\n");
        Scanner input=new Scanner(System.in);
        int choice=input.nextInt();
        airport_System run= new airport_System();

        switch(choice)
        {
        case 1:
        run.Boarding();
        break;

        case 2:
        run.ticketv();
        break;

        case 3: 
        run.ticketc();
        break;

        case 4:
        run.currency();
        break;
        
        case 5:
        run.time();
        break;


        }
    
    }

    public void Boarding()
    {
        Scanner input= new Scanner(System.in);
        System.out.println("Enter you boarding number/ticket number\n");
        String ticket_pass=input.nextLine();
        int n=ticket_pass.length();
        String gate=ticket_pass.substring(n-2,n);
        System.out.println("Your gate number is: "+gate);
    }
    public void ticketv()
    {

    }
    public void ticketc()
    {

    }
    public void currency()
    {

    }
    public void time()
    {

    }
}