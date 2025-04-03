class Laptop {
    private String brand;
    private int ramSize;

    public Laptop(String brand, int ramSize) {
        this.setBrand(brand);
        this.setRamSize(ramSize);
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        if (brand != null && !brand.isEmpty()) {
            this.brand = brand;
        } else {
            throw new IllegalArgumentException("Brand cannot be null or empty");
        }
    }

    public int getRamSize() {
        return ramSize;
    }

    public void setRamSize(int ramSize) {
        if (ramSize > 0) {
            this.ramSize = ramSize;
        } else {
            throw new IllegalArgumentException("RAM size must be greater than 0");
        }
    }

    @Override
    public String toString() {
        return "Laptop{brand='" + brand + "', ramSize=" + ramSize + "GB}";
    }

    public static void main(String[] args) {
        Laptop myLaptop = new Laptop("Dell", 16);
        System.out.println("Laptop Details: " + myLaptop);
    }
}
