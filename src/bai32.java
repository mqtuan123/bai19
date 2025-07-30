import java.util.*;

class sv5 {
    protected String id, hvt, lop, email;
    public sv5(String id, String hvt, String lop, String email){
        this.id = id;
        this.hvt = hvt;
        this.lop = lop;
        this.email = email;
    }
    public int Years(){
        return Integer.parseInt(this.id.substring(0, 4));
    }
    public String nameFormed(String s){
        String[] parts = s.trim().toLowerCase().split(" ");
        StringBuilder stringBuilder = new StringBuilder();
        for(String part : parts){
            if(!part.isEmpty()){
                stringBuilder.append(Character.toUpperCase(part.charAt(0))).append(part.substring(1)).append(" ");
            }
        }
        return stringBuilder.toString().trim();
    }
    @Override
    public String toString(){
        return id + " " + nameFormed(hvt) + " " + lop + " " + email;
    }
}

public class bai32 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        scanner.nextLine();
        List<sv5> ds1 = new ArrayList<>();
        for(int i = 0; i < n; i++){
            String id = scanner.nextLine();
            String hvt = scanner.nextLine();
            String lop = scanner.nextLine();
            String email = scanner.nextLine();
            ds1.add(new sv5(id, hvt, lop, email));
        }
        int m = scanner.nextInt();
        scanner.nextLine();
        while (m-- > 0) {
            String khoa = scanner.nextLine();
            System.out.println("DANH SACH SINH VIEN KHOA " + khoa + " :");
            for (sv5 sv : ds1) {
                if (sv.Years() == Integer.parseInt(khoa)) {
                    System.out.println(sv);
                }
            }
        }
    }
}
