package Pets;

import java.util.Objects;

public class Mammals extends Pets{
    private String area;
    private int speed;

    public Mammals(String name, int age, String area, int speed) {
        super(name, age);
        if (area==null||area.isEmpty()){
            System.out.println("Информация не указана");}
        else {this.area = area;}
        if (speed<=0){
            System.out.println("Информация не указана");}
        else {this.speed = speed;}
    }

    public String getArea() {
        return area;
    }

    public void setArea(String area) {
        this.area = area;
    }

    public int getSpeed() {
        return speed;
    }

    public void setSpeed(int speed) {
        this.speed = speed;
    }
    public void eat(){
        System.out.println("Есть");}
    public void move(){
        System.out.println("Ходить");
    }
    public void walk(){
        System.out.println("Гулять");
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Mammals mammals = (Mammals) o;
        return speed == mammals.speed && Objects.equals(area, mammals.area);
    }

    @Override
    public int hashCode() {
        return Objects.hash(area, speed);
    }

    @Override
    public String toString() {
        return super.toString() +
                "Mammals{" +
                "area='" + area + '\'' +
                ", speed=" + speed +
                '}';
    }
}
