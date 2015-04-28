package com.example.layali.tic_tac_toegame;

import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;


public class MainActivity extends ActionBarActivity {

    Button btn1 , btn2 , btn3 , btn4 , btn5, btn6 , btn7 , btn8 , btn9;
    public static boolean PLAYER_ONE=false;
    public static boolean PLAYER_TWO= false;
    public int turn=0;
    int playerOneScore =0;
    int playerTwoScore=0;
    TextView result;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        getSupportActionBar().setDisplayHomeAsUpEnabled(true);

        btn1=(Button)findViewById(R.id.button1);
       btn1.setBackgroundResource(R.drawable.icon4);
        btn1.setText("");

        btn2=(Button)findViewById(R.id.button2);
        btn2.setBackgroundResource(R.drawable.icon4);
        btn2.setText("");

        btn3=(Button)findViewById(R.id.button3);
        btn3.setBackgroundResource(R.drawable.icon4);
        btn3.setText("");

        btn4=(Button)findViewById(R.id.button4);
        btn4.setBackgroundResource(R.drawable.icon4);
        btn4.setText("");

        btn5=(Button)findViewById(R.id.button5);
        btn5.setBackgroundResource(R.drawable.icon4);
        btn5.setText("");

        btn6=(Button)findViewById(R.id.button6);
        btn6.setBackgroundResource(R.drawable.icon4);
        btn6.setText("");

        btn7=(Button)findViewById(R.id.button7);
        btn7.setBackgroundResource(R.drawable.icon4);
        btn7.setText("");

        btn8=(Button)findViewById(R.id.button8);
        btn8.setBackgroundResource(R.drawable.icon4);
        btn8.setText("");

        btn9=(Button)findViewById(R.id.button9);
        btn9.setBackgroundResource(R.drawable.icon4);
        btn9.setText("");


