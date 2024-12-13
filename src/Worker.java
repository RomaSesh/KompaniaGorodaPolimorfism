/**
 * Абстрактный класс, представляющий сотрудника.
 * Содержит общие характеристики и методы для всех типов сотрудников.
 */
public abstract class Worker {
    protected String name; // Имя сотрудника
    protected double salary; // Зарплата сотрудника

    /**
     * Метод для расчета и возврата зарплаты сотрудника.
     * @return зарплата в виде дробного числа
     */
    public abstract double giveSalary();
}