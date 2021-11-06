public abstract class Monster extends Entity{
    private String sound;

    protected int force;

    public Monster(String name, int force) {
        this.name = name;
        this.force = force;
        System.out.println("Monster " + name + " was created");
    }

    protected int getForce() {
        return force;
    }

    public void growl() {
        System.out.println(this.name + " growled");
    }
}
