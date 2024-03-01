import java.math.BigDecimal;

public class Main {
    public static void main(String[] args) {
        BigDecimal netPrice = BigDecimal.valueOf(9.99);
        BigDecimal VAT = BigDecimal.valueOf(1.23);
        BigDecimal pcs = BigDecimal.valueOf(10_000);
        BigDecimal grossValue = netPrice.multiply(VAT);
        BigDecimal grossValueTotal = grossValue.multiply(pcs);
        BigDecimal netValueTotal = netPrice.multiply(pcs);
        System.out.println("Price including the VAT is: " + grossValue);
        System.out.println("Price including the VAT for 10000 pieces is: " + grossValueTotal);
        System.out.println("Price without the VAT is: " + netPrice);
        System.out.println("Price without the VAT for 10000 pieces is: " + netValueTotal);




    }
}