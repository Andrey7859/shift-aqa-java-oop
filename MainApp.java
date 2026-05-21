public class MainApp {
    public static void main(String[] args) {
        Autobot optimus = new Autobot("Optimus Prime", "Autobot");
        Decepticon megatron = new Decepticon("Megatron", "Decepticon");

        optimus.run();
        optimus.fire();
        optimus.charge();
        optimus.transform();

        megatron.run();
        megatron.fire();
        megatron.charge();
        megatron.transform();
    }
}
