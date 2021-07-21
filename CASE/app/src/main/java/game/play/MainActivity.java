package game.play;

import androidx.appcompat.app.AppCompatActivity;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        Activity act = this;
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        CavalryHeroes h1 = new CavalryHeroes();
        ArcherHeroes h2 = new ArcherHeroes();
        ArcherArmy a1 = new ArcherArmy();
        CatapultArmy a2 = new CatapultArmy();
        CavalryArmy a3 = new CavalryArmy();
        InfantryArmy a4 = new InfantryArmy();
        InfantryHeroes h3 = new InfantryHeroes();


        Heroes fightingHeroes [] = new Heroes[2];
        fightingHeroes [0] = h1;
        fightingHeroes [1] = h2;

        Army fightingHero[] = new Army[4];
        fightingHero [0] = a1;
        fightingHero [1] = a2;
        fightingHero [2] = a3;
        fightingHero [3] = a4;

        Heroes fightingArmy[] = new Heroes[1];
        fightingArmy[0] = h3;
        double playerA;
        double playerA2;
        double playerB;
        double playerB2;
        double players;

        double NumberTroopsCavalry = 100000;
        double NumberTroopsArcher = 10000;
        double NumberTroopsArcherArmy = 25000;
        double NumberTroopsCavalryArmy = 25000;
        double NumberTroopsCatapultArmy = 25000;
        double NumberTroopsInfantryArmy = 25000;
        double NumberTroopsInfantry = 100000;

        playerA = NumberTroopsCavalry + 5 * 0.1 * NumberTroopsCavalry;
        playerB = NumberTroopsArcher + 5 * 0.1 * NumberTroopsArcher;
        players=  playerA - playerB;

        playerA2 = (NumberTroopsArcherArmy+NumberTroopsCavalryArmy+NumberTroopsCatapultArmy+NumberTroopsInfantryArmy
                + 5 * 0.4 * NumberTroopsArcherArmy+NumberTroopsCavalryArmy+NumberTroopsCatapultArmy+NumberTroopsInfantryArmy);

        playerB2 = NumberTroopsInfantry + 5 * 0.1 * NumberTroopsInfantry;

        final Button btn = findViewById(R.id.battleNow);
        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
           if(playerA > playerB){
               Toast.makeText(getApplicationContext(), "Player 1 Win" , Toast.LENGTH_SHORT).show();
           }else{
               Toast.makeText(getApplicationContext(), "Player 1 Lose" , Toast.LENGTH_SHORT).show();
           }


            }
        });
    }
}