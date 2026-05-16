public abstract class Weapon {
    protected String name;
    protected int price;
    protected int clipSize;
    protected int currentAmmo;

    public Weapon(String name, int price, int clipSize) {
        this.name = name;
        this.price = price;
        this.clipSize = clipSize;
        this.currentAmmo = clipSize;
    }

    public abstract void displayStats();

    public void refillAmmo() {
        currentAmmo = clipSize;
    }
}