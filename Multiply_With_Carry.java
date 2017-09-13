import java.util.Random;
 
public class Multiply_With_Carry 
{
    public static void main(String args[])
    {
        int max_Sequence_Elements = 100;
        Random random = new Random();
        int base_b = 2000;
        int multiplier_a = random.nextInt(base_b);
        int r = 1;
        int []c = new int[max_Sequence_Elements];
        int []x = new int[max_Sequence_Elements];
 
        c[0] = random.nextInt(multiplier_a);
        x[0] = random.nextInt(base_b);
 
        System.out.print("The random numbers are:");
        System.out.print("\n");
        System.out.print (x[0]);
        
        for(int i=1; i<max_Sequence_Elements; i++)
        {
            x[i] = (multiplier_a*x[i-r] + c[i-1]) % base_b;
            c[i] = (multiplier_a*x[i-r] + c[i-1]) / base_b;
            System.out.print(" " + x[i]);
            if(i % 10 == 0)
                System.out.print("\n");
        }
    }
}
