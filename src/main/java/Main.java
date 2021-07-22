public class Main {
    public static void main(String[] args) {
        CanRunCanJump[] members = {
                new Human(2, 2, "Алекс"),
                new Human(1, 2, "Пауль"),
                new Cat(3, 4, "Экстази"),
                new Cat(1, 1, "Эверест"),
                new Robot(0, 10, 12345),
                new Robot(4,6,4321)
        };

        Obstacle[] obstacles = {
                new RunningTrack(1),
                new RunningTrack(3),
                new Wall(1),
                new Wall(2)
        };

        for (CanRunCanJump member : members) {
            System.out.println("На старте полосы препятствий: " + member);
            boolean winner = true;
            for (Obstacle obstacle : obstacles) {
                System.out.println(member + " пробует пройти " + obstacle);
                if (obstacle.toJump(member.getMaxHeight()) ||
                        obstacle.toRun(member.getMaxLength())) {
                    System.out.println("И проходит успешно!");
                } else {
                    winner = false;
                    System.out.println("И у него не получилось.");
                    break;
                }
            }

            if(winner) {
                System.out.println(member + " прошёл полосу препятствий!");
            } else {
                System.out.println(member + " проиграл.");
            }
            System.out.println();
        }
    }
}