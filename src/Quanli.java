import java.util.*;
 class Product implements Comparable<Product> {
    protected String id, name, cnt;
    protected int bought_p, sell_p, profit;
    public Product(int num, String name, String cnt, int bought_p, int sell_p){
        this.id = String.format("MH%04d", num);
        this.name = name;
        this.cnt = cnt;
        this.bought_p = bought_p;
        this.sell_p = sell_p;
        this.profit = sell_p - bought_p;
    }
    public int getProfit(){
        return profit;
    }
    @Override
    public int compareTo(Product p1){
        return p1.profit - this.profit;
    }
    @Override
    public String toString() {
        return id + " " + name + " " + cnt + " " + bought_p + " " + sell_p + " " + profit;
    }
}
public class Quanli {
    public static void main(String[] args) {
         Scanner scanner = new Scanner(System.in);
         int n = scanner.nextInt();
         scanner.nextLine();
         List<Product> list1 = new ArrayList<>();
         for(int i = 1; i <= n; i++){
             String name = scanner.nextLine();
             String count = scanner.nextLine();
             int b = Integer.parseInt(scanner.nextLine());
             int s = Integer.parseInt(scanner.nextLine());
             list1.add(new Product(i, name, count, b, s));
         }
         Collections.sort(list1);
         for(Product p2: list1){
             System.out.println(p2);

        }
    }
}
