public class Battle {
    private Monster[] monsters = new Monster[5];
    private int numberOfMonsters = 0;

    void add(Monster monster) {
        if (numberOfMonsters < 5) {
            monsters[numberOfMonsters] = monster;
            numberOfMonsters++;
        } else if (numberOfMonsters >= monsters.length) {
            System.out.println("No more monsters!");
        }
    }

    void start() {
        run();
    }

    void run() {
        int i = 0;
        while (i < 5 && monsters[i] != null) {
            monsters[i].attack(monsters[(int) (Math.random() * monsters.length)]);
            i++;
        }
    }

}
