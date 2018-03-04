
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
        Triangle triangle = new Triangle(x, y, z);
        return triangle.isTriangle();
    }

    public String triangleType(int x, int y, int z) {
        Triangle triangle = new Triangle(x, y, z);
        if (triangle.isEquilateral()) {
            return "EqT";
        } else if (triangle.isIsosceles()) {
            return "IsosT";
        } else if (triangle.isRight()) {
            return "RAT";
        } else if (triangle.isObtuse()) {
            return "OAT";
        } else if (triangle.isAcute()) {
            return "AAT";
        } else {
            return "NT";
        }
    }

}
