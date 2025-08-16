class inheritance
{
    @SuppressWarnings("unused")
    public static void main(String[] arg)
    {
          car test=new car("");
          test.run();
          family_car test2= new family_car();
          test2.next();
          super_car test3=new super_car();
    }
}
class car {
    car(String category){
        System.out.print(category);
    }
    void run(){
        System.out.println("\nThere are different categories of Car\n"); 
    }
}

class family_car extends car {

    family_car() {
        System.out.print("The first category: ");
        super("Family Car");
    }
    void next()
    {
        System.out.println("");
    }

}

class super_car extends car {
    super_car() {
        System.out.print("\nThe second category: ");
        super("Super Car");
        System.out.println("\nFastest cars on roads");
    }
}
