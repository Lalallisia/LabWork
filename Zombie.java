class Zombie {
    private String name;
    private int health;

    public Zombie(String name, int health) {
        this.name = name;
        this.health = health;
    }

    // ім'я
    public String getName() {
        return name;
    }

    // Урон
    public void takeDamage(int damage) {
        health -= damage;
        System.out.println("\u001B[34m" + name +"\u001B[32m" +  " отримав " + "\u001B[31m" + damage +"\u001B[32m" +  " шкоди. \n Загальне здоров'я противника: " +"\u001B[31m" +  health);
    }

    // void
    public void move(String direction) {
        System.out.println("\u001B[34m" + name + "\u001B[32m" + " рухається у напрямку " + "\u001B[31m" + direction);
    }

    // Метод для атаки гравця
    public void attack(Player target) {
        int damage = 20;
        target.takeDamage(damage);
    }
}