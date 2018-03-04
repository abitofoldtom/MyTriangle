
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
    
    public boolean isTriangle(int x, int y, int z) {
        int[] sides = {x, y, z};
        Arrays.sort(sides);
        int longestSide = sides[2];
        int sumOfOtherSides = sides[0] + sides[1];
        return longestSide < sumOfOtherSides;
    }

    public String triangleType(int x, int y, int z) {
        return "TODO";
    }

}
