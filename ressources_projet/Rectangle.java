public class Rectangle {

    private double x, y, width, height;

    public Rectangle(double x, double y, double width, double height){
        this.x = x;
        this.y = y;
        this.width = width;
        this.height = height;
    }

    public void toString(){
        System.out.println ("Ceci est un rectangle positionné en ("+this.x+","+this.y+"), de longueur "+this.width+" et de hauteur "+this.height+".");
    }
}