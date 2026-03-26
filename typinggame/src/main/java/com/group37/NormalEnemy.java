package com.group37;

public class NormalEnemy implements Enemy {

    private String word;
    private int health;
    private int damage;
    private int scoreValue;

    public NormalEnemy(String word) {
        this.word = word;
        this.health = word.length();
        this.damage = 1;
        this.scoreValue = 10;
    }

    public String getWord() {
        return word;
    }

    public int getHealth() {
        return health;
    }

    public boolean isAlive() {
        return health > 0;
    }

    public void takeDamage(int amount) {
        health -= amount;
    }

    public void update() {
        // movement later
    }

    public int getDamage() {
        return damage;
    }

    public int getScoreValue() {
        return scoreValue;
    }
}