abstract class Monster {
    private String name;
    private int damage;
    private String sound;

    private int force;
    private int hp = 15;
    private boolean destroyed = false;

    public Monster(String name, int force) {
        this.name = name;
        this.force = force;
        System.out.println("Monster " + name + " was created");
    }

    protected int getForce() {
        return force;
    }

    public boolean isDestroyed() {
        return destroyed;
    }

    abstract public void attack(Monster monster);

    protected boolean damage(int dhp) {
        hp -= dhp;
        if (hp <= 0) {
            destroyed = true;
            System.out.println("Monster " + name + " was destroyed");
            return true;
        } else {
            return false;
        }
    }

    public void growl() {
        System.out.println(this.name + " growled");
    }
}
