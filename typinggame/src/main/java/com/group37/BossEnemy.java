package com.group37;

public class BossEnemy implements Enemy {

    private String word;
    private int health;
    private int damage;
    private int scoreValue;

    public BossEnemy(String word) {
        this.word = word;
        this.health = word.length() * 3;
        this.damage = 3;
        this.scoreValue = 50;
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
        // boss logic later
    }

    public int getDamage() {
        return damage;
    }

    public int getScoreValue() {
        return scoreValue;
    }
}