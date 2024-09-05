package leceight;

    public class Stu {

        int id;
        String name;
        int age;

        Stu(int i, String n) {
            id = i;
            name = n;
        }

        Stu(int i, String n, int a) {
            id = i;
            name = n;
            age = a;
        }

        void display() {
            System.out.println(id + " " + name + " " + age);
        }
    }

