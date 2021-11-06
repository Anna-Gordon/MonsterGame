public class Entity {
    protected String name;
    protected boolean destroyed = false;
    private int hp = 15;

    public Entity(String name) {
        this.name = name;
    }

    public Entity() { this("Entity"); }

    public boolean isDestroyed() {
        return destroyed;
    }

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
}

