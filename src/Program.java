public class Program {
    public static void main(String[] args) {
        // Создание массива для хранения объектов компаний
        Company[] companies = new Company[6];
// Создание и инициализация объектов
        companies[0] = new InsCompany("ABC", 100, 100000, 111, 111111, 1111);
        companies[1] = new InsCompany("BCD", 200, 200000, 222, 222222, 2222);
        companies[2] = new TechCompany("TechCorp", 150, 150000, "AI Development");
        companies[3] = new TechCompany("InnoTech", 250, 250000, "Blockchain Solutions");
        companies[4] = new InsCompany("CDE", 300, 300000, 333, 333333, 3333);
        companies[5] = new TechCompany("FutureTech", 400, 400000, "Quantum Computing");

        // Печать информации о компаниях
        for (Company company : companies) {
            company.show(); // Вызов метода show() для каждого объекта компании
        }

        // Выяснить, какая компания имеет наименьшую сумму страховых взносов
        int min = Integer.MAX_VALUE; // Начальное значение минимальной суммы взносов
        int index = -1; // Индекс компании с минимальной суммой взносов
        // Поиск компании с наименьшей суммой взносов
        for (int i = 0; i < companies.length; i++) {
            if (companies[i] instanceof InsCompany) { // Проверяем, является ли компания страховой
                int temp = ((InsCompany) companies[i]).getSummaplus();
                if (temp < min) { // Если текущая сумма меньше минимальной
                    min = temp; // Обновляем минимальную сумму
                    index = i; // Обновляем индекс компании с минимальной суммой
                }
            }
        }

        // Вывод названия компании с наименьшей суммой взносов
        if (index != -1) {
            System.out.println("\nНаименьшая сумма взносов в компании " + companies[index].getName());
        }
    }
}