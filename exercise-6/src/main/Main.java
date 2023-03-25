package main;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.Month;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
    	Scanner sc = new Scanner(System.in);
    	System.out.println("Enter the speed: ");
        double speed = Integer.parseInt(sc.nextLine());
        System.out.println("Enter the distance: ");
        double distance = Integer.parseInt(sc.nextLine());
        LocalDate date = LocalDate.of(2023, Month.MARCH, 27);
        LocalTime time = LocalTime.of(9, 0); // 9 AM
        Lorry lorry = new Lorry(speed, distance, date, time);
        LocalDateTime endDateTime = lorry.getEndDateTime();
        System.out.println("Expected arrival time: " + endDateTime);
    }
}
