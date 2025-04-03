class Flight {
    private String destination;
    private int seatCount;

    public Flight(String destination, int seatCount) {
        this.setDestination(destination);
        this.setSeatCount(seatCount);
    }

    public String getDestination() {
        return destination;
    }

    public void setDestination(String destination) {
        if (destination != null && !destination.isEmpty()) {
            this.destination = destination;
        } else {
            throw new IllegalArgumentException("Destination cannot be null or empty");
        }
    }

    public int getSeatCount() {
        return seatCount;
    }

    public void setSeatCount(int seatCount) {
        if (seatCount > 0) {
            this.seatCount = seatCount;
        } else {
            throw new IllegalArgumentException("Seat count must be greater than 0");
        }
    }

    @Override
    public String toString() {
        return "Flight{destination='" + destination + "', seatCount=" + seatCount + "}";
    }

    public static void main(String[] args) {
        Flight myFlight = new Flight("New York", 150);
        System.out.println("Flight Details: " + myFlight);
    }
}
