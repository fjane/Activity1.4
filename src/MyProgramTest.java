import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MyProgramTest {

    @DisplayName("Test check for Sum Method")

    @org.junit.jupiter.api.Test
    void sum() {
        MyProgram mp = new MyProgram();
        int result = mp.sum(1,2);
        assertEquals(3,result);
    }

    @org.junit.jupiter.api.Test
    void sum1() {
        MyProgram mp = new MyProgram();
        int result = mp.sum(2,1);
        assertEquals(3,result);
    }

    @org.junit.jupiter.api.Test
    void sum2() {
        MyProgram mp = new MyProgram();
        int result = mp.sum(0,-1);
        assertEquals(-1,result);
    }

    @org.junit.jupiter.api.Test
    void sum3() {
        MyProgram mp = new MyProgram();
        int result = mp.sum(-1,-1);
        assertEquals(-2,result);
    }


    @DisplayName("Test check for multiplyByAdding Method")

    @org.junit.jupiter.api.Test
    void multiplyByAdding() {
        MyProgram mp = new MyProgram();
        int result = mp.multiplyByAdding(10,2);
        assertEquals(20,result);
    }

    @org.junit.jupiter.api.Test
    void multiplyByAdding1() {
        MyProgram mp = new MyProgram();
        int result = mp.multiplyByAdding(1,25);
        assertEquals(25,result);
    }

    @org.junit.jupiter.api.Test
    void multiplyByAdding2() {
        MyProgram mp = new MyProgram();
        int result = mp.multiplyByAdding(-10,2);
        assertEquals(-20,result);
    }

    @org.junit.jupiter.api.Test
    void multiplyByAdding3() {
        MyProgram mp = new MyProgram();
        int result = mp.multiplyByAdding(10,-2);
        assertEquals(-20,result);
    }

    @org.junit.jupiter.api.Test
    void multiplyByAdding4() {
        MyProgram mp = new MyProgram();
        int result = mp.multiplyByAdding(5,1);
        assertEquals(5,result);
    }

    @org.junit.jupiter.api.Test
    void multiplyByAdding5() {
        MyProgram mp = new MyProgram();
        int result = mp.multiplyByAdding(5,0);
        assertEquals(0,result);
    }

    @org.junit.jupiter.api.Test
    void multiplyByAdding6() {
        MyProgram mp = new MyProgram();
        int result = mp.multiplyByAdding(-1,-1);
        assertEquals(1,result);
    }


    @DisplayName("Test check for divideBy Method")
    @org.junit.jupiter.api.Test
    void divideBy() {
    }

    @org.junit.jupiter.api.Test
    void divideBy1() {
        MyProgram mp = new MyProgram();
        double result = mp.divideBy(10,2);
        assertEquals(5,result);
    }

    @org.junit.jupiter.api.Test
    void divideBy2() {
        MyProgram mp = new MyProgram();
        double result = mp.divideBy(1,25);
        assertEquals(0.04,result);
    }

    @org.junit.jupiter.api.Test
    void divideBy3() {
        MyProgram mp = new MyProgram();
        double result = mp.divideBy(-10,2);
        assertEquals(-5,result);
    }

    @org.junit.jupiter.api.Test
    void divideBy4() {
        MyProgram mp = new MyProgram();
        double result = mp.divideBy(10,-2);
        assertEquals(-5,result);
    }

    @org.junit.jupiter.api.Test
    void divideBy5() {
        MyProgram mp = new MyProgram();
        double result = mp.divideBy(5,1);
        assertEquals(5,result);
    }

    @org.junit.jupiter.api.Test
    void divideBy6() {
        MyProgram mp = new MyProgram();
        double result = mp.divideBy(0,10);
        assertEquals(0,result);
    }

}