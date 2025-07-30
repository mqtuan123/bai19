import java.util.*;

class Sv2 implements Comparable<Sv2> {
    private String id, hvt, lop, email;
    public Sv2(String id, String hvt, String lop, String email){
        this.id = id;
        this.hvt = hvt;
        this.lop = lop;
        this.email = email;
    }
    @Override
    public int compareTo(Sv2 o){
        String[] thisPart = this.hvt.split(" ");
        String[] otherPart = o.hvt.split(" ");
        String tenthis = thisPart[thisPart.length - 1];
        String tenother = otherPart[otherPart.length - 1];

        if (!this.lop.equalsIgnoreCase(o.lop)) {
            return this.lop.compareToIgnoreCase(o.lop);
        } else {
            if (tenthis.equalsIgnoreCase(tenother)) {
                return this.hvt.compareTo(o.hvt);
            } else {
                return tenthis.compareTo(tenother);
            }
        }
    }


    @Override
    public String toString() {
        return id + " " + hvt + " " + lop + " " + email;
    }
}
public class bai29 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        scanner.nextLine();
        List<Sv2> list = new ArrayList<>();
        for(int i = 0; i < n; i++){
             String id = scanner.nextLine();
             String hvt = scanner.nextLine();
             String lop = scanner.nextLine();
             String email = scanner.nextLine();
             list.add(new Sv2(id, hvt, lop, email));
        }
        Collections.sort(list);
        for(Sv2 f : list){
            System.out.println(f);
        }
    }
}
