import java.util.Random;

/**
 * Created by Brad on 2/06/2016.
 */
public class MasterTheorem extends Algorithms {

    Algorithms A = new Algorithms();
    Random rand = new Random();

    public void masterTheorem () {

        int a = A.returnRandom() + 1; //making sure that a is always >= 1
        int b = A.returnRandom() + 2; //making sure that b is always > 1
        int d = rand.nextInt(2);


        //PLEASE READ:
        //Unicodes don't print properly in Windows cmd line, so for compatibility's sake I've disabled them for now.
        //Feel free to uncomment and explore the nicely formatted formulas on your Mac/Linux system.

        //Mathmatical Unicodes
        /*String aScript = "\uD835\uDC4E";
        String bScript = "\uD835\uDC4F";
        String dScript = "\uD835\uDC4E";
        String tScript = "\uD835\uDC47";
        String nScript = "\uD835\uDC5B";*/


        //Print recurrence
        //Unicode version:
        /*System.out.println("\n"+tScript+"("+nScript+") = "+a+tScript+"("+nScript+"/"+b+") + "+d+"\n\n");*/

        //Vanilla version:
        System.out.println("\n T(n) = " + a + "T(n/" + b + ") + " + d + "\n\n");

        //Apply Master Theorem to calculate answer
        if (d == 0) {
            System.out.println("Master Theorem can't be applied because d is equal to 0.");

        } else if (a < Math.pow(b, d)) {
            /*System.out.println(aScript+" = "+a+" is SMALLER than "+bScript+" = "+b+A.superScript(Integer.toString(d))+
                    ". \n\n Therefore:");*/
            System.out.println("a = " + a + " is SMALLER than b = " + b + " to the power of " + d +
                    ". \n\n Therefore:");
            /*System.out.println("    Θ" + nScript + A.superScript(Integer.toString(d)));*/
            System.out.println("    theta n to the power of "+d);

        } else if (a == Math.pow(b, d)) {
            /*System.out.println(aScript + " = " + a + " is EQUAL to " + bScript + " = " + b + A.superScript(Integer.toString(d)) +
                    ". \n\n Therefore:");*/
            System.out.println("a = " + a + " is EQUAL than b = " + b + " to the power of " + d +
                    ". \n\n Therefore:");
            /*System.out.println("    Θ(" + nScript + A.superScript(Integer.toString(d)) + " log " + nScript + ")");*/
            System.out.println("    theta(n to the power of "+d+" log n)");

        } else if (a > Math.pow(b, d)) {
            /*System.out.println(aScript + " = " + a + " is GREATER than " + bScript + " = " + b + A.superScript(Integer.toString(d)) +
                    ". \n\n Therefore:");*/
            System.out.println("a = " + a + " is GREATER than b = " + b + " to the power of " + d +
                    ". \n\n Therefore:");
            /*System.out.println("    Θ(" + nScript + " to the power of log" + A.subScript(Integer.toString(b)) + a + ")");*/
            System.out.println("    theta(n to the power of log base "+b+" "+a+")");
        }
        System.out.println("\n\n");
    }
}
