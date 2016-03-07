package com.company;

public class Main {

    public static void main(String[] args) {
	// write your code here

        int x = 1041;
        //x = 328;

        System.out.println(x);

        System.out.println(solution(x));

        System.out.println(Integer.toBinaryString(x));
    }

    static int prev= 0;

    //TODO improve and clean up
    public static int solution(int N){
        int count = 0;
        prev = N;
        //System.out.println("Start " + N);
        //System.out.println(" N " + Integer.toBinaryString(N));
        //System.out.println("~N " + Integer.toBinaryString(~N));
        if(N % 2 == 0){
            N = (N >> 1);
            //System.out.println("% " +  Integer.toBinaryString(N));
        }
        if(~N != 0) {
            N = ((N | N << 1) >> 1);
            if(N != prev)
                count = 1 + solution(N);
            //System.out.println("~ " + Integer.toBinaryString(N));
        }

        return count;

        /*
        System.out.println(N);
        String bin = Integer.toBinaryString(N);
        System.out.println(bin);
        int loc = 0;
        if(bin.charAt(0) == '1'){

            System.out.println("loc " + loc + " bin: " + bin);
            bin = bin.substring(1);
            loc = bin.indexOf("1");
            System.out.println("loc " + loc + " bin: " + bin);
            if(loc == -1){
                return count;
            }
            if(loc > count) {
                count = loc;
            }
            System.out.println("count is " + count);
        }

        int test = Integer.parseInt(bin.substring(loc), 2);
        System.out.println(test);


        solution(test);

        return count;
        */
        /*if(N == 1){
            System.out.println();
            return count;
        }

        int len = Integer.toBinaryString(N).length();

        System.out.print("\t" + N + " " + len + " "  + (Math.pow(2,len-1)) + "-->");

        if(N%(Math.pow(2,len-1)) == 0 && prev){
            System.out.print("0\n");
            count++;
        }
        else{
            count = 0;
            prev = true;
            System.out.print("1\n");
        }
        solution(N>>1);
        return count;
        */
    }
}