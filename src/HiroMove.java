abstract class HiroMove extends Move {

    public void takeItEasy() throws CheckNulHiroException {
        if (this.hashCode() != 0) {
            Move.spokoen(this);
        } else {
            throw new CheckNulHiroException("Неопознанный двойник " + this.toString() + "\bи попытался прыгнуть, но люди в чёрном уже им занимаются");
        }
    }

    public void hello(){
        System.out.println("я стесняюсь! Сказал " + this.toString());
    }

    public void look(){
        try {
            TryLook(this);
        }catch (CheckLookNeznaykaExeption e){
            System.out.println(e.getMessage());
        }
    }

    private void TryLook(Object hiro) throws CheckLookNeznaykaExeption{
        if (HiroNames.ZNAYKA.getStatus() != "NoInBasket"){
            Move.look(hiro);
        }else{
            if (hiro.toString() == HiroNames.ZNAYKA.getName()){
                throw new CheckLookNeznaykaExeption("\n"+HiroNames.NEZNAYKA.getName() + " уже нет на борту! \nОн не может кого-то увидеть!");
            } else {
                Move.look(hiro);
            }
        }
    }

    public void jump() throws CheckNulHiroException{
        if (this.hashCode() != 0){
            Move.jump(this);
        } else {
            throw new CheckNulHiroException("Неопознанный двойник " + this.toString() + "\bи попытался прыгнуть, но люди в чёрном уже им занимаются");
        }
    }

    public void went() {
        try {
            TryWent(this);
        } catch (CheckNulHiroException e){
            System.out.println(e.getMessage());
        }
    }

    private void TryWent(Object hiro) throws CheckNulHiroException{
        if (this.hashCode() != 0){
            Move.went(this);
        } else {
            throw new CheckNulHiroException("Неопознанный двойник " + this.toString() + "\bи попытался влезть в сказку, но люди в чёрном уже им занимаются");
        }
    }
}


