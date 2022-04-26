public class Exercicio1 {
    public static void main(String args[]){
        String s1 = "ABCDCBDCBDACBDABDCBADF"; 
        String s2 = "ADF";

        recebe2Strings(s1, s2);
    }

    public static void recebe2Strings(String s1, String s2){
        int count = 0;
        int i, j;
        int k = 0;
        for (i=0; i < s1.length(); i++) {
            for (j=0; j < s2.length(); j++) {
                count = count + 1;
                if (s1.charAt(i + j) != s2.charAt(j)) {
                    break;
                } else {
                    k = i;
                }
            }  
        }
        System.out.println("Index: " + k + " Contador: " + count);
    }
}