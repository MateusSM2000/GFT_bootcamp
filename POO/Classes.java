public class Classes {
    public static void main(String[] args) {
        var person1 = new Person();
        System.out.println(person1.name);
        person1.name = "João";
        person1.age = 25;
        System.out.printf("%s %s\n", person1.name, person1.age );
        person1.setCPF("123.456.789-00");
        person1.setSex("Male");
        System.out.printf("%s %s\n", person1.getCPF(), person1.getSex());
        Person.staticMethod();
        var person2 = new Person("Marcia");
        System.out.println(person2.name)
    }
}
