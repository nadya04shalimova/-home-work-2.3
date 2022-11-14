package Pets;
    import java.util.Objects;

    public class Pets {
        private String name;
        private int age;

        public Pets(String name, int age) {
            if (name==null||name.isEmpty()){
                System.out.println("Информация не указана");}
            else {this.name = name;}
            if (age<=0){
                System.out.println("Информация не указана");}
            else {this.age = age;}

        }

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }

        public int getAge() {
            return age;
        }

        public void setAge(int age) {
            this.age = age;
        }


        public void eat(){
            System.out.println("Кушать");
        }
        public void sleep(){
            System.out.println("Спать");
        }
        public void move(){
            System.out.println("Перемещаться");
        }

        @Override
        public boolean equals(Object o) {
            if (this == o) return true;
            if (o == null || getClass() != o.getClass()) return false;
            Pets pets = (Pets) o;
            return age == pets.age && Objects.equals(name, pets.name);
        }

        @Override
        public int hashCode() {
            return Objects.hash(name, age);
        }

        @Override
        public String toString() {
            return "Pets{" +
                    "name='" + name + '\'' +
                    ", age=" + age +
                    '}';
        }
    }

