public class Main {
    public static void main(String[] args) {
        JumpableRunable[] members ={
                new Human(5,3,"Nick"),
                new Human(11,7,"Helena"),
                new Cat(1,1,"Scherlock"),
                new Cat(2,3,"Jack"),
                new Robot(6,8,"Sunny"),
                new Robot(3,10,"MicroSchef")
        };
        Obstruction[] obstructions = {
                new Track(3),
                new Track(6),
                new Wall(2),
                new Wall(10)
        };

        for (JumpableRunable member : members) {
            System.out.println("Begins to pass obstacles " + member);
            boolean winner = true;
            for (Obstruction obstruction : obstructions) {
                System.out.println(member + " trying to pass a " + obstruction);
                if(obstruction.toJump(member.getMaxHeight())||obstruction.toRun(member.getMaxLength())){
                    System.out.println("He did it!!!");

                } else {
                    winner = false;
                    System.out.println("Unfortunately, he did not manage to get through all the obstacles.");
                    break;
                }
            }
            if (winner){
                System.out.println(member + " went the distance!");

            } else {
                System.out.println(member + " lost");
            }
            System.out.println();
        }
    }
}
