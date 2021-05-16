import java.util.*;

public class Solution{
    public static void main(String args[]){
        Scanner sc =  new Scanner (System.in);

        int T = sc.nextInt();

        for (int i=1;i<=T;i++){

            int N = sc.nextInt();

            int B = sc.nextInt();

            int A[] = new int[N+1];

            for (int j=1;j<=N;j++){
                A[j] = sc.nextInt();
            }

            Arrays.sort(A);

            int ans = 0,k=1;

            for (k=1;k<=N;k++){
                if (B >= A[k]){
                    ans++;
                    B = B - A[k];
                }
            }
            System.out.println("Case #"+(i)+": "+ans);
        }
    }
}