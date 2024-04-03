public class AirTransportation extends Transport {
    private String name;
    private int numberOfContainers;

    public AirTransportation(String name, int numberOfContainers) {
        this.name = name;
        this.numberOfContainers = numberOfContainers;
        super.setFees(0.04);
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public int getNumberOfContainers() {
        return numberOfContainers;
    }
    public void setNumberOfContainers(int numberOfContainers) {
        this.numberOfContainers = numberOfContainers;
    }
    @Override
    public double getPriceWithFees() {
        return super.getPrice() * (1.0 + (super.getFees() * 0.01));
    }

    @Override
    public String getTransportType() {
        return "Air";
    }
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();

        sb.append(String.format("\n%15s: %s\n", "Tipo Transporte", getTransportType()));
        sb.append(String.format("%15s: %s\n", "ID", super.getId()));
        sb.append(String.format("%15s: %s\n", "Origem", super.getOrigin()));
        sb.append(String.format("%15s: %s\n", "Destino", super.getDestination()));
        sb.append(String.format("%15s: %5.2f€\n", "Preço", super.getPrice()));
        sb.append(String.format("%15s: %4.2f%%\n", "Honorarios", super.getFees()));
        sb.append(String.format("%15s: %4.2f€\n", "Preço Final", getPriceWithFees()));
        sb.append(String.format("Name: %s\n", this.name));
        sb.append(String.format("Number Of Containers: %s\n", this.numberOfContainers + ""));

        return sb.toString();
    }
}
