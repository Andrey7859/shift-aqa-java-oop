import java.util.List;
import java.util.ArrayList;

public class MainApp {
    public static void main(String[] args) {
        Autobot optimus = new Autobot("Optimus Prime", "Autobot");
        Decepticon megatron = new Decepticon("Megatron", "Decepticon");

        List<Transformer> transformers = new ArrayList<>();
        transformers.add(optimus);
        transformers.add(megatron);

        optimus.run();
        optimus.fire();
        optimus.charge();
        optimus.transform();
        System.out.println();

        megatron.run();
        megatron.fire();
        megatron.charge();
        megatron.transform();
        System.out.println();

        System.out.println("Cписок трансформеров:");
        for (Transformer transformer : transformers) {
            System.out.println(transformer);
        }
    }
}
