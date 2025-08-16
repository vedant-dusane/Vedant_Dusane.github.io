class Constructor_overloading 
{
    Constructor_overloading()
    {
        System.out.println("\nThis is a normal constructor");
    }
    Constructor_overloading(int a,int b)
    {
        System.out.println("\nThis is a parameterised constructor with two variable "+a+" , "+b+"\n and there sum would be "+(a+b));

    }
    Constructor_overloading(double a,double b)
    {
        System.out.println("\nThis is a parameterised constructor with two variable "+a+" , "+b+"\n and there average would be "+((a+b)/2));

    }

    @SuppressWarnings("unused")
    public static void main(String[] args) {
        Constructor_overloading run1=new Constructor_overloading();
        Constructor_overloading run2=new Constructor_overloading(5,3);
        Constructor_overloading run3=new Constructor_overloading(8.0,5.0);
        
    }

}