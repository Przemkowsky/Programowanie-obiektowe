public class AWP extends Weapon implements IFireable, IZoomable {
    private boolean isZoomed = false;

    public AWP() {
        super("AWP", 4750, 10);
    }

    @Override
    public void displayStats() {
        System.out.println(name + " | $" + price + " | Ammo: " + currentAmmo + "/" + clipSize + " | Zoom: " + isZoomed);
    }

    @Override
    public void shoot() {
        if (currentAmmo > 0) {
            currentAmmo--;
            System.out.println("BOOM!");
        } else {
            System.out.println("Click! (Brak amunicji)");
        }
    }

    @Override
    public void reload() {
        refillAmmo();
        System.out.println("AWP przeładowane!");
    }

    @Override
    public void toggleScope() {
        isZoomed = !isZoomed;
        System.out.println(isZoomed ? "Zoom ON" : "Zoom OFF");
    }
}