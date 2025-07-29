import java.util.*;

class SinhVien3 implements Comparable<SinhVien3> {
    private String id, name, lop, dob;
    private double gpa;
    private static int count = 1;

    public SinhVien3(String name, String lop, String dob, double gpa) {
        this.id = String.format("SV%03d", count++);
        this.name = chuanHoaTen(name);
        this.lop = lop;
        this.dob = chuanHoaNgaySinh(dob);
        this.gpa = gpa;
    }

    private String chuanHoaTen(String s) {
        s = s.trim().toLowerCase();
        String[] parts = s.split("\\s+");
        StringBuilder sb = new StringBuilder();
        for (String part : parts) {
            sb.append(Character.toUpperCase(part.charAt(0)));
            sb.append(part.substring(1)).append(" ");
        }
        return sb.toString().trim();
    }

    private String chuanHoaNgaySinh(String s) {
        String[] parts = s.split("/");
        String d = parts[0];
        String m = parts[1];
        String y = parts[2];
        if (d.length() == 1) d = "0" + d;
        if (m.length() == 1) m = "0" + m;
        return d + "/" + m + "/" + y;
    }

    @Override
    public int compareTo(SinhVien3 other) {
        if (this.gpa != other.gpa)
            return Double.compare(other.gpa, this.gpa); // GPA giảm dần
        return this.id.compareTo(other.id); // ID tăng dần
    }

    @Override
    public String toString() {
        return String.format("%s %s %s %s %.2f", id, name, lop, dob, gpa);
    }
}

public class bai24 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = Integer.parseInt(sc.nextLine());
        ArrayList<SinhVien3> list = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            String name = sc.nextLine();
            String lop = sc.nextLine();
            String dob = sc.nextLine();
            double gpa = Double.parseDouble(sc.nextLine());
            list.add(new SinhVien3(name, lop, dob, gpa));
        }

        Collections.sort(list);
        for (SinhVien3 sv : list) {
            System.out.println(sv);
        }
    }
}
