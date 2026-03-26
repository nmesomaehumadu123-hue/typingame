package com.group37;

/**
 * NormalEnemy represents a standard enemy in the typing game.
 * It implements the Enemy interface with basic health, damage, and score values.
 */
public class NormalEnemy implements Enemy {

    private String word;
    private int health;
    private int damage;
    private int scoreValue;

    /**
     * Constructs a new NormalEnemy with the given word.
     * Sets health to the word length, damage to 1, and score value to 10.
     * @param word the word that the player must type to defeat this enemy
     */
    public NormalEnemy(String word) {
        this.word = word;
        this.health = word.length();
        this.damage = 1;
        this.scoreValue = 10;
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
     * Updates the state of this enemy. Currently a placeholder for future movement logic.
     */
    public void update() {
        // movement later
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