public class Wall implements Obstruction{
    int height;

    public Wall(int height){
        this.height=height;
    }

    @Override
    public boolean toRun(int maxLength) {
        return false;
    }

    @Override
    public boolean toJump(int maxHeight) {
        return (maxHeight>=height);
    }

    @Override
    public String toString() {
        return "Wall with  "+ height + " meter";
    }
}
