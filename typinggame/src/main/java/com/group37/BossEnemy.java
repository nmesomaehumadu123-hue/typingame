package com.group37;

/**
 * BossEnemy represents a boss enemy in the typing game.
 * It implements the Enemy interface and has higher health and score value compared to normal enemies.
 */
public class BossEnemy implements Enemy {

    private String word;
    private int health;
    private int damage;
    private int scoreValue;

    /**
     * Constructs a new BossEnemy with the given word.
     * Sets health to three times the word length, damage to 3, and score value to 50.
     * @param word the word that the player must type to defeat this enemy
     */
    public BossEnemy(String word) {
        this.word = word;
        this.health = word.length() * 3;
        this.damage = 3;
        this.scoreValue = 50;
    }

    /**
     * Returns the word associated with this enemy.
     * @return the word that needs to be typed
     */
    public String getWord() {
        return word;
    }

    /**
     * Returns the current health of this enemy.
     * @return the health value
     */
    public int getHealth() {
        return health;
    }

    /**
     * Checks if this enemy is still alive.
     * @return true if health is greater than 0, false otherwise
     */
    public boolean isAlive() {
        return health > 0;
    }

    /**
     * Reduces the health of this enemy by the specified amount.
     * @param amount the amount of damage to take
     */
    public void takeDamage(int amount) {
        health -= amount;
    }

    /**
     * Updates the state of this enemy. Currently a placeholder for future boss logic.
     */
    public void update() {
        // boss logic later
    }

    /**
     * Returns the damage this enemy deals.
     * @return the damage value
     */
    public int getDamage() {
        return damage;
    }

    /**
     * Returns the score value awarded for defeating this enemy.
     * @return the score value
     */
    public int getScoreValue() {
        return scoreValue;
    }
}