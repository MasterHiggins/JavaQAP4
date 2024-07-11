package Problem2;

public class EquilateralTriangle extends Triangle {
    public EquilateralTriangle(double side) {
        super(side, side, side);
        name = "EquilateralTriangle";
    }

    //No need to override scale method as it's already defined in Triangle

}