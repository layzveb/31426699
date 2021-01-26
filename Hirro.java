abstract class Hirro{

    public String name;
    private int SIDCode;

    public int getSIDCode() {
        return SIDCode;
    }

    public Hirro(String HirriName, String ClassName){
        name = HirriName;

        if (HirroNames.NEZNAYKA.CheckeName().equals(name)){
            SIDCode = (int)(Math.random() * 1000);
            Move.setName(name, 3, SIDCode);
        }else if (HirroNames.TOROPIZHKA.CheckeName().equals(name)){
            SIDCode = (int)(Math.random() * 1000);
            Move.setName(name, 2, SIDCode);
        }else if (HirroNames.ZNAYKA.CheckeName().equals(name)){
            SIDCode = (int)(Math.random() * 1000);
            Move.setName(name, 1, SIDCode);
        }
    }

    public void TakeItEasy(){
        Move.spokoen(this);
    }

    public void jump(){
        Move.jump(this);
    }

    public void podoshol(){
        Move.podoshol(this);
    }

    @Override
    public boolean equals(Object o) {
        if (this.hashCode() == o.hashCode()) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Hirro hirro = (Hirro) o;
        return this.SIDCode == hirro.SIDCode;
    }

    @Override
    public int hashCode() {
        return SIDCode;
    }

    @Override
    public String toString() {
        return name;
    }

}


