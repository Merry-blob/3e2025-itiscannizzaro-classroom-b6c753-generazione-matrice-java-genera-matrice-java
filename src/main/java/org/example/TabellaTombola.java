import java.util.Arrays;

public class TabellaTombola {
    public static void main(String[] args){
        int[] A = new int[15];
        int[][] M = new int[3][5];
        for (int i = 0; i < A.length; i++){
            A[i] = (int)(Math.random()*90+1);
        }
        for (int i = 0; i < A.length; i++){
            for (int u = 0; u < A.length; u++){
                if (A[i] == A[u] && i != u){
                    for (int o = 0; o < A.length; o++) {
                        if (A[o] == A[u] && u != o){
                            A[i] = (int)(Math.random()*90+1);
                        }
                    }
                }
            }
        }
        Arrays.sort(A);
        for (int i = 0, o = 0; i < M.length; i++){
            for (int u = 0; u < M[0].length; u++, o++){
                M[i][u] = A[o];
            }
        }
        System.out.println(Arrays.toString(M[0]));
        System.out.println(Arrays.toString(M[1]));
        System.out.println(Arrays.toString(M[2]));
    }
}
