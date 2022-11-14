package Transport;

public class Bus extends Transport{
    public Bus(String marka, String model, int yearOfRelease, String country, String color, int maxSpeed) {
        super(marka, model, yearOfRelease, country, color, maxSpeed);
    }

    @Override
    public void refill() {
        System.out.println("Заправь дизелем");
        System.out.println("Заправь бензином");
    }

    @Override
    public String toString() {
        return getMarka() + getModel() +  color + getYearOfRelease()+" "+getCountry();
    }
}
