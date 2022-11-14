package Pets;

import java.util.Objects;

public class Herbivores extends Mammals{
    private String typeOfFood;

    public Herbivores(String name, int age, String area, int speed, String typeOfFood) {
        super(name, age, area, speed);
        if (typeOfFood==null||typeOfFood.isEmpty()){
            System.out.println("Информация не указана");}
        else {this.typeOfFood = name;}

    }

    public String getTypeOfFood() {
        return typeOfFood;
    }

    public void setTypeOfFood(String typeOfFood) {
        this.typeOfFood = typeOfFood;
    }
    public void eat(){
        System.out.println("Есть траву");}
    public void move(){
        System.out.println("Бегать");
    }
    public void graze(){
        System.out.println("Пастись");

    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Herbivores that = (Herbivores) o;
        return Objects.equals(typeOfFood, that.typeOfFood);
    }

    @Override
    public int hashCode() {
        return Objects.hash(typeOfFood);
    }

    @Override
    public String toString() {
        return super.toString()+
                "Herbivores{" +
                "typeOfFood='" + typeOfFood + '\'' +
                '}';
    }
}