        result=(TextView) findViewById(R.id.Result);
     //  btn1.setText("X");

    }


    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }


    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();


      //  return super.onOptionsItemSelected(item);

        switch(id) {
            case R.id.action_logout: exitGame();
               return true;

            case R.id.action_newGame: startNewGame();
                return true;
            default:
            return super.onOptionsItemSelected(item);
        }
    }


    // check winner method
    public void check() {

     //   btn1.setText("o");
       // btn1.setBackgroundResource(R.drawable.icon3);

        // if the first player get 3 x's in 1 & 2 &3 (horizontal)
        if(btn1.getText().equals("x")){
            if(btn2.getText().equals("x")){
                if(btn3.getText().equals("x")){
                    PLAYER_ONE=true;
                    btn1.setBackgroundResource(R.drawable.icon3);
                    btn2.setBackgroundResource(R.drawable.icon3);
                    btn3.setBackgroundResource(R.drawable.icon3);
                    result.setText("Winner is Player 'x' ");
                    disableButtons();
                }
            }
        }


        // if the first player get 3 x's in 4 & 5&6 (horizontal)
        if(btn4.getText().equals("x")){
            if(btn5.getText().equals("x")){
                if(btn6.getText().equals("x")){
                    PLAYER_ONE=true;
                    btn4.setBackgroundResource(R.drawable.icon3);
                    btn5.setBackgroundResource(R.drawable.icon3);
                    btn6.setBackgroundResource(R.drawable.icon3);
                    result.setText("Winner is Player 'x' ");
                    disableButtons();
                }
            }
        }

        // if the first player get 3 x's in 7 &8&9(horizontal)
        if(btn7.getText().equals("x")){
            if(btn8.getText().equals("x")){
                if(btn9.getText().equals("x")){
                    PLAYER_ONE=true;
                    btn7.setBackgroundResource(R.drawable.icon3);
                    btn8.setBackgroundResource(R.drawable.icon3);
                    btn9.setBackgroundResource(R.drawable.icon3);
                    result.setText("Winner is Player 'x' ");
                    disableButtons();
                }
            }
        }

        // if the first player get 3 x's in 1 &4 &7 (vertical)
        if(btn1.getText().equals("x")){
            if(btn4.getText().equals("x")){
                if(btn7.getText().equals("x")){
                    PLAYER_ONE=true;
                    btn1.setBackgroundResource(R.drawable.icon3);
                    btn4.setBackgroundResource(R.drawable.icon3);
                    btn7.setBackgroundResource(R.drawable.icon3);
                    result.setText("Winner is Player 'x' ");
                    disableButtons();
                }
            }
        }


        // if the first player get 3 x's in 2 &5 &8(vertical)
        if(btn2.getText().equals("x")){
            if(btn5.getText().equals("x")){
                if(btn8.getText().equals("x")){
                    PLAYER_ONE=true;
                    btn2.setBackgroundResource(R.drawable.icon3);
                    btn5.setBackgroundResource(R.drawable.icon3);
                    btn8.setBackgroundResource(R.drawable.icon3);
                    result.setText("Winner is Player 'x' ");
                    disableButtons();
                }
            }
        }

        // if the first player get 3 x's in 3 &6 &9 (vertical)
        if(btn3.getText().equals("x")){
            if(btn6.getText().equals("x")){
                if(btn9.getText().equals("x")){
                    PLAYER_ONE=true;
                    btn3.setBackgroundResource(R.drawable.icon3);
                    btn6.setBackgroundResource(R.drawable.icon3);
                    btn9.setBackgroundResource(R.drawable.icon3);
                    result.setText("Winner is Player 'x' ");
                    disableButtons();
                }
            }
        }

        // if the first player get 3 x's in 1 &5&9(diagonal)
        if(btn1.getText().equals("x")){
            if(btn5.getText().equals("x")){
                if(btn9.getText().equals("x")){
                    PLAYER_ONE=true;
                    btn1.setBackgroundResource(R.drawable.icon3);
                    btn5.setBackgroundResource(R.drawable.icon3);
                    btn9.setBackgroundResource(R.drawable.icon3);
                    result.setText("Winner is Player 'x' ");
                    disableButtons();
                }
            }
        }


        // if the first player get 3 x's in 1 &4 &7 (diagonal)
        if(btn3.getText().equals("x")){
            if(btn5.getText().equals("x")){
                if(btn7.getText().equals("x")){
                    PLAYER_ONE=true;
                    btn3.setBackgroundResource(R.drawable.icon3);
                    btn5.setBackgroundResource(R.drawable.icon3);
                    btn7.setBackgroundResource(R.drawable.icon3);
                    result.setText("Winner is Player 'x' ");
                    disableButtons();
                }
            }
        }


        // if player one is winner , don't check for second player:

            // if the second player get 3 x's in 1 & 2 &3 (horizontal)
            if(btn1.getText().equals("o")){
                if(btn2.getText().equals("o")){
                    if(btn3.getText().equals("o")){
                        PLAYER_TWO=true;
                        btn1.setBackgroundResource(R.drawable.icon3);
                        btn2.setBackgroundResource(R.drawable.icon3);
                        btn3.setBackgroundResource(R.drawable.icon3);
                        result.setText("Winner is Player 'o' ");
                        disableButtons();
                    }
                }
            }


            // if the second player get 3 x's in 4 & 5&6 (horizontal)
            if(btn4.getText().equals("o")){
                if(btn5.getText().equals("o")){
                    if(btn6.getText().equals("o")){
                        PLAYER_ONE=true;
                        btn4.setBackgroundResource(R.drawable.icon3);
                        btn5.setBackgroundResource(R.drawable.icon3);
                        btn6.setBackgroundResource(R.drawable.icon3);
                        result.setText("Winner is Player 'o' ");
                        disableButtons();
                    }
                }
            }

            // if the second player get 3 x's in 7 &8&9(horizontal)
            if(btn7.getText().equals("o")){
                if(btn8.getText().equals("o")){
                    if(btn9.getText().equals("o")){
                        PLAYER_TWO=true;
                        btn7.setBackgroundResource(R.drawable.icon3);
                        btn8.setBackgroundResource(R.drawable.icon3);
                        btn9.setBackgroundResource(R.drawable.icon3);
                        result.setText("Winner is Player 'o' ");
                        disableButtons();
                    }
                }
            }

            // if the second player get 3 x's in 1 &4 &7 (vertical)
            if(btn1.getText().equals("o")){
                if(btn4.getText().equals("o")){
                    if(btn7.getText().equals("o")){
                        PLAYER_TWO=true;
                        btn1.setBackgroundResource(R.drawable.icon3);
                        btn4.setBackgroundResource(R.drawable.icon3);
                        btn7.setBackgroundResource(R.drawable.icon3);
                        result.setText("Winner is Player 'o' ");
                        disableButtons();
                    }
                }
            }


            // if the second player get 3 x's in 2 &5 &8(vertical)
            if(btn2.getText().equals("o")){
                if(btn5.getText().equals("o")){
                    if(btn8.getText().equals("o")){
                        PLAYER_TWO=true;
                        btn2.setBackgroundResource(R.drawable.icon3);
                        btn5.setBackgroundResource(R.drawable.icon3);
                        btn8.setBackgroundResource(R.drawable.icon3);
                        result.setText("Winner is Player 'o' ");
                        disableButtons();
                    }
                }
            }

            // if the second player get 3 x's in 3 &6 &9 (vertical)
            if(btn3.getText().equals("o")){
                if(btn6.getText().equals("o")){
                    if(btn9.getText().equals("o")){
                        PLAYER_TWO=true;
                        btn3.setBackgroundResource(R.drawable.icon3);
                        btn6.setBackgroundResource(R.drawable.icon3);
                        btn9.setBackgroundResource(R.drawable.icon3);
                        result.setText("Winner is Player 'o' ");
                        disableButtons();
                    }
                }
            }

            // if the second player get 3 x's in 1 &5&9(diagonal)
            if(btn1.getText().equals("o")){
                if(btn5.getText().equals("o")){
                    if(btn9.getText().equals("o")){
                        PLAYER_TWO=true;
                        btn1.setBackgroundResource(R.drawable.icon3);
                        btn5.setBackgroundResource(R.drawable.icon3);
                        btn9.setBackgroundResource(R.drawable.icon3);
                        result.setText("Winner is Player 'o' ");
                        disableButtons();
                    }
                }
            }


            // if the second player get 3 x's in 3 & 5 & 7 (diagonal)
            if(btn3.getText().equals("o")){
                if(btn5.getText().equals("o")){
                    if(btn7.getText().equals("o")){
                        PLAYER_TWO=true;
                        btn3.setBackgroundResource(R.drawable.icon3);
                        btn5.setBackgroundResource(R.drawable.icon3);
                        btn7.setBackgroundResource(R.drawable.icon3);
                        result.setText("Winner is Player 'o' ");
                        disableButtons();
                    }
                }
            }

    }


    // when clicking on the buttons
    public void onClick_choice(View view) {
        Button b =(Button)view;
        if(b.getText().equals("") ){
            if(turn==0){
                b.setText("x");
                turn =1;
                check();
            }
            else if(turn ==1){
                b.setText("o");
                turn =0;
                check();
            }
        }

    }

    public void disableButtons(){
        btn1.setEnabled(false);
        btn2.setEnabled(false);
        btn3.setEnabled(false);
        btn4.setEnabled(false);
        btn5.setEnabled(false);
        btn6.setEnabled(false);
        btn7.setEnabled(false);
        btn8.setEnabled(false);
        btn9.setEnabled(false);
    }

    public void startNewGame(){
        btn1.setEnabled(true);
        btn2.setEnabled(true);
        btn3.setEnabled(true);
        btn4.setEnabled(true);
        btn5.setEnabled(true);
        btn6.setEnabled(true);
        btn7.setEnabled(true);
        btn8.setEnabled(true);
        btn9.setEnabled(true);

        btn1.setText("");
        btn2.setText("");
        btn3.setText("");
        btn4.setText("");
        btn5.setText("");
        btn6.setText("");
        btn7.setText("");
        btn8.setText("");
        btn9.setText("");

        btn1.setBackgroundResource(R.drawable.icon4);
        btn2.setBackgroundResource(R.drawable.icon4);
        btn3.setBackgroundResource(R.drawable.icon4);
        btn4.setBackgroundResource(R.drawable.icon4);
        btn5.setBackgroundResource(R.drawable.icon4);
        btn6.setBackgroundResource(R.drawable.icon4);
        btn7.setBackgroundResource(R.drawable.icon4);
        btn8.setBackgroundResource(R.drawable.icon4);
        btn9.setBackgroundResource(R.drawable.icon4);

        result.setText("");


    }

    public void exitGame(){
        this.finish();
    }
}
