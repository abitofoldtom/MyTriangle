/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author tguerney
 */
public class TriClassTest {

    private TriClass triClass;

    public TriClassTest() {
    }

    @BeforeClass
    public static void setUpClass() {
    }

    @AfterClass
    public static void tearDownClass() {
    }

    @Before
    public void setUp() {
        triClass = new TriClass();
    }

    @After
    public void tearDown() {
    }

    // Test isTriangle
    @Test
    public void testIsTriangle001() {
        int x = 10;
        int y = 4;
        int z = 4;

        boolean expected = false;

        boolean actual = triClass.isTriangle(x, y, z);

        assertEquals(expected, actual);

    }

    @Test
    public void testIsTriangle002() {
        int x = 4;
        int y = 10;
        int z = 4;

        boolean expected = false;

        boolean actual = triClass.isTriangle(x, y, z);

        assertEquals(expected, actual);

    }

    @Test
    public void testIsTriangle003() {
        int x = 4;
        int y = 4;
        int z = 10;

        boolean expected = false;

        boolean actual = triClass.isTriangle(x, y, z);

        assertEquals(expected, actual);

    }

    @Test
    public void testIsTriangle004() {
        int x = 5;
        int y = 5;
        int z = 5;

        boolean expected = true;

        boolean actual = triClass.isTriangle(x, y, z);

        assertEquals(expected, actual);

    }

    @Test
    public void testIsTriangle005() {
        int x = 0;
        int y = 5;
        int z = 5;

        boolean expected = false;

        boolean actual = triClass.isTriangle(x, y, z);

        assertEquals(expected, actual);

    }

    @Test
    public void testIsTriangle006() {
        int x = 5;
        int y = 0;
        int z = 5;

        boolean expected = false;

        boolean actual = triClass.isTriangle(x, y, z);

        assertEquals(expected, actual);

    }

    @Test
    public void testIsTriangle007() {
        int x = 5;
        int y = 5;
        int z = 0;

        boolean expected = false;

        boolean actual = triClass.isTriangle(x, y, z);

        assertEquals(expected, actual);

    }

    @Test
    public void testIsTriangle008() {
        int x = 0;
        int y = 0;
        int z = 0;

        boolean expected = false;

        boolean actual = triClass.isTriangle(x, y, z);

        assertEquals(expected, actual);

    }

    //Test triangleType()
    @Test
    public void triangleType001() {
        int x = 3;
        int y = 4;
        int z = 9;

        String expected = "NT";

        String actual = triClass.triangleType(x, y, z);

        assertEquals(expected, actual);

    }

    @Test
    public void triangleType002() {
        int x = 9;
        int y = 8;
        int z = 6;

        String expected = "AAT";

        String actual = triClass.triangleType(x, y, z);

        assertEquals(expected, actual);

    }

    @Test
    public void triangleType003() {
        int x = 25;
        int y = 24;
        int z = 7;

        String expected = "RAT";

        String actual = triClass.triangleType(x, y, z);

        assertEquals(expected, actual);

    }

    @Test
    public void triangleType004() {
        int x = 12;
        int y = 5;
        int z = 16;

        String expected = "OAT";

        String actual = triClass.triangleType(x, y, z);

        assertEquals(expected, actual);

    }

    @Test
    public void triangleType005() {
        int x = 5;
        int y = 5;
        int z = 5;

        String expected = "EqT";

        String actual = triClass.triangleType(x, y, z);

        assertEquals(expected, actual);

    }

    @Test
    public void triangleType006() {
        int x = 10;
        int y = 10;
        int z = 5;

        String expected = "IsosT";

        String actual = triClass.triangleType(x, y, z);

        assertEquals(expected, actual);

    }
}
