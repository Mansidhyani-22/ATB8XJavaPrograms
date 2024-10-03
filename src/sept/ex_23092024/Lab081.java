package sept.ex_23092024;

public class Lab081 {
    public static void main(String[] args) {
        int itemcode = 003;
        switch (itemcode){
            default:
                System.out.println("None");
                System.out.println("None");
                System.out.println("None");
                System.out.println("None");
                System.out.println("None");
                break;
            case 001,002,005:
                System.out.println("All of the them are Electronic Gadget");
                System.out.println("All of the them are Electronic Gadget");
                System.out.println("All of the them are Electronic Gadget");
                break;
            case 004,006,007:
                System.out.println("This is Mech");
                System.out.println("This is Mech");
                System.out.println("This is Mech");
                break;

        }
    }
}
