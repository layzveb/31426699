
public class Main {
    public static void main(String[] args) {

        AddHiro.Neznayka NEEEEE = new AddHiro.Neznayka(){
            public void hello(){
                System.out.println(HiroNames.NEZNAYKA.getName() + " приветствует тебя!");
            }
        };
        AddHiro.Toropizhka NUUUUUU = new AddHiro.Toropizhka();
        AddHiro.Neznayka BYYYY = new AddHiro.Neznayka();
        AddHiro.Vorchun Vorch = new AddHiro.Vorchun();
        AddHiro.Toropizhka cccc = new AddHiro.Toropizhka();
        AddHiro.Znayka TheBest = new AddHiro.Znayka();

        NEEEEE.hello();
        NUUUUUU.hello();
        NEEEEE.jump();
        NEEEEE.look();
        TheBest.look();
        TheBest.look();
        TheBest.look();
        Vorch.look();
        Vorch.look();
        Vorch.went();
        Vorch.went();
        cccc.jump();
        BYYYY.jump();
        NUUUUUU.jump();
        TheBest.jump();
        TheBest.went();
        TheBest.jump();
        BYYYY.look();
        TheBest.look();

    }
}
