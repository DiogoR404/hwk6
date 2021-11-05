public abstract class Command {
    BeeBot bot;

    public Command (BeeBot b) {
        this.bot = b;
    }
    public abstract void execute();
}
