package fasy.basic;

import java.util.ArrayList;

public class A2 {

    public static class Dog {
        private String name;
        private int age;
        private int weight;
        private String race;

        public Dog(String name, int age, int weight, String race) {
            setName(name);
            setAge(age);
            setWeight(weight);
            setRace(race);
        }

        private Dog() {
        }

        public void doWoof() {
            System.out.println("Woof!");
        }

        private int getAge() {
            return this.age;
        }

        private void setNewAge(int newAge) {
            this.age = newAge;
        }

        public void setName(String name) {
            this.name = name;
        }

        public void setAge(int age) {
            this.age = age;
        }

        public void setWeight(int weight) {
            this.weight = weight;
        }

        public void setRace(String race) {
            this.race = race;
        }

        @Override
        public String toString() {
            return "Dog{" +
                    "name='" + name + '\'' +
                    ", age=" + age +
                    ", weight=" + weight +
                    ", race='" + race + '\'' +
                    '}';
        }
    }

    public static void main(String[] args) {

        Dog dog01 = new Dog();
        dog01.setName("Snoopy");
        dog01.setAge(12);
        dog01.setWeight(35);
        dog01.setRace("White");

        Dog dog02 = new Dog("Shadow", 14, 55, "Black");

        ArrayList<Dog> dogs = new ArrayList<>();
        dogs.add(dog01);
        dogs.add(dog02);

        for(Dog d : dogs){
            System.out.print(d + " ");
            d.doWoof();
        }
    }
}
