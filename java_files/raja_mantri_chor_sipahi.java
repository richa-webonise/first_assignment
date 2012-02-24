
import java.awt.Button;
import java.awt.event.KeyEvent;
import javax.swing.text.View;
import javax.swing.text.html.ImageView;
import sun.rmi.runtime.Log;

public class raja_mantri_chor_sipahi extends Activity {

    @Override
    public void onBackPressed() {
    }

    @Override
    protected void onPostResume() {
        super.onPostResume();
    }

    @Override
    public boolean onKeyDown(int key_code, KeyEvent event) {
        AlertDialog dialog = new AlertDialog.Builder(this).create();
        dialog.setTitle("Exit game!");
        dialog.setMessage("Are you sure you want to exit the game?");
        dialog.setButton("Exit", new DialogInterface.OnClickListener() {

            public void onClick(DialogInterface dialog, int which) {
                finish();
            }
        });

        dialog.setButton2("Cancel", new DialogInterface.OnClickListener() {

            public void onClick(DialogInterface dialog, int which) {
                dialog.dismiss();
            }
        });
        dialog.show();
        return super.onKeyDown(keyCode, event);
    }

    @Override
    public void onLowMemory() {
        AlertDialog dialog = new AlertDialog.Builder(this).create();
        dialog.setTitle("Low memory!");
        dialog.setMessage("Too many apps open, kindly close some other apps and try again!");
        dialog.setButton("Exit", new DialogInterface.OnClickListener() {

            public void onClick(DialogInterface dialog, int which) {
                finish();
            }
        });

        dialog.show();
        super.onLowMemory();
    }

    @Override
    protected void onPause() {
        super.onPause();
    }
    String[] solutionArray = {"RAJA", "MANTRI", "CHOR", "SIPAHI"};
    String[] playersArray = {"Player1", "Player2", "Player3", "Player4"};
    static String first_player_name = "";
    static String second_player_name = "";
    static String third_player_name = "";
    static String fourth_player_name = "";
    static String first_player_role = "";
    static String second_player_role = "";
    static String third_player_role = "";
    static String fourth_player_role = "";
    static boolean guess = false;
    static String first_player = "";
    static String second_player = "";
    static String third_player = "";
    static String fourth_player = "";
    static int i = 0, j = 0, k = 0, l = 0;
    static int first_player_score = 0;
    static int second_player_score = 0;
    static int third_player_score = 0;
    static int fourth_player_score = 0;
    int count = 0;
    Button raja_mantri_button;
    Button help_button;
    ImageView view_image;
    Button play_button;
    static Button first_pod_button;
    static Button second_pod_button;
    static Button third_pod_button;
    static Button fourth_pod_button;
    Button show_result_button;
    Button restart_button;
    Button sign_in_button;
    Button guess_button;
    EditText first_player_edit_text;
    EditText second_player_edit_text;
    EditText third_player_edit_text;
    EditText fourth_player_edit_text;
    EditText second_edit;
    EditText third_edit;
    EditText fourth_edit;
    TextView first_player_label;
    TextView second_player_label;
    TextView third_player_label;
    TextView fourth_player_label;
    static TextView turn_text;
    static TextView first_player_text;
    static TextView second_player_text;
    static TextView third_player_text;
    static TextView fourth_player_text;
    Bundle saved_instance_state2;
    Button main_menu_button;
    String next_turn = "";

    public void onRestart() {
        super.onRestart();
        /*	first_player_name = "" ;
        second_player_name = "";
        third_player_name = "";
        fourth_player_name = "";
        guess = false;
        first_player = "";
        second_player = "";
        third_player = "";
        fourth_player = "";
        i=0;j=0;k=0;l=0;
        first_player_score = 0;
        second_player_score = 0;
        third_player_score = 0;
        fourth_player_score = 0;*/
    }

    public void onResume() {
        super.onResume();
        /*
        first_player_name = "" ;
        second_player_name = "";
        third_player_name = "";
        fourth_player_name = "";
        guess = false;
        first_player = "";
        second_player = "";
        third_player = "";
        fourth_player = "";
        i=0;j=0;k=0;l=0;
        first_player_score = 0;
        second_player_score = 0;
        third_player_score = 0;
        fourth_player_score = 0;
         */
    }

