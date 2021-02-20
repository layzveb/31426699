public enum HiroNames {
    NEZNAYKA("Незнайка", "NoCalm"),
    ZNAYKA("Знайка", "InCenterBasket"),
    TOROPIZHKA("Торопыжка", "InBasket"),
    VORCHUN("Ворчун", "Sit"),
    TUBICK("Тюбик", "InBasket"),
    SETINGS("", "");

    private String Name, Status;

    HiroNames(String Name, String Status) {
        this.Name = Name;
        this.Status = Status;
    }

    public String getName() { return Name; }

    public void changeStatus(String HiroName) {
        if (HiroNames.NEZNAYKA.getName() == HiroName) {
            NEZNAYKA.Status = "Calm";
        } else if (HiroNames.ZNAYKA.getName() == HiroName) {
            if (HiroNames.ZNAYKA.getStatus() == "InCenterBasket"){
                ZNAYKA.Status = "InBasketEdge";
            } else if (HiroNames.ZNAYKA.getStatus() == "InBasketEdge"){
                ZNAYKA.Status = "NoInBasket";
            }
        } else if (HiroNames.TOROPIZHKA.getName() == HiroName) {
            if (HiroNames.TOROPIZHKA.getStatus() == "InBasket") {
                TOROPIZHKA.Status = "NoInBasket";
            } else if (HiroNames.TOROPIZHKA.getStatus() == "NoInBasket") {
                TOROPIZHKA.Status = "Stuck";
            } else if (HiroNames.TOROPIZHKA.getStatus() == "Stuck") {
                TOROPIZHKA.Status = "InBasket";
            }
        } else if (HiroNames.VORCHUN.getName() == HiroName) {
            VORCHUN.Status = "NoSit";
        }
    }

    public String getStatus() { return Status; }

    class Settings{
        public void changeStatusHiro(String HiroName) {
            if (HiroNames.NEZNAYKA.getName() == HiroName) {
                NEZNAYKA.Status = "Calm";
            } else if (HiroNames.ZNAYKA.getName() == HiroName) {
                if (HiroNames.ZNAYKA.getStatus() == "InCenterBasket"){
                    ZNAYKA.Status = "InBasketEdge";
                } else if (HiroNames.ZNAYKA.getStatus() == "InBasketEdge"){
                    ZNAYKA.Status = "NoInBasket";
                }
            } else if (HiroNames.TOROPIZHKA.getName() == HiroName) {
                if (HiroNames.TOROPIZHKA.getStatus() == "InBasket") {
                    TOROPIZHKA.Status = "NoInBasket";
                } else if (HiroNames.TOROPIZHKA.getStatus() == "NoInBasket") {
                    TOROPIZHKA.Status = "Stuck";
                } else if (HiroNames.TOROPIZHKA.getStatus() == "Stuck") {
                    TOROPIZHKA.Status = "InBasket";
                }
            } else if (HiroNames.VORCHUN.getName() == HiroName) {
                VORCHUN.Status = "NoSit";
            }
        }
    }

}
