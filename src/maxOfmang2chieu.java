import java.util.Scanner;
public class maxOfmang2chieu {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Nhap vao so hang :");
        int line = input.nextInt();
        System.out.println("Nhap vao so cot :");
        int colum = input.nextInt();
        int[][] array = new int[line][colum];

        for(int i = 0; i < line; i ++) {
            for (int j = 0; j < colum; j++) {
                System.out.println("Nhap vao gia tri cua ma tran tai hang " + i + " cot " +j);
                array[i][j] = input.nextInt();
            }
        }

        int max = 0;
        for(int i = 0; i < line; i ++) {
            for (int j = 0; j < colum; j++) {
                if(array[i][j] > max){
                    max = array[i][j];
                }
            }
        }
        System.out.println("Gia tri lon nhat la " + max);
    }
}