    public void onCreate(Bundle saved_instance_state) {
        super.onCreate(saved_instance_state);
        setContentView(R.layout.welcome);
        i = 0;
        j = 0;
        k = 0;
        l = 0;
        help_button = (Button) findViewById(R.id.help_button);
        help_button.setOnClickListener(new OnClickListener() {

            public void onClick(View v) {
                setContentView(R.layout.help);
                // Create the ad_view
                AdView ad_view = new AdView(RajaMantri.this, AdSize.BANNER, "a14e156523d01de");
                // Lookup your LinearLayout assuming it’s been given
                // the attribute android:id="@+id/mainLayout"
                LinearLayout layout = (LinearLayout) findViewById(R.id.mainLayoutHelp);
                // Add the ad_view to it
                layout.addView(ad_view);
                // Initiate a generic request to load it with an ad
                ad_view.loadAd(new AdRequest());
                TextView help_text = (TextView) findViewById(R.id.help_text);
                String text = "Welcome to nostalgia! This is the paper free version of Raja Mantri Chor Sipahi.\n\nThe game involves bluffing with facial expressions and good guessing. This is a very popular childhood game in India played among kids often during their long summer vacations.\n\nThe game has 4 paper chits with Chor (thief), Sipahi (police), Raja (king) and Mantri (minister). The chits are folded at the start of the game and one of the 4 players will press SHUFFLE each one of the four players is supposed to secretly (by taking the phone and not letting the others see it)pick one chit by clicking on it, the player then clicks on the chit again to fold it back. All the players will then secretly open their chits and read what they have got. \n\nThe player who gets the chit with Raja written on it will say MERA MANTRI KAUN? (Who is my minister?). The player who got the chit with Mantri will say MEIN! (Me), The player with Raja will then say CHOR SIPAHI KA PATA LAGAO (find out who is the theif and who is the soldier). The player with Mantri will then guess who is the Chor (Thief), if he is wrong then his points are deducted and if he is correct he gets more points and the points from the player who got Chor (Thief) are deducted.\n\nIf the guess is correct the player with Chor is wrapped on his wrist by the Mantri, and if the Mantri is wrong then the Chor gets to hit his wrist.";
                help_text.setText(text);
                Button back_button = (Button) findViewById(R.id.btnMainMenuHelp);
                back_button.setOnClickListener(new OnClickListener() {

                    public void onClick(View v) {
                        Intent i = new Intent(RajaMantri.this, RajaMantri.class);
                        RajaMantri.this.startActivity(i);
                        finish();
                    }
                });
            }
        });
        raja_mantri_button = (Button) findViewById(R.id.raja_mantri_button);
        raja_mantri_button.setOnClickListener(new OnClickListener() {

            public void onClick(View v) {
                setContentView(R.layout.rmcsp);
                // Create the ad_view
                AdView ad_view = new AdView(RajaMantri.this, AdSize.BANNER, "a14e156523d01de");
                // Lookup your LinearLayout assuming it’s been given
                // the attribute android:id="@+id/mainLayout"
                LinearLayout layout = (LinearLayout) findViewById(R.id.mainLayoutPlayer);
                // Add the ad_view to it
                layout.addView(ad_view);
                // Initiate a generic request to load it with an ad
                ad_view.loadAd(new AdRequest());

                first_player_edit_text = (EditText) findViewById(R.id.first_player_edit_text);
                second_player_edit_text = (EditText) findViewById(R.id.second_player_edit_text);
                third_player_edit_text = (EditText) findViewById(R.id.third_player_edit_text);
                fourth_player_edit_text = (EditText) findViewById(R.id.fourth_player_edit_text);

                first_player_label = (TextView) findViewById(R.id.first_player_label);
                second_player_label = (TextView) findViewById(R.id.second_player_label);
                third_player_label = (TextView) findViewById(R.id.third_player_label);
                fourth_player_label = (TextView) findViewById(R.id.fourth_player_label);

                Display display = getWindowManager().getDefaultDisplay();
                int width = display.getWidth();
                int height = display.getHeight();

                first_player_label.setGravity(Gravity.CENTER_HORIZONTAL);
                second_player_label.setGravity(Gravity.CENTER_HORIZONTAL);
                third_player_label.setGravity(Gravity.CENTER_HORIZONTAL);
                fourth_player_label.setGravity(Gravity.CENTER_HORIZONTAL);

                Log.v("AkandBakar", "Playernames:" + first_player_name);
                Log.v("AkandBakar", "Playernames:" + second_player_name);
                Log.v("AkandBakar", "Playernames:" + third_player_name);
                Log.v("AkandBakar", "Playernames:" + fourth_player_name);

                btnMainMenu = (Button) findViewById(R.id.btnMainMenu);
                btnMainMenu.setOnClickListener(new OnClickListener() {

                    public void onClick(View v) {
                        Intent i = new Intent(RajaMantri.this, RajaMantri.class);
                        RajaMantri.this.startActivity(i);
                        finish();
                    }
                });

                sign_in_button = (Button) findViewById(R.id.btnsignin);
                sign_in_button.setOnClickListener(new OnClickListener() {

                    public void onClick(View v) {
                        first_player_name = first_player_edit_text.getText().toString();
                        second_player_name = second_player_edit_text.getText().toString();
                        third_player_name = third_player_edit_text.getText().toString();
                        fourth_player_name = fourth_player_edit_text.getText().toString();
                        if (first_player_name.equals("") || second_player_name.equals("") || third_player_name.equals("") || fourth_player_name.equals("")) {
                            Toast toast = Toast.makeText(getBaseContext(), "Enter player names!", 8000);
                            toast.show();
                        } else {
                            setContentView(R.layout.rmcsgnew);
                            // Create the ad_view
                            AdView ad_view = new AdView(RajaMantri.this, AdSize.BANNER, "a14e156523d01de");
                            // Lookup your LinearLayout assuming it’s been given
                            // the attribute android:id="@+id/mainLayout"
                            LinearLayout layout = (LinearLayout) findViewById(R.id.mainLayout);
                            // Add the ad_view to it
                            layout.addView(ad_view);
                            // Initiate a generic request to load it with an ad
                            ad_view.loadAd(new AdRequest());

                            turn_text = (TextView) findViewById(R.id.turn_text);
                            turn_text.setText("Click on SHUFFLE!");
                            playersArray[0] = first_player_name;
                            playersArray[1] = second_player_name;
                            playersArray[2] = third_player_name;
                            playersArray[3] = fourth_player_name;

                            first_player_text = (TextView) findViewById(R.id.first_player_text);
                            first_player_text.setText("1." + first_player_name + " [" + first_player_score + "]");

                            second_player_text = (TextView) findViewById(R.id.second_player_text);
                            second_player_text.setText("2." + second_player_name + " [" + second_player_score + "]");

                            third_player_text = (TextView) findViewById(R.id.third_player_text);
                            third_player_text.setText("3." + third_player_name + " [" + third_player_score + "]");

                            fourth_player_text = (TextView) findViewById(R.id.fourth_player_text);
                            fourth_player_text.setText("4." + fourth_player_name + " [" + fourth_player_score + "]");

                            play_button = (Button) findViewById(R.id.play_button);

                            play_button.setOnClickListener(new OnClickListener() {

                                public void onClick(View v) {

                                    if (play_button.getText().equals("SHUFFLE")) {
                                        RajaMantri.this.shuffle();
                                    } else {
                                        RajaMantri.this.makeGuess();

                                        Log.v("RajaMantri", "########## Player Name:" + first_player_name + " Role:" + first_player_role);
                                        Log.v("RajaMantri", "########## Player Name:" + second_player_name + " Role:" + second_player_role);
                                        Log.v("RajaMantri", "########## Player Name:" + third_player_name + " Role:" + third_player_role);
                                        Log.v("RajaMantri", "########## Player Name:" + fourth_player_name + " Role:" + fourth_player_role);
                                    }
                                }
                            });
                        }
                    }
                });
            }
        });
    }

