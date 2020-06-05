public class App {
    public static void main(String[] args) {
        
        String filename = "sortie.svg"; // Le nom de votre fichier de sortie

        
        // Étape 1 (exemple pour un rectangle, mais vous pouvez faire autre chose)
      
        double x,y,width,height ;
        x =10. ; y = 2. ; width = 80. ; height = 50. ; // À personnaliser !
        Rectangle rect = new Rectangle(x,y,width,height) ; 
        

        /*
        //--------------------------------------------------------
        // Étape 2 
        // Ajouter quelques propriétés (ex. : couleurRemplissage, couleurContour)*/
        Color rectColor = rect.getCouleurRemplissage() ; 
        Color nouvelleCouleurRemplissageRect = new Color(255,255,255);
        Color nouvelleCouleurContourRect = new Color(0,0,0);
        rect.changeRemplissage(nouvelleCouleurRemplissageRect) ;
        rect.changeContour(nouvelleCouleurContourRect) ; // Une façon possible de gérer la couleur
        System.out.println(rect.toString()+"\n") ;



        /*
        //---------------------------------------------------------
        // Étape 3
        //
        // Implémenter une autre primitive sur un modèle similaire
        //
        //---------------------------------------------------------*/
        Cercle cercle;
        Color nouvelleCouleurRemplissageCercle = new Color(255,0,0);
        Color nouvelleCouleurContourCercle = new Color(255,0,0);
        cercle = new Cercle(50,26,15,nouvelleCouleurRemplissageCercle, nouvelleCouleurContourCercle);
        System.out.println(cercle.toString()+"\n") ;



        /*// Étape 4
        //
        // Faire des dessins avec plusieurs primitives 
        // 
        // toXML() des précédentes primitives ne peut plus retourner le XML global
        //
        // Idée : prévoir une classe SVG capable de conduire une liste de primitives
        //        son "toXML()" renverra le SVG global en appelant le toXML() des objets à afficher
        //
        // --------------------------------------------------------*/
        SVG svg = new SVG ();
        svg.addElement(rect.toXML());
        svg.addElement(cercle.toXML()); 
        System.out.println("Contenu du SVG :\n"+svg.toXML()) ;


        
        /*// Étape 5
        //
        // Si ce n'est déjà fait, se poser la question de factoriser le code grâce à l'héritage et les interfaces
        
        */




      

        // Ces deux lignes doivent toujours être à la fin du fichier
        
        File.write(filename, svg.toXML()); // Permet de sauvegarder votre xml
    }
  }