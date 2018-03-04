
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

    public boolean isTriangle() {
        return longestSide < getSumOfOtherSides();
    }

    public boolean isEquilateral() {
        if (isTriangle()) {
            if (longestSide == otherSideA && longestSide == otherSideB) {
                return true;
            }
        }

        return false;
    }

    public boolean isIsosceles() {
        if (isTriangle() && !isEquilateral()) {
            if (longestSide == otherSideA || longestSide == otherSideB
                    || otherSideA == otherSideB) {
                return true;

            }
        }

        return false;

    }

    public boolean isRight() {
        if (isTriangle()) {
            if (getSquareOfLongestSide() == getSumOfSquareOfOtherSides()) {
                return true;
            }
        }

        return false;
    }

    public boolean isObtuse() {
        if (isTriangle()) {
            if (getSquareOfLongestSide() > getSumOfSquareOfOtherSides()) {
                return true;
            }
        }

        return false;
    }

    public boolean isAcute() {
        if (isTriangle()) {
            if (getSquareOfLongestSide() < getSumOfSquareOfOtherSides()) {
                return true;
            }
        }

        return false;
    }

    private int getSumOfOtherSides() {
        return otherSideA + otherSideB;
    }

    private int getSquareOfLongestSide() {
        return longestSide * longestSide;
    }

    private int getSumOfSquareOfOtherSides() {
        return otherSideA * otherSideA + otherSideB * otherSideB;
    }

}
