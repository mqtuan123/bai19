import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

class Nhanvien2 implements Comparable<Nhanvien2> {
    protected String id, hvt, gt, ngaysinh, dc, mst, nkhd;
    public Nhanvien2(int num, String hvt, String gt, String ngaysinh, String dc, String mst, String nkhd){
        this.id = String.format("%05d", num);
        this.hvt = hvt;
        this.gt = gt;
        this.ngaysinh = ngaysinh;
        this.dc = dc;
        this.mst = mst;
        this.nkhd = nkhd;
    }
    public String chuanhoa(String ngaysinh){
        String[] parts = ngaysinh.split("/");
        String d = parts[0];
        String m = parts[1];
        String y = parts[2];
        if(d.length() == 1) d = "0" + d;
        if(m.length() == 1) m = "0" + m;
        return d + "/" + m + "/" + y;
    }
    @Override
    public int compareTo(Nhanvien2 other){
        if(!this.ngaysinh.equals(other.ngaysinh)){
            return this.ngaysinh.compareTo(other.ngaysinh);
        }
        return this.id.compareTo(other.id);
    }
    @Override
    public String toString(){
        return id + " " + hvt + " " + gt + " " + chuanhoa(ngaysinh) + " " + dc + " " + mst + " " + chuanhoa(nkhd);
    }
}
public class bai26 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        scanner.nextLine();
        List<Nhanvien2> list2 = new ArrayList<>();
        for(int i = 1; i <= n; i++){
            String name = scanner.nextLine();
            String gender = scanner.nextLine();
            String dob = scanner.nextLine();
            String address = scanner.nextLine();
            String id_tax = scanner.nextLine();
            String contraction_signing = scanner.nextLine();
            list2.add(new Nhanvien2(i, name, gender, dob, address, id_tax, contraction_signing));
        }
        Collections.sort(list2);
        for(Nhanvien2 nv2 : list2){
            System.out.println(nv2);
        }
    }
}
