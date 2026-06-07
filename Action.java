public interface Action {
    default void run() {
        System.out.println("is running");
    }

    void fire();

    void charge();
}