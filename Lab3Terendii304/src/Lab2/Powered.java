package Lab2;
/**
 * Інтерфейс для об'єктів, що мають джерело енергії.
 */
public  abstract interface Powered {
    double milesToFueling(); // Метод для отримання кількості енергії до заправки або зарядки
    int SPEEDLIMIT = 100;    // Обмеження швидкост
}
