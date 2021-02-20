
public class Move implements BadMoments {
    private static String nameZnayka;
    private static String nameToropizhka;
    private static String nameNeznayka;
    private static String nameVorchun;
    private static int Kolvoraz;
    private static final String RED = "\033[31m";
    private static final String REZET = "\033[0m";


    private static void rezetcolor() {
        System.out.print(REZET + "\r");
        System.out.print("\t\t\r");
    }

    public static void look(Object x){
        if (x.toString() == HiroNames.VORCHUN.getName()) {
            System.out.println("\n" + HiroNames.VORCHUN.getName() + " подозрительно посмотрел на " + HiroNames.TUBICK.getName() + "а");
        } else if(x.toString() == HiroNames.NEZNAYKA.getName() && HiroNames.ZNAYKA.getStatus() == "NoInBasket"){
            sleep(1000);
            System.out.println("Незнайка увидел, что шар снова полетел вверх, и закричал: Ворчун поглядел вниз и сказал: Ворчун и Незнайка начали спорить и спорили до самого вечера. \nЗнайки не было, и никто теперь не мог остановить их. \nСолнце уже клонилось к закату. Ветер крепчал. \nШар еще больше остыл и снова стал опускаться вниз, а Ворчун и Незнайка не умолкали.");
        } else {
            String res = "небо";

            while (res == "небо") {
                switch ((int)(Math.random() * 5 + 1)){
                    case 1:
                        if (x.toString() != HiroNames.ZNAYKA.getName()) { res = HiroNames.ZNAYKA.getName() + "\bу"; }
                        break;
                    case 2:
                        if (x.toString() != HiroNames.NEZNAYKA.getName()) { res = HiroNames.NEZNAYKA.getName() + "\bу"; }
                        break;
                    case 3:
                        if (x.toString() != HiroNames.TOROPIZHKA.getName()) { res = HiroNames.TOROPIZHKA.getName() + "\bу"; }

                        break;
                    case 4:
                        if (x.toString() != HiroNames.VORCHUN.getName()) { res = HiroNames.VORCHUN.getName() + "а"; }
                        break;
                    case 5:
                        if (x.toString() != HiroNames.TUBICK.getName()) { res = HiroNames.TUBICK.getName() + "а"; }
                        break;
                }
            }
            sleep(800);
            System.out.println("\n" + x.toString() + " посмотрел на " + res);
        }
    }

    public static String getName(String nameHero) {
        String result = "хз";
        switch (nameHero) {
            case "Знайка":
                result = nameZnayka;
                break;
            case "Незнайка":
                result = nameNeznayka;
                break;
            case "Торопыжка":
                result = nameToropizhka;
                break;
            case "Ворчун":
                result = nameVorchun;
                break;
        }
        return result;
    }

//    public static void setName(String name) {
//        if (HiroNames.ZNAYKA.getName() == name) {
//            if (nameZnayka == null) {
//                nameZnayka = name;
//            }
//        } else if (HiroNames.TOROPIZHKA.getName() == name) {
//            if (nameToropizhka == null) {
//                nameToropizhka = name;
//            }
//        } else if (HiroNames.NEZNAYKA.getName() == name) {
//            if (nameNeznayka == null) {
//                nameNeznayka = name;
//            }
//        } else if (HiroNames.VORCHUN.getName() == name){
//            if (nameVorchun == null){
//                nameVorchun = name;
//            }
//        }
//    }

    public class AdderHiro{
        void setNameHiro(String name){
            if (HiroNames.ZNAYKA.getName() == name) {
                if (nameZnayka == null) {
                    nameZnayka = name;
                }
            } else if (HiroNames.TOROPIZHKA.getName() == name) {
                if (nameToropizhka == null) {
                    nameToropizhka = name;
                }
            } else if (HiroNames.NEZNAYKA.getName() == name) {
                if (nameNeznayka == null) {
                    nameNeznayka = name;
                }
            } else if (HiroNames.VORCHUN.getName() == name){
                if (nameVorchun == null){
                    nameVorchun = name;
                }
            }
        }
    }

