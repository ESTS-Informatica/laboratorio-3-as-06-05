public class GroundTransportation extends Transport {
    private String licensePlate;

    public GroundTransportation(String licensePlate) {
        this.licensePlate = licensePlate;
        super.setFees(0.03);
    }

    public String getLicensePlate() {
        return licensePlate;
    }
    public void setLicensePlate(String licensePlate) {
        this.licensePlate = licensePlate;
    }
    @Override
    public double getPriceWithFees() {
        return super.getPrice() * (1.0 + (super.getFees() * 0.01));
    }

    @Override
    public String getTransportType() {
        return "Ground";
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
        sb.append(String.format("License Plate %s\n", this.licensePlate));

        return sb.toString();
    }
}
