public class GiantSnake extends Monster implements Fighter {
    private static String scream = "Ssssss ";

    public GiantSnake(String name) {
        super(name + " the GiantSnake", 7);
    }

    public void growl() {
        System.out.print(scream);
    }

    public void growl(boolean loud) {
        if (!loud) {
            growl();
        } else {
            System.out.print(scream.toUpperCase());
            growl();
        }
    }

    @Override
    public void attack(Entity m) {
        growl(true);
        System.out.println("     ...and hid in the grass");
        m.damage(getForce());
    }
}
