
import java.util.Arrays;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author tguerney
 */
public class Triangle {

    private int longestSide;
    private int otherSideA;
    private int otherSideB;

    public Triangle(int x, int y, int z) {
        int[] sortedSides = sortSides(x, y, z);
        this.otherSideA = sortedSides[0];
        this.otherSideB = sortedSides[1];
        this.longestSide = sortedSides[2];
    }

    private int[] sortSides(int x, int y, int z) {
        int[] sides = {x, y, z};
        Arrays.sort(sides);
        return sides;
    }

    public int getLongestSide() {
        return longestSide;
    }

    public int getOtherSideA() {
        return otherSideA;
    }

    public int getOtherSideB() {
        return otherSideB;
    }
    
    public int getSumOfOtherSides() {
        return otherSideA + otherSideB;
    }
    
    public int getSquareOfLongestSide() {
        return longestSide * longestSide;
    }
    
    public int getSumOfSquareOfOtherSides() {
        return otherSideA * otherSideA + otherSideB * otherSideB;
    }
    
    public boolean isTriangle() {
        return getLongestSide() < getSumOfOtherSides();
    }
    
    
}
