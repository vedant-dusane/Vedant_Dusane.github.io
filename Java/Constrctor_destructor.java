import java.util.Scanner;
class constructor_distructor
{
    constructor_distructor(String nam)
        {
            System.out.println("Object in constructor: "+ nam);
        }
    public void destructor(String nam) 
        {
            System.out.println("Name is destroyed");
            nam="null";
            System.out.println("Name after destroyed: "+nam);
        }
     @SuppressWarnings("resource")
    public static void main(String[] args)
        {
            System.out.print("Enter a name: ");
            Scanner input=new Scanner(System.in);
            String name= input.nextLine();
            constructor_distructor trial= new constructor_distructor(name);
            trial.destructor(name);
        }
}
