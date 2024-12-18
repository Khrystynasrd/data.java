import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

public class Schedule {
    private List<Event> events; // Список заходів


    public Schedule() {
        events = new ArrayList<>();
    }


    public void addEvent(Event event) {
        events.add(event);
    }


    public List<Event> getEventsByDate(LocalDate date) {
        List<Event> result = new ArrayList<>();
        for (Event event : events) {
            if (event.dateTime.toLocalDate().equals(date)) {
                result.add(event);
            }
        }
        return result;
    }


    public void removePastEvents() {
        LocalDateTime now = LocalDateTime.now();
        events.removeIf(event -> event.dateTime.isBefore(now));
    }


    public void printAllEvents() {
        if (events.isEmpty()) {
            System.out.println("Немає запланованих заходів.");
        } else {
            for (Event event : events) {
                System.out.println(event);
            }
        }
    }
}