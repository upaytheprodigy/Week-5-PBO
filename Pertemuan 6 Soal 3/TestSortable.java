public class TestSortable {
    public static void main(String[] args) {
        Employee[] staff = new Employee[3];
        
        // Perhatikan, kita bisa memasukkan Manager ke dalam array Employee
        staff[0] = new Manager("Maria Bianchi", 2500000, 1, 12, 1991);
        staff[1] = new Employee("Isabel Vidal", 3000000, 1, 11, 1993);
        staff[2] = new Employee("Antonio Rossi", 2000000, 1, 10, 1989);

        System.out.println("Data sebelum diurutkan:");
        for (Employee e : staff) {
            e.print();
        }
        
        // Memanggil metode static shell_sort untuk mengurutkan array
        Sortable.shell_sort(staff);

        System.out.println("\nData setelah diurutkan berdasarkan gaji:");
        for (Employee e : staff) {
            e.print();
        }
    }
}