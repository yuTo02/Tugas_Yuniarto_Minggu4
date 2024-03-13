package domain;

public class Person {
    //modifier private agar kelas hanya bisa diakses di dalalm kelas itu sendiri (Person class).
    private String name;

    //penggunaan deprecated annotation untuk menandakan bahwa atribut ini sudah usang.
    @Deprecated
    private int age;

    /*
    /*penggunaan Constuctor
     * Konstruktor membantu dalam menerapkan prinsip enkapsulasi, di mana atribut name dan age adalah private,
     * yang berarti hanya bisa diakses dan diubah nilainya melalui metode-metode yang disediakan (setter & getter).
     * Dalam hal ini, konstruktor digunakan untuk mengatur nilai name dan age saat objek Person dibuat,
     * sehingga melindungi data dan mencegah akses langsung dari luar kelas.
     */
    public Person (String name, int age){
        this.name = name;
        this.age = age;
    }

    /*
     * penggunaan getter
     * Jika atribut dalam kelas Person dideklarasikan sebagai private, tanpa menggunakan konstruktor dan beserta getter,
     * maka tidak akan mungkin untuk mengakses nilai atribut tersebut dari luar kelas Person.
     * Hal ini karena prinsip enkapsulasi dalam pemrograman Java.
     * maka dibutuhkan acceessor method.
     */
     public String getName(){
        return name;
     }
     @Deprecated
     public int getAge(){
        return age;
     }
}
