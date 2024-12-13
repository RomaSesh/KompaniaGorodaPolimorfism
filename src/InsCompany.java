/**
 * Класс, представляющий страховую компанию, наследуется от класса Company.
 */
public class InsCompany extends Company {
    private int counts; // Количество застрахованных лиц
    private int summaplus; // Сумма страховых взносов
    private int summaminus; // Сумма страховых выплат

    /**
     * Конструктор для инициализации объекта страховой компании.
     *
     * @param name Название компании
     * @param persons Количество сотрудников
     * @param money Месячный фонд зарплаты
     * @param counts Количество застрахованных лиц
     * @param summaplus Сумма страховых взносов
     * @param summaminus Сумма страховых выплат
     */
    public InsCompany(String name, int persons, int money, int counts, int summaplus, int summaminus) {
        super(name, persons, money); // Вызов конструктора базового класса Company
        this.counts = counts; // Инициализация количества застрахованных
        this.summaplus = summaplus; // Инициализация суммы взносов
        this.summaminus = summaminus; // Инициализация суммы выплат
    }

    /**
     * Метод для печати информации о страховой компании.
     */
    @Override
    public void show() {
        super.show(); // Вызов метода show() базового класса для вывода общей информации
        // Вывод информации о застрахованных, взносах и выплатах
        System.out.println("Застрахованных лиц: " + counts +
                ", Взносы: " + summaplus +
                ", Выплаты: " + summaminus);
    }

    /**
     * Вычисляет средний размер страховых взносов.
     *
     * @return Средний размер взносов, или 0, если застрахованных нет
     */
    public int averageIns() {
        return counts > 0 ? summaplus / counts : 0; // Избегаем деления на ноль
    }

    /**
     * Метод для получения суммы страховых взносов.
     *
     * @return Сумма страховых взносов
     */
    public int getSummaplus() {
        return summaplus;
    }
}