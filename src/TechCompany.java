public class TechCompany extends Company {
    private String technologyFocus; // Фокус технологии

    // Конструктор принимает параметры для инициализации объектов
    public TechCompany(String name, int persons, int money, String technologyFocus) {
        super(name, persons, money); // Вызов конструктора базового класса Company
        this.technologyFocus = technologyFocus; // Инициализация фокуса технологии
    }

    // Печать информации о технологической компании
    @Override
    public void show() {
        super.show(); // Вызов метода show() базового класса для вывода общей информации
        // Вывод информации о фокусе технологии
        System.out.println("Фокус технологии: " + technologyFocus);
    }
}
