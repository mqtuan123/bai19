import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

class sv7 implements Comparable<sv7> {
    protected String id, hvt, bomon;
    public sv7(int num, String hvt, String bomon){
        this.id = String.format("GV%02d", num);
        this.hvt = hvt;
        this.bomon = bomon;
    }
    public String viettattennganh(String s){
        String[] parts = s.trim().split(" ");
        StringBuilder stringBuilder = new StringBuilder();
        for(String part : parts){
            if(!part.isEmpty()){
                stringBuilder.append(Character.toUpperCase(part.charAt(0)));
            }
        }
        return stringBuilder.toString();
    }
    @Override
    public int compareTo(sv7 o){
        String[] thisPart = this.hvt.split(" ");
        String[] otherPart = o.hvt.split(" ");

        String tenthis = thisPart[thisPart.length - 1];
        String tenother = otherPart[otherPart.length - 1];
        if(tenthis.equalsIgnoreCase(tenother)){
            return this.hvt.compareTo(o.hvt);
        } else {
            return tenthis.compareTo(tenother);
        }
    }
    @Override
    public String toString(){
        return id + " " + hvt + " " + viettattennganh(bomon);
    }
}
public class bai34 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        sc.nextLine();
        List<sv7> ds3 = new ArrayList<>();
        for(int i = 1; i <= n; i++){
            String hvt = sc.nextLine();
            String tenNganh = sc.nextLine();
            ds3.add(new sv7(i, hvt, tenNganh));
        }
        Collections.sort(ds3);
        for(sv7 u : ds3){
            System.out.println(u);
        }
    }


}
