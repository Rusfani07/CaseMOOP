package game.play;

public abstract class Army {
    public int Attack_Army;
    public String type;
    public int NumberTroops ;


    public  String ARCHER = "ARCHER";
    public  String CAVALRY = "CAVALRY";
    public  String INFANTRY = "INFANTRY";
    public  String CATAPULT = "CATAPULT";

    public static int Infantry_Attack = 4;
    public static int Cavalry_Attack = 4;
    public static int Archer_Attack = 4;
    public static int Catapult_Attack= 4;

    public Heroes[] Heroes;
    public Army[] Armies;
    public Army[] ArmiesToBattles;

    public int getAttack_Army() {
        return Attack_Army;
    }
    public void setAttack2(int attack2) {
        Attack_Army = attack2;
    }
    public String getType() {
        return type;
    }
    public void setType(String type) {
        this.type = type;
    }
    public int getNumberTroops() {
        return NumberTroops;
    }
    public void setType(int NumberTroops) {
        NumberTroops = NumberTroops;
    }
    public static int getInfantry_Attack() {
        return Infantry_Attack;
    }
    public static void setInfantry_Attack(int infantry_Attack) {
        Infantry_Attack = infantry_Attack;
    }
    public  int getCavalry_Attack() {
        return Cavalry_Attack;
    }
    public  void setCavalry_Attack(int cavalry_Attack) {
        Cavalry_Attack = cavalry_Attack;
    }
    public  int getArcher_Attack() {
        return Archer_Attack;
    }
    public  void setArcher_Attack(int archer_Attack) {
        Archer_Attack = archer_Attack;
    }
    public  int getCatapult_Attack() {
        return Catapult_Attack;
    }
    public  void setCatapult_Attack(int catapult_Attack) {
        Catapult_Attack = catapult_Attack;
    }

    public abstract double calculatePower();

    public abstract void setArmy(Army[] armies);
    public Army BattleTo(Army army) {
        return army;
    }


}
