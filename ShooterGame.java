public class ShooterGame {
    public static void main(String[] args) {
        Player player1 = new Player("Alfa", 100);
        Zombie zombie1 = new Zombie("Zombie", 50);
        Weapon gun1 = new Weapon("Mini Uzi", 30);

        player1.move("вперед");
        zombie1.move("вліво");

        gun1.fire(zombie1);
        gun1.reload();
        zombie1.attack(player1);

    }
}
