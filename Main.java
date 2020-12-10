import java.util.Scanner; //for accepting input from the user

class Main 
{
  public static void main(String[] args) 
  {
    //datatypes - declaring and initializing variables in Java
    int myNum = 5;
    float mFNum = 2.7f;
    double dNum = 5.78;
    char cNum = 'M';
    boolean bNum = false;
    String sInfo = "McMillanite";

    //Programming is IPO - input process output
    System.out.println("Int: " + myNum);
    System.out.print("Float: " + mFNum + "\n");
    System.out.println("Double: " + dNum);
    System.out.println("Char: " + cNum);
    System.out.println("Boolean: " + bNum);
    System.out.println("String: " + sInfo);

    //accepting input in Java
    Scanner sc = new Scanner(System.in);
    double n1 = 0.0, n2 = 0.0, a = 0.0;

    //input validation and accept input
    while(true)
    {
      System.out.print("\nPlease enter number 1: ");
      try
      {
        n1 = Double.parseDouble(sc.next());
        break;
      }
      catch(NumberFormatException ignore)
      {
        System.out.println("Invalid input. Enter a number.");
      }
    }

    while(true)
    {
      System.out.print("\nPlease enter number 2: ");
      try
      {
        n2 = Double.parseDouble(sc.next());
        break;
      }
      catch(NumberFormatException ignore)
      {
        System.out.println("Invalid input. Enter a number.");
      }
    }

    ///processing
    a = n1 + n2;
    System.out.println(n1 + " + " + n2 + " = " + a);

    /*********Conditions**********/
    int myAge = 30;
    int yourAge = 37;

    if(myAge > yourAge)
    {
      System.out.println("I am older than you.");
    }
    else if(myAge < yourAge)
    {
      System.out.println("You are older than me.");
    }
    else if(myAge == yourAge)
    {
      System.out.println("We are the same age.");
    }
    else //default clause
    {
      System.out.println("Error: Something went wrong!");
    }

    //how to call instances of the Person class we created
    Person Ashley = new Person(); //this calls the default constructor
    //this gives memory for the Ashley object
    //print the current data
    System.out.println("\nAge: " + Ashley.getAge());
    System.out.println("Name: " + Ashley.getName());

    //assign data to the object
    Ashley.setAge(30);
    Ashley.setName("Ashley");

    System.out.println("\nAge: " + Ashley.getAge());
    System.out.println("Name: " + Ashley.getName());

    System.out.println("\nHello world!");
  }
}