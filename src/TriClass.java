
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
public class TriClass {

    public TriClass() {

    }

    /**
     * @param x - the length of one side of a triangle, if one can be formed
     * @param y - the length of another side of a triangle, if one can be formed
     * @param z - the length of the third side of a triangle, if one can be
     * formed
     * @return true if a triangle can be formed with the three sides x, y and z
     */
    public boolean isTriangle(int x, int y, int z) {
        Triangle triangle = new Triangle(x, y, z);
        return triangle.isTriangle();
    }

    /**
     *
     * @param x - the length of one side of a triangle, if one can be formed
     * @param y - the length of another side of a triangle, if one can be formed
     * @param z - the length of the third side of a triangle, if one can be
     * formed
     * @return the type of the triangle, assuming one triangle can be formed Use
     * EqT, IsoT, AAT, RAT, OAT as short-form
     */
    public String triangleType(int x, int y, int z) {
        String type = "unknown";
        if (isEquilateral(x, y, z)) {
            type = "EqT";
        } else if (isIsosceles(x, y, z)) {
            type = "IsoT";
//        } else if (isAcuteAngled(x, y, z)) {
//            type = "AAT";
//        } else if (isRightAngled(x, y, z)) {
//            type = "RAT";
//        } else if (isObtuse(x, y, z)) {
//            type = "OAT";
        } else {
            System.err.println("Unknown type – should not be here");
        }
        return type;
    }

    public boolean isEquilateral(int x, int y, int z) {
        boolean result = false;

        if (isTriangle(x, y, z)) {
            if (x == y && y == z) {
                result = true;
            }
        }

        return result;
    }

    public boolean isIsosceles(int longestSide, int otherSideA, int otherSideB) {
        boolean result = false;

        if (longestSide == otherSideA || longestSide == otherSideB
                || otherSideA == otherSideB) {
            result = true;
        }
        return result;

    }

    private int[] sortSides(int x, int y, int z) {
        int[] sides = {x, y, z};
        Arrays.sort(sides);
        return sides;
    }

}
