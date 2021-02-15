public class Track implements Obstruction{
    int lenght;

    public Track(int lenght){
        this.lenght=lenght;
    }

    @Override
    public boolean toRun(int maxLength) {
        return (maxLength>=lenght);
    }

    @Override
    public boolean toJump(int maxHeight) {
        return false;
    }

    @Override
    public String toString() {
        return "Track with  "+ lenght + " meter";
    }
}
