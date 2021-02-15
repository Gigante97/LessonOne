public class Robot implements JumpableRunable  {
    private int maxHeight;
    private int maxLenght;
    public String name;

    public Robot(int maxHeight,int maxLenght,String name) {
        this.maxHeight=maxHeight;
        this.maxLenght=maxLenght;
        this.name=name;
    }

    @Override
    public int getMaxHeight() {
        return maxHeight;
    }

    @Override
    public void jump() {
        System.out.println("Robot " + name + " jump");
    }

    @Override
    public int getMaxLength() {
        return maxLenght;
    }

    @Override
    public void run() {
        System.out.println("Robot " + name + " run");
    }

    @Override
    public String toString() {
        return "Robot's name "+ name;
    }
}
