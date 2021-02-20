public abstract class AddHiro extends HiroMove{
    private String name;
    private int SIDCode;
    private boolean HiroInBasket = true;
    private static boolean NeznaykaCheck = false;
    private static boolean ToropizhkaCheck = false;
    private static boolean ZnaykaCheck = false;
    private static boolean VorchunCheck = false;
    AdderHiro x = new AdderHiro();

    AddHiro(String name, boolean status) {
        if (!status) {
            this.name = name;
            this.SIDCode = (int)((Math.random() + 1) * 1000);
            x.setNameHiro(name);
        } else {
            this.name = name;
        }
    }

    public static class Znayka extends AddHiro {
        public Znayka() {
            super(HiroNames.ZNAYKA.getName(),  ZnaykaCheck);
            ZnaykaCheck = true;
        }
    }

    public static class Neznayka extends AddHiro {
        public Neznayka() {
            super(HiroNames.NEZNAYKA.getName(),  NeznaykaCheck);
            NeznaykaCheck = true;
        }
    }

    public static class Toropizhka extends AddHiro {
        public Toropizhka() {
            super(HiroNames.TOROPIZHKA.getName(),  ToropizhkaCheck);
            ToropizhkaCheck = true;
        }
    }

    public static class Vorchun extends AddHiro {
        public Vorchun(){
            super(HiroNames.VORCHUN.getName(),  VorchunCheck);
            VorchunCheck = true;
        }
    }

    @Override
    public String toString() {
        return name;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || this.getClass() != o.getClass()) return false;
        HiroMove hiro = (HiroMove) o;
        if (o != null){
            return this.name == Move.getName(this.name);
        }else{
            return false;
        }
    }

    @Override
    public int hashCode() {
        return SIDCode;
    }
}
