import java.util.*;

class Sinhvien2 {
    protected String id, name, dob, major;
    protected double gpa;
    public Sinhvien2(int num, String name, String major, String dob, double gpa){
        this.id = String.format("SV%03d", num);
        this.name = name;
        this.major = major;
        this.dob = dob;
        this.gpa = gpa;
    }
    public String chuanHoa(String dob){
        String[] parts = dob.split("/");
        String d = parts[0];
        String m = parts[1];
        String y = parts[2];
        if(d.length() == 1) d = "0" + d;
        if(m.length() == 1) m = "0" + m;
        return d + "/" + m + "/" + y;
    }
    @Override
    public String toString() {
        return id + " " + name + " " + major + " " + chuanHoa(dob) + " " + String.format("%.2f", gpa);
    }

}
public class Quanli2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        scanner.nextLine();
        List<Sinhvien2> list = new ArrayList<>();
        for(int i = 1; i <= n; i++){
            String name1 = scanner.nextLine();
            String major1 = scanner.nextLine();
            String dob1 = scanner.nextLine();
            double gpa1 = Double.parseDouble(scanner.nextLine());
            list.add(new Sinhvien2(i, name1, major1, dob1, gpa1));
        }
        for(Sinhvien2 sv : list){
            System.out.println(sv);
        }

    }
}
