package UTS;

public abstract class Flight {
    protected String route;
    protected String departureDate;
    protected String airline;
    protected int availableSeats;
    protected String type;

    public Flight (String route, String departureDate, String airline, int availableSeats, String type) {
        this.route = route;
        this.departureDate = departureDate;
        this.airline = airline;
        this.availableSeats = availableSeats;
        this.type = type;
    }

    public String getRoute() { return route; }
    public String getDepartureDate() { return departureDate; }
    public String getAirline() { return airline; }
    public int getAvailableSeats() { return availableSeats; }
    public String getType() { return type; }

    public void decreaseSeat() {
        if (availableSeats > 0) {
            availableSeats--;
        }
    }

    public void increaseSeat() {
        availableSeats++;
    }

    public boolean isSameFlight(Flight other) {
        return this.route.equalsIgnoreCase(other.route)
                && this.departureDate.equalsIgnoreCase(other.departureDate)
                && this.airline.equalsIgnoreCase(other.airline)
                && this.type.equalsIgnoreCase(other.type);
    }

    public abstract String getFacility();

    public abstract String getBookingMessage();

    public void displayInfo() {
        System.out.println("[" + type + "] " + route
        + " | Tanggal: " + departureDate
        + " | Maskapai: " + airline
        + " | Kursi: " + availableSeats
        + " | Fasilitas: " + getFacility()
        );
    }
}
