package com.group37;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class NormalEnemyTest {

    @Test
    public void testHealth() {
        NormalEnemy e = new NormalEnemy("cat");
        assertEquals(3, e.getHealth());
    }

    @Test
    public void testDamage() {
        NormalEnemy e = new NormalEnemy("dog");
        e.takeDamage(1);
        assertEquals(2, e.getHealth());
    }

    @Test
    public void testDeath() {
        NormalEnemy e = new NormalEnemy("hi");
        e.takeDamage(2);
        assertFalse(e.isAlive());
    }
}