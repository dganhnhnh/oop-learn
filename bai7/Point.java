package bai7;

abstract class Point {
    private int x,y;
    public Point(int x, int y) {
        this.x = x;
        this.y = y;
    }
    public void move(int dx, int dy) {
        this.x += dx;
        this.y += dy;
        plot();
    }
    public abstract void plot();
}
