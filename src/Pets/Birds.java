package Pets;
import java.util.Objects;

public class Birds extends Pets{
    private String area;

    public Birds(String name, int age, String area) {
        super(name, age);
        if (area==null||area.isEmpty()){
            System.out.println("Информация не указана");}
        else {this.area = area;}

    }

    public String getArea() {
        return area;
    }

    public void setArea(String area) {
        this.area = area;
    }
    public void eat(){
        System.out.println("Есть");}
    public void move(){
        System.out.println("Ходить");
    }
    public void hunt(){
        System.out.println("Охотиться");

    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Birds birds = (Birds) o;
        return Objects.equals(area, birds.area);
    }

    @Override
    public int hashCode() {
        return Objects.hash(area);
    }

    @Override
    public String toString() {
        return super.toString()+
                "Birds{" +
                "area='" + area + '\'' +
                '}';
    }
}

