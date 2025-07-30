import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

class Sv3 implements Comparable<Sv3> {
    private String id, hvt, lop, email;
    public Sv3(String id, String hvt, String lop, String email){
        this.id = id;
        this.hvt = hvt;
        this.lop = lop;
        this.email = email;
    }
    @Override
    public int compareTo(Sv3 o){
        return this.id.compareTo(o.id);
    }
    @Override
    public String toString(){
        return id + " " + hvt + " " + lop + " " + email + " ";
    }
}

public class bai30 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        List<Sv3> list = new ArrayList<>();

        while (sc.hasNextLine()) {
            String id = sc.nextLine();
            if (id.trim().isEmpty()) break;

            String hvt = sc.nextLine();
            String lop = sc.nextLine();
            String email = sc.nextLine();

            list.add(new Sv3(id, hvt, lop, email));
        }
        Collections.sort(list);
        for(Sv3 sv3 : list){
            System.out.println(sv3);
        }
    }
}
