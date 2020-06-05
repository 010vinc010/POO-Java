public class Cercle {

    private double x, y, r;
    private Color remplissage, contour;

    public Cercle(double x, double y, double r){
        this.x = x;
        this.y = y;
        this.r = r;
        this.remplissage = new Color(0, 0, 0);
        this.contour = new Color(0, 0, 0);
    }

    public Cercle(double x, double y, double r, Color remplissage, Color contour){
        this.x = x;
        this.y = y;
        this.r = r;
        this.remplissage = remplissage;
        this.contour = contour;
    }

    public String toString(){
        return ("Ceci est un cercle positionné en ("+this.x+","+this.y+"), de rayon "+this.r+" de couleur de remplissage "+this.remplissage.toHexString()+" et de couleur de contour "+this.contour.toHexString()+".");
    }

    public String toXML(){
        return ("<circle cy='"+this.y+"' cx='"+this.x+"' r='"+this.r+"' style='fill:"+this.remplissage.toString()+";stroke:"+this.contour.toString()+"'></circle>");
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