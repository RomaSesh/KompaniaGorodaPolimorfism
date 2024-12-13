/**
 * Класс, представляющий технологическую компанию, наследуется от класса Company.
 */
public class TechCompany extends Company {
    private String technologyFocus; // Фокус технологии

    /**
     * Конструктор для инициализации объекта технологической компании.
     *
     * @param name Название компании
     * @param persons Количество сотрудников
     * @param money Месячный фонд зарплаты
     * @param technologyFocus Фокус технологии компании
     */
    public TechCompany(String name, int persons, int money, String technologyFocus) {
        super(name, persons, money); // Вызов конструктора базового класса Company
        this.technologyFocus = technologyFocus; // Инициализация фокуса технологии
    }

    /**
     * Метод для печати информации о технологической компании.
     */
    @Override
    public void show() {
        super.show(); // Вызов метода show() базового класса для вывода общей информации
        // Вывод информации о фокусе технологии
        System.out.println("Фокус технологии: " + technologyFocus);
    }
}