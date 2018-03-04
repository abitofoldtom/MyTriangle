
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
        if (!triangle.isTriangle()) {
            return "NT";
        } else {
            return "TODO";
        }
    }

}
