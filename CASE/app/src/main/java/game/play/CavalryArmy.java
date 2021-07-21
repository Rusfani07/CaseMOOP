package game.play;

public class CavalryArmy extends Army{
    public double calculatePower(){
        double power = 0;
        for(Army arm : this.ArmiesToBattles){
            if(arm.type == this.CAVALRY){
                power += arm.NumberTroops + arm.NumberTroops * Army.Cavalry_Attack;
            }else{
                power += arm.NumberTroops;
            }
        }
        return power;

    }

    public  void setArmy(Army[] armies){

    }

    public CavalryArmy() {

        this.type = this.CAVALRY;
        this.Attack_Army =  this.Attack_Army*this.Cavalry_Attack/10;
    }
}
