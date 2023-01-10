import java.util.Locale;

public class Main {
    public static void main(String[] args) {
        String my_string = "cccCCC";
        String answer = "";
        String[] A = my_string.split("");
      for(char c : my_string.toCharArray()){
          if(Character.isLowerCase(c)){
              answer+=Character.toUpperCase(c);
          }else{
              answer+=Character.toLowerCase(c);
          }
      }
        System.out.println(answer);
    }
}

/*
   if(Character.isLowerCase(Integer.parseInt(A[i]))){
                A[i].toUpperCase();
            } else{
                A[i].toLowerCase();
            }*/

