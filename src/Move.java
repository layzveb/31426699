
public class Move implements BadMoments{
    private static String nameZnayka;
    private static String nameToropizhka;
    private static String nameNeznayka;
    private static int SIDCodeZnayka;
    private static int SIDCodeToropizhka;
    private static int SIDCodeNeznayka;
    private static int Kolvoraz;
    private static final String RED = "\033[31m";
    private static final String REZET = "\033[0m";


    private static void rezetcolor() {
        System.out.print(REZET + "\r");
        System.out.print("\t\t\r");
    }

    public static void setName(String name, int num, int SIDCode) {
        if (num == 1) {
            if (nameZnayka == null) {
                nameZnayka = name;
                SIDCodeZnayka = SIDCode;
            }
        } else if (num == 2) {
            if (nameToropizhka == null) {
                nameToropizhka = name;
                SIDCodeToropizhka = SIDCode;
            }
        } else if (num == 3) {
            if(nameNeznayka == null) {
                nameNeznayka = name;
                SIDCodeNeznayka = SIDCode;
            }
        }
    }

    public static void spokoen(Hirro x) {
        if (x.getSIDCode() == SIDCodeNeznayka || x.getSIDCode() == SIDCodeZnayka || x.getSIDCode() == SIDCodeToropizhka) {
            Kolvoraz += 1;
            switch (Kolvoraz){
                case 1:
                    System.out.println(x.toString() + " немного успокоился");
                    slp(800);
                    break;
                case 2:
                    System.out.println("\t\t   И");
                    slp(300);
                    System.out.println(x.toString() + " немного успокоился");
                    slp(800);
                    break;
                default:
                    System.out.println("\t\t ЕЩЁ И");
                    slp(300);
                    System.out.println(x.toString() + " немного успокоился");
                    slp(500);
                    System.out.println("\t\tВ ОБЩЕМ");
                    slp(1000);
                    System.out.println("Всем стали чуть спокойней");
                    slp(800);
                    break;
            }
        }
    }

    public static void slp(int x) {
        try {
            Thread.sleep(x);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    public static void podoshol(Hirro x) {
        String HirroName = x.toString();
        if (HirroName.equals(nameZnayka) && x.getSIDCode() == SIDCodeZnayka) {
            Move.slp(1000);
            System.out.println("\n" + HirroName + " пошел к краю корзины...");
            Move.slp(500);
            for (int i = 0; i < 10; i++) {
                if (i % 2 == 0) {
                    System.out.print(" __ ");
                } else {
                    System.out.print(" -- ");
                }
                Move.slp(300);
            }
            System.out.print("\r\t\t\t\t\t\t\r");
            System.out.println(HirroName + " подошел к краю корзины.");
        }
    }

    public static void jump(Hirro x) {
        String HirroName = x.toString();
        if (HirroName.equals(nameZnayka) && x.getSIDCode() == SIDCodeZnayka) {
            slp(800);
            System.out.println("\n" + HirroName + " прыгает первым" + "\n");
            rezetcolor();
            slp(1000);
            System.out.println("*Вжууух!*" + "\n");
        } else if (HirroName.equals(nameToropizhka) && x.getSIDCode() == SIDCodeToropizhka) {
            if (BadMoments.RNDSituation()) {
                slp(1000);
                System.out.println("Вслед за ним прыгнул " + HirroName + "\n");
                slp(800);
                System.out.println(RED + "\rВдруг! Случилось непредвиденное!");
                slp(1500);
                System.out.println("Вместо того, чтобы прыгнуть, а потом раскрыть парашут, " + HirroName + " в спешке сначала раскрыл парашут, а потом прыгнул. \n");
                rezetcolor();
                slp(2000);

                if (BadMoments.RNDSituation()) {
                    BadMoments.zachep(HirroName);
                } else {
                    System.out.println("В этот день ему везло и все прошло без последствий");
                    System.out.println("Но то, что с ним могло произойти, только самому разработчику известно");
                }
            }
        } else {
            slp(900);
            System.out.println("\nЭЭЭЭЭМММ...., подумал " + HirroName);
            slp(800);
            System.out.println("и решил не прыгать....");
        }
    }
}
