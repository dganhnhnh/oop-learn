package param;

public class Polygon {

    private Side[] sides;

    public class Side{
        public Point start;
        public Point end;
        public double length;
    }

    public Polygon() {
    }

    // truyền vào bao nhiêu Point tùy ý 
    public Polygon polygonFrom(Point... corners) {
        Polygon p = new Polygon();
        int numberOfSides = corners.length;
        double squareOfSide1, lengthOfSide1;
        squareOfSide1 = (corners[1].x - corners[0].x)
                * (corners[1].x - corners[0].x)
                + (corners[1].y - corners[0].y)
                        * (corners[1].y - corners[0].y);
        lengthOfSide1 = Math.sqrt(squareOfSide1);
        // create & return a polygon connecting the Points
        

        return p;
    }
}