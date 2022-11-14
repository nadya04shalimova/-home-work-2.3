package Pets;
import java.util.Objects;

public class Flying extends Birds{
    private String typeOfMovement;

    public Flying(String name, int age, String area, String typeOfMovement) {
        super(name, age, area);
        this.typeOfMovement = typeOfMovement;
    }

    public String getTypeOfMovement() {
        return typeOfMovement;
    }

    public void setTypeOfMovement(String typeOfMovement) {
        if (typeOfMovement==null||typeOfMovement.isEmpty()){
            System.out.println("Информация не указана");}
        else {this.typeOfMovement = typeOfMovement;}
    }
    public void eat(){
        System.out.println("Грызть ");}
    public void move(){
        System.out.println("Цепляться");}
    public void fly(){
        System.out.println("Летать");
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Flying flying = (Flying) o;
        return Objects.equals(typeOfMovement, flying.typeOfMovement);
    }

    @Override
    public int hashCode() {
        return Objects.hash(typeOfMovement);
    }

    @Override
    public String toString() {
        return super.toString()+
                "Flying{" +
                "typeOfMovement='" + typeOfMovement + '\'' +
                '}';
    }
}

