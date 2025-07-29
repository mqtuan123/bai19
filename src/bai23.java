import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

class Sinhvien {
    protected String id, hvt, major, dob;
    protected double gpa;
    public Sinhvien(int num, String hvt, String major, String dob, double gpa){
        this.id = String.format("SV%03d", num);
        this.hvt = hvt;
        this.major = major;
        this.dob = dob;
        this.gpa = gpa;
    }
    public String chuanhoa(String dob){
        String[] strings = dob.split("/");
        String d = strings[0];
        String m = strings[1];
        String y = strings[2];
        if(d.length() == 1) d = "0" + d;
        if(m.length() == 1) m = "0" + m;
        return d + "/" + m + "/" + y;
    }
    @Override
    public String toString(){
        return id + " " + hvt + " " + major + " " + chuanhoa(dob) + " " + String.format("%.2f", gpa);
    }
}
public class bai23 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        scanner.nextLine();
        List<Sinhvien> list = new ArrayList<>();
        for(int i = 1; i <= n; i++){
            String hvt1 = scanner.nextLine();
            String major1 = scanner.nextLine();
            String dob1 = scanner.nextLine();
            double gpa1 = Double.parseDouble(scanner.nextLine());
            list.add(new Sinhvien(i, hvt1, major1, dob1, gpa1));
        }
        for(Sinhvien sv : list){
            System.out.println(sv);
        }

    }
}
