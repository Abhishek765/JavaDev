
class MacBookProM1 {

    public void show() {
        System.out.println("Welcome to macbook pro M1 Class");
    }

    /**
     ** Created inner class as Configuration is something which is just related to
     ** MacBookProM1 class
     */
    static class Configuration {

        public void showConfiguration() {
            System.out.println("M1 Configuration...");

        }
    }

}

public class InnerClassExample {

    public static void main(String[] args) {
        MacBookProM1 macBookProM1 = new MacBookProM1();
        macBookProM1.show();

        // MacBookProM1.Configuration innerClassObj = macBookProM1.new Configuration();
        // //! if inner class is normal

        // innerClassObj.showConfiguration();
        MacBookProM1.Configuration innerClassObj = new MacBookProM1.Configuration(); // ! if inner class is static
        innerClassObj.showConfiguration();

    }

}
