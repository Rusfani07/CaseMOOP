package game.play;

public class ArcherArmy extends Army {
    public double calculatePower(){
        double power = 0;
        for(Army arm : this.ArmiesToBattles){
            if(arm.type == this.ARCHER){
                power += arm.NumberTroops + arm.NumberTroops * Army.Archer_Attack;
            }else{
                power += arm.NumberTroops;
            }
        }
        return power;
    }

    public  void setArmy(Army[] armies){

    }
    public ArcherArmy() {

        this.type = this.ARCHER;
        this.Attack_Army = this.Attack_Army*this.Archer_Attack/10;
    }
}
