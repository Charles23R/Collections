package tests;

import collections.*;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class PileTest {
    Pile pile;
    @BeforeEach
    void setUp() {
        pile = new Pile();
        for(int i=0; i<10; i++){
            pile.push(i);
        }
    }

    @Test
    void pop() {
        assertEquals(9,pile.pop());
        assertEquals(8,pile.pop());
    }

    @Test
    void peek() {
        assertEquals(9,pile.peek());
    }

    @Test
    void clear() {
        pile.clear();
        assertEquals(0,pile.size());
    }

    @Test
    void size() {
        assertEquals(10,pile.size());
    }

}