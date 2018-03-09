
import java.util.Arrays;
import java.util.HashMap;


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
        return longestSide(x, y, z) < sumOfTwoShortestSides(x, y, z);
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

    public boolean isIsosceles(int x, int y, int z) {
        boolean result = false;

        if (isTriangle(x, y, z) && !isEquilateral(x, y, z)) {
            if (x == y || x == z || y == z) {
                result = true;
            }
        }

        return result;
    }

    private HashMap sortSides(int x, int y, int z) {
        HashMap<SIDE, Integer> sideMap = new HashMap<>();
        int[] sideArray = {x, y, z};
        Arrays.sort(sideArray);
        sideMap.put(SIDE.OTHER_A, sideArray[0]);
        sideMap.put(SIDE.OTHER_B, sideArray[1]);
        sideMap.put(SIDE.LONGEST, sideArray[2]);
        return sideMap;
    }

    public enum SIDE {
        LONGEST, OTHER_A, OTHER_B;
    }

}
