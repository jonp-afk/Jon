/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package forloopsstars;

/**
 *
 * @author jprice2027
 */
public class ForLoopsStars {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        final int MIN_ROWS_A = 1;
System.out.println("a.");
//for each row
for (int row = 10; row >= MIN_ROWS_A; row--) //rows now decreasing to lessen the amount of stars per row
{
//print out the appropriate number of stars for that row
for (int star = 1; star <= row; star++){
System.out.print("*");
}
//newline for a new row
System.out.println();
}

System.out.println("b.");
final int MAX_ROWS_B = 10;
for (int row = 1; row <= MAX_ROWS_B; row++)
{
//print out the appropriate number of spaces for that row
for (int spaces = 9; spaces >= row; spaces--){
System.out.print(" ");
}
//prints the right amount of stars per row
for (int star = 1; star <= row; star++){
System.out.print("*");
}
//newline for a new row
System.out.println();
}

System.out.println("c.");
final int MIN_ROWS_C = 1;
for (int row = 10; row >= MIN_ROWS_C; row--) //again, we decrease the rows
{
//print out the appropriate number of spaces for that row
for (int spaces = 9; spaces >= row; spaces--){
System.out.print(" ");
}
//prints the approrpiate star count
for (int star = 1; star <= row; star++){
System.out.print("*");
}
//newline for a new row
System.out.println();
}

System.out.println("d.");
final int MAX_ROWS_D = 10;
for (int row = 1; row <= MAX_ROWS_D; row+=2)//incrament by 2 to so stars go up by two per row as well
{
//print out the appropriate number of spaces for that row
for (int spaces = 7; spaces >= row; spaces-=2){//also incramenting down by 2 to center the stars properly
System.out.print(" ");
}
//print the right amount of stars for that row
for (int star = 1; star <= row; star++){
System.out.print("*");
}
//newline for a new row
System.out.println();
}

//we then start a new series of loops and do the same thing but reversed
final int MIN_ROWS_D = 1;
for (int row = 9; row >= MIN_ROWS_D; row-=2)
{
//print out the appropriate number of spaces for that row
for (int spaces = 7; spaces >= row; spaces-=2){
System.out.print(" ");
}
//prints the right amount of stars for that row
for (int star = 1; star <= row; star++){
System.out.print("*");
}
//newline for a new row
System.out.println();
}

    }
    
}
