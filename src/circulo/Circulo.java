package circulo;
import static java.lang.Math.PI;
import java.util.Scanner;

public class Circulo 
{
    public static void calcularArea(double r)
    {
        double area=(PI*r*r);
        System.out.println("El valor del área del círuclo es " + area);
    }
    
    public static void calcularDiametro(double r)
    {
        double diametro=2*r;
        System.out.println("El valor del diámetro del círuclo es " + diametro);
    }

    public static void main(String[] args)
    {
     
        final double PI=3.1416;
        
        try
        {
            Scanner s=new Scanner(System.in);

            System.out.println("Introduce el radio:");
            double r=s.nextDouble();
            double area=(PI*r*r);
            System.out.printf("El valor del área es %f\n", area);
        }
        catch(Exception e)
        {
            System.out.println(e.getMessage());
        }
    }
}    
