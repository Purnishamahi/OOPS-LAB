class Movie {
    private String title;
    private double rating;

    public Movie(String title, double rating) {
        this.setTitle(title);
        this.setRating(rating);
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        if (title != null && !title.isEmpty()) {
            this.title = title;
        } else {
            throw new IllegalArgumentException("Title cannot be null or empty");
        }
    }

    public double getRating() {
        return rating;
    }

    public void setRating(double rating) {
        if (rating >= 0 && rating <= 10) {
            this.rating = rating;
        } else {
            throw new IllegalArgumentException("Rating must be between 0 and 10");
        }
    }

    @Override
    public String toString() {
        return "Movie{title='" + title + "', rating=" + rating + "}";
    }

    public static void main(String[] args) {
        Movie myMovie = new Movie("Inception", 8.8);
        System.out.println("Movie Details: " + myMovie);
    }
}
