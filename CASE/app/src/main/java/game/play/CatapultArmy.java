package game.play;

public class CatapultArmy extends Army{
    public double calculatePower(){
        double power = 0;
        for(Army arm : this.ArmiesToBattles){
            if(arm.type == this.CATAPULT){
                power += arm.NumberTroops + arm.NumberTroops * Army.Catapult_Attack;
            }else{
                power += arm.NumberTroops;
            }
        }
        return power;

    }

    public  void setArmy(Army[] armies){

    }

    public CatapultArmy() {

        this.type = this.CATAPULT;
        this.Attack_Army =this.Attack_Army*this.Catapult_Attack/10;


    }
}
