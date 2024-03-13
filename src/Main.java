/*
 * penggunaan import
 * dapat dikatakan bahwa kelas Main bisa mengakses atribut dari kelas Person dalam package domain (berprivate atribut) dan
 * karena terhubung melalui mekanisme import.
 */
import domain.Person;

public class Main {
    public static void main(String[] args) throws Exception {
        Person person = new Person("yuto",23);

        System.out.println("nama saya : " + person.getName());
        System.out.println("umur saya : " + person.getAge()); // Terdapat yellowUnderLine warning karena age sudah deprecated
    }
}
