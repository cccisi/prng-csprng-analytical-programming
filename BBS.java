public class bbs {
   private double p, q, M, seed, actual;
   public bbs(double p, double q, double seed) {
       this.p = p;
       this.q = q;
       this.M = p*q;
       this.seed = seed;
       this.actual = seed;
   }
 
   public double getrandom() {
 
       double r = actual*actual%M;
       actual = r;
       return r/M;
   }
 
   private double gcd(double a, double b) {
 
       if(b == 0) return a;
       return gcd(b, a%b);
 
   }
 
   public double getirandom(int i) {
       double g = gcd(p, q);
       double l = (p-1)*(q-1)/g;
 
       double exp = 1;
       for(int j = 1; j <= i; ++j) exp = exp*2%l;
 
       double x0 = seed*seed;
       double r = x0;
       for(double j = 2; j<=exp; ++j ) {
           r = r*x0%M;
       }
       return r/M;
   }
 }


/**main class:**/
Print numbers main class:
public class main {
   
       public static void main(String[] args) {
           double p = 11;
           double q = 19;
           double seed = 3;
   
           bbs b = new bbs(p,q,seed);
   
           System.out.println("1000 random numbers from 0 to 1:");
           for(int i = 0; i <= 1000; ++i) {
               if(i % 5 == 0)
            	   System.out.print("\n");
               		System.out.print(b.getrandom());
           }
       }
   
   }

/**Print numbers main class:**/
public class main {
	
    public main(String[] args) {
        double p = 11;
        double q = 19;
        double seed = 3;
        double a[] = null;
        bbs b = new bbs(p,q,seed);

        for(int i = 0; i <= 1000; ++i) {
            a[i] = b.getrandom();
        }
       
        double sum = 0;
        double r = 0;
        for (int j = 0; j < 1000; j += 2)
        {
        	do
        	{
        		r = a[j] % a[j + 1];
        		a[j] = a[j + 1];
        		a[j + 1] = r;
        	} while (r != 0);		if (a[j] == 1)
        		sum = sum + 1;
        }


        double piSqr = 3000 / (sum * pow(10, 17);
        System.out.println("Estimate value of Pi is: " + Math.sqrt(piSqr));
    }
}

