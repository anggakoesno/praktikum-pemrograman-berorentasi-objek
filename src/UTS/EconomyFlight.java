package UTS;

public class EconomyFlight extends Flight {
    public EconomyFlight(String route, String departureDate, String airline, int availableSeats) {
        super(route, departureDate, airline, availableSeats, "ECONOMY");
    }

    @Override
    public String getFacility() {
        return "Bagasi kabin 7 kg dan snack gratis.";
    }

    @Override
    public String getBookingMessage() {
        return "Silakan check-in minimal 2 jam sebelum keberangkatan untuk kelas Economy.";
    }
}
