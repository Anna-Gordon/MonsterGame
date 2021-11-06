public class GiantSnake extends Monster implements Fighter {
    public static String scream = "Ssssss ";

    public GiantSnake(String name) {
        super(name + " the GiantSnake", 7);
    }

    public void growl() {
        System.out.print(scream);
        super.growl();
    }

    public void growl(boolean loud) {
        if (!loud) {
            growl();
        } else {
            System.out.print(scream.toUpperCase());
            super.growl();
        }
    }

    @Override
    public void attack(Entity monster) {
        growl(true);
        System.out.println("     ...and hid in the grass");
        monster.damage(getForce());
    }
}
