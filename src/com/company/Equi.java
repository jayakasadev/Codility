package com.company;

public class Equi {

    static int equilibrium(int arr[])
    {
        int sum = 0;      // initialize sum of whole array
        int leftsum = 0; // initialize leftsum
        int i;
        int n = arr.length;

	   /* Find sum of the whole array */
        for (i = 0; i < n; ++i)
            sum += arr[i];

        for( i = 0; i < n; ++i)
        {
            sum -= arr[i]; // sum is now right sum for index i

            if(leftsum == sum)
                return i;

            leftsum += arr[i];
        }

	    /* If no equilibrium index found, then return 0 */
        return -1;
    }

    public static void main(String[] args){
        //int arr[] = {-7, 1, 5, 2, -4, 3, 0};
        //System.out.println("First equilibrium index is " + equilibrium(arr));

        Password p = new Password();
        p.password("Ba0816Cdafdgwrqw");
        System.out.println();
        //p.password("BABSDUSIbiasdifoh21392i1=-oikasdnasn ;lm;/;m[   kwp[qe-jn ADasd651`=]'\32A5SW D6A   64S1s16df 6413");
        //System.out.println();
        p.password("BABSDUSIbiasdifoh21392i1D=-oikasdnasn ;lm;/;m[   kwp[qe-jn ADasd651`=]'\32A5SW D6A   64S1s16df 6413");

        RandomRules r = new RandomRules();
        System.out.println(r.matches("ABBAC"));
    }
}

