import java.awt.print.Book;

public class Player extends Human {

    protected Backpack backpack;


    public Player(String name) {
        super(name + " the Player");
        backpack = new Backpack();
    }

    public void take(String smth) {
        backpack.put(smth);
    }

    class Backpack {
        public String staff = "";

        void put(String item) {
            staff += item + ",";
        }

        @Override
        public String toString() {
            if (staff.equals("")) return "the backpack is empty";
            else return staff.substring(0, staff.length() - 1) + " in the backpack";
        }
    }
}
