# Program Java Sederhana dengan Konsep OOP

Program ini adalah contoh sederhana penggunaan konsep pemrograman berorientasi objek (OOP) dalam bahasa pemrograman Java. Program ini terdiri dari dua kelas utama: `Person` dan `Main`.

## Kelas `Person`

Kelas `Person` merupakan kelas utama yang memiliki dua atribut, yaitu `name` (nama) dan `age` (umur). Atribut ini dideklarasikan sebagai `private`, yang berarti hanya bisa diakses di dalam kelas `Person` sendiri. Selain itu, terdapat penggunaan annotation `@Deprecated` pada atribut `age` untuk menandai bahwa atribut tersebut sudah usang.

### Modifier dalam Kelas `Person`

- `private String name;`: Atribut `name` dideklarasikan sebagai `private`, sehingga hanya bisa diakses di dalam kelas `Person`.
- `@Deprecated private int age;`: Atribut `age` dideklarasikan sebagai `private` dan diberi annotation `@Deprecated` untuk menandai bahwa atribut tersebut sudah usang.

### Method dalam Kelas `Person`

- `public Person(String name, int age)`: Konstruktor untuk membuat objek `Person` dengan menginisialisasi `name` dan `age` saat objek tersebut dibuat.
- `public String getName()`: Getter untuk mendapatkan nilai `name` dari objek `Person`.
- `@Deprecated public int getAge()`: Getter untuk mendapatkan nilai `age` dari objek `Person`. Perlu diperhatikan bahwa atribut `age` sudah diberi annotation `@Deprecated`.

## Kelas `Main`

Kelas `Main` merupakan kelas untuk menjalankan program utama. Di dalam kelas `Main`, kita melakukan import kelas `Person` untuk mengaksesnya dari package `domain`.

### Modifier dalam Kelas `Main`

- `import domain.Person;`: Menggunakan import untuk mengakses kelas `Person` yang berada dalam package `domain`.

### Langkah-langkah Program

1. Membuat objek `person` dari kelas `Person` dengan nilai `name` "yuto" dan `age` 23.
2. Menggunakan getter untuk mendapatkan nilai `name` dan `age` dari objek `person`.
3. Mencetak nilai `name` dan `age` dari objek `person`.

### Menjalankan Program

Untuk menjalankan program ini, pastikan telah memiliki Java Development Kit (JDK) terinstal di komputer masing-masing. Jalankan kelas `Main` sebagai kelas utama.

```bash
java Main.java
