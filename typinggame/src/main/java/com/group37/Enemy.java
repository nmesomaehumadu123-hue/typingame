package com.group37;

public interface Enemy {

    String getWord();

    int getHealth();

    boolean isAlive();

    void takeDamage(int amount);

    void update();

    int getDamage();

    int getScoreValue();
}