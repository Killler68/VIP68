package calculator.practices;

public class Human {
        String name; //name объекта
        int age;

        public void setName(String name) { // name метода
            this.name = name; // this.name - name объекта, = name метода
        }

        public void setAge(int age) {
            this.age = age;
        }

        public String getName() {
            return name;
        }

        public int getAge() {
            return age;
        }

        public void getInfo() {
            System.out.println(name + "," + age);
        }
    }

