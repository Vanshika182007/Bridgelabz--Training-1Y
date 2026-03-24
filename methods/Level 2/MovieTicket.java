class MovieTicket {
    String movieName;
    int seatNumber;
    double price;

    // Book ticket
    void bookTicket(String name, int seat, double cost) {
        movieName = name;
        seatNumber = seat;
        price = cost;
        System.out.println("Ticket booked successfully!");
    }

    // Display details
    void displayTicket() {
        System.out.println("Movie: " + movieName);
        System.out.println("Seat Number: " + seatNumber);
        System.out.println("Price: " + price);
    }

    public static void main(String[] args) {
        MovieTicket t = new MovieTicket();
        t.bookTicket("Avengers", 15, 250);
        t.displayTicket();
    }
}
