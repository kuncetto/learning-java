public class IdentityCard {
    public static void main(String[] args) {
        Person p =  new Person();

        p.firstName = "John";
        p.lastName = "Doe";
        p.age = 42;
        p.gender = 'M';
        p.height = 1.76f;
        p.weight = 80.2f;

        System.out.print("First Name: ");
        System.out.println(p.firstName);
        System.out.print("Last Name: ");
        System.out.println(p.lastName);
        System.out.print("Age: ");
        System.out.println(p.age);
        System.out.print("Gender: ");
        System.out.println(p.gender);
        System.out.print("Height(m): ");
        System.out.println(p.height);
        System.out.print("Weight(kg): ");
        System.out.println(p.weight);
    }
}
