import java.util.*;

class Time implements Comparable<Time> {
    private int hour;
    private int mins;
    private int secs;

    public Time(int hour, int mins, int secs){
        this.hour = hour;
        this.mins = mins;
        this.secs = secs;
    }

    @Override
    public int compareTo(Time other) {
        if (this.hour != other.hour)
            return this.hour - other.hour;
        if (this.mins != other.mins)
            return this.mins - other.mins;
        return this.secs - other.secs;
    }

    @Override
    public String toString() {
        return hour + " " + mins + " " + secs;
    }
}

public class Entry {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        List<Time> list = new ArrayList<>();

        for (int i = 0; i < n; i++) {
            int h = scanner.nextInt();
            int m = scanner.nextInt();
            int s = scanner.nextInt();
            list.add(new Time(h, m, s));
        }

        Collections.sort(list);

        for (Time t : list) {
            System.out.println(t);
        }
    }
}
