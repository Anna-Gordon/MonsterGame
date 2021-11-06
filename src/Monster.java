public abstract class Monster extends Entity{
    private String sound;

    protected int force;
//    private int hp = 15;

    public Monster(String name, int force) {
        this.name = name;
        this.force = force;
        System.out.println("Monster " + name + " was created");
    }

    protected int getForce() {
        return force;
    }

//    protected boolean damage(int dhp) {
//        hp -= dhp;
//        if (hp <= 0) {
//            destroyed = true;
//            System.out.println("Monster " + name + " was destroyed");
//            return true;
//        } else {
//            return false;
//        }
//    }

    public void growl() {
        System.out.println(this.name + " growled");
    }
}
