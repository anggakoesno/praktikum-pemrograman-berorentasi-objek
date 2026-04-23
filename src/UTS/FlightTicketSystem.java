package UTS;

import java.util.ArrayList;
import java.util.List;

public class FlightTicketSystem {
    private List<Flight> flights;
    private List<Booking> bookings;

    public FlightTicketSystem() {
        flights = new ArrayList<>();
        bookings = new ArrayList<>();
    }

    public void addFlight(Flight flight) {
        flights.add(flight);
    }

    public void displayAvailableFlights() {
        System.out.println("BERIKUT DAFTAR PENERBANGAN YANG TERSEDIA SAAT INI");
        boolean found = false;

        for (Flight flight : flights) {
            if (flight.getAvailableSeats() > 0) {
                flight.displayInfo();
                found = true;
            }
        }

        if (!found) {
            System.out.println("Tidak ada penerbangan yang tersedia saat ini");
        }
    }

    public void bookTicket(Passenger passenger, Flight flight) {
        for (Booking booking : bookings) {
            if (booking.getPassenger().getEmail().equalsIgnoreCase(passenger.getEmail())
                    && booking.getFlight().isSameFlight(flight)) {
                System.out.println("Pemesanan gagal: Penumpang dengan email "
                + passenger.getEmail()
                + " sudah memesan tiket pada penerbangan "
                + flight.getRoute());
                return;
            }
        }

        if (flight.getAvailableSeats() <= 0) {
            System.out.println("Pemesanan gagal: Kursi penuh untuk penerbangan "
                    + flight.getRoute());
            return;
        }

        Booking booking = new Booking(passenger, flight);
        bookings.add(booking);
        flight.decreaseSeat();

        System.out.println(passenger.getName() + " berhasil memesan tiket untuk penerbangan " + flight.getRoute());
        System.out.println("Pesan: '" + flight.getBookingMessage() + "' berhasil dikirim ke email penumpang.");

    }

    public void cancelBooking(String email, Flight flight) {
        for (int i = 0; i < bookings.size(); i++) {
            Booking booking = bookings.get(i);

            if (booking.getPassenger().getEmail().equalsIgnoreCase(email)
                    && booking.getFlight().isSameFlight(flight)) {
                booking.getFlight().increaseSeat();
                bookings.remove(i);
                System.out.println("Booking dibatalkan: " + booking);
                return;
            }
        }

        System.out.println("Tidak ditemukan booking dengan email " + email
                + " pada penerbangan " + flight.getRoute());
    }

    public void getBookingsByEmail(String email) {
        boolean found = false;
        for (Booking booking : bookings) {
            if (booking.getPassenger().getEmail().equalsIgnoreCase(email)) {
                if (!found) {
                    System.out.println("Berikut data booking untuk email: " + email);
                }
                System.out.println(booking);
                found = true;
            }
        }

        if (!found) {
            System.out.println("Data booking untuk email: " + email + ", tidak ditemukan.");
        }
    }

    public void getAvailableFlightsByDate(String date) {
        System.out.println("Penerbangan tersedia pada tanggal " + date);
        boolean found = false;

        for (Flight flight : flights) {
            if (flight.getDepartureDate().equalsIgnoreCase(date)
                    && flight.getAvailableSeats() > 0) {
                flight.displayInfo();
                found = true;
            }
        }

        if (!found) {
            System.out.println("Tidak ada penerbangan yang tersedia pada tanggal " + date);
        }
    }
}
