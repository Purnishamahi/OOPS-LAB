class Temperature {
    private double celsius;

    public Temperature(double celsius) {
        this.setCelsius(celsius);
    }

    public void setCelsius(double celsius) {
        this.celsius = celsius;
    }

    public double getCelsius() {
        return celsius;
    }

    public double toFahrenheit() {
        return (celsius * 9 / 5) + 32;
    }

    @Override
    public String toString() {
        return "Temperature{celsius=" + celsius + ", fahrenheit=" + toFahrenheit() + "}";
    }

    public static void main(String[] args) {
        Temperature temp = new Temperature(25);
        System.out.println("Temperature Details: " + temp);
    }
}
