public interface BadMoments {
    static Boolean RNDSituation() {
        return true;
    }
    static void zachep(String HirroName) {
        System.out.println("Из-за этого парашют зацепился за край корзины");
        Move.sleep(1100);
        if (RNDSituation()) {
            System.out.println(HirroName + " запутался ногой в шнурках и повис вниз головой");
            HiroNames.SETINGS.changeStatus(HirroName);
            Move.sleep(1500);
            System.out.println("Он принялся дрыгать ногами и извиваться всем телом, словно червяк, которого надевают на рыболовный крючок");
            Move.sleep(2000);
            if (RNDSituation()) {
                System.out.println("Несмотря на все старания, парашют не отцеплялся");
                Move.sleep(1600);
                System.out.println("Малыши ухватились руками за парашют и втащили Торопыжку обратно в корзину.");
                HiroNames.SETINGS.changeStatus(HiroNames.TOROPIZHKA.getName());
                Move.sleep(1000);
            } else {
                System.out.println("Благодаря всем его страданиям, " + HirroName + " все же смог отцепить парашют");
                Move.sleep(1700);
            }
        } else {
            System.out.println("Благодаря невиданному чуду, парашют отцепился от корзины");
            Move.sleep(1300);
            System.out.println("И наш" + HirroName + " полетел вниз с раскрытым парашютом");
            Move.sleep(1700);
        }
    }

    static void continStory(){
        Move.sleep(1000);
        System.out.println("От холода воздушный шар покрылся инеем и сверкал над головами малышей, словно был сделан из чистого серебра. \nПостепенно воздух снова остыл в оболочке, и шар стал опускаться вниз. \nЧерез несколько минут он уже стремительно падал. \nЗапас мешков с песком кончился, и ничем нельзя было удержать падение. \nНедолго думая Знайка схватил его за шиворот и вытащил из-под лавки.");
    }
}
