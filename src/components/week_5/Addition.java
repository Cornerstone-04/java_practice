package components.week_5;
// Java program for Method Overloading

//Using Different Numbers of Arguments 
class Addition {
	//Using Different Numbers of Arguments 
    // Addition of 2 numbers
    static int AdditionOfNumbers(int Num1, int Num2)
    {
        return Num1 + Num2;
    }
    // Addition of 3 numbers
    static int AdditionOfNumbers(int Num1, int Num2, int Num3)
    {
        return Num1 + Num2 + Num3;
    }
  //Using Different Types of Arguments 
    static float AdditionOfNumbers(float Num1, float Num2)
    {
        return Num1 + Num2;
    }
    // Addition of 3 numbers
    static float AdditionOfNumbers(float Num1, float Num2, float Num3)
    {
        return Num1 + Num2 + Num3;
    }
}
 
class Test2 {
    public static void main(String[] args)
    {
        System.out.println(Addition.AdditionOfNumbers(20, 40));
        System.out.println(Addition.AdditionOfNumbers(20, 800, 1000));
        
        System.out.println(Addition.AdditionOfNumbers(30.0f, 50.0f));
        System.out.println(Addition.AdditionOfNumbers(30, 80.0f, 1000));
    }
}
