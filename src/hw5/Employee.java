package hw5;

public class Employee {
    String name;
    String post;
    String email;
    String phone;
    int money;
    int age;

    public Employee() {

    }

    public Employee(String name,String post, String email, String phone,int money, int age){
        this.name = name;
        this.post = post;
        this.email = email;
        this.phone = phone;
        this.money = money;
        this.age = age;
    }



    String getinfo() {
        return "Имя фамилия: " + name +
                " Должность: " + post +
                " EMAIL адрес: "+ email +
                " Номер телефона: "+ phone +
                " ЗП: " + money +
                " Возраст: " + age;
    }
    String getName(){
        return name;
    }
    String getPost(){
        return post;
    }
    String getEmail(){
        return email;
    }
    String getPhone(){
        return phone;
    }
    int getAge(){
        return age;
    }
    int getMoney(){
        return money;
    }
}

