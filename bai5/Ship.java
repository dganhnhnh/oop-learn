public class Ship {
    private double x=0.0, y=0.0;
    private double speed = 1.0, direction = 0.0;
    public String name;

    public Ship(String name) {
        this.name = name;
    }
    public Ship(String name, double speed, double direction){
        this(name);
        this.speed = speed;
        this.direction=direction;
    }
    public Ship(String name, double speed, double direction, double x, double y){
        this(name, speed, direction);
        this.x=x;
        this.y=y;
    }
    private double degreesToRadians(double degrees){
        return (degrees * Math.PI/180.0);
    }

    // a method can call its overloaded method 
    public void move(){
        move(1);
    }
    public void move(int steps){
        double angle = degreesToRadians(direction);
        x+= (double) steps*speed*Math.cos(angle);
        y+= (double) steps*speed*Math.sin(angle);
    }
    public void printLocation() {
        System.out.println(name + " is at ("
        + x + "," + y + ").");
        }
}