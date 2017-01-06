import java.io.*;

public class Pet
{
   String name;
   int age;
   double weight;
	
  
   public Pet(String name, int age, double weight){
      this.name = name;
      this.age = age;
      this.weight = weight;
   }

    public Pet(String name, int age){
    this.name = name;
    this.age = age;
    }
}