public class Person {
    public Person () {}
    public Person (String name) {
        this.name = name;
    }
    public String name = "mateus";
    public int age;
    private String sex;
    private String CPF;
    public String getSex() {
        return sex;
    }
    public void setSex (String sex) {
        this.sex = sex;
    }
    public String getCPF() {
        return CPF;
    }
    public void setCPF (String CPF) {
        this.CPF = CPF;
    }
    public static void staticMethod () {
        System.out.println("Método estático");
    }
}
