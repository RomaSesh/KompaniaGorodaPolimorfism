public class InsCompany extends Company {
    private int counts; // количество застрахованных лиц
    private int summaplus; // сумма страховых взносов
    private int summaminus; // сумма страховых выплат

    // Конструктор принимает параметры для инициализации объектов
    public InsCompany(String name, int persons, int money, int counts, int summaplus, int summaminus) {
        super(name, persons, money); // Вызов конструктора базового класса Company
        this.counts = counts; // Инициализация количества застрахованных
        this.summaplus = summaplus; // Инициализация суммы взносов
        this.summaminus = summaminus; // Инициализация суммы выплат
    }

    // Печать информации о страховой компании
    @Override
    public void show() {
        super.show(); // Вызов метода show() базового класса для вывода общей информации
        // Вывод информации о застрахованных, взносах и выплатах
        System.out.println("Застрахованных лиц: " + counts +
                ", Взносы: " + summaplus +
                ", Выплаты: " + summaminus);
    }

    // Вычисление среднего размера страховых взносов
    public int averageIns() {
        return counts > 0 ? summaplus / counts : 0; // Избегаем деления на ноль
    }

    // Метод для получения суммы страховых взносов
    public int getSummaplus() {
        return summaplus;
    }
}
