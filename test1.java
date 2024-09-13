package edu.java.lab1;
/**
 *  @author Tsatskis_Artem
 **/
public class test1 {
    public static void main(String[] args) {
        // Объявляем и инициализируем статический массив целых чисел
        int[] numbers = {5, 8, 1, 3, 7, 2, 6, 4};
        // Выводим исходный массив на консоль
        System.out.println("Исходный массив:");
        printArray(numbers);
        // Сортируем массив по возрастанию
        bubbleSort(numbers);       
        // Выводим отсортированный массив на консоль
        System.out.println("Отсортированный массив (по возрастанию):");
        printArray(numbers);  
        
        // Сортируем массив по убыванию
        bubbleSortDescending(numbers);       
        // Выводим отсортированный массив на консоль
        System.out.println("Отсортированный массив (по убыванию):");
        printArray(numbers);
    }
    
    //Метод для сортировки массива целых чисел методом пузырька.
    public static void bubbleSort(int[] array) {
        int n = array.length;
        // Проходим по массиву для сортировки
        for (int i = 0; i < n - 1; i++) {
            // И для каждого элемента сравниваем его с последующими
            for (int j = 0; j < n - i - 1; j++) {
                // Если текущий элемент больше следующего, то их меняем местами
                if (array[j] > array[j + 1]) {
                    // Временная переменная для обмена значениями
                    int temp = array[j];
                    array[j] = array[j + 1];
                    array[j + 1] = temp;
                }
            }
        }
    }
     // Метод для сортировки массива целых чисел по убыванию.
    public static void bubbleSortDescending(int[] array) {
        int n = array.length;
        // Проходим по массиву для сортировки
        for (int i = 0; i < n - 1; i++) {
            // И для каждого элемента сравниваем его с последующими
            for (int j = 0; j < n - i - 1; j++) {
                // Если текущий элемент меньше следующего, то их меняем местами
                if (array[j] < array[j + 1]) {
                    // Временная переменная для обмена значениями
                    int temp = array[j];
                    array[j] = array[j + 1];
                    array[j + 1] = temp;
                }
            }
        }
    }
     //Метод для вывода элементов массива на консоль.
    public static void printArray(int[] array) {
        // Проходим по массиву и выводим каждый элемент
        for (int num : array) {
            System.out.print(num + " ");
        }
        System.out.println(); // Переход на новую строку
    }
}
