public class App {
    public static void main(String[] args) {
        
        String filename = "sortie.svg"; // Le nom de votre fichier de sortie
        
        // Étape 1 (exemple pour un rectangle, mais vous pouvez faire autre chose)
      
        double x,y,width,height ;
        x =10. ; y = 3. ; width = 100. ; height = 50. ; // À personnaliser !
        Rectangle rect = new Rectangle(x,y,width,height) ; 
        

        /*
        //--------------------------------------------------------
        // Étape 2 
        // Ajouter quelques propriétés (ex. : couleurRemplissage, couleurContour)*/

        Color rectColor = rect.getCouleurRemplissage() ; 
        Color nouvelleCouleurRemplissageRect = new Color(255,255,0);
        rect.changeRemplissage(nouvelleCouleurRemplissageRect) ; // Une façon possible de gérer la couleur
        /*
        //---------------------------------------------------------
        // Étape 3
        //
        // Implémenter une autre primitive sur un modèle similaire
        //
        //---------------------------------------------------------*/
        Cercle cercle;
        Color nouvelleCouleurRemplissageCercle = new Color(255,0,255);
        Color nouvelleCouleurContourCercle = new Color(124,0,100);
        cercle = new Cercle(12,4,5,nouvelleCouleurRemplissageCercle, nouvelleCouleurContourCercle);

        /*// Étape 4
        //
        // Faire des dessins avec plusieurs primitives 
        // 
        // toXML() des précédentes primitives ne peut plus retourner le XML global
        //
        // Idée : prévoir une classe SVG capable de conduire une liste de primitives
        //        son "toXML()" renverra le SVG global en appelant le toXML() des objets à afficher
        //
        // --------------------------------------------------------
        // Étape 5
        //
        // Si ce n'est déjà fait, se poser la question de factoriser le code grâce à l'héritage et les interfaces
        
        */




      

        System.out.println(rect.toString()) ;
        System.out.println(cercle.toString()) ;
        // Ces deux lignes doivent toujours être à la fin du fichier
        String xmlRectangle = rect.toXML();
        File.write(filename, xmlRectangle); // Permet de sauvegarder votre xml
    }
  }