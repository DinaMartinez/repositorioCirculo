package circulo;
import java.util.Scanner;

public class Circulo 
{

    public static void main(String[] args)
    {
     
        final double PI=3.1416;
       
        Scanner s=new Scanner(System.in);
        System.out.println("Introduce el radio:");
        double r=s.nextDouble();
        double area=(PI*r*r);
        System.out.printf("El valor del área es %f\n", area);
    }
}    