public class Demo {
    public static void main(String[] args) {
        Invoker invoker = new Invoker();
        BeeBot bot = new BeeBot();

        invoker.setCommand(new Forward(bot));
        invoker.executeCommand();

        invoker.setCommand(new Left(bot));
        invoker.executeCommand();

        invoker.setCommand(new Forward(bot));
        invoker.executeCommand();

        invoker.setCommand(new Forward(bot));
        invoker.executeCommand();

        invoker.setCommand(new Right(bot));
        invoker.executeCommand();

    } 
}