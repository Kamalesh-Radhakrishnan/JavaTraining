package main;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;

class Lorry {
    private double speed;
    private double distance;
    private LocalDateTime startDateTime;
    private LocalDateTime endDateTime;

    public Lorry(double speed, double distance, LocalDate date, LocalTime time) {
        this.speed = speed;
        this.distance = distance;
        this.startDateTime = LocalDateTime.of(date, time);
        this.endDateTime = calculateEndDateTime();
    }

    private LocalDateTime calculateEndDateTime() {
        Holidays schedule = new Holidays(startDateTime.getYear());
        LocalDateTime currentDateTime = startDateTime;
        double remainingDistance = distance;
        while (remainingDistance > 0) {
            if (schedule.isHoliday(currentDateTime.toLocalDate())) {
                currentDateTime = currentDateTime.plusDays(1).withHour(8);
            } else {
                double drivingHours = Math.min(8, remainingDistance / speed);
                currentDateTime = currentDateTime.plusHours((int) drivingHours);
                remainingDistance -= drivingHours * speed;
            }
        }
        return currentDateTime;
    }

    public LocalDateTime getEndDateTime() {
        return endDateTime;
    }
}