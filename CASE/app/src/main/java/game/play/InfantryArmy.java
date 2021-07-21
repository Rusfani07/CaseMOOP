package game.play;

public class InfantryArmy extends Army{
    public double calculatePower(){
        double power = 0;
        for(Army arm : this.ArmiesToBattles){
            if(arm.type == this.INFANTRY){
                power += arm.NumberTroops + arm.NumberTroops * Army.Infantry_Attack;
            }else{
                power += arm.NumberTroops;
            }
        }
        return power;

    }


    public  void setArmy(Army[] armies){

    } public InfantryArmy() {

        this.type = this.INFANTRY;
        this.Attack_Army = this.Attack_Army*this.Infantry_Attack/10;
    }
}
