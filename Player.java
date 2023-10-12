class Player {
    private String name;
    private int health;

    public Player(String name, int health) {
        this.name = name;
        this.health = health;
    }


    // Метод з типізованим поверненням
    public void takeDamage(int damage) {
        health -= damage;
        System.out.println("\u001B[32m" + " Урон по гравцю " + "\u001B[33m" + name +"." + "\n" + name + "\u001B[32m" + " втратив " + "\u001B[31m" + damage + "\u001B[32m" + " здоров'я. \n Загальне здоров'я гравця: " +"\u001B[31m" +  health);
    }

    // Метод без типізованого повернення (void)
    public void move(String direction) {
        System.out.println("\u001B[33m"+name + "\u001B[32m" + " рухається у напрямку " + "\u001B[31m" +  direction);
    }
}