    public void makeGuess() {
        play_button.setText("SHUFFLE");
        count = 0;
        play_button.setText("SHUFFLE");

        first_pod_button.setClickable(true);
        second_pod_button.setClickable(true);
        third_pod_button.setClickable(true);
        fourth_pod_button.setClickable(true);

        if (first_player.equals("RAJA")) {

            first_pod_button.setText("RAJA");
            first_pod_button.setBackgroundResource(R.drawable.podopen);
            first_pod_button.setClickable(false);
        }
        if (second_player.equals("RAJA")) {
            second_pod_button.setText("RAJA");
            second_pod_button.setBackgroundResource(R.drawable.podopen);
            second_pod_button.setClickable(false);
        }
        if (third_player.equals("RAJA")) {
            third_pod_button.setText("RAJA");
            third_pod_button.setBackgroundResource(R.drawable.podopen);
            third_pod_button.setClickable(false);
        }
        if (fourth_player.equals("RAJA")) {
            fourth_pod_button.setText("RAJA");
            fourth_pod_button.setBackgroundResource(R.drawable.podopen);
            fourth_pod_button.setClickable(false);
        }
        if (first_player.equals("MANTRI")) {
            first_pod_button.setText("MANTRI");
            first_pod_button.setBackgroundResource(R.drawable.podopen);
            first_pod_button.setClickable(false);
        }
        if (second_player.equals("MANTRI")) {
            second_pod_button.setText("MANTRI");
            second_pod_button.setBackgroundResource(R.drawable.podopen);
            second_pod_button.setClickable(false);
        }
        if (third_player.equals("MANTRI")) {
            third_pod_button.setText("MANTRI");
            third_pod_button.setBackgroundResource(R.drawable.podopen);
            third_pod_button.setClickable(false);
        }
        if (fourth_player.equals("MANTRI")) {
            fourth_pod_button.setText("MANTRI");
            fourth_pod_button.setBackgroundResource(R.drawable.podopen);
            fourth_pod_button.setClickable(false);
        }
        if (first_player_role.equals("MANTRI")) {
            turn_text.setText(first_player_name + " will find the CHOR!");
        }
        if (second_player_role.equals("MANTRI")) {
            turn_text.setText(second_player_name + " will find the CHOR!");
        }
        if (third_player_role.equals("MANTRI")) {
            turn_text.setText(third_player_name + " will find the CHOR!");
        }
        if (fourth_player_role.equals("MANTRI")) {
            turn_text.setText(fourth_player_name + " will find the CHOR!");
        }

        Log.v("AkhandBakar", "#########" + first_pod_button.getText());

        if (first_pod_button.getText().equals("")) {
            first_pod_button.setOnClickListener(new OnClickListener() {

                public void onClick(View v) {
                    Log.v("AkhandBakar", "#########" + first_player);
                    if (first_player.equals("CHOR")) {
                        RajaMantri.guess = true;
                        first_pod_button.setBackgroundResource(R.drawable.podopen);
                        first_pod_button.setText("CHOR");
                    } else {
                        RajaMantri.guess = false;
                        first_pod_button.setBackgroundResource(R.drawable.podopen);
                        first_pod_button.setText("SIPAHI");
                    }
                    first_pod_button.setClickable(false);
                    second_pod_button.setClickable(false);
                    third_pod_button.setClickable(false);
                    fourth_pod_button.setClickable(false);
                    updateScore();
                }
            });
        }
        Log.v("AkhandBakar", "#########" + second_pod_button.getText());
        if (second_pod_button.getText().equals("")) {
            second_pod_button.setOnClickListener(new OnClickListener() {

                public void onClick(View v) {
                    Log.v("AkhandBakar", "#########" + second_player);
                    if (second_player.equals("CHOR")) {
                        RajaMantri.guess = true;
                        second_pod_button.setBackgroundResource(R.drawable.podopen);
                        second_pod_button.setText("CHOR");
                    } else {
                        RajaMantri.guess = false;
                        second_pod_button.setBackgroundResource(R.drawable.podopen);
                        second_pod_button.setText("SIPAHI");
                    }
                    first_pod_button.setClickable(false);
                    second_pod_button.setClickable(false);
                    third_pod_button.setClickable(false);
                    fourth_pod_button.setClickable(false);
                    updateScore();
                }
            });
        }
        Log.v("AkhandBakar", "#########" + third_pod_button.getText());
        if (third_pod_button.getText().equals("")) {
            third_pod_button.setOnClickListener(new OnClickListener() {

                public void onClick(View v) {
                    Log.v("AkhandBakar", "#########" + third_player);
                    if (third_player.equals("CHOR")) {
                        RajaMantri.guess = true;
                        third_pod_button.setBackgroundResource(R.drawable.podopen);
                        third_pod_button.setText("CHOR");
                    } else {
                        RajaMantri.guess = false;
                        third_pod_button.setBackgroundResource(R.drawable.podopen);
                        third_pod_button.setText("SIPAHI");
                    }
                    first_pod_button.setClickable(false);
                    second_pod_button.setClickable(false);
                    third_pod_button.setClickable(false);
                    fourth_pod_button.setClickable(false);
                    updateScore();
                }
            });
        }
        Log.v("AkhandBakar", "#########" + fourth_pod_button.getText());
        if (fourth_pod_button.getText().equals("")) {
            fourth_pod_button.setOnClickListener(new OnClickListener() {

                public void onClick(View v) {
                    Log.v("AkhandBakar", "#########" + fourth_player);
                    if (fourth_player.equals("CHOR")) {
                        RajaMantri.guess = true;
                        fourth_pod_button.setBackgroundResource(R.drawable.podopen);
                        fourth_pod_button.setText("CHOR");
                    } else {
                        RajaMantri.guess = false;
                        fourth_pod_button.setBackgroundResource(R.drawable.podopen);
                        fourth_pod_button.setText("SIPAHI");
                    }
                    first_pod_button.setClickable(false);
                    second_pod_button.setClickable(false);
                    third_pod_button.setClickable(false);
                    fourth_pod_button.setClickable(false);
                    updateScore();
                }
            });
        }
    }

