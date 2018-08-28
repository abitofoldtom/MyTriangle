
import java.util.Arrays;

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
        Sides sides = new Sides(x, y, z);
        return sides.longest < sides.sumOfOtherSides();
    }


    //this is CAMS change to the file
    // AND ANOTHER CHANGE, ON THE MASTER TOO, HAHAHA

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
        } else if (isAcuteAngled(x, y, z)) {
            type = "AAT";
        } else if (isRightAngled(x, y, z)) {
            type = "RAT";
        } else if (isObtuse(x, y, z)) {
            type = "OAT";
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

    public boolean isAcuteAngled(int x, int y, int z) {
        boolean result = false;

        if (isTriangle(x, y, z) && !isEquilateral(x, y, z) && !isIsosceles(x, y, z)) {
            Sides sides = new Sides(x, y, z);
            if (sides.squareOfLongestSide() < sides.sumOfSquareOfOtherSides()) {
                result = true;
            }
        }

        return result;
    }

    public boolean isRightAngled(int x, int y, int z) {
        boolean result = false;

        if (isTriangle(x, y, z)) {
            Sides sides = new Sides(x, y, z);
            if (sides.squareOfLongestSide() == sides.sumOfSquareOfOtherSides()) {
                result = true;
            }
        }

        return result;
    }

    public boolean isObtuse(int x, int y, int z) {
        boolean result = false;

        if (isTriangle(x, y, z)) {
            Sides sides = new Sides(x, y, z);
            if (sides.squareOfLongestSide() > sides.sumOfSquareOfOtherSides()) {
                result = true;
            }
        }

        return result;
    }

    class Sides {

        private int longest;
        private int otherA;
        private int otherB;

        public Sides(int x, int y, int z) {
            int[] sortedSides = sortSides(x, y, z);
            this.otherA = sortedSides[0];
            this.otherB = sortedSides[1];
            this.longest = sortedSides[2];
        }

        private int[] sortSides(int x, int y, int z) {
            int[] sides = {x, y, z};
            Arrays.sort(sides);
            return sides;
        }

        private int sumOfOtherSides() {
            return otherA + otherB;
        }

        private int squareOfLongestSide() {
            return longest * longest;
        }

        private int sumOfSquareOfOtherSides() {
            return otherA * otherA + otherB * otherB;
        }

    }

}
