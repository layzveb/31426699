public interface BadMoments {
    static Boolean RNDSituation() {
        return true;
    }
    static void zachep(String HirroName) {
        System.out.println("Из-за этого парашют зацепился за край корзины");
        Move.slp(1100);
        if (RNDSituation()) {
            System.out.println(HirroName + " запутался ногой в шнурках и повис вниз головой");
            Move.slp(1500);
            System.out.println("Он принялся дрыгать ногами и извиваться всем телом, словно червяк, которого надевают на рыболовный крючок");
            Move.slp(2000);
            if (RNDSituation()) {
                System.out.println("Несмотря на все старания, парашют не отцеплялся");
                Move.slp(1600);
            } else {
                System.out.println("Благодаря всем его страданиям, " + HirroName + " все же смог отцепить парашют");
                Move.slp(1700);
            }
        } else {
            System.out.println("Благодаря невиданному чуду, парашют отцепился от корзины");
            Move.slp(1300);
            System.out.println("И наш" + HirroName + " полетел вниз с раскрытым парашютом");
            Move.slp(1700);
        }
    }
}
