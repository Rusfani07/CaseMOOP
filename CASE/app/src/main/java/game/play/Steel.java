package game.play;

public class Steel extends Castle{

        public double calculatePower(){
            return 0;
        }

        public Castle battleTo(Castle castle2){
            return castle2;
        }

        public void setArmy(Army[] armies){

        }

    public Steel (String type) {
        super(type);
        this.type= this.INFANTRY;

    }
}
