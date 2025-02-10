package example6;

public class Main {
    public static void main(String[] args) {
        MyArrayList<String> list = new MyArrayList<>();

        // Добавляем элементы
        list.add("Один");
        list.add("Два");
        list.add("Три");
        list.add("Четыре");
        list.add("Пять");

        System.out.println("Список после добавления элементов: " + list);

        // Получаем элемент
        System.out.println("Элемент с индексом 3: " + list.get(3));

        // Удаляем элемент
        list.remove(1);
        System.out.println("Список без элемента с индксом 1 " + list);

        // Добавляем больше элементов, чтобы проверить расширение массива
        list.add("Шесть");
        list.add("Семь");
        list.add("Восемь");
        list.add("Девять");
        list.add("Десять");

        System.out.println("Cписок с добавлением элементов " + list);
        System.out.println("Размер списка: " + list.size());
    }
}