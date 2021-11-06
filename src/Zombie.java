public class Zombie extends Monster {
    public static String scream = "Raaaauuughhhh ";

    public Zombie(String name) {
        super(name + " the Zombie", 5);
    }


    public void growl() {
        System.out.print(scream);
        super.growl();
    }

    public void growl(boolean volume) {
        if (volume) System.out.print(scream.toUpperCase());
        else System.out.print(scream);
        super.growl();
    }

    public void attack(Monster monster) {
        this.growl();
        monster.damage(getForce());
    }
}
