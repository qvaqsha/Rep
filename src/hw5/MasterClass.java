package hw5;

public class MasterClass {
    public static void main(String[] args) {
        Employee employee = new Employee("Ivan", "admin", "email@em.com", "88005553535", 100000, 29);


        Employee[] array = new Employee[5];
        array[0] = new Employee("Ivanov Ivan", "Engineer", "ivan@ya.ru", "89233455555", 30000, 30);
        array[1] = new Employee("Olegov Oleg", "Director", "dir@ya.ru", "89245455555", 60000, 42);
        array[2] = new Employee("Petrov Petr", "Tehnolog", "tech@ya.ru", "89267755555", 40000, 44);
        array[3] = new Employee("Alexeev Alexey ", "Buhgalter", "glbuh@ya.ru", "89334554215", 36000, 29);
        array[4] = new Employee("Magamedov Magamed", "Security", "sec@ya.ru", "89233455695", 40000, 37);

        old(array);
    }
    public static void old(Employee[] array){
        for(int i=0; i<array.length; i++){
            if (array[i].getAge()>40){
                System.out.println(array[i].getinfo());
            }
        }
    }
}
