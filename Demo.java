public class Demo {
    public static void main(String[] args) {
        Invoker invoker = new Invoker();

        invoker.setCommand(new Forward());
        invoker.executeCommand();

        invoker.setCommand(new Left());
        invoker.executeCommand();

        invoker.setCommand(new Right());
        invoker.executeCommand();

        invoker.setCommand(new Back());
        invoker.executeCommand();

    } 
}