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
        // TODO create list, sort, and then get longest and others
        int longestSide = findLongestSide(x, y, z);
        return false;
    }

    private int findLongestSide(int x, int y, int z) {
        int max = 0;
        max = Math.max(x, y);
        max = Math.max(max, z);
        return max;
    }

    public String triangleType(int x, int y, int z) {
        return "TODO";
    }

}
