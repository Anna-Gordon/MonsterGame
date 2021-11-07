public class Zombie extends Monster implements Fighter {
    private static String scream = "Raaaauuughhhh ";

    public Zombie(String name) {
        super(name + " the Zombie", 5);
    }


    public void growl() {
        System.out.print(scream);
    }

    public void growl(boolean volume) {
        if (volume) System.out.print(scream.toUpperCase());
        else System.out.print(scream);
        growl();
    }

    public void attack(Entity entity) {
        this.growl();
        entity.damage(getForce());
    }
}
