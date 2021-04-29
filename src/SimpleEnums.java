public class SimpleEnums {
    public static void main(String[] args) {


    }

    //Simple enum declaration as inner class
    public enum Move {
        //All names in uppercase letters because they are constants.
        LEFT, RIGHT, FORWARD, BACKWARD;
    }

//     Enum is a special "class" that should be used when you need to represent fixed set of constants.

//     Enum can't inherit from other classes and other classes can't inherit from Enum

//      What happens underneath.
//      public final class SimpleEnums$SimpleEnumDirections extends java.lang.Enum<SimpleEnums$SimpleEnumDirections>
//      {
//      public static final SimpleEnums$SimpleEnumDirections LEFT;
//      public static final SimpleEnums$SimpleEnumDirections RIGHT;
//      public static final SimpleEnums$SimpleEnumDirections FORWARD;
//      public static final SimpleEnums$SimpleEnumDirections BACKWARD;
//      public static SimpleEnums$SimpleEnumDirections[] values();
//      public static SimpleEnums$SimpleEnumDirections valueOf(java.lang.String);
//      static {};
//      }


//    Enum can implement interfaces

    public enum Size implements SizeInterface {
        XS, S, M, L, XL;

        @Override
        public void showSize() {

        }
    }

    public Move move = Move.FORWARD;
    //Another way of creating enum
    public Move anotherMove = Move.valueOf("LEFT");

    //      Comparing enum should be done with == instead of equals()

    boolean isForward = move == Move.FORWARD ? true : false;
    boolean isLeft = move == Move.LEFT ? true : false;

    //      Enum in switch and if.
    void printMove(Move move) {
        if (move == Move.FORWARD) {
            System.out.println("You are moving forward");
        } else if (move == Move.BACKWARD) {
            System.out.println("You are moving backwards");
        } else if (move == Move.LEFT) {
            System.out.println("You are moving left");
        } else if (move == Move.RIGHT) {
            System.out.println("You are moving right");
        }
    }

    void printDirection(Move move) {
        switch (move) {
            case RIGHT:
                System.out.println("Right");
                break;
            case LEFT:
                System.out.println("Left");
                break;
            case FORWARD:
                System.out.println("Forward");
            case BACKWARD:
                System.out.println("Backward");
            default:
                System.out.println("Not moving");
        }
    }

    //Enum Iteration
    void enumIteration() {
        //Built in values method returns Array with all possible values
        for (Move move : Move.values()) {
            //Will automatically use toString()
            System.out.println(move);
        }
    }

    //Enum can have fields
    public enum RockyPlanets {
        MERCURY(1, "No atmosphere"),
        WENUS(2, "Too thick atmosphere"),
        EARTH(3, "Just right"),
        MARS(4, "Too thin atmosphere");


        private int position;
        private String message;

        //Constructor always private
        RockyPlanets(int position, String message) {
            this.position = position;
            this.message = message;

        }

        //Enum can have methods
        public void showMessage() {
            System.out.println(this.message);
        }
    }


}