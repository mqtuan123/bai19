import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

class sv6 {
    protected String id, hvt, lop, email;
    public sv6(String id, String hvt, String lop, String email){
        this.id = id;
        this.hvt = hvt;
        this.lop = lop;
        this.email = email;
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
    public String tennganh(){
        return this.lop.substring(0, 4);
    }
    @Override
    public String toString(){
        return id + " " + nameFormed(hvt) + " " + lop + " " + email;
    }
}
public class bai33 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        scanner.nextLine();
        List<sv6> ds2 = new ArrayList<>();
        for(int i = 0; i < n; i++){
            String id = scanner.nextLine();
            String hvt = scanner.nextLine();
            String lop = scanner.nextLine();
            String email = scanner.nextLine();
            ds2.add(new sv6(id, hvt, lop, email));
        }
        int m = scanner.nextInt();
        scanner.nextLine();
        while(m-- > 0){
            String t = scanner.nextLine();
            System.out.println("DANH SACH SINH VIEN NGANH " + t + " : ");
            for(sv6 sv6 : ds2){
                if(sv6.tennganh().equals(t)){
                    System.out.println(sv6);
                }
            }
        }
    }
}
