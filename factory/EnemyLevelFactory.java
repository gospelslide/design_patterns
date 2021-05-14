package factory;

public class EnemyLevelFactory implements EnemyFactory {

    private int levelRequired;

    EnemyLevelFactory(int level) {
        this.levelRequired = level;
    }

    public Enemy getEnemy() {
        LoompaEnemy le = new LoompaEnemy();
        le.setLevel(levelRequired);
        // other complex init stuff;
        return le;
    }

}