package xyz.gamars.objects.base;

public class Command {

    private String format;
    private Integer delay;
    private Boolean op;
    private Boolean console;

    public Command(String format, Integer delay, Boolean op, Boolean console) {
        this.format = format;
        this.delay = delay;
        this.op = op;
        this.console = console;
    }


    public String getFormat() {
        return format;
    }

    public void setFormat(String format) {
        this.format = format;
    }

    public Integer getDelay() {
        return delay;
    }

    public void setDelay(Integer delay) {
        this.delay = delay;
    }

    public Boolean getOp() {
        return op;
    }

    public void setOp(Boolean op) {
        this.op = op;
    }

    public Boolean getConsole() {
        return console;
    }

    public void setConsole(Boolean console) {
        this.console = console;
    }
}