    public void shuffle() {
        play_button.setText("Guess");
        play_button.setClickable(false);
        shuffleArray(solutionArray);
        turn_text.setText(first_player_name + "'s" + " turn!");
        next_turn = second_player_name;
        first_pod_button = (Button) findViewById(R.id.first_pod_button);
        first_pod_button.setBackgroundResource(R.drawable.podtlclosed);
        first_pod_button.setOnClickListener(new OnClickListener() {

            public void onClick(View v) {
                first_player = solutionArray[0];
                first_pod_button.setText(first_player);
                first_pod_button.setBackgroundResource(R.drawable.podopen);
                second_pod_button.setClickable(false);
                third_pod_button.setClickable(false);
                fourth_pod_button.setClickable(false);
                if (turn_text.getText().equals(first_player_name + "'s" + " turn!")) {
                    if (first_player.equals("MANTRI")) {
                        first_player_role = "MANTRI";
                    }
                    if (first_player.equals("RAJA")) {
                        first_player_role = "RAJA";
                    }
                    if (first_player.equals("SIPAHI")) {
                        first_player_role = "SIPAHI";
                    }
                    if (first_player.equals("CHOR")) {
                        first_player_role = "CHOR";
                    }
                    next_turn = second_player_name + "'s" + " turn!";
                }
                if (turn_text.getText().equals(second_player_name + "'s" + " turn!")) {
                    if (first_player.equals("MANTRI")) {
                        second_player_role = "MANTRI";
                    }
                    if (first_player.equals("RAJA")) {
                        second_player_role = "RAJA";
                    }
                    if (first_player.equals("SIPAHI")) {
                        second_player_role = "SIPAHI";
                    }
                    if (first_player.equals("CHOR")) {
                        second_player_role = "CHOR";
                    }
                    next_turn = third_player_name + "'s" + " turn!";
                }
                if (turn_text.getText().equals(third_player_name + "'s" + " turn!")) {
                    if (first_player.equals("MANTRI")) {
                        third_player_role = "MANTRI";
                    }
                    if (first_player.equals("RAJA")) {
                        third_player_role = "RAJA";
                    }
                    if (first_player.equals("SIPAHI")) {
                        third_player_role = "SIPAHI";
                    }
                    if (first_player.equals("CHOR")) {
                        third_player_role = "CHOR";
                    }
                    next_turn = fourth_player_name + "'s" + " turn!";
                }
                if (turn_text.getText().equals(fourth_player_name + "'s" + " turn!")) {
                    if (first_player.equals("MANTRI")) {
                        fourth_player_role = "MANTRI";
                    }
                    if (first_player.equals("RAJA")) {
                        fourth_player_role = "RAJA";
                    }
                    if (first_player.equals("SIPAHI")) {
                        fourth_player_role = "SIPAHI";
                    }
                    if (first_player.equals("CHOR")) {
                        fourth_player_role = "CHOR";
                    }
                    next_turn = "Click on Guess!";
                }
                turn_text.setText("Click again to close the chit!");

                first_pod_button.setOnClickListener(new OnClickListener() {

                    public void onClick(View v) {
                        first_pod_button.setClickable(false);
                        count++;
                        first_pod_button.setText("");
                        first_pod_button.setBackgroundResource(R.drawable.podtlhalf);
                        turn_text.setText(next_turn);
                        second_pod_button.setClickable(true);
                        third_pod_button.setClickable(true);
                        fourth_pod_button.setClickable(true);
                        if (count == 4) {
                            turn_text.setText("Click on Guess!");
                            play_button.setClickable(true);
                            count = 0;
                        }
                    }
                });
            }
        });
        second_pod_button = (Button) findViewById(R.id.second_pod_button);
        second_pod_button.setBackgroundResource(R.drawable.podtrclosed);
        second_pod_button.setOnClickListener(new OnClickListener() {

            public void onClick(View v) {
                second_player = solutionArray[1];
                second_pod_button.setText(second_player);
                second_pod_button.setBackgroundResource(R.drawable.podopen);
                first_pod_button.setClickable(false);
                third_pod_button.setClickable(false);
                fourth_pod_button.setClickable(false);
                if (turn_text.getText().equals(first_player_name + "'s" + " turn!")) {
                    if (second_player.equals("MANTRI")) {
                        first_player_role = "MANTRI";
                    }
                    if (second_player.equals("RAJA")) {
                        first_player_role = "RAJA";
                    }
                    if (second_player.equals("SIPAHI")) {
                        first_player_role = "SIPAHI";
                    }
                    if (second_player.equals("CHOR")) {
                        first_player_role = "CHOR";
                    }
                    next_turn = second_player_name + "'s" + " turn!";
                }
                if (turn_text.getText().equals(second_player_name + "'s" + " turn!")) {
                    if (second_player.equals("MANTRI")) {
                        second_player_role = "MANTRI";
                    }
                    if (second_player.equals("RAJA")) {
                        second_player_role = "RAJA";
                    }
                    if (second_player.equals("SIPAHI")) {
                        second_player_role = "SIPAHI";
                    }
                    if (second_player.equals("CHOR")) {
                        second_player_role = "CHOR";
                    }
                    next_turn = third_player_name + "'s" + " turn!";
                }
                if (turn_text.getText().equals(third_player_name + "'s" + " turn!")) {
                    if (second_player.equals("MANTRI")) {
                        third_player_role = "MANTRI";
                    }
                    if (second_player.equals("RAJA")) {
                        third_player_role = "RAJA";
                    }
                    if (second_player.equals("SIPAHI")) {
                        third_player_role = "SIPAHI";
                    }
                    if (second_player.equals("CHOR")) {
                        third_player_role = "CHOR";
                    }
                    next_turn = fourth_player_name + "'s" + " turn!";
                }
                if (turn_text.getText().equals(fourth_player_name + "'s" + " turn!")) {
                    if (second_player.equals("MANTRI")) {
                        fourth_player_role = "MANTRI";
                    }
                    if (second_player.equals("RAJA")) {
                        fourth_player_role = "RAJA";
                    }
                    if (second_player.equals("SIPAHI")) {
                        fourth_player_role = "SIPAHI";
                    }
                    if (second_player.equals("CHOR")) {
                        fourth_player_role = "CHOR";
                    }
                    next_turn = "Click on Guess!";
                }
                turn_text.setText("Click again to close the chit!");
                second_pod_button.setOnClickListener(new OnClickListener() {

                    public void onClick(View v) {
                        second_pod_button.setClickable(false);
                        count++;
                        second_pod_button.setText("");
                        second_pod_button.setBackgroundResource(R.drawable.podtrhalf);
                        turn_text.setText(next_turn);
                        first_pod_button.setClickable(true);
                        third_pod_button.setClickable(true);
                        fourth_pod_button.setClickable(true);
                        if (count == 4) {
                            turn_text.setText("Click on Guess!");
                            play_button.setClickable(true);
                            count = 0;
                        }
                    }
                });
            }
        });
        third_pod_button = (Button) findViewById(R.id.third_pod_button);
        third_pod_button.setBackgroundResource(R.drawable.podblclosed);
        third_pod_button.setOnClickListener(new OnClickListener() {

            public void onClick(View v) {
                third_player = solutionArray[2];
                third_pod_button.setText(third_player);
                third_pod_button.setBackgroundResource(R.drawable.podopen);
                second_pod_button.setClickable(false);
                first_pod_button.setClickable(false);
                fourth_pod_button.setClickable(false);
                if (turn_text.getText().equals(first_player_name + "'s" + " turn!")) {
                    if (third_player.equals("MANTRI")) {
                        first_player_role = "MANTRI";
                    }
                    if (third_player.equals("RAJA")) {
                        first_player_role = "RAJA";
                    }
                    if (third_player.equals("SIPAHI")) {
                        first_player_role = "SIPAHI";
                    }
                    if (third_player.equals("CHOR")) {
                        first_player_role = "CHOR";
                    }
                    next_turn = second_player_name + "'s" + " turn!";
                }
                if (turn_text.getText().equals(second_player_name + "'s" + " turn!")) {
                    if (third_player.equals("MANTRI")) {
                        second_player_role = "MANTRI";
                    }
                    if (third_player.equals("RAJA")) {
                        second_player_role = "RAJA";
                    }
                    if (third_player.equals("SIPAHI")) {
                        second_player_role = "SIPAHI";
                    }
                    if (third_player.equals("CHOR")) {
                        second_player_role = "CHOR";
                    }
                    next_turn = third_player_name + "'s" + " turn!";
                }
                if (turn_text.getText().equals(third_player_name + "'s" + " turn!")) {
                    if (third_player.equals("MANTRI")) {
                        third_player_role = "MANTRI";
                    }
                    if (third_player.equals("RAJA")) {
                        third_player_role = "RAJA";
                    }
                    if (third_player.equals("SIPAHI")) {
                        third_player_role = "SIPAHI";
                    }
                    if (third_player.equals("CHOR")) {
                        third_player_role = "CHOR";
                    }
                    next_turn = fourth_player_name + "'s" + " turn!";
                }
                if (turn_text.getText().equals(fourth_player_name + "'s" + " turn!")) {
                    if (third_player.equals("MANTRI")) {
                        fourth_player_role = "MANTRI";
                    }
                    if (third_player.equals("RAJA")) {
                        fourth_player_role = "RAJA";
                    }
                    if (third_player.equals("SIPAHI")) {
                        fourth_player_role = "SIPAHI";
                    }
                    if (third_player.equals("CHOR")) {
                        fourth_player_role = "CHOR";
                    }
                    next_turn = "Click on Guess!";
                }
                turn_text.setText("Click again to close the chit!");
                third_pod_button.setOnClickListener(new OnClickListener() {

                    public void onClick(View v) {
                        third_pod_button.setClickable(false);
                        count++;
                        third_pod_button.setText("");
                        third_pod_button.setBackgroundResource(R.drawable.podblhalf);
                        turn_text.setText(next_turn);
                        second_pod_button.setClickable(true);
                        first_pod_button.setClickable(true);
                        fourth_pod_button.setClickable(true);
                        if (count == 4) {
                            turn_text.setText("Click on Guess!");
                            play_button.setClickable(true);
                            count = 0;
                        }
                    }
                });
            }
        });
        fourth_pod_button = (Button) findViewById(R.id.fourth_pod_button);
        fourth_pod_button.setBackgroundResource(R.drawable.podbrclosed);

        fourth_pod_button.setOnClickListener(new OnClickListener() {

            public void onClick(View v) {
                fourth_player = solutionArray[3];
                fourth_pod_button.setText(fourth_player);
                fourth_pod_button.setBackgroundResource(R.drawable.podopen);
                second_pod_button.setClickable(false);
                third_pod_button.setClickable(false);
                first_pod_button.setClickable(false);
                if (turn_text.getText().equals(first_player_name + "'s" + " turn!")) {
                    if (fourth_player.equals("MANTRI")) {
                        first_player_role = "MANTRI";
                    }
                    if (fourth_player.equals("RAJA")) {
                        first_player_role = "RAJA";
                    }
                    if (fourth_player.equals("SIPAHI")) {
                        first_player_role = "SIPAHI";
                    }
                    if (fourth_player.equals("CHOR")) {
                        first_player_role = "CHOR";
                    }
                    next_turn = second_player_name + "'s" + " turn!";
                }
                if (turn_text.getText().equals(second_player_name + "'s" + " turn!")) {
                    if (fourth_player.equals("MANTRI")) {
                        second_player_role = "MANTRI";
                    }
                    if (fourth_player.equals("RAJA")) {
                        second_player_role = "RAJA";
                    }
                    if (fourth_player.equals("SIPAHI")) {
                        second_player_role = "SIPAHI";
                    }
                    if (fourth_player.equals("CHOR")) {
                        second_player_role = "CHOR";
                    }
                    next_turn = third_player_name + "'s" + " turn!";
                }
                if (turn_text.getText().equals(third_player_name + "'s" + " turn!")) {
                    if (fourth_player.equals("MANTRI")) {
                        third_player_role = "MANTRI";
                    }
                    if (fourth_player.equals("RAJA")) {
                        third_player_role = "RAJA";
                    }
                    if (fourth_player.equals("SIPAHI")) {
                        third_player_role = "SIPAHI";
                    }
                    if (fourth_player.equals("CHOR")) {
                        third_player_role = "CHOR";
                    }
                    next_turn = fourth_player_name + "'s" + " turn!";
                }
                if (turn_text.getText().equals(fourth_player_name + "'s" + " turn!")) {
                    if (fourth_player.equals("MANTRI")) {
                        fourth_player_role = "MANTRI";
                    }
                    if (fourth_player.equals("RAJA")) {
                        fourth_player_role = "RAJA";
                    }
                    if (fourth_player.equals("SIPAHI")) {
                        fourth_player_role = "SIPAHI";
                    }
                    if (fourth_player.equals("CHOR")) {
                        fourth_player_role = "CHOR";
                    }
                    next_turn = "Click on Guess!";
                }
                turn_text.setText("Click again to close the chit!");
                fourth_pod_button.setOnClickListener(new OnClickListener() {

                    public void onClick(View v) {
                        fourth_pod_button.setClickable(false);
                        count++;
                        fourth_pod_button.setText("");
                        fourth_pod_button.setBackgroundResource(R.drawable.podbrhalf);
                        turn_text.setText(next_turn);
                        second_pod_button.setClickable(true);
                        third_pod_button.setClickable(true);
                        first_pod_button.setClickable(true);
                        if (count == 4) {
                            turn_text.setText(next_turn);
                            play_button.setClickable(true);
                            count = 0;
                        }
                    }
                });
            }
        });
        first_pod_button.setText("");
        second_pod_button.setText("");
        third_pod_button.setText("");
        fourth_pod_button.setText("");
    }

