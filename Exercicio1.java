public class Exercicio1 {

    
    public static void main(String args[]){

        String s1 = "ABCDCBDCBDACBDABDCBADF"; 
        String s2 = "ADF";

        System.out.println("Index: " + recebe2Strings(s1, s2));
    }

    public static int recebe2Strings(String s1, String s2){
        
        int i, j;
        int k = 0;
        for (i=0; i < s1.length(); i++) {
            for (j=0; j < s2.length(); j++) {
                if (s1.charAt(i + j) != s2.charAt(j)) {
                    break;
                } else {
                    k = i;
                }
            }  
        }

        return k;
    }
}