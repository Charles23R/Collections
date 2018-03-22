package tests;
import collections.*;

import static org.junit.jupiter.api.Assertions.*;

/**
 * Created by rench1732786 on 2018-03-22.
 */
class ArrayListTest {
    List arrayList;
    @org.junit.jupiter.api.BeforeEach
    void setUp() {
          arrayList =new ArrayList();
        for(int i=0; i<10; i++){
            arrayList.add(i);
        }
    }

    @org.junit.jupiter.api.Test
    void add1() {
        arrayList.add(0,"oui");
        arrayList.add(1, "non");
        for(int i=0; i<20; i++){
            arrayList.add("grow");
        }
        assertEquals("oui", arrayList.get(0));
        assertEquals("non", arrayList.get(1));
        assertEquals(0, arrayList.get(2));
        assertEquals(1, arrayList.get(3));
        assertEquals(2, arrayList.get(4));
        assertEquals(3, arrayList.get(5));
        assertEquals("grow", arrayList.get(19));
    }

    @org.junit.jupiter.api.Test
    void set() {
        arrayList.set(0, "set0");
        arrayList.set(4, "set4");
        assertEquals("set0",arrayList.get(0));
        assertEquals(1,arrayList.get(1));
        assertEquals("set4",arrayList.get(4));
        assertEquals(3,arrayList.get(3));
        assertEquals(5,arrayList.get(5));
    }

    @org.junit.jupiter.api.Test
    void remove() {
        arrayList.remove(3);
        arrayList.remove(1);
        arrayList.remove(0);
        assertEquals(2,arrayList.get(0));
        assertEquals(4,arrayList.get(1));
        assertEquals(5,arrayList.get(2));
        assertEquals(9,arrayList.get(6));
    }

    @org.junit.jupiter.api.Test
    void clear() {
        arrayList.clear();
        assertEquals(0,arrayList.size());
        arrayList.add("clear");
        assertEquals("clear",arrayList.get(0));
    }
}