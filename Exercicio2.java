public class Exercicio2 {
    static int count = 0;
    public static void main(String args[]){
        String s1 = "ADF"; 
        String s2 = "ABCDCBDCBDACBDABDCBADFDKSJFSKDFLAIUWYQWADFAFAFSFSFAFDAFSDSDADFASDSFDSFDFASDFDADFASDSAFSAFDSASGFDHGSFJHDS";

        System.out.println("Index: " + search(s1, s2));
        System.out.println("Count: " + count);
    }

    private static int search(String pat, String txt) {
        int M = pat.length();
        int N = txt.length();
        long patHash = hash(pat, M);
     
        for (int i = 0; i <= N - M; i++) {
           long txtHash = hash(txt.substring(i, i+M), M);
           count = count + 1;
           if (patHash == txtHash)
              return i; // ocorrência? colisão?
        }
        return N; // nenhuma ocorrência
    }
    // Algoritmo de Horner
    private static long hash(String s, int M) {
        long R = 3;
        long Q = 6700417;
        long h = 0;
        for (int j = 0; j < M; j++)
           h = (h * R + s.charAt(j)) % Q;
           count = count + 1;
        return h;
     }
}