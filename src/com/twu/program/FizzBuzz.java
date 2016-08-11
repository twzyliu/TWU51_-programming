package com.twu.program;

/**
 * Created by zyongliu on 16/8/11.
 */
public class FizzBuzz {
    public static void fizzBuzz( int n ){
        for( int i=1; i<=n; i++ ) {
            if (i % 3 != 0 && i % 5 != 0) System.out.print(i);
            if (i % 3 == 0) System.out.print("Fizz");
            if (i % 5 == 0) System.out.print("Buzz");
            System.out.println();
        }
    }

    public static void main(String[] args){
        FizzBuzz.fizzBuzz(100);
    }
}
