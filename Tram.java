public class Tram extends Transport {
    public Tram() {

        Transport t1 = new Transport();
        System.out.println("Tram:" + "\n" + "\t" + "Date: " + getDate() + "\n" + "\t" + "Age: " + getAge() + "\n" + "\t"
                + "Mileage: " + t1.getMileage() + "\n" + "\t" + "low-floor: " + getFloor(true) + "\n" + "\t"
                + "Articulate: " + getArticulate(true));
    }
}
