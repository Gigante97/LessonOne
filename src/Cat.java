public class Cat implements JumpableRunable {
    private int maxHeight;
    private int maxLenght;
    public String name;

    public Cat(int maxHeight,int maxLenght,String name) {
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
        System.out.println("Cat " + name + " jump");
    }

    @Override
    public int getMaxLength() {
        return maxLenght;
    }

    @Override
    public void run() {
        System.out.println("Cat " + name + " run");
    }

    @Override
    public String toString() {
        return "Cat's name "+ name;
    }
}
