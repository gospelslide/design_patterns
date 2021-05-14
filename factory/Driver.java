package factory;

public class Driver {
    public static void main(String args[]) {
        EnemyFactory ef = new EnemyLevelFactory(5); // parent can hold obj of any diff child factories;
        Enemy e = ef.getEnemy();
        System.out.println(e.attackSound());
    }
}