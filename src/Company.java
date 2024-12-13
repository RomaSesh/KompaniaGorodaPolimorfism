/**
 * Класс, представляющий компанию.
 */
public class Company {
    protected String name; // Название компании
    protected int persons; // Количество сотрудников
    protected int money; // Месячный фонд зарплаты

    /**
     * Конструктор для инициализации объекта компании.
     *
     * @param name Название компании
     * @param persons Количество сотрудников
     * @param money Месячный фонд зарплаты
     */
    public Company(String name, int persons, int money) {
        this.name = name; // Инициализация названия компании
        this.persons = persons; // Инициализация количества сотрудников
        this.money = money; // Инициализация месячного фонда зарплаты
    }

    /**
     * Метод для получения названия компании.
     *
     * @return Название компании
     */
    public String getName() {
        return name;
    }

    /**
     * Метод для печати информации о компании.
     */
    public void show() {
        // Вывод информации о компании
        System.out.println("В компании " + name +
                " трудятся " + persons + " сотрудников, " +
                "фонд зарплаты: " + money);
    }

    /**
     * Вычисляет среднюю зарплату сотрудников.
     *
     * @return Средняя зарплата, или 0, если сотрудников нет
     */
    public int averageSalary() {
        return persons > 0 ? money / persons : 0; // Избегаем деления на ноль
    }

    /**
     * Вычисляет максимальное число сотрудников с заданной зарплатой.
     *
     * @param salary Зарплата одного сотрудника
     * @return Максимальное число сотрудников, или 0, если зарплата некорректна
     */
    public int maxPersons(int salary) {
        return salary > 0 ? money / salary : 0; // Избегаем деления на ноль
    }
}