package tests;

import collections.*;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class FileTest {
    File file;
    @BeforeEach
    void setUp() {
        file = new File();
        for(int i=0; i<10; i++){
            file.add(i);
        }
    }

    @Test
    void remove() {
        assertEquals(0,file.remove());
        assertEquals(1, file.remove());
    }

    @Test
    void peek() {
        assertEquals(0, file.peek());
    }

    @Test
    void clear() {
        file.clear();
        assertEquals(0,file.size());
    }

    @Test
    void size() {
        assertEquals(10, file.size());
    }

}