    public void setRole(String role, String player) {
        if (first_player.equals("MANTRI")) {
            fourth_player_role = "MANTRI";
        }
        if (first_player.equals("RAJA")) {
            fourth_player_role = "RAJA";
        }
        if (first_player.equals("SIPAHI")) {
            fourth_player_role = "SIPAHI";
        }
        if (first_player.equals("CHOR")) {
            fourth_player_role = "CHOR";
        }
    }

    void shuffleArray(String[] solutionArray) {
        Random rnd = new Random();
        for (int i = solutionArray.length - 1; i >= 0; i--) {
            int index = rnd.nextInt(i + 1);
            String a = solutionArray[index];
            solutionArray[index] = solutionArray[i];
            solutionArray[i] = a;
        }
    }

    static void updateScore() {
        Log.v("AkhandBakar", "##########" + guess);
        if (first_player_role.equals("MANTRI")) {
            Log.v("AkhandBakar", "##########Mantri" + first_player_name);
            if (guess) {
                i = i + 80;
                first_player_score = i;
                turn_text.setText(first_player_name + " is right!");
                first_pod_button.setText(first_player);
                second_pod_button.setText(second_player);
                third_pod_button.setText(third_player);
                fourth_pod_button.setText(fourth_player);
                first_pod_button.setBackgroundResource(R.drawable.podopen);
                second_pod_button.setBackgroundResource(R.drawable.podopen);
                third_pod_button.setBackgroundResource(R.drawable.podopen);
                fourth_pod_button.setBackgroundResource(R.drawable.podopen);
                if (second_player_role.equals("CHOR")) {
                    second_player_score = j;
                    if (third_player_role.equals("RAJA")) {
                        k = k + 100;
                        l = l + 50;
                        third_player_score = k;
                        fourth_player_score = l;
                    } else {
                        l = l + 100;
                        k = k + 50;
                        fourth_player_score = l;
                        third_player_score = k;
                    }
                }
                if (third_player_role.equals("CHOR")) {
                    third_player_score = k;
                    if (second_player_role.equals("RAJA")) {
                        j = j + 100;
                        l = l + 50;
                        second_player_score = j;
                        fourth_player_score = l;
                    } else {
                        l = l + 100;
                        j = j + 50;
                        fourth_player_score = l;
                        second_player_score = j;
                    }
                }
                if (fourth_player_role.equals("CHOR")) {
                    fourth_player_score = l;
                    if (third_player_role.equals("RAJA")) {
                        k = k + 100;
                        j = j + 50;
                        second_player_score = j;
                        third_player_score = k;
                    } else {
                        j = j + 100;
                        k = k + 50;
                        third_player_score = k;
                        second_player_score = j;
                    }
                }
            } else {
                i = i - 80;
                first_player_score = i;
                turn_text.setText(first_player_name + " is wrong!");
                first_pod_button.setText(first_player);
                second_pod_button.setText(second_player);
                third_pod_button.setText(third_player);
                fourth_pod_button.setText(fourth_player);
                first_pod_button.setBackgroundResource(R.drawable.podopen);
                second_pod_button.setBackgroundResource(R.drawable.podopen);
                third_pod_button.setBackgroundResource(R.drawable.podopen);
                fourth_pod_button.setBackgroundResource(R.drawable.podopen);
                if (second_player_role.equals("CHOR")) {
                    j = j + 25;
                    second_player_score = j;
                    if (third_player_role.equals("RAJA")) {
                        k = k + 100;
                        l = l + 50;
                        third_player_score = k;
                        fourth_player_score = l;
                    } else {
                        l = l + 100;
                        k = k + 50;
                        fourth_player_score = l;
                        third_player_score = k;
                    }
                }
                if (third_player_role.equals("CHOR")) {
                    k = k + 25;
                    third_player_score = k;
                    if (second_player_role.equals("RAJA")) {
                        j = j + 100;
                        l = l + 50;
                        second_player_score = j;
                        fourth_player_score = l;
                    } else {
                        l = l + 100;
                        j = j + 50;
                        fourth_player_score = l;
                        second_player_score = j;
                    }
                }
                if (fourth_player_role.equals("CHOR")) {
                    l = l + 25;
                    fourth_player_score = l;
                    if (third_player_role.equals("RAJA")) {
                        k = k + 100;
                        j = j + 50;
                        second_player_score = j;
                        third_player_score = k;
                    } else {
                        j = j + 100;
                        k = k + 50;
                        third_player_score = k;
                        second_player_score = j;
                    }
                }
            }
        }
        if (second_player_role.equals("MANTRI")) {
            if (guess) {
                Log.v("AkhandBakar", "##########Mantri" + second_player_name);
                j = j + 80;
                second_player_score = j;
                turn_text.setText(second_player_name + " is right!");
                first_pod_button.setText(first_player);
                second_pod_button.setText(second_player);
                third_pod_button.setText(third_player);
                fourth_pod_button.setText(fourth_player);
                first_pod_button.setBackgroundResource(R.drawable.podopen);
                second_pod_button.setBackgroundResource(R.drawable.podopen);
                third_pod_button.setBackgroundResource(R.drawable.podopen);
                fourth_pod_button.setBackgroundResource(R.drawable.podopen);
                if (first_player_role.equals("CHOR")) {
                    first_player_score = i;
                    if (third_player_role.equals("RAJA")) {
                        k = k + 100;
                        l = l + 50;
                        third_player_score = k;
                        fourth_player_score = l;
                    } else {
                        l = l + 100;
                        k = k + 50;
                        fourth_player_score = l;
                        third_player_score = k;
                    }
                }
                if (third_player_role.equals("CHOR")) {
                    third_player_score = k;
                    if (first_player_role.equals("RAJA")) {
                        i = i + 100;
                        l = l + 50;
                        first_player_score = i;
                        fourth_player_score = l;
                    } else {
                        l = l + 100;
                        i = i + 50;
                        first_player_score = i;
                        fourth_player_score = l;
                    }
                }
                if (fourth_player_role.equals("CHOR")) {
                    fourth_player_score = l;
                    if (first_player_role.equals("RAJA")) {
                        i = i + 100;
                        k = k + 50;
                        first_player_score = i;
                        third_player_score = k;
                    } else {
                        k = k + 100;
                        i = i + 50;
                        first_player_score = i;
                        third_player_score = k;
                    }
                }
            } else {
                j = j - 80;
                second_player_score = j;
                turn_text.setText(second_player_name + " is wrong!");
                first_pod_button.setText(first_player);
                second_pod_button.setText(second_player);
                third_pod_button.setText(third_player);
                fourth_pod_button.setText(fourth_player);
                first_pod_button.setBackgroundResource(R.drawable.podopen);
                second_pod_button.setBackgroundResource(R.drawable.podopen);
                third_pod_button.setBackgroundResource(R.drawable.podopen);
                fourth_pod_button.setBackgroundResource(R.drawable.podopen);
                if (first_player_role.equals("CHOR")) {
                    i = i + 25;
                    first_player_score = i;
                    if (third_player_role.equals("RAJA")) {
                        k = k + 100;
                        l = l + 50;
                        third_player_score = k;
                        fourth_player_score = l;
                    } else {
                        l = l + 100;
                        k = k + 50;
                        fourth_player_score = l;
                        third_player_score = k;
                    }
                }
                if (third_player_role.equals("CHOR")) {
                    k = k + 25;
                    third_player_score = k;
                    if (first_player_role.equals("RAJA")) {
                        i = i + 100;
                        l = l + 50;
                        first_player_score = i;
                        fourth_player_score = l;
                    } else {
                        l = l + 100;
                        i = i + 50;
                        first_player_score = i;
                        fourth_player_score = l;
                    }
                }
                if (fourth_player_role.equals("CHOR")) {
                    l = l + 25;
                    fourth_player_score = l;
                    if (first_player_role.equals("RAJA")) {
                        i = i + 100;
                        k = k + 50;
                        first_player_score = i;
                        third_player_score = k;
                    } else {
                        k = k + 100;
                        i = i + 50;
                        first_player_score = i;
                        third_player_score = k;
                    }
                }
            }
        }
        if (third_player_role.equals("MANTRI")) {
            Log.v("AkhandBakar", "##########Mantri" + third_player_name);
            if (guess) {
                k = k + 80;
                third_player_score = k;
                turn_text.setText(third_player_name + " is right!");
                first_pod_button.setText(first_player);
                second_pod_button.setText(second_player);
                third_pod_button.setText(third_player);
                fourth_pod_button.setText(fourth_player);
                first_pod_button.setBackgroundResource(R.drawable.podopen);
                second_pod_button.setBackgroundResource(R.drawable.podopen);
                third_pod_button.setBackgroundResource(R.drawable.podopen);
                fourth_pod_button.setBackgroundResource(R.drawable.podopen);
                if (first_player_role.equals("CHOR")) {
                    first_player_score = i;
                    if (second_player_role.equals("RAJA")) {
                        j = j + 100;
                        l = l + 50;
                        second_player_score = j;
                        fourth_player_score = l;
                    } else {
                        l = l + 100;
                        j = j + 50;
                        second_player_score = j;
                        fourth_player_score = l;
                    }
                }
                if (second_player_role.equals("CHOR")) {
                    second_player_score = j;
                    if (first_player_role.equals("RAJA")) {
                        i = i + 100;
                        l = l + 50;
                        first_player_score = i;
                        fourth_player_score = l;
                    } else {
                        i = i + 50;
                        l = l + 100;
                        first_player_score = i;
                        fourth_player_score = l;
                    }
                }
                if (fourth_player_role.equals("CHOR")) {
                    fourth_player_score = l;
                    if (second_player_role.equals("RAJA")) {
                        j = j + 100;
                        i = i + 50;
                        first_player_score = i;
                        second_player_score = j;
                    } else {
                        j = j + 50;
                        i = i + 100;
                        first_player_score = i;
                        second_player_score = j;
                    }
                }
            } else {
                k = k - 80;
                third_player_score = k;
                turn_text.setText(third_player_name + " is wrong!");
                first_pod_button.setText(first_player);
                second_pod_button.setText(second_player);
                third_pod_button.setText(third_player);
                fourth_pod_button.setText(fourth_player);
                first_pod_button.setBackgroundResource(R.drawable.podopen);
                second_pod_button.setBackgroundResource(R.drawable.podopen);
                third_pod_button.setBackgroundResource(R.drawable.podopen);
                fourth_pod_button.setBackgroundResource(R.drawable.podopen);
                if (first_player_role.equals("CHOR")) {
                    i = i + 25;
                    first_player_score = i;
                    if (second_player_role.equals("RAJA")) {
                        j = j + 100;
                        l = l + 50;
                        second_player_score = j;
                        fourth_player_score = l;
                    } else {
                        l = l + 100;
                        j = j + 50;
                        second_player_score = j;
                        fourth_player_score = l;
                    }
                }
                if (second_player_role.equals("CHOR")) {
                    j = j + 25;
                    second_player_score = j;
                    if (first_player_role.equals("RAJA")) {
                        i = i + 100;
                        l = l + 50;
                        first_player_score = i;
                        fourth_player_score = l;
                    } else {
                        i = i + 50;
                        l = l + 100;
                        first_player_score = i;
                        fourth_player_score = l;
                    }
                }
                if (fourth_player_role.equals("CHOR")) {
                    l = l + 25;
                    fourth_player_score = l;
                    if (second_player_role.equals("RAJA")) {
                        j = j + 100;
                        i = i + 50;
                        first_player_score = i;
                        second_player_score = j;
                    } else {
                        j = j + 50;
                        i = i + 100;
                        first_player_score = i;
                        second_player_score = j;
                    }
                }
            }
        }
        if (fourth_player_role.equals("MANTRI")) {
            Log.v("AkhandBakar", "##########Mantri" + fourth_player_name);
            if (guess) {
                l = l + 80;
                fourth_player_score = l;
                turn_text.setText(fourth_player_name + " is right!");
                first_pod_button.setText(first_player);
                second_pod_button.setText(second_player);
                third_pod_button.setText(third_player);
                fourth_pod_button.setText(fourth_player);
                first_pod_button.setBackgroundResource(R.drawable.podopen);
                second_pod_button.setBackgroundResource(R.drawable.podopen);
                third_pod_button.setBackgroundResource(R.drawable.podopen);
                fourth_pod_button.setBackgroundResource(R.drawable.podopen);
                if (first_player_role.equals("CHOR")) {
                    first_player_score = i;
                    if (second_player_role.equals("RAJA")) {
                        j = j + 100;
                        k = k + 50;
                        second_player_score = j;
                        third_player_score = k;
                    } else {
                        j = j + 50;
                        k = k + 100;
                        second_player_score = j;
                        third_player_score = k;
                    }
                }
                if (second_player_role.equals("CHOR")) {
                    second_player_score = j;
                    if (first_player_role.equals("RAJA")) {
                        i = i + 100;
                        k = k + 50;
                        first_player_score = i;
                        third_player_score = k;
                    } else {
                        i = i + 50;
                        k = k + 100;
                        first_player_score = i;
                        third_player_score = k;
                    }
                }
                if (third_player_role.equals("CHOR")) {
                    third_player_score = k;
                    if (first_player_role.equals("RAJA")) {
                        i = i + 100;
                        j = j + 50;
                        first_player_score = i;
                        second_player_score = j;
                    } else {
                        i = i + 50;
                        j = j + 100;
                        first_player_score = i;
                        second_player_score = j;
                    }
                }
            } else {
                l = l - 80;
                fourth_player_score = l;
                turn_text.setText(fourth_player_name + " is wrong!");
                first_pod_button.setText(first_player);
                second_pod_button.setText(second_player);
                third_pod_button.setText(third_player);
                fourth_pod_button.setText(fourth_player);
                first_pod_button.setBackgroundResource(R.drawable.podopen);
                second_pod_button.setBackgroundResource(R.drawable.podopen);
                third_pod_button.setBackgroundResource(R.drawable.podopen);
                fourth_pod_button.setBackgroundResource(R.drawable.podopen);
                if (first_player_role.equals("CHOR")) {
                    i = i + 25;
                    first_player_score = i;
                    if (second_player_role.equals("RAJA")) {
                        j = j + 100;
                        k = k + 50;
                        second_player_score = j;
                        third_player_score = k;
                    } else {
                        j = j + 50;
                        k = k + 100;
                        second_player_score = j;
                        third_player_score = k;
                    }
                }
                if (second_player_role.equals("CHOR")) {
                    j = j + 25;
                    second_player_score = j;
                    if (first_player_role.equals("RAJA")) {
                        i = i + 100;
                        k = k + 50;
                        first_player_score = i;
                        third_player_score = k;
                    } else {
                        i = i + 50;
                        k = k + 100;
                        first_player_score = i;
                        third_player_score = k;
                    }
                }
                if (third_player_role.equals("CHOR")) {
                    k = k + 25;
                    third_player_score = k;
                    if (first_player_role.equals("RAJA")) {
                        i = i + 100;
                        j = j + 50;
                        first_player_score = i;
                        second_player_score = j;
                    } else {
                        i = i + 50;
                        j = j + 100;
                        first_player_score = i;
                        second_player_score = j;
                    }
                }
            }
        }
        Log.v("AkhandBakar", "##########Score " + i);
        first_player_text.setText("1." + first_player_name + " [" + i + "]");
        Log.v("AkhandBakar", first_player + " [" + i + "]");
        second_player_text.setText("2." + second_player_name + " [" + j + "]");
        Log.v("AkhandBakar", second_player + " [" + second_player_score + "]");
        third_player_text.setText("3." + third_player_name + " [" + k + "]");
        Log.v("AkhandBakar", third_player + " [" + third_player_score + "]");
        fourth_player_text.setText("4." + fourth_player_name + " [" + l + "]");
        Log.v("AkhandBakar", fourth_player + " [" + fourth_player_score + "]");
    }
}