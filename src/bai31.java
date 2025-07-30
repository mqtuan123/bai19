import java.util.*;

class sv4 {
    protected String id, hvt, lop, email;
    public sv4(String id, String hvt, String lop, String email){
        this.id = id;
        this.hvt = hvt;
        this.lop = lop;
        this.email = email;
    }

    public String nameFormed(String s) {
        String[] parts = s.trim().toLowerCase().split("\\s+"); // loại bỏ nhiều khoảng trắng liên tiếp
        StringBuilder stringBuilder = new StringBuilder();
        for (String part : parts) {
            if (!part.isEmpty()) {
                stringBuilder.append(Character.toUpperCase(part.charAt(0)))
                        .append(part.substring(1))
                        .append(" ");
            }
        }
        return stringBuilder.toString().trim(); // loại bỏ khoảng trắng cuối cùng
    }
    @Override
    public String toString(){
        return id + " " + nameFormed(hvt) + " " + lop + " " + email;
    }

}
public class bai31 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = Integer.parseInt(sc.nextLine());
        List<sv4> ds = new ArrayList<>();

        for (int i = 0; i < n; i++) {
            String ma = sc.nextLine();
            String ten = sc.nextLine();
            String lop = sc.nextLine();
            String email = sc.nextLine();
            ds.add(new sv4(ma, ten, lop, email));
        }

        int q = Integer.parseInt(sc.nextLine());
        while (q-- > 0) {
            String lopTruyVan = sc.nextLine();
            System.out.println("DANH SACH SINH VIEN LOP " + lopTruyVan + " :");
            for (sv4 sv : ds) {
                if (sv.lop.equals(lopTruyVan)) {
                    System.out.println(sv);
                }
            }
        }
    }
}
