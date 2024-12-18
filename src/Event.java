import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class Event {
    String name; // Назва заходу
    LocalDateTime dateTime; // Дата і час заходу
    String location; // Місце проведення


    public Event(String name, LocalDateTime dateTime, String location) {
        this.name = name;
        this.dateTime = dateTime;
        this.location = location;
    }


    @Override
    public String toString() {
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd.MM.yyyy HH:mm");
        return "Захід: " + name + ", Дата: " + dateTime.format(formatter) + ", Місце: " + location;
    }
}
