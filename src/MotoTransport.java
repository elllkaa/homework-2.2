public class MotoTransport extends transport {
    public MotoTransport(String modelName, int wheelsCount) {
        super(modelName, wheelsCount);
    }

    public void checkEngine() {
        System.out.println("Проверяем двигатель");
    }
    public void service() {
        super.service();
        checkEngine();
    }
}
