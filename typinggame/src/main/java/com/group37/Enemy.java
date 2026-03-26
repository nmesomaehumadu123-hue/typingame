package com.group37;

/**
 * Enemy interface defines the contract for enemy objects in the typing game.
 * Enemies have a word to type, health, damage, and score value.
 */
public interface Enemy {

    /**
     * Returns the word that the player must type to defeat this enemy.
     * @return the word to type
     */
    String getWord();

    /**
     * Returns the current health of this enemy.
     * @return the health value
     */
    int getHealth();

    /**
     * Checks if this enemy is still alive.
     * @return true if alive, false if defeated
     */
    boolean isAlive();

    /**
     * Applies damage to this enemy, reducing its health.
     * @param amount the amount of damage to apply
     */
    void takeDamage(int amount);

    /**
     * Updates the state of this enemy. Called each game tick.
     */
    void update();

    /**
     * Returns the damage this enemy deals to the player.
     * @return the damage value
     */
    int getDamage();

    /**
     * Returns the score value awarded for defeating this enemy.
     * @return the score value
     */
    int getScoreValue();
}