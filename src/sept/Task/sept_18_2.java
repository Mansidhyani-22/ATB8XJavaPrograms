package sept.Task;

public class sept_18_2 {
    public static void main(String[] args) {
        //TASK 1:
        //Give some another example of Widening with Implicit
        //and Explicit, Narrowing with implicit and explicit.

        int a=80;
        long b=a; //implicit widening
        System.out.println(b);

        short c=75;
        float d=(float)c; //explicit widening
        System.out.println(d);

        int f = 350;
        byte value1 = (byte)f; //Valid Explicit casting --Loss of data
        System.out.println(value1);
    }
}
