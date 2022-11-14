package Pets;
import java.util.Objects;

public class Flightless extends Birds{
    private String typeOfMovement;

    public Flightless(String name, int age, String area, String typeOfMovement) {
        super(name, age, area);
        if (typeOfMovement==null||typeOfMovement.isEmpty()){
            System.out.println("Информация не указана");}
        else {this.typeOfMovement = typeOfMovement;}
    }

    public String getTypeOfMovement() {
        return typeOfMovement;
    }

    public void setTypeOfMovement(String typeOfMovement) {
        this.typeOfMovement = typeOfMovement;
    }
    public void eat(){
        System.out.println("Грызть ");}
    public void move(){
        System.out.println("Цепляться");}
    public void walk(){
        System.out.println("Гулять ");
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Flightless that = (Flightless) o;
        return Objects.equals(typeOfMovement, that.typeOfMovement);
    }

    @Override
    public int hashCode() {
        return Objects.hash(typeOfMovement);
    }

    @Override
    public String toString() {
        return  super.toString()+
                "Flightless{" +
                "typeOfMovement='" + typeOfMovement + '\'' +
                '}';
    }
}
