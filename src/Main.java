
import java.util.*;
class Matrix {
    private int rows;
    private int cols;
    private int[][] data;
    public Matrix(int rows, int cols){
        this.rows = rows;
        this.cols = cols;
        data = new int[rows][cols];
    }
    public void nextMatrix(Scanner scanner){
        for(int i = 0; i < rows; i++){
            for(int j = 0; j < cols; j++){
                data[i][j] = scanner.nextInt();
            }
        }
    }
    public Matrix trans(){
        Matrix transposed = new Matrix(this.cols, this.rows);
        for(int i = 0; i < this.rows; i++){
            for(int j = 0; j < this.cols; j++){
                transposed.data[j][i] = this.data[i][j];
            }
        }
        return transposed;
    }
    public Matrix mul(Matrix other){
        Matrix result = new Matrix(this.rows, other.cols);
            for(int i = 0; i < this.rows; i++){
                for(int j = 0; j < other.cols; j++){
                    result.data[i][j] = 0;
                    for(int k = 0; k < this.cols; k++){
                        result.data[i][j] += this.data[i][k] * other.data[k][j];
                    }
                }
            }
            return result;
        }


    @Override
    public String toString(){
        StringBuilder stringBuilder = new StringBuilder();
        for(int i = 0; i < this.rows; i++){
            for(int j = 0; j < this.cols; j++){
                stringBuilder.append(data[i][j]).append(" ");
            }
            stringBuilder.append("\n");
        }
        return stringBuilder.toString();
    }
}

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int m = scanner.nextInt();
        Matrix a = new Matrix(n, m);
        a.nextMatrix(scanner);
        Matrix b = a.trans();
        System.out.println(a.mul(b));
    }
}