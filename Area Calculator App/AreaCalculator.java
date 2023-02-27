import java.util.Scanner;



abstract class Shape
{
    
    float area;

    abstract void input();
    abstract void compute();

    void display()
    {
        System.out.println("Area is - " + area +" unit sq");

    }
}
    

    class Rectangle extends Shape
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


class Square extends Shape
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



class Circle extends Shape
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




class Geomatry
{
     void poly(Shape ref)
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

    Rectangle rec = new Rectangle();
     
        
     Square sq = new Square();

     Circle cr = new Circle();

     Geomatry p = new Geomatry();

     p.poly(rec);
     p.poly(sq);
     p.poly(cr);
     
     

    


    }
    
}
