package game.play;

public abstract class Heroes {

    public String Type;
    public int skill;
    public int Attack_Heroes;


    public static final String INFANTRY = "INFANTRY";
    public static final String CAVALRY = "CAVALRY";
    public static final String ARCHER = "ARCHER";
    public static final String CATAPULT = "CATAPULT";

    public static int Infantry_Skill = 2;
    public static int Cavalry_Skill = 2;
    public static int Archer_Skill = 2;
    public static int Catapult_Skill = 2;

    public String getType() {
        return Type;
    }
    public void setType (String type) {
        Type = type;
    }
    public int getSkill() {
        return skill;
    }
    public void setSkill (int skill) {
        skill = skill;
    }

    public int getAttack_Heroes() {
        return Attack_Heroes;
    }
    public void setAttack1(int attack1) {
        Attack_Heroes = attack1;
    }
    public static int getInfantry_Skill() {
        return Infantry_Skill;
    }
    public static void setInfantry_Skill(int infantry_Skill) {
        Infantry_Skill = infantry_Skill;
    }
    public static int getCavalry_Skill() {
        return Cavalry_Skill;
    }
    public static void setCavalry_Skill(int cavalry_Skill) {
        Cavalry_Skill = cavalry_Skill;
    }
    public static int getArcher_Skill() {
        return Archer_Skill;
    }
    public static void setArcher_Skill(int archer_Skill) {
        Archer_Skill = archer_Skill;
    }
    public static int getCatapult_Skill() {
        return Catapult_Skill;
    }
    public static void setCatapult_Skill(int catapult_Skill) {
        Catapult_Skill = catapult_Skill;
    }


    public Heroes BattleTo(Heroes hero) {
        return hero;
    }

}