    public static void spokoen(HiroMove x) {
        Kolvoraz += 1;
        switch (Kolvoraz) {
            case 1:
                System.out.println(x.toString() + " немного успокоился");
                sleep(800);
                break;
            case 2:
                System.out.println("\t\t   И");
                sleep(300);
                System.out.println(x.toString() + " немного успокоился");
                sleep(800);
                break;
            default:
                System.out.println("\t\t ЕЩЁ И");
                sleep(300);
                System.out.println(x.toString() + " немного успокоился");
                sleep(500);
                System.out.println("\t\tВ ОБЩЕМ");
                sleep(1000);
                System.out.println("Всем стали чуть спокойней");
                sleep(800);
                break;
        }

    }

    public static void sleep(int x) {
        try {
            Thread.sleep(x);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    public static void went(HiroMove x) {
        String hirroName = x.toString();
        if (hirroName.equals(nameZnayka)) {
            HiroNames.SETINGS.changeStatus(hirroName);
            Move.sleep(1000);
            System.out.println("\n" + hirroName + " пошел к краю корзины...");
            Move.sleep(500);
            for (int i = 0; i < 10; i++) {
                if (i % 2 == 0) {
                    System.out.print(" __ ");
                } else {
                    System.out.print(" -- ");
                }
                Move.sleep(300);
            }
            System.out.print("\r\t\t\t\t\t\t\r");
            System.out.println(hirroName + " подошел к краю корзины.");
        } else if (hirroName == nameVorchun){
            if (HiroNames.VORCHUN.getStatus() == "Sit"){
                sleep(800);
                System.out.println("\n"+hirroName + " поднялся со своего места и сказал: Он сел рядом с Тюбиком, но Тюбик тоже выбивал дробь зубами.");
                HiroNames.SETINGS.changeStatus(hirroName);
            } else {
                sleep(800);
                System.out.println("\n"+hirroName + " встал и пересел на другое место.");
                sleep(800);
                System.out.println("Так он пересаживался несколько раз и только другим мешал.");
                BadMoments.continStory();
            }
        }
    }

    public static void jump(HiroMove x) {
        String hirroName = x.toString();
        if (hirroName.equals(nameZnayka) && HiroNames.ZNAYKA.getStatus() != "NoInBasket") {
            if (HiroNames.ZNAYKA.getStatus() == "InBasketEdge"){
                sleep(800);
                System.out.println("\n" + hirroName + " прыгает первым" + "\n");
                rezetcolor();
                sleep(1000);
                System.out.println("*Вжууух!*" + "\n");
                HiroNames.SETINGS.changeStatus(HiroNames.ZNAYKA.getName());
            } else {
                System.out.println("\n" + hirroName + " не может прыгнуть. Ему сначала нужно подойти к краю корзины");
            }
        } else if (hirroName.equals(nameToropizhka)) {
            if (HiroNames.ZNAYKA.getStatus() == "NoInBasket") {
                if (BadMoments.RNDSituation()) {
                    sleep(1000);
                    System.out.println("\nВслед за ним прыгнул " + hirroName + "\n");
                    sleep(800);
                    System.out.println(RED + "\rВдруг! Случилось непредвиденное!");
                    sleep(1500);
                    System.out.println("Вместо того, чтобы прыгнуть, а потом раскрыть парашут, " + hirroName + " в спешке сначала раскрыл парашут, а потом прыгнул. \n");
                    rezetcolor();
                    sleep(2000);

                    if (BadMoments.RNDSituation()) {
                        BadMoments.zachep(hirroName);
                    } else {
                        System.out.println("\n В этот день ему везло и все прошло без последствий");
                        System.out.println("\n Но то, что с ним могло произойти, только самому разработчику известно");
                    }
                }
            } else {
                System.out.println("\n" + hirroName + " не хочет прыгать первым");
            }
        } else {
            if (HiroNames.ZNAYKA.getStatus() != "NoInBasket"){
                System.out.println("\n" + hirroName + " не хочет прыгать первым");
            } else {
                sleep(900);
                System.out.println("\nЭЭЭЭЭМММ...., подумал " + hirroName);
                sleep(800);
                System.out.println("и решил не прыгать....");
            }
        }
    }
}
