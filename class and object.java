class Student {
    int id = 101;
    String name = "Venu";

    void display() {
        System.out.println("ID: " + id);
        System.out.println("Name: " + name);
    }

    public static void main(String[] args) {
        Student s = new Student();
        s.display();
    }
}
