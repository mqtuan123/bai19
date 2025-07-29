import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

class Nhanvien {
    protected String id, ht, gt, dob, dc, mst, ngaykihd;
    public Nhanvien(int num, String ht, String gt, String dob, String dc, String mst, String ngaykihd){
        this.id = String.format("%05d", num);
        this.ht = ht;
        this.gt = gt;
        this.dob = dob;
        this.dc = dc;
        this.mst = mst;
        this.ngaykihd = ngaykihd;
    }
    @Override
    public String toString(){
        return id + " " + ht + " " + gt + " " + dob + " " + dc + " " + mst + " " + ngaykihd;
    }

}
public class bai25 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        scanner.nextLine();
        List<Nhanvien> list = new ArrayList<>();
        for(int i = 1; i <= n; i++){
            String ht = scanner.nextLine();
            String gt = scanner.nextLine();
            String dob = scanner.nextLine();
            String dc = scanner.nextLine();
            String mst = scanner.nextLine();
            String nkhd = scanner.nextLine();
            list.add(new Nhanvien(i, ht, gt, dob, dc, mst, nkhd));
        }
        for(Nhanvien nhanvien : list){
            System.out.println(nhanvien);
        }

    }
}
