public class Main {
    public static void main(String[] args) {
        Transport[] transports = {
                new Bicycle(""),
                new Car("Volkswagen"),
                new Truck("Faw", 16)
        };

        ServiceStation serviceStation = new ServiceStation();
        for (Transport transport : transports) {
            serviceStation.chek(transport);
        }

    }
}