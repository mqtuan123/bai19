import java.util.*;

class Points implements Comparable<Points> {
    protected String name, id;
    protected double[] scores = new double[10];

    public Points(int num, String name, double[] scores) {
        this.id = String.format("HS%02d", num);
        this.name = name;
        this.scores = scores;
    }

    public double avg() {
        double sum = 0;
        for (double d : scores) sum += d;
        return Math.round(sum / 10 * 10.0) / 10.0;
    }

    public String loai() {
        double d = avg();
        if (d >= 9) return "XUAT SAC";
        else if (d >= 8) return "GIOI";
        else if (d >= 7) return "KHA";
        else if (d >= 5) return "TRUNG BINH";
        else return "YEU";
    }

    @Override
    public int compareTo(Points other) {
        return Double.compare(other.avg(), this.avg());
    }

    @Override
    public String toString() {
        return String.format("%s %s %.1f %s", id, name, avg(), loai());
    }
}

public class bai28 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = Integer.parseInt(sc.nextLine());
        ArrayList<Points> list4 = new ArrayList<>();

        for (int i = 1; i <= n; i++) {
            String name = sc.nextLine();
            double[] scores = new double[10];
            String[] parts = sc.nextLine().trim().split("\\s+");
            for (int j = 0; j < 10; j++) {
                scores[j] = Double.parseDouble(parts[j]);
            }

            list4.add(new Points(i, name, scores));
        }

        Collections.sort(list4);
        for (Points p : list4) {
            System.out.println(p);
        }
    }
}
