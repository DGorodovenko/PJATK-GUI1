import java.util.Random;

public class Transport {
    Random rand = new Random();

    public int mileage = 150000;
    public int date = 2020;
    public int age;
    public boolean floor;
    public boolean articulate;

    public String fuel = "gas";

    public String getFuel() {
        return fuel;
    }

    public boolean getFloor(boolean floor) {
        return floor == true ? true : false;
    }

    public boolean getArticulate(boolean articulate) {
        return articulate == true ? true : false;
    }

    public int getMileage() {
        return rand.nextInt(mileage - 100000) + 100000;
    }

    public void setMileage(int mileage) {
        this.mileage = mileage;
    }

    public int getDate() {
        date = rand.nextInt(date - 1970) + 1970;
        return date;
    }

    public int getAge() {
        age = 2021 - this.date;
        return age;
    }

    public void setDate(int date) {
        this.date = date;
    }

}
