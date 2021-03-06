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

    /**
     * JUnit test corresponds to the first test case in Test Plan table
     */
    @Test
    public void testIsTriangle001() {
        int x = 5;
        int y = 5;
        int z = 5;

        boolean expected = true;

        TriClass triClass = new TriClass();

        boolean actual = triClass.isTriangle(x, y, z);

        assertEquals(expected, actual);

    }

    @Test
    public void testIsTriangle002() {
        int x = 5;
        int y = 10;
        int z = 10;

        boolean expected = true;

        TriClass triClass = new TriClass();

        boolean actual = triClass.isTriangle(x, y, z);

        assertEquals(expected, actual);

    }

    @Test
    public void testIsTriangle003() {
        int x = 10;
        int y = 5;
        int z = 10;

        boolean expected = true;

        TriClass triClass = new TriClass();

        boolean actual = triClass.isTriangle(x, y, z);

        assertEquals(expected, actual);

    }

    @Test
    public void testIsTriangle004() {
        int x = 10;
        int y = 10;
        int z = 5;

        boolean expected = true;

        TriClass triClass = new TriClass();

        boolean actual = triClass.isTriangle(x, y, z);

        assertEquals(expected, actual);

    }

    @Test
    public void testIsTriangle005() {
        int x = 9;
        int y = 8;
        int z = 6;

        boolean expected = true;

        TriClass triClass = new TriClass();

        boolean actual = triClass.isTriangle(x, y, z);

        assertEquals(expected, actual);

    }

    @Test
    public void testIsTriangle006() {
        int x = 25;
        int y = 24;
        int z = 7;

        boolean expected = true;

        TriClass triClass = new TriClass();

        boolean actual = triClass.isTriangle(x, y, z);

        assertEquals(expected, actual);

    }

    @Test
    public void testIsTriangle007() {
        int x = 12;
        int y = 5;
        int z = 16;

        boolean expected = true;

        TriClass triClass = new TriClass();

        boolean actual = triClass.isTriangle(x, y, z);

        assertEquals(expected, actual);

    }

    @Test
    public void testIsTriangle008() {
        int x = 10;
        int y = 4;
        int z = 4;

        boolean expected = false;

        TriClass triClass = new TriClass();

        boolean actual = triClass.isTriangle(x, y, z);

        assertEquals(expected, actual);

    }

    @Test
    public void testIsTriangle009() {
        int x = 4;
        int y = 10;
        int z = 4;

        boolean expected = false;

        TriClass triClass = new TriClass();

        boolean actual = triClass.isTriangle(x, y, z);

        assertEquals(expected, actual);

    }

    @Test
    public void testIsTriangle010() {
        int x = 4;
        int y = 4;
        int z = 10;

        boolean expected = false;

        TriClass triClass = new TriClass();

        boolean actual = triClass.isTriangle(x, y, z);

        assertEquals(expected, actual);

    }

    @Test
    public void testIsTriangle011() {
        int x = 0;
        int y = 5;
        int z = 5;

        boolean expected = false;

        TriClass triClass = new TriClass();

        boolean actual = triClass.isTriangle(x, y, z);

        assertEquals(expected, actual);

    }

    @Test
    public void testIsTriangle012() {
        int x = 5;
        int y = 0;
        int z = 5;

        boolean expected = false;

        TriClass triClass = new TriClass();

        boolean actual = triClass.isTriangle(x, y, z);

        assertEquals(expected, actual);

    }

    @Test
    public void testIsTriangle013() {
        int x = 5;
        int y = 5;
        int z = 0;

        boolean expected = false;

        TriClass triClass = new TriClass();

        boolean actual = triClass.isTriangle(x, y, z);

        assertEquals(expected, actual);

    }

    @Test
    public void testIsTriangle014() {
        int x = 0;
        int y = 0;
        int z = 0;

        boolean expected = false;

        TriClass triClass = new TriClass();

        boolean actual = triClass.isTriangle(x, y, z);

        assertEquals(expected, actual);

    }

    @Test
    public void testIsTriangle015() {
        int x = -5;
        int y = 5;
        int z = 5;

        boolean expected = false;

        TriClass triClass = new TriClass();

        boolean actual = triClass.isTriangle(x, y, z);

        assertEquals(expected, actual);

    }

    @Test
    public void testIsTriangle016() {
        int x = 5;
        int y = -5;
        int z = 5;

        boolean expected = false;

        TriClass triClass = new TriClass();

        boolean actual = triClass.isTriangle(x, y, z);

        assertEquals(expected, actual);

    }

    @Test
    public void testIsTriangle017() {
        int x = 5;
        int y = 5;
        int z = -5;

        boolean expected = false;

        TriClass triClass = new TriClass();

        boolean actual = triClass.isTriangle(x, y, z);

        assertEquals(expected, actual);

    }

    @Test
    public void testIsTriangle018() {
        int x = -5;
        int y = -5;
        int z = -5;

        boolean expected = false;

        TriClass triClass = new TriClass();

        boolean actual = triClass.isTriangle(x, y, z);

        assertEquals(expected, actual);

    }

    @Test
    public void testIsTriangle019() {
        int x = 1;
        int y = 2;
        int z = 3;

        boolean expected = false;

        TriClass triClass = new TriClass();

        boolean actual = triClass.isTriangle(x, y, z);

        assertEquals(expected, actual);

    }

    @Test
    public void testIsTriangle020() {
        int x = 1;
        int y = 3;
        int z = 2;

        boolean expected = false;

        TriClass triClass = new TriClass();

        boolean actual = triClass.isTriangle(x, y, z);

        assertEquals(expected, actual);

    }

    @Test
    public void testIsTriangle021() {
        int x = 3;
        int y = 1;
        int z = 2;

        boolean expected = false;

        TriClass triClass = new TriClass();

        boolean actual = triClass.isTriangle(x, y, z);

        assertEquals(expected, actual);

    }

    @Test
    public void testIsEquilateral001() {

        int x = 5;
        int y = 5;
        int z = 5;

        boolean expected = true;

        TriClass triClass = new TriClass();

        boolean actual = triClass.isEquilateral(x, y, z);

        assertEquals(expected, actual);
    }

    @Test
    public void testIsEquilateral002() {
        int x = 0;
        int y = 5;
        int z = 5;

        boolean expected = false;

        boolean actual = triClass.isEquilateral(x, y, z);

        assertEquals(expected, actual);

    }

    @Test
    public void testIsEquilateral003() {
        int x = -5;
        int y = 5;
        int z = 5;

        boolean expected = false;

        boolean actual = triClass.isEquilateral(x, y, z);

        assertEquals(expected, actual);

    }

    @Test
    public void testIsEquilateral004() {
        int x = 4;
        int y = 5;
        int z = 5;

        boolean expected = false;

        boolean actual = triClass.isEquilateral(x, y, z);

        assertEquals(expected, actual);

    }

    @Test
    public void testIsEquilateral005() {
        int x = 4;
        int y = 5;
        int z = 5;

        boolean expected = false;

        boolean actual = triClass.isEquilateral(x, y, z);

        assertEquals(expected, actual);

    }

    @Test
    public void testIsEquilateral006() {
        int x = 4;
        int y = 5;
        int z = 5;

        boolean expected = false;

        boolean actual = triClass.isEquilateral(x, y, z);

        assertEquals(expected, actual);

    }

    @Test
    public void testIsEquilateral007() {
        int x = 4;
        int y = 5;
        int z = 6;

        boolean expected = false;

        boolean actual = triClass.isEquilateral(x, y, z);

        assertEquals(expected, actual);

    }

    @Test
    public void testIsIsosceles001() {
        int x = 5;
        int y = 10;
        int z = 10;

        boolean expected = true;

        boolean actual = triClass.isIsosceles(x, y, z);

        assertEquals(expected, actual);

    }

    @Test
    public void testIsIsosceles002() {
        int x = 10;
        int y = 5;
        int z = 10;

        boolean expected = true;

        boolean actual = triClass.isIsosceles(x, y, z);

        assertEquals(expected, actual);

    }

    @Test
    public void testIsIsosceles003() {
        int x = 10;
        int y = 10;
        int z = 5;

        boolean expected = true;

        boolean actual = triClass.isIsosceles(x, y, z);

        assertEquals(expected, actual);

    }

    @Test
    public void testIsIsosceles004() {
        int x = 10;
        int y = 10;
        int z = 10;

        boolean expected = false;

        boolean actual = triClass.isIsosceles(x, y, z);

        assertEquals(expected, actual);

    }

    @Test
    public void testIsIsosceles005() {
        int x = 9;
        int y = 8;
        int z = 6;

        boolean expected = false;

        boolean actual = triClass.isIsosceles(x, y, z);

        assertEquals(expected, actual);

    }

    @Test
    public void testIsIsosceles006() {
        int x = 25;
        int y = 24;
        int z = 7;

        boolean expected = false;

        boolean actual = triClass.isIsosceles(x, y, z);

        assertEquals(expected, actual);

    }

    @Test
    public void testIsIsosceles007() {
        int x = 12;
        int y = 5;
        int z = 16;

        boolean expected = false;

        boolean actual = triClass.isIsosceles(x, y, z);

        assertEquals(expected, actual);

    }

    @Test
    public void testIsAcuteAngled001() {
        int x = 9;
        int y = 8;
        int z = 6;

        boolean expected = true;

        boolean actual = triClass.isAcuteAngled(x, y, z);

        assertEquals(expected, actual);

    }

    @Test
    public void testIsAcuteAngled002() {
        int x = 5;
        int y = 5;
        int z = 5;

        boolean expected = false;

        boolean actual = triClass.isAcuteAngled(x, y, z);

        assertEquals(expected, actual);

    }

    @Test
    public void testIsAcuteAngled003() {
        int x = 10;
        int y = 10;
        int z = 5;

        boolean expected = false;

        boolean actual = triClass.isAcuteAngled(x, y, z);

        assertEquals(expected, actual);

    }

    @Test
    public void testIsAcuteAngled004() {
        int x = 1;
        int y = 2;
        int z = 3;

        boolean expected = false;

        boolean actual = triClass.isAcuteAngled(x, y, z);

        assertEquals(expected, actual);

    }

    @Test
    public void testIsAcuteAngled005() {
        int x = 25;
        int y = 24;
        int z = 7;

        boolean expected = false;

        boolean actual = triClass.isAcuteAngled(x, y, z);

        assertEquals(expected, actual);

    }

    @Test
    public void testIsAcuteAngled006() {
        int x = 12;
        int y = 5;
        int z = 16;

        boolean expected = false;

        boolean actual = triClass.isAcuteAngled(x, y, z);

        assertEquals(expected, actual);

    }

    @Test
    public void testIsAcuteAngled007() {
        int x = 0;
        int y = 8;
        int z = 6;

        boolean expected = false;

        boolean actual = triClass.isAcuteAngled(x, y, z);

        assertEquals(expected, actual);

    }

    @Test
    public void testIsAcuteAngled008() {
        int x = -9;
        int y = 8;
        int z = 6;

        boolean expected = false;

        boolean actual = triClass.isAcuteAngled(x, y, z);

        assertEquals(expected, actual);

    }

    @Test
    public void testIsRightAngled001() {
        int x = 25;
        int y = 24;
        int z = 7;

        boolean expected = true;

        boolean actual = triClass.isRightAngled(x, y, z);

        assertEquals(expected, actual);

    }
    
    @Test
    public void testIsRightAngled002() {
        int x = 5;
        int y = 5;
        int z = 5;

        boolean expected = false;

        boolean actual = triClass.isRightAngled(x, y, z);

        assertEquals(expected, actual);

    }

    @Test
    public void testIsRightAngled003() {
        int x = 10;
        int y = 10;
        int z = 5;

        boolean expected = false;

        boolean actual = triClass.isRightAngled(x, y, z);

        assertEquals(expected, actual);

    }

    @Test
    public void testIsRightAngled004() {
        int x = 1;
        int y = 2;
        int z = 3;

        boolean expected = false;

        boolean actual = triClass.isRightAngled(x, y, z);

        assertEquals(expected, actual);

    }

    @Test
    public void testIsRightAngled005() {
        int x = 9;
        int y = 8;
        int z = 6;

        boolean expected = false;

        boolean actual = triClass.isRightAngled(x, y, z);

        assertEquals(expected, actual);

    }

    @Test
    public void testIsRightAngled006() {
        int x = 12;
        int y = 5;
        int z = 16;

        boolean expected = false;

        boolean actual = triClass.isRightAngled(x, y, z);

        assertEquals(expected, actual);

    }

    @Test
    public void testIsRightAngled007() {
        int x = 25;
        int y = 24;
        int z = 0;

        boolean expected = false;

        boolean actual = triClass.isRightAngled(x, y, z);

        assertEquals(expected, actual);

    }

    @Test
    public void testIsRightAngled008() {
        int x = -25;
        int y = 24;
        int z = 7;

        boolean expected = false;

        boolean actual = triClass.isRightAngled(x, y, z);

        assertEquals(expected, actual);

    }

    @Test
    public void testIsObtuse001() {
        int x = 12;
        int y = 5;
        int z = 16;

        boolean expected = true;

        boolean actual = triClass.isObtuse(x, y, z);

        assertEquals(expected, actual);

    }
    
        @Test
    public void testIsObtuse002() {
        int x = 5;
        int y = 5;
        int z = 5;

        boolean expected = false;

        boolean actual = triClass.isObtuse(x, y, z);

        assertEquals(expected, actual);

    }

    @Test
    public void testIsObtuse003() {
        int x = 10;
        int y = 10;
        int z = 5;

        boolean expected = false;

        boolean actual = triClass.isObtuse(x, y, z);

        assertEquals(expected, actual);

    }

    @Test
    public void testIsObtuse004() {
        int x = 1;
        int y = 2;
        int z = 3;

        boolean expected = false;

        boolean actual = triClass.isObtuse(x, y, z);

        assertEquals(expected, actual);

    }

    @Test
    public void testIsObtuse005() {
        int x = 25;
        int y = 24;
        int z = 7;

        boolean expected = false;

        boolean actual = triClass.isObtuse(x, y, z);

        assertEquals(expected, actual);

    }

    @Test
    public void testIsObtuse006() {
        int x = 9;
        int y = 8;
        int z = 6;

        boolean expected = false;

        boolean actual = triClass.isObtuse(x, y, z);

        assertEquals(expected, actual);

    }

    @Test
    public void testIsObtuse007() {
        int x = 0;
        int y = 5;
        int z = 16;

        boolean expected = false;

        boolean actual = triClass.isObtuse(x, y, z);

        assertEquals(expected, actual);

    }

    @Test
    public void testIsObtuse008() {
        int x = -12;
        int y = 5;
        int z = 16;

        boolean expected = false;

        boolean actual = triClass.isObtuse(x, y, z);

        assertEquals(expected, actual);

    }

}
