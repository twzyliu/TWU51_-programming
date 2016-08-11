package com.twu.program;

/**
 * Created by zyongliu on 16/8/11.
 */
public class Diamond {

    public static void printCenteredTriangle( int n ) {
        int startPointOfEachLine = (2 * n - 1) / 2;
        int totalCountOfEachLine = 1;

        for( int i=0; i<n; i++, startPointOfEachLine--, totalCountOfEachLine += 2 )
            printALineFromSomePoint(startPointOfEachLine, totalCountOfEachLine);
    }

    public static void printCenteredDiamond( int n ) {
        printCenteredTriangle(n);

        int startPointOfEachLine = 1;
        int totalCountOfEachLine = 2 * n - 3;

        for( int i=0; i<n-1; i++, startPointOfEachLine++, totalCountOfEachLine -= 2 )
            printALineFromSomePoint( startPointOfEachLine, totalCountOfEachLine );
    }

    public static void printDiamondWithName( int n, String name ){

        int startPointOfLine = (2 * n - 1) / 2;
        int totalCountOfLine = 1;
        for( int i=0; i<n-1; i++, startPointOfLine--, totalCountOfLine += 2 )
            printALineFromSomePoint(startPointOfLine, totalCountOfLine);

        System.out.println(name);

        startPointOfLine = 1;
        totalCountOfLine = 2 * n - 3;
        for( int i=0; i<n-1; i++, startPointOfLine++, totalCountOfLine -= 2 )
            printALineFromSomePoint(startPointOfLine, totalCountOfLine);
    }

    public static void printALineFromSomePoint( int startPoint, int totalCount ){
        for( int i=0; i<startPoint; i++ )   System.out.print(" ");
        for( int i=0; i<totalCount; i++ )   System.out.print("*");
        System.out.println();
    }

    public static void main( String[] args ) {
        Triangle.printSegmentLine("centered triangle:");
        Diamond.printCenteredTriangle(3);

        Triangle.printSegmentLine("centered diamond:");
        Diamond.printCenteredDiamond(3);

        Triangle.printSegmentLine("diamond with name:");
        Diamond.printDiamondWithName(3, "Petrina");

    }
}
