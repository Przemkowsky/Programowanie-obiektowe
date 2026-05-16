public class Glock18 extends Weapon implements IFireable, IModeSwitchable {
    private String fireMode = "Single";

    public Glock18() {
        super("Glock-18", 200, 20);
    }

    @Override
    public void displayStats() {
        System.out.println(name + " | $" + price + " | Ammo: " + currentAmmo + "/" + clipSize + " | Mode: " + fireMode);
    }

    @Override
    public void shoot() {
        if (currentAmmo > 0) {
            currentAmmo--;
            System.out.println("Bang!");
        } else {
            System.out.println("Click! (Brak amunicji)");
        }
    }

    @Override
    public void reload() {
        refillAmmo();
        System.out.println("Glock przeładowany!");
    }

    @Override
    public void switchMode() {
        fireMode = fireMode.equals("Single") ? "Burst" : "Single";
        System.out.println("Tryb zmieniony na: " + fireMode);
    }
}