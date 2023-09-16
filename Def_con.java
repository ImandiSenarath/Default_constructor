//default constructor code
class Def_con {
    int id;
    String name;

    //default constructor
    Def_con() {
        System.out.println(id);
        System.out.println(name);
    }

    //method display
    void display() {
        System.out.println(id + " " + name);

    }

    public static void main(String[] args) {

        //creating objects
        Def_con s1 = new Def_con();
        Def_con s2 = new Def_con();

        //displaying values of the object
        s1.display();
        s2.display();

    }
}