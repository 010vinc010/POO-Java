public class Grade {
    public static String gradeToLetter (double note){
      if (note < 5)
        return "F";
      else{
        if (note < 8)
          return "E";
        else{
          if (note < 11)
            return "D";
          else{
            if (note < 14)
              return "C";
            else{
              if (note < 16)
                return "B";
              else{
                return "A";
              }
            }
          }
        }
      }
    }
   
}