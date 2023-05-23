public class Main {
    public static void main(String[] args) {
        transport[] transports = {
                new Bicycle(""),
                new Car("Volkswagen"),
                new Truck("Faw", 16)
        };

        ServiceStation serviceStation = new ServiceStation();
        for (transport transport : transports) {
            serviceStation.chek(transport);
        }



    }
}