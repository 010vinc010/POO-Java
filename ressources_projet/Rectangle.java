public class Rectangle {

    private double x, y, width, height;
    private Color remplissage, contour;

    public Rectangle(double x, double y, double width, double height){
        this.x = x;
        this.y = y;
        this.width = width;
        this.height = height;
        this.remplissage = new Color(0, 0, 0);
        this.contour = new Color(0, 0, 0);
    }

    public String toString(){
        return ("Ceci est un rectangle positionné en ("+this.x+","+this.y+"), de longueur "+this.width+", de hauteur "+this.height+", de couleur de remplissage "+this.remplissage.toHexString()+" et de couleur de contour "+this.contour.toHexString()+".");
    }

    public String toXML(){
        return ("<rect y='"+this.y+"' x='"+this.x+"' height='"+this.height+"' width='"+this.width+"' style='fill:"+this.remplissage.toString()+";stroke:"+this.contour.toString()+"'></rect>");
    }

    public Color getCouleurRemplissage(){
        return this.remplissage;
    }

    public void changeRemplissage(Color nouvelle){
        this.remplissage = nouvelle;
    }

    public void changeContour(Color nouvelle){
        this.contour = nouvelle;
    }
}