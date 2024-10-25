import java.util.Scanner;

public class Tugas1_18 {
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);

        System.out.print("Masukkan nilai N(minimal 3): ");
        int N = sc.nextInt();

        if (N < 3){
            System.out.print("N minimal harus 3.");
            return;
        }
        for (int i = 0; i<N; i++){
        for(int j = 0; j<N; j++){
            if (i==0||i==N -1||j==0||j==N -1){
                System.out.print(N+"   ");
            }else{
                System.out.print("    ");
            }
        }
        System.out.println();
    }

    } 
}
