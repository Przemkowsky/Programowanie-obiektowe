import java.util.*;

public class Main {
    public static void main(String[] args) {
        List<Weapon> myLoadout = new ArrayList<>();

        myLoadout.add(new Glock18());
        myLoadout.add(new AWP());

        for (Weapon weapon : myLoadout) {
            weapon.displayStats();

            // jeśli ma lunetę
            if (weapon instanceof IZoomable) {
                ((IZoomable) weapon).toggleScope();
            }

            // strzelanie
            if (weapon instanceof IFireable) {
                IFireable gun = (IFireable) weapon;

                for (int i = 0; i < 5; i++) {
                    gun.shoot();
                }

                gun.reload();
            }

            System.out.println("-------------------");
        }
    }
}