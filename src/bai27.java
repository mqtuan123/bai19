
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

class Net implements Comparable<Net> {
    protected String username, password, name, h_in, h_out;
    protected int durationMins;
    public Net(String username, String password, String name, String h_in, String h_out){
        this.username = username;
        this.password = password;
        this.name = name;
        this.h_in = HourFormed(h_in);
        this.h_out = HourFormed(h_out);
        this.durationMins = ConvertHourtoMin();


    }
    public String HourFormed(String hour){
        String[] parts = hour.split(":");
        String h = parts[0];
        String s = parts[1];
        if(h.length() == 1) h = "0" + h;
        if(s.length() == 1) s = "0" + s;
        return h + ":" + s;
    }
    public int ConvertHourtoMin() {
        String[] inParts = h_in.split(":");
        String[] outParts = h_out.split(":");
        int inHour = Integer.parseInt(inParts[0]);
        int inMinute = Integer.parseInt(inParts[1]);
        int outHour = Integer.parseInt(outParts[0]);
        int outMinute = Integer.parseInt(outParts[1]);
        return outHour * 60 + outMinute - (inHour * 60 + inMinute);
    }
    public String count_hour() {
        int hour = durationMins / 60;
        int mins = durationMins % 60;
        return hour + " gio " + mins + " phut ";
    }

    @Override
    public int compareTo(Net o) {
        return o.durationMins - this.durationMins;
    }
    @Override
    public String toString(){
        return username + " " + password + " " + name + " " + count_hour();
    }
}
public class bai27 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        scanner.nextLine();
        List<Net> list3 = new ArrayList<>();
        for(int i = 0; i < n; i++){
            String user = scanner.nextLine();
            String pass = scanner.nextLine();
            String name1 = scanner.nextLine();
            String hour_in = scanner.nextLine();
            String hour_out = scanner.nextLine();
            list3.add(new Net(user, pass, name1, hour_in, hour_out));
        }
        Collections.sort(list3);
        for(Net net : list3){
            System.out.println(net);
        }
    }
}
