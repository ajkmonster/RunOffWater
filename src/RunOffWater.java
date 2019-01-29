import java.util.Scanner;

public class RunOffWater {
    public static void main(String[] args){
    double lengthft;
    double widthft;
    double lengthin;
    double widthin;
    double rainfall;
    double cubicwater;
    double gallonwater;
        System.out.println("Please enter length of roof in ft: ");
        Scanner key = new Scanner(System.in);
        lengthft = key.nextDouble();
        System.out.println("Please enter width of roof in ft: ");
        Scanner key2 = new Scanner(System.in);
        widthft = key2.nextDouble();
        System.out.println("Please enter amount of rainfall in inches:");
        Scanner key3 = new Scanner(System.in);
        rainfall = key3.nextDouble();
        lengthin = lengthft*12;
        widthin=widthft*12;
        cubicwater = lengthin * widthin * rainfall;
        gallonwater = cubicwater/231;
        System.out.println("Gallons of water runoff: " + gallonwater);
    }
}
/* scanner length of roof ft
scanner width of roof ft
scanner inches of rainfall
length of roof in equals length of roof ft * 12
width of roof in equals width of roof ft *12
calculate cubic in of water
cubic in of water = length of roof in * width of roof in * inches of rainfall
calculate gallons of water
gallons of water = cubic in of water/ 231
display gallons of water
*/