package tests;
import collections.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

/**
 * Created by rench1732786 on 2018-03-22.
 */
class LinkedListTest {
    List linkedlist;
    @BeforeEach
    void setUp() {
        linkedlist = new LinkedList();
        for(int i=0; i<10; i++){
            linkedlist.add(i);
        }
    }

    @Test
    void add() {
        linkedlist.add(0, "oui");
        linkedlist.add(5,"non");
        linkedlist.add(-3,9);
        linkedlist.add(1000,9);
        linkedlist.add(linkedlist.size(),"size");
        assertEquals("oui",linkedlist.get(0));
        assertEquals(0,linkedlist.get(1));
        assertEquals(1,linkedlist.get(2));
        assertEquals("non",linkedlist.get(5));
        assertEquals(4,linkedlist.get(6));
        assertEquals("size",linkedlist.get(linkedlist.size()-1));
    }

    @Test
    void set() {
        linkedlist.set(0, "set0");
        linkedlist.set(4, "set4");
        assertEquals("set0",linkedlist.get(0));
        assertEquals(1,linkedlist.get(1));
        assertEquals("set4",linkedlist.get(4));
        assertEquals(3,linkedlist.get(3));
        assertEquals(5,linkedlist.get(5));
    }

    @Test
    void get() {
        for (int i=0; i<linkedlist.size();i++){
            System.out.println(linkedlist.get(i));
        }
    }

    @Test
    void remove() {
        linkedlist.remove(3);
        linkedlist.remove(1);
        linkedlist.remove(0);
        assertEquals(2,linkedlist.get(0));
        assertEquals(4,linkedlist.get(1));
        assertEquals(5,linkedlist.get(2));
        assertEquals(9,linkedlist.get(6));
    }

    @Test
    void clear() {
    }

    @Test
    void size() {
    }

}