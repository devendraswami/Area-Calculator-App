import java.util.Scanner;



abstract class Parent
{
    
    float area;

    abstract void input();
    abstract void compute();

    void display()
    {
        System.out.println("Area is - " + area +" unit sq");

    }
}
    

    class Rectangle extends Parent
    {
        float length;
        float breadth;

        void input()
        {
           System.out.println("Calculation of Rectangle App ");
           Scanner scan = new Scanner(System.in);

           System.out.println("Entre the length of rectangle - ");
           length = scan.nextFloat();

           System.out.println("Entre the breadth of Rectangle - ");
           breadth = scan.nextFloat();
              
        }
        void compute()
        {
           area = length * breadth;

        }
   
}


class Square extends Parent
{
    float side;

    void input()
    {
       System.out.println("Calculation of Square App "); 
       Scanner scan = new Scanner(System.in);
       
       System.out.println("Entre the side of Square ");
       
       side = scan.nextFloat();
       
    }

    void compute()
    {
      area = side*side;

    }
}



class Circle extends Parent
{
    float radius;

    void input()
    {
       System.out.println("Calculation of Circle App "); 
       Scanner scan = new Scanner(System.in);
       
       System.out.println("Entre the Radius of circle- ");
       
       radius = scan.nextFloat();
       
    }

    void compute()
    {
      area = 3.14f * radius*radius;

    }
}




class Poly
{
     void poly(Parent ref)
     {
        ref.input();
        ref.compute();
        ref.display();
        System.out.println("*************************************************************");
        System.out.println();
     }
}




public class AreaCalculator  
{
    public static void main(String[] args) 
    {

    Rectangle r1 = new Rectangle();
     
        
     Square s1 = new Square();

     Circle c1 = new Circle();

     Poly p = new Poly();

     p.poly(r1);
     p.poly(s1);
     p.poly(c1);
     
     

    


    }
    
}
