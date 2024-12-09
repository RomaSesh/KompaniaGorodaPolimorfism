public class Company {
    protected String name; // название
    protected int persons; // количество сотрудников
    protected int money; // месячный фонд зарплаты

    // Конструктор принимает параметры для инициализации объектов
    public Company(String name, int persons, int money) {
        this.name = name; // Инициализация названия компании
        this.persons = persons; // Инициализация количества сотрудников
        this.money = money; // Инициализация месячного фонда зарплаты
    }

    // Метод для получения названия компании
    public String getName() {
        return name;
    }

    // Метод для печати информации о компании
    public void show() {
        // Вывод информации о компании
        System.out.println("В компании " + name +
                " трудятся " + persons + " сотрудников, " +
                "фонд зарплаты: " + money);
    }

    // Вычисление средней зарплаты сотрудников
    public int averageSalary() {
        return persons > 0 ? money / persons : 0; // Избегаем деления на ноль
    }

    // Вычисление максимального числа сотрудников с заданной зарплатой
    public int maxPersons(int salary) {
        return salary > 0 ? money / salary : 0; // Избегаем деления на ноль
    }
}