class Weapon {
    String name;
    int damage;

    public Weapon(String name, int damage) {
        this.name = name;
        this.damage = damage;
    }

    // Метод для вистрілу зброєю в зомбі
    public void fire(Zombie target) {
        System.out.println("\u001B[35m" + "Зброя " + name + " вистрілила в " + target.getName() + " і завдала " + damage + " шкоди.");
        target.takeDamage(damage);
    }

    // Void
    public void reload() {
        System.out.println("\u001B[35m" + "Зброя " + name + " перезаряджена.");
    }
}