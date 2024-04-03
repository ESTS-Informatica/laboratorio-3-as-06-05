public class AppStart {
    public static void main(String[] args) {

        Transport gT = new GroundTransportation("ABC123");

        Transport aT = new AirTransportation("Boeing 747", 10);
        Transport aT2 = new AirTransportation("Boeing 7478", 20);

        Transport lorry = new Lorry("asadadsdsa", 2 , 3);
        Transport van = new Van("saddsad", 2);

        gT.setPrice(32100);
        aT.setPrice(345000);

        ShippingCompany shippingCompany = new ShippingCompany("RELIABLE-MOVING");

        shippingCompany.add(gT);
        shippingCompany.add(aT);
        shippingCompany.add(aT2);
        shippingCompany.add(lorry);
        shippingCompany.add(van);

        shippingCompany.makeTransportation("T-002", "Origin", "Dest", 312.12);
        System.out.println(shippingCompany.toString());

        shippingCompany.finalizeTransportation("T-002");

        System.out.println(shippingCompany.toString());

        System.out.println(gT.toString());
        System.out.println(aT.toString());
        System.out.println(aT2.toString());
        System.out.println(lorry.toString());
        System.out.println(van.toString());
    }
}
