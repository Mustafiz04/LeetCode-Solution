import java.util.*;

class WaterUsage{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // 0 == Non commercial
        // 1 == Commercial
        System.out.println("Enter the userCatergory : ");
        System.out.println("0 for NonCommercial & 1 for Commercial");
        int userCategory = sc.nextInt();

        System.out.println("Enter the water usage");
        double waterUsage = sc.nextInt();

        double val = rate( userCategory, waterUsage);
        System.out.printf("RM%.2f", val);
    }

    public static double rate(int userCategory, Double waterUsage){
        double ans = 0.00;

        if( userCategory == 1 ){
            ans = 0.00;
            ans += Math.min(waterUsage, 20.00) * 0.70;
            waterUsage = Math.max(waterUsage-20.00, 0.00);

            ans += Math.min(waterUsage, 30.00) * 1.10;
            waterUsage = Math.max(waterUsage-30.00, 0.00);

            ans += waterUsage * 1.50;

        }
        if( userCategory == 0 ){
            ans = 0.00;
            ans += Math.min(waterUsage, 15.00) * 0.40;
            waterUsage = Math.max(waterUsage-15.00, 0.00);

            ans += Math.min(waterUsage, 25.00) * 0.70;
            waterUsage = Math.max(waterUsage-25.00, 0.00);

            ans += Math.min(waterUsage, 20.00) * 1.00;
            waterUsage = Math.max(waterUsage-20.00, 0.00);

            ans += waterUsage * 1.30;
        }

        return ans;
    }

}