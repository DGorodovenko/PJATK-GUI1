import java.math.BigDecimal;

public class Bus extends Transport {
    public Bus() {

        BigDecimal bd = new BigDecimal("2.54");
        // Producer p1 = new Producer();
        System.out.println("Bus:" + "\n" + "\t" + "Date: " + getDate() + "\n" + "\t" + "Age: " + getAge() + "\n" + "\t"
                + "Mileage: " + getMileage() + "\n" + "\t" + "Engine: " + bd + "\n" + "\t" + "Fuel: " + getFuel() + "\n"
                + "\t" + "low-floor: " + getFloor(true) + "\n" + "\t" + "Articulate: " + getArticulate(true));
    }

}
