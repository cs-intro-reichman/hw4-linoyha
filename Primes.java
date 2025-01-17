public class Primes {
    public static void main(String[] args) {
        int N = Integer.parseInt(args[0]);
        int p = 2;
        boolean isprime [] = new boolean[N+1];
        for (int i = 0; i < isprime.length; i++) {
            if ( i > 1) {
                isprime[i]= true;
            }
            else {
                isprime[i] = false;
            }
        }
        while (p < Math.sqrt(N)) {
                int index = p;
                while (index < isprime.length) {
                    if(index % p == 0 && index!=p) {
                        isprime [index] = false;
                    }
                    index++;
                }
                for (int i = p + 1; i < isprime.length; i++) {
                    if (isprime[i]) {
                        p = i;
                        break;
                    }
                }
        }
        
        System.out.println("Prime numbers up to "+N+":");
        int count = 0;
            for (int i = 0; i < isprime.length; i++) {
                if (isprime[i]) {
                    count++;
                    System.out.println(i); 
                }
            }
            double precent = ((double)count / (double)N) * 100;

        System.out.println("There are " +count + " primes between 2 and "+N+" ("+(int)precent+"% are primes)");


    }
}
