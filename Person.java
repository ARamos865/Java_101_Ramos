//This is a Person class blueprint in Java

public class Person
{
  //private member variables
  private int age;
  private String name;

  public Person() //default constructor
  {
    age = 0;
    name = "Default Name";
  }

  public void setAge(int a)
  {
    this.age = a; //set the private member variable
  }

  public int getAge()
  {
    return age; //return the private member variable
  }

  public void setName(String n)
  {
    this.name = n;
  }

  public String getName()
  {
    return name;
  }

}