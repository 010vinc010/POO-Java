public class SVG {

    private String debut, fin, corps;

    public SVG(){
        this.debut = "<svg width='100%' height='100%' viewBox='0 0 100 100' xmlns='http://www.w3.org/2000/svg'>";
        this.corps = "";
        this.fin = "</svg>";
    }

    public SVG(String corps){
        this.debut = "<svg width='100%' height='100%' viewBox='0 0 100 100' xmlns='http://www.w3.org/2000/svg'>";
        this.corps = corps;
        this.fin = "</svg>";
    }

    public void addElement (String elt){
        this.corps += "\t"+elt+"\n";
    }

    public String toXML(){
        return debut+"\n"+corps+fin;
    }
}