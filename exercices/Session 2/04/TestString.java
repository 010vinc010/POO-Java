public class TestString {
    public static String replaceName(String texte, String prenom, String nom){
      System.out.println("Toto");
      return texte.replace("PRENOM", prenom).replace("NOM", nom);
    }

}