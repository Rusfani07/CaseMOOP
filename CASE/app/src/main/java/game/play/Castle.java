package game.play;

public abstract class Castle {
     String type;

    public  String INFANTRY = "INFANTRY";
    public  String CAVALRY = "CAVALRY";
    public  String ARCHER = "ARCHER";
    public  String CATAPULT = "CATAPULT";

    public Castle BattleTo(){
        return null;
    }
    public Heroes[] Heroes;
    public Army[] Armies;
    public Army[] ArmiesToBattles;


    public Castle(String type) {
        super();
        this.type = type;
    }

    public String getType() {
        return type;
    }
    public void setType(String type) {
        this.type = type;
    }

    public  String getInfantry() {
        return INFANTRY;
    }
    public void setInfantry(String infantry) {
        INFANTRY= infantry;
    }
    public  String getCavalry() {
        return CAVALRY;
    }
    public void setCavalry(String cavalry) {
        CAVALRY = cavalry;
    }
    public String getArcher() {
        return ARCHER;
    }
    public  void setArcher(String archer) {
        ARCHER = archer;
    }
    public String getCatapult() {
        return CATAPULT;
    }
    public void setCatapult(String catapult) {
        CATAPULT = catapult;
    }


    public abstract double calculatePower();

    public abstract void setArmy(Army[] armies);

}
