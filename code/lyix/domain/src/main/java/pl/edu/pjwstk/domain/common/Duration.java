package pl.edu.pjwstk.domain.common;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;

public class Duration {
    private LocalDateTime start;
    private LocalDateTime end;
    public Duration(LocalDateTime start, LocalDateTime end) {
        this.start = start;
        this.end = end;
    }
    public Duration(LocalDate start, LocalDate end) {
        this.start = LocalDateTime.of(start, LocalTime.of(0,0,0));
        this.end = LocalDateTime.of(end, LocalTime.of(0,0,0));
    }
}
