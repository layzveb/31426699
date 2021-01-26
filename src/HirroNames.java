public enum HirroNames {
    NEZNAYKA("Незнайка"),
    ZNAYKA("Знайка"),
    TOROPIZHKA("Торопыжка");

    private String Name;

    HirroNames(String Name) {
        this.Name = Name;
    }

    public String CheckeName(){
        return Name;
    }
}
