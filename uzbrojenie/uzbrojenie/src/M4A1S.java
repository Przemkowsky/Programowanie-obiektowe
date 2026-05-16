public class M4A1S extends Weapon implements IFireable, IModeSwitchable {
    private boolean silencerOn = true;

    public M4A1S() {
        super("M4A1-S", 2900, 20);
    }

    @Override
    public void displayStats() {
        System.out.println(name + " | $" + price + " | Ammo: " + currentAmmo + "/" + clipSize + " | Silencer: " + silencerOn);
    }

    @Override
    public void shoot() {
        if (currentAmmo > 0) {
            currentAmmo--;
            System.out.println(silencerOn ? "Pew!" : "Bang!");
        } else {
            System.out.println("Click! (Brak amunicji)");
        }
    }

    @Override
    public void reload() {
        refillAmmo();
        System.out.println("M4A1-S przeładowany!");
    }

    @Override
    public void switchMode() {
        silencerOn = !silencerOn;
        System.out.println(silencerOn ? "Tłumik założony" : "Tłumik zdjęty");
    }
}