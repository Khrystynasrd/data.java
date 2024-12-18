import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        // Створюємо розклад
        Schedule schedule = new Schedule();


        schedule.addEvent(new Event("Конференція", LocalDateTime.of(2024, 12, 20, 10, 0), "Тернопіль"));
        schedule.addEvent(new Event("Зустріч", LocalDateTime.of(2024, 12, 18, 14, 30), "Львів"));
        schedule.addEvent(new Event("Виставка", LocalDateTime.of(2025, 1, 15, 11, 0), "Одеса"));


        System.out.println("Усі заходи:");
        schedule.printAllEvents();


        LocalDate filterDate = LocalDate.of(2024, 12, 18);
        System.out.println("\nЗаходи на " + filterDate + ":");
        List<Event> eventsByDate = schedule.getEventsByDate(filterDate);
        for (Event event : eventsByDate) {
            System.out.println(event);
        }


        schedule.removePastEvents();
        System.out.println("\nЗаходи після видалення старих:");
        schedule.printAllEvents();
    }
}