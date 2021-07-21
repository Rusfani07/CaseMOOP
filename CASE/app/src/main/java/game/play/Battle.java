package game.play;


import android.app.Activity;
import android.widget.Toast;

public class Battle implements Runnable{
    private static final String Toast = null;
    private Heroes h1, h2;
    public Heroes winner;
    public Army winner2;
    public Heroes h3;
    private Activity a;
    private Army a1,a2,a3,a4;

    public Battle(Activity act, CavalryHeroes h1, ArcherHeroes h2, ArcherArmy a1, CatapultArmy a2, CavalryArmy a3, InfantryArmy a4, InfantryHeroes h3) {
    }

    @Override
    public void run() {

        winner = h1.BattleTo(h2);

        try{
            Thread.sleep(10000);
        }catch (Exception e){
            e.printStackTrace();
        }

        if (winner.equals(h1)){
            android.widget.Toast.makeText(a.getApplicationContext(), "Winner is" + h1.Type, android.widget.Toast.LENGTH_SHORT).show();
        }else{
            android.widget.Toast.makeText(a.getApplicationContext(), "Winner is" + h2.Type, android.widget.Toast.LENGTH_SHORT).show();
        }

//        winner2 = a1,a2,a3,a4.BattleTo(h3);
        try{
            Thread.sleep(10000);
        }catch (Exception e){
            e.printStackTrace();
        }
        if(winner2.equals(h3)){
            android.widget.Toast.makeText(a.getApplicationContext(), "Winner is" + h3.Type, android.widget.Toast.LENGTH_SHORT).show();
        }else{
            android.widget.Toast.makeText(a.getApplicationContext(), "Winner is" + a1.type, android.widget.Toast.LENGTH_SHORT).show();
            android.widget.Toast.makeText(a.getApplicationContext(), "Winner is" + a2.type, android.widget.Toast.LENGTH_SHORT).show();
            android.widget.Toast.makeText(a.getApplicationContext(), "Winner is" + a3.type, android.widget.Toast.LENGTH_SHORT).show();
            android.widget.Toast.makeText(a.getApplicationContext(), "Winner is" + a4.type, android.widget.Toast.LENGTH_SHORT).show();
        }

    }

    public Battle(Activity ac, Heroes h1){
        this.a = ac;
        this.h1 =h1;
        this.h2 =h2;
        this.winner = null;

        }

//    public Battle(Activity ac, Heroes h1, Heroes h2,a1,a2,a3,a4,h3){
//        this.a = ac;
//        this.h1 =h1;
//        this.h2 =h2;
//        this.winner = null;
//        this.a1 = a1;
//        this.a2 = a2;
//        this.a3 = a3;
//        this.a4 = a4;
//        this.h3 = h3;
//        this.winner2 = null;
//
//    }

    }



