
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

    String[] solutionArray = { "RAJA", "MANTRI", "CHOR", "SIPAHI"};
    String[] playersArray = {"Player1", "Player2", "Player3", "Player4"};
    static String player1_name = "" ;
    static String player2_name = "";
    static String player3_name = "";
    static String player4_name = "";
    static String player1_role = "";
    static String player2_role = "";
    static String player3_role = "";
    static String player4_role = "";
    static boolean guess = false;
    static String player1 = "";
    static String player2 = "";
    static String player3 = "";
    static String player4 = "";
    static int i=0,j=0,k=0,l=0;
    static int player1_score = 0;
    static int player2_score = 0;
    static int player3_score = 0;
    static int player4_score = 0;
    int count = 0;

    Button raja_mantri_button;
    Button help_button;
    ImageView btn9;
    Button play_button;
    static Button btnPod1;
    static Button btnPod2;
    static Button btnPod3;
    static Button btnPod4;
    Button show_result_button;
    Button restart_button;
    Button sign_in_button;
    Button guess_button;
    EditText player1_edit_text;
    EditText player2_edit_text;
    EditText player3_edit_text;
    EditText player4_edit_text;
    EditText edit2;
    EditText edit3;
    EditText edit4;
    TextView player1_label;
    TextView player2_label;
    TextView player3_label;
    TextView player4_label;
    static TextView turn_text;
    static TextView player1_text;
    static TextView player2_text;
    static TextView player3_text;
    static TextView player4_text;
    Bundle saved_instance_state2;
    Button main_menu_button;
    String next_turn = "";
    public void onRestart(){
        super.onRestart();
   /*	player1_name = "" ;
   	player2_name = "";
   	player3_name = "";
   	player4_name = "";
   	guess = false;
   	player1 = "";
   	player2 = "";
   	player3 = "";
   	player4 = "";
   	i=0;j=0;k=0;l=0;
   	p1score = 0;
   	p2score = 0;
   	p3score = 0;
   	p4score = 0;*/
   }

   public void onResume(){
       super.onResume();
      /*
        player1_name = "" ;
   	player2_name = "";
   	player3_name = "";
   	player4_name = "";
    	guess = false;
    	player1 = "";
   	player2 = "";
    	player3 = "";
   	player4 = "";
   	i=0;j=0;k=0;l=0;
    	p1score = 0;
   	p2score = 0;
    	p3score = 0;
    	p4score = 0;
       */
    }

    public void onCreate(Bundle saved_instance_state) {
        super.onCreate(saved_instance_state);
        setContentView(R.layout.welcome);
        i = 0;
        j = 0;
        k = 0;
        l = 0;
        help_button = (Button)findViewById(R.id.help_button);
        help_button.setOnClickListener(new OnClickListener() {

            public void onClick(View v) {
                setContentView(R.layout.help);
		// Create the ad_view
		AdView ad_view = new AdView(RajaMantri.this, AdSize.BANNER, "a14e156523d01de");
		// Lookup your LinearLayout assuming it’s been given
	        // the attribute android:id="@+id/mainLayout"
		LinearLayout layout = (LinearLayout)findViewById(R.id.mainLayoutHelp);
		// Add the ad_view to it
		layout.addView(ad_view);
		// Initiate a generic request to load it with an ad
		ad_view.loadAd(new AdRequest());
		TextView help_text = (TextView)findViewById(R.id.help_text);
		String text = "Welcome to nostalgia! This is the paper free version of Raja Mantri Chor Sipahi.\n\nThe game involves bluffing with facial expressions and good guessing. This is a very popular childhood game in India played among kids often during their long summer vacations.\n\nThe game has 4 paper chits with Chor (thief), Sipahi (police), Raja (king) and Mantri (minister). The chits are folded at the start of the game and one of the 4 players will press SHUFFLE each one of the four players is supposed to secretly (by taking the phone and not letting the others see it)pick one chit by clicking on it, the player then clicks on the chit again to fold it back. All the players will then secretly open their chits and read what they have got. \n\nThe player who gets the chit with Raja written on it will say MERA MANTRI KAUN? (Who is my minister?). The player who got the chit with Mantri will say MEIN! (Me), The player with Raja will then say CHOR SIPAHI KA PATA LAGAO (find out who is the theif and who is the soldier). The player with Mantri will then guess who is the Chor (Thief), if he is wrong then his points are deducted and if he is correct he gets more points and the points from the player who got Chor (Thief) are deducted.\n\nIf the guess is correct the player with Chor is wrapped on his wrist by the Mantri, and if the Mantri is wrong then the Chor gets to hit his wrist.";
		help_text.setText(text);
		Button back_button = (Button)findViewById(R.id.btnMainMenuHelp);
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
	        LinearLayout layout = (LinearLayout)findViewById(R.id.mainLayoutPlayer);
	        // Add the ad_view to it
	        layout.addView(ad_view);
	        // Initiate a generic request to load it with an ad
	        ad_view.loadAd(new AdRequest());

                player1_edit_text = (EditText) findViewById(R.id.player1_edit_text);
 		player2_edit_text = (EditText)findViewById(R.id.player2_edit_text);
 		player3_edit_text = (EditText)findViewById(R.id.player3_edit_text);
 		player4_edit_text = (EditText)findViewById(R.id.player4_edit_text);

 		player1_label = (TextView) findViewById(R.id.player1_label);
 		player2_label = (TextView) findViewById(R.id.player2_label);
 		player3_label = (TextView) findViewById(R.id.player3_label);
 		player4_label = (TextView) findViewById(R.id.player4_label);

 		Display display = getWindowManager().getDefaultDisplay(); 
 		int width = display.getWidth();
 		int height = display.getHeight();

 		player1_label.setGravity(Gravity.CENTER_HORIZONTAL);
 		player2_label.setGravity(Gravity.CENTER_HORIZONTAL);
 		player3_label.setGravity(Gravity.CENTER_HORIZONTAL);
 		player4_label.setGravity(Gravity.CENTER_HORIZONTAL);

 		Log.v("AkandBakar", "Playernames:" + player1_name);
 		Log.v("AkandBakar", "Playernames:" + player2_name);
 		Log.v("AkandBakar", "Playernames:" + player3_name);
 		Log.v("AkandBakar", "Playernames:" + player4_name);

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
				player1_name = player1_edit_text.getText().toString();
		 		player2_name = player2_edit_text.getText().toString();
		 		player3_name = player3_edit_text.getText().toString();
		 		player4_name = player4_edit_text.getText().toString();

				if(player1_name.equals("")||player2_name.equals("")||player3_name.equals("")||player4_name.equals("")){

					Toast toast = Toast.makeText(getBaseContext(), "Enter player names!", 8000);
					toast.show();

				}else{
					setContentView(R.layout.rmcsgnew);	
					 // Create the ad_view
				    AdView ad_view = new AdView(RajaMantri.this, AdSize.BANNER, "a14e156523d01de");
				    // Lookup your LinearLayout assuming it’s been given
				    // the attribute android:id="@+id/mainLayout"
				    LinearLayout layout = (LinearLayout)findViewById(R.id.mainLayout);
				    // Add the ad_view to it
				    layout.addView(ad_view);
				    // Initiate a generic request to load it with an ad
				    ad_view.loadAd(new AdRequest());

					turn_text = (TextView)findViewById(R.id.turn_text);
					turn_text.setText("Click on SHUFFLE!");
					playersArray[0] = player1_name;
			 		playersArray[1] = player2_name;
			 		playersArray[2] = player3_name;
			 		playersArray[3] = player4_name;

					txtPlayer1 = (TextView) findViewById(R.id.txtPlayer1);
					txtPlayer1.setText("1."+player1_name + " [" + p1score + "]");

					txtPlayer2 = (TextView) findViewById(R.id.txtPlayer2);
					txtPlayer2.setText("2."+player2_name+ " [" + p2score + "]");

					txtPlayer3 = (TextView) findViewById(R.id.txtPlayer3);
					txtPlayer3.setText("3."+player3_name+ " [" + p3score + "]");

					txtPlayer4 = (TextView) findViewById(R.id.txtPlayer4);
					txtPlayer4.setText("4."+player4_name+ " [" + p4score + "]");

				play_button = (Button) findViewById(R.id.play_button);

				play_button.setOnClickListener(new OnClickListener() {

		 			public void onClick(View v) {

		 				if(play_button.getText().equals("SHUFFLE")){
		 					RajaMantri.this.shuffle();
		 				}else{
		 					RajaMantri.this.makeGuess();

		 					Log.v("RajaMantri", "########## Player Name:" + player1_name +" Role:" + player1_role);
		 					Log.v("RajaMantri", "########## Player Name:" + player2_name +" Role:" + player2_role);
		 					Log.v("RajaMantri", "########## Player Name:" + player3_name +" Role:" + player3_role);
		 					Log.v("RajaMantri", "########## Player Name:" + player4_name +" Role:" + player4_role);
						}

		 			}
		 		});
			}
		         
		}

 	});
}

		
		});
 		 
       
    }
    
    
    public void makeGuess(){
    	
    	play_button.setText("SHUFFLE");
			count = 0;
			play_button.setText("SHUFFLE");
			
			btnPod1.setClickable(true);
			btnPod2.setClickable(true);
			btnPod3.setClickable(true);
			btnPod4.setClickable(true);
			
		if(player1.equals("RAJA")){
			
			btnPod1.setText("RAJA");
			btnPod1.setBackgroundResource(R.drawable.podopen);
			btnPod1.setClickable(false);
		}
		if(player2.equals("RAJA")){
			
			btnPod2.setText("RAJA");
			btnPod2.setBackgroundResource(R.drawable.podopen);
			btnPod2.setClickable(false);
		}
		if(player3.equals("RAJA")){

			btnPod3.setText("RAJA");
			btnPod3.setBackgroundResource(R.drawable.podopen);
			btnPod3.setClickable(false);
		}
		if(player4.equals("RAJA")){

			btnPod4.setText("RAJA");
			btnPod4.setBackgroundResource(R.drawable.podopen);
			btnPod4.setClickable(false);
		}

		if(player1.equals("MANTRI")){
			
			btnPod1.setText("MANTRI");
			btnPod1.setBackgroundResource(R.drawable.podopen);
			btnPod1.setClickable(false);
		}
		if(player2.equals("MANTRI")){
			
			btnPod2.setText("MANTRI");
			btnPod2.setBackgroundResource(R.drawable.podopen);
			btnPod2.setClickable(false);
		}
		if(player3.equals("MANTRI")){

			btnPod3.setText("MANTRI");
			btnPod3.setBackgroundResource(R.drawable.podopen);
			btnPod3.setClickable(false);
		}
		if(player4.equals("MANTRI")){

			btnPod4.setText("MANTRI");
			btnPod4.setBackgroundResource(R.drawable.podopen);
			btnPod4.setClickable(false);
			
		}
		
		if(player1_role.equals("MANTRI")){
			turn_text.setText(player1_name + " will find the CHOR!");
		}
		if(player2_role.equals("MANTRI")){
			turn_text.setText(player2_name + " will find the CHOR!");
		}
		if(player3_role.equals("MANTRI")){
			turn_text.setText(player3_name + " will find the CHOR!");
		}
		if(player4_role.equals("MANTRI")){
			turn_text.setText(player4_name + " will find the CHOR!");
		}
		
		Log.v("AkhandBakar","#########" + btnPod1.getText());
		
		if(btnPod1.getText().equals("")){
			
			btnPod1.setOnClickListener(new OnClickListener() {
				
			
				public void onClick(View v) {
					// TODO Auto-generated method stub
					Log.v("AkhandBakar","#########" + player1);
					if(player1.equals("CHOR")){
					
						RajaMantri.guess = true;
						btnPod1.setBackgroundResource(R.drawable.podopen);
						btnPod1.setText("CHOR");
						
					}else{
						
						RajaMantri.guess = false;
						btnPod1.setBackgroundResource(R.drawable.podopen);
						btnPod1.setText("SIPAHI");
					}
					btnPod1.setClickable(false);
					btnPod2.setClickable(false);
					btnPod3.setClickable(false);
					btnPod4.setClickable(false);
					updateScore();
				}
			});
		}	
		
		
		Log.v("AkhandBakar","#########" + btnPod2.getText());
		if(btnPod2.getText().equals("")){
			
			btnPod2.setOnClickListener(new OnClickListener() {
				
				public void onClick(View v) {
					// TODO Auto-generated method stub
					Log.v("AkhandBakar","#########" + player2);
					if(player2.equals("CHOR")){
					
						RajaMantri.guess = true;
						btnPod2.setBackgroundResource(R.drawable.podopen);
						btnPod2.setText("CHOR");
					}else{
						
						RajaMantri.guess = false;
						btnPod2.setBackgroundResource(R.drawable.podopen);
						btnPod2.setText("SIPAHI");
						
					}
					btnPod1.setClickable(false);
					btnPod2.setClickable(false);
					btnPod3.setClickable(false);
					btnPod4.setClickable(false);
					updateScore();
				}
			});
		}	
    	
		Log.v("AkhandBakar","#########" + btnPod3.getText());
		if(btnPod3.getText().equals("")){
			
			btnPod3.setOnClickListener(new OnClickListener() {
				
				
				public void onClick(View v) {
					// TODO Auto-generated method stub
					Log.v("AkhandBakar","#########" + player3);
					if(player3.equals("CHOR")){
					
						RajaMantri.guess = true;
						btnPod3.setBackgroundResource(R.drawable.podopen);
						btnPod3.setText("CHOR");
					}else{
						
						RajaMantri.guess = false;
						btnPod3.setBackgroundResource(R.drawable.podopen);
						btnPod3.setText("SIPAHI");
						
					}
					btnPod1.setClickable(false);
					btnPod2.setClickable(false);
					btnPod3.setClickable(false);
					btnPod4.setClickable(false);
					updateScore();
				}
			});
		}
    	
		
		Log.v("AkhandBakar","#########" + btnPod4.getText());
		if(btnPod4.getText().equals("")){
			
			btnPod4.setOnClickListener(new OnClickListener() {
				
			
				public void onClick(View v) {
					// TODO Auto-generated method stub
					Log.v("AkhandBakar","#########" + player4);
					if(player4.equals("CHOR")){
					
						RajaMantri.guess = true;
						btnPod4.setBackgroundResource(R.drawable.podopen);
						btnPod4.setText("CHOR");
					}else{
						
						RajaMantri.guess = false;
						btnPod4.setBackgroundResource(R.drawable.podopen);
						btnPod4.setText("SIPAHI");
						
					}
					btnPod1.setClickable(false);
					btnPod2.setClickable(false);
					btnPod3.setClickable(false);
					btnPod4.setClickable(false);
					updateScore();
				}
			});
		}
		
    }
    
    
    public void shuffle(){
    	
    	play_button.setText("Guess");
			play_button.setClickable(false);
			shuffleArray(solutionArray);
			turn_text.setText(player1_name + "'s" + " turn!");
			next_turn = player2_name;
			btnPod1 = (Button)findViewById(R.id.btnPod1);
			btnPod1.setBackgroundResource(R.drawable.podtlclosed);
			btnPod1.setOnClickListener(new OnClickListener() {
				
				public void onClick(View v) {
					// TODO Auto-generated method stub
					player1 = solutionArray[0];
					btnPod1.setText(player1);
					btnPod1.setBackgroundResource(R.drawable.podopen);
					btnPod2.setClickable(false);
					btnPod3.setClickable(false);
					btnPod4.setClickable(false);
					if(turn_text.getText().equals(player1_name + "'s" + " turn!")){
						
						if(player1.equals("MANTRI")){
							
							player1_role = "MANTRI";
						}
						if(player1.equals("RAJA")){
							
							player1_role = "RAJA";
						}
						if(player1.equals("SIPAHI")){

							player1_role = "SIPAHI";
						}
						if(player1.equals("CHOR")){
							
							player1_role = "CHOR";
						}
				    	

						next_turn = player2_name + "'s" + " turn!";
						
					}
					if(turn_text.getText().equals(player2_name + "'s" + " turn!")){
						
						if(player1.equals("MANTRI")){
							
							player2_role = "MANTRI";
						}
						if(player1.equals("RAJA")){
							
							player2_role = "RAJA";
						}
						if(player1.equals("SIPAHI")){

							player2_role = "SIPAHI";
						}
						if(player1.equals("CHOR")){
							
							player2_role = "CHOR";
						}
				    	
						next_turn = player3_name + "'s" + " turn!";
						
					}
					if(turn_text.getText().equals(player3_name + "'s" + " turn!")){
						
						if(player1.equals("MANTRI")){
							
							player3_role = "MANTRI";
						}
						if(player1.equals("RAJA")){
							
							player3_role = "RAJA";
						}
						if(player1.equals("SIPAHI")){

							player3_role = "SIPAHI";
						}
						if(player1.equals("CHOR")){
							
							player3_role = "CHOR";
						}
				    	
						next_turn = player4_name + "'s" + " turn!";
						
					}
					
					if(turn_text.getText().equals(player4_name + "'s" + " turn!")){
						
						if(player1.equals("MANTRI")){
							
							player4_role = "MANTRI";
						}
						if(player1.equals("RAJA")){
							
							player4_role = "RAJA";
						}
						if(player1.equals("SIPAHI")){

							player4_role = "SIPAHI";
						}
						if(player1.equals("CHOR")){
							
							player4_role = "CHOR";
						}
				    	
						
						next_turn = "Click on Guess!";
						
					}
					
					turn_text.setText("Click again to close the chit!");
				
					
					
					btnPod1.setOnClickListener(new OnClickListener() {
						
						public void onClick(View v) {
							// TODO Auto-generated method stub
							btnPod1.setClickable(false);
							count++;
							btnPod1.setText("");
							btnPod1.setBackgroundResource(R.drawable.podtlhalf);
							turn_text.setText(next_turn);
							btnPod2.setClickable(true);
							btnPod3.setClickable(true);
							btnPod4.setClickable(true);
							if(count == 4){
								
								turn_text.setText("Click on Guess!");
								play_button.setClickable(true);
								count = 0;
								
							}
						}
					});
				}
			});
			
			btnPod2 = (Button)findViewById(R.id.btnPod2);
			btnPod2.setBackgroundResource(R.drawable.podtrclosed);
			btnPod2.setOnClickListener(new OnClickListener() {
					
					public void onClick(View v) {
						// TODO Auto-generated method stub
						player2 = solutionArray[1];
						btnPod2.setText(player2);
						btnPod2.setBackgroundResource(R.drawable.podopen);
						btnPod1.setClickable(false);
						btnPod3.setClickable(false);
						btnPod4.setClickable(false);
						if(turn_text.getText().equals(player1_name + "'s" + " turn!")){
							
							if(player2.equals("MANTRI")){
								
								player1_role = "MANTRI";
							}
							if(player2.equals("RAJA")){
								
								player1_role = "RAJA";
							}
							if(player2.equals("SIPAHI")){

								player1_role = "SIPAHI";
							}
							if(player2.equals("CHOR")){
								
								player1_role = "CHOR";
							}
					    	
							next_turn = player2_name+ "'s" + " turn!";
							
						}
						if(turn_text.getText().equals(player2_name + "'s" + " turn!")){
							
							if(player2.equals("MANTRI")){
								
								player2_role = "MANTRI";
							}
							if(player2.equals("RAJA")){
								
								player2_role = "RAJA";
							}
							if(player2.equals("SIPAHI")){

								player2_role = "SIPAHI";
							}
							if(player2.equals("CHOR")){
								
								player2_role = "CHOR";
							}
					    	
							next_turn = player3_name+ "'s" + " turn!";
							
						}
						if(turn_text.getText().equals(player3_name + "'s" + " turn!")){
							
							if(player2.equals("MANTRI")){
								
								player3_role = "MANTRI";
							}
							if(player2.equals("RAJA")){
								
								player3_role = "RAJA";
							}
							if(player2.equals("SIPAHI")){

								player3_role = "SIPAHI";
							}
							if(player2.equals("CHOR")){
								
								player3_role = "CHOR";
							}
					    	
							next_turn = player4_name+ "'s" + " turn!";
							
						}
						if(turn_text.getText().equals(player4_name + "'s" + " turn!")){
							
							if(player2.equals("MANTRI")){
								
								player4_role = "MANTRI";
							}
							if(player2.equals("RAJA")){
								
								player4_role = "RAJA";
							}
							if(player2.equals("SIPAHI")){

								player4_role = "SIPAHI";
							}
							if(player2.equals("CHOR")){
								
								player4_role = "CHOR";
							}
					    	
							next_turn = "Click on Guess!";
							
						}
						turn_text.setText("Click again to close the chit!");
						btnPod2.setOnClickListener(new OnClickListener() {
							
							public void onClick(View v) {
								// TODO Auto-generated method stub
								btnPod2.setClickable(false);
								count++;
								btnPod2.setText("");
								btnPod2.setBackgroundResource(R.drawable.podtrhalf);
								turn_text.setText(next_turn);
								btnPod1.setClickable(true);
								btnPod3.setClickable(true);
								btnPod4.setClickable(true);
								if(count == 4){
									
									turn_text.setText("Click on Guess!");
									play_button.setClickable(true);
									count = 0;
									
								}
							}
						});
					}
				});
		        
		        
			btnPod3 = (Button)findViewById(R.id.btnPod3);
			btnPod3.setBackgroundResource(R.drawable.podblclosed);
			btnPod3.setOnClickListener(new OnClickListener() {
					
					public void onClick(View v) {
						// TODO Auto-generated method stub
						player3 = solutionArray[2];
						btnPod3.setText(player3);
						btnPod3.setBackgroundResource(R.drawable.podopen);

						btnPod2.setClickable(false);
						btnPod1.setClickable(false);
						btnPod4.setClickable(false);
						if(turn_text.getText().equals(player1_name + "'s" + " turn!")){
							
							if(player3.equals("MANTRI")){
								
								player1_role = "MANTRI";
							}
							if(player3.equals("RAJA")){
								
								player1_role = "RAJA";
							}
							if(player3.equals("SIPAHI")){

								player1_role = "SIPAHI";
							}
							if(player3.equals("CHOR")){
								
								player1_role = "CHOR";
							}
					    	
							next_turn = player2_name+ "'s" + " turn!";
							
						}
						if(turn_text.getText().equals(player2_name + "'s" + " turn!")){
							
							if(player3.equals("MANTRI")){
								
								player2_role = "MANTRI";
							}
							if(player3.equals("RAJA")){
								
								player2_role = "RAJA";
							}
							if(player3.equals("SIPAHI")){

								player2_role = "SIPAHI";
							}
							if(player3.equals("CHOR")){
								
								player2_role = "CHOR";
							}
					    	
							next_turn = player3_name+ "'s" + " turn!";
							
						}
						if(turn_text.getText().equals(player3_name + "'s" + " turn!")){
							
							if(player3.equals("MANTRI")){
								
								player3_role = "MANTRI";
							}
							if(player3.equals("RAJA")){
								
								player3_role = "RAJA";
							}
							if(player3.equals("SIPAHI")){

								player3_role = "SIPAHI";
							}
							if(player3.equals("CHOR")){
								
								player3_role = "CHOR";
							}
							next_turn = player4_name+ "'s" + " turn!";
							
						}
						if(turn_text.getText().equals(player4_name + "'s" + " turn!")){
							
							if(player3.equals("MANTRI")){
								
								player4_role = "MANTRI";
							}
							if(player3.equals("RAJA")){
								
								player4_role = "RAJA";
							}
							if(player3.equals("SIPAHI")){

								player4_role = "SIPAHI";
							}
							if(player3.equals("CHOR")){
								
								player4_role = "CHOR";
							}
							next_turn = "Click on Guess!";
							
						}

						turn_text.setText("Click again to close the chit!");
						btnPod3.setOnClickListener(new OnClickListener() {
							
							public void onClick(View v) {
								// TODO Auto-generated method stub
								btnPod3.setClickable(false);
								count++;
								btnPod3.setText("");
								btnPod3.setBackgroundResource(R.drawable.podblhalf);
								turn_text.setText(next_turn);
								btnPod2.setClickable(true);
								btnPod1.setClickable(true);
								btnPod4.setClickable(true);
								if(count == 4){
									
									turn_text.setText("Click on Guess!");
									play_button.setClickable(true);
									count = 0;
									
								}
							}
						});
					}
				});
		     
			
			
			
			btnPod4 = (Button)findViewById(R.id.btnPod4);
			btnPod4.setBackgroundResource(R.drawable.podbrclosed);
			
			btnPod4.setOnClickListener(new OnClickListener() {
					
					public void onClick(View v) {
						// TODO Auto-generated method stub
						player4 = solutionArray[3];
						btnPod4.setText(player4);
						btnPod4.setBackgroundResource(R.drawable.podopen);
						

						btnPod2.setClickable(false);
						btnPod3.setClickable(false);
						btnPod1.setClickable(false);
						if(turn_text.getText().equals(player1_name + "'s" + " turn!")){
							
							if(player4.equals("MANTRI")){
								
								player1_role = "MANTRI";
							}
							if(player4.equals("RAJA")){
								
								player1_role = "RAJA";
							}
							if(player4.equals("SIPAHI")){

								player1_role = "SIPAHI";
							}
							if(player4.equals("CHOR")){
								
								player1_role = "CHOR";
							}
							next_turn = player2_name+ "'s" + " turn!";
							
						}
						if(turn_text.getText().equals(player2_name + "'s" + " turn!")){
							
							if(player4.equals("MANTRI")){
								
								player2_role = "MANTRI";
							}
							if(player4.equals("RAJA")){
								
								player2_role = "RAJA";
							}
							if(player4.equals("SIPAHI")){

								player2_role = "SIPAHI";
							}
							if(player4.equals("CHOR")){
								
								player2_role = "CHOR";
							}
							next_turn = player3_name+ "'s" + " turn!";
							
						}
						if(turn_text.getText().equals(player3_name + "'s" + " turn!")){
							
							if(player4.equals("MANTRI")){
								
								player3_role = "MANTRI";
							}
							if(player4.equals("RAJA")){
								
								player3_role = "RAJA";
							}
							if(player4.equals("SIPAHI")){

								player3_role = "SIPAHI";
							}
							if(player4.equals("CHOR")){
								
								player3_role = "CHOR";
							}
							next_turn = player4_name+ "'s" + " turn!";
							
						}
						if(turn_text.getText().equals(player4_name + "'s" + " turn!")){
							
							if(player4.equals("MANTRI")){
								
								player4_role = "MANTRI";
							}
							if(player4.equals("RAJA")){
								
								player4_role = "RAJA";
							}
							if(player4.equals("SIPAHI")){

								player4_role = "SIPAHI";
							}
							if(player4.equals("CHOR")){
								
								player4_role = "CHOR";
							}
							next_turn = "Click on Guess!";
							
						}
						
						turn_text.setText("Click again to close the chit!");
						btnPod4.setOnClickListener(new OnClickListener() {
							
							public void onClick(View v) {
								// TODO Auto-generated method stub
								btnPod4.setClickable(false);
								count++;
								btnPod4.setText("");
								btnPod4.setBackgroundResource(R.drawable.podbrhalf);
								turn_text.setText(next_turn);
								btnPod2.setClickable(true);
								btnPod3.setClickable(true);
								btnPod1.setClickable(true);
								if(count == 4){
									
									turn_text.setText(next_turn);
									play_button.setClickable(true);
									count = 0;
									
								}
							}
						});
					}
				});    
			
			btnPod1.setText("");
			btnPod2.setText("");
			btnPod3.setText("");
			btnPod4.setText("");
    	
    	
    }
    
    public void setRole(String role, String player){
    	
    	if(player1.equals("MANTRI")){
			
			player4_role = "MANTRI";
		}
		if(player1.equals("RAJA")){
			
			player4_role = "RAJA";
		}
		if(player1.equals("SIPAHI")){

			player4_role = "SIPAHI";
		}
		if(player1.equals("CHOR")){
			
			player4_role = "CHOR";
		}
    	
    	
    } 
    
    void shuffleArray(String[] solutionArray)
    {
    	Random rnd = new Random();
    	for (int i = solutionArray.length - 1; i >= 0; i--)
    		{
    			int index = rnd.nextInt(i + 1);
  
    			String a = solutionArray[index];
    			solutionArray[index] = solutionArray[i];
    			solutionArray[i] = a;
    		}
	}
    
    static void updateScore(){
    	
    	Log.v("AkhandBakar", "##########"+ guess);
    	if(player1_role.equals("MANTRI"))
    	{
    		Log.v("AkhandBakar", "##########Mantri"+ player1_name);
    	if(guess)
    		{
    		i = i+80;
    		p1score=i;
    		turn_text.setText(player1_name+" is right!");
    		btnPod1.setText(player1);
			btnPod2.setText(player2);
			btnPod3.setText(player3);
			btnPod4.setText(player4);
			btnPod1.setBackgroundResource(R.drawable.podopen);
			btnPod2.setBackgroundResource(R.drawable.podopen);
			btnPod3.setBackgroundResource(R.drawable.podopen);
			btnPod4.setBackgroundResource(R.drawable.podopen);
    		if(player2_role.equals("CHOR"))
    			{
    			p2score=j;
    			if(player3_role.equals("RAJA")){
    				
    				k = k+100;
    				l = l+50;
    				p3score=k;
    				p4score=l;
    			}else{
    				
    				l = l+100;
    				k = k+50;
    				p4score=l;
    				p3score=k;
    			}
    			}
    		if(player3_role.equals("CHOR"))
    			{
    			
    			p3score=k;
    			
    			
    			if(player2_role.equals("RAJA")){
    				
    				j = j+100;
    				l = l+50;
    				p2score=j;
    				p4score=l;
    			}else{
    				
    				l = l+100;
    				j = j+50;
    				p4score=l;
    				p2score=j;
    			}
    			}
    		if(player4_role.equals("CHOR"))
    			{
    			
    			p4score=l;
    			
    			if(player3_role.equals("RAJA")){
    				
    				k = k+100;
    				j = j+50;
    				p2score=j;
    				p3score=k;
    			}else{
    				
    				j = j+100;
    				k = k+50;
    				p3score=k;
    				p2score=j;
    			}
    			}
    		}
    	else
    		{
    		i=i-80;
    		p1score = i;
    		turn_text.setText(player1_name+" is wrong!");
    		btnPod1.setText(player1);
			btnPod2.setText(player2);
			btnPod3.setText(player3);
			btnPod4.setText(player4);
			btnPod1.setBackgroundResource(R.drawable.podopen);
			btnPod2.setBackgroundResource(R.drawable.podopen);
			btnPod3.setBackgroundResource(R.drawable.podopen);
			btnPod4.setBackgroundResource(R.drawable.podopen);
			if(player2_role.equals("CHOR"))
			{
				j = j+25;
			p2score=j;
			if(player3_role.equals("RAJA")){
				
				k = k+100;
				l = l+50;
				p3score=k;
				p4score=l;
			}else{
				
				l = l+100;
				k = k+50;
				p4score=l;
				p3score=k;
			}
			}
		if(player3_role.equals("CHOR"))
			{
			k=k+25;
			p3score=k;
			
			
			if(player2_role.equals("RAJA")){
				
				j = j+100;
				l = l+50;
				p2score=j;
				p4score=l;
			}else{
				
				l = l+100;
				j = j+50;
				p4score=l;
				p2score=j;
			}
			}
		if(player4_role.equals("CHOR"))
			{
			l=l+25;
			p4score=l;
			
			if(player3_role.equals("RAJA")){
				
				k = k+100;
				j = j+50;
				p2score=j;
				p3score=k;
			}else{
				
				j = j+100;
				k = k+50;
				p3score=k;
				p2score=j;
			}
			}
    		}

    	}
    if(player2_role.equals("MANTRI"))
    	{
    	if(guess)
    		{
    		Log.v("AkhandBakar", "##########Mantri"+ player2_name);
    		j = j+80;
    		p2score=j;
    		turn_text.setText(player2_name+" is right!");
    		btnPod1.setText(player1);
			btnPod2.setText(player2);
			btnPod3.setText(player3);
			btnPod4.setText(player4);
			btnPod1.setBackgroundResource(R.drawable.podopen);
			btnPod2.setBackgroundResource(R.drawable.podopen);
			btnPod3.setBackgroundResource(R.drawable.podopen);
			btnPod4.setBackgroundResource(R.drawable.podopen);
    		if(player1_role.equals("CHOR"))
    			{
    			p1score=i;
    			
    			if(player3_role.equals("RAJA")){
    			
    				k = k+100;
    				l = l+50;
    				p3score=k;
    				p4score=l;
    			
    			}else{
    				
    				l = l+100;
    				k = k+50;
    				p4score=l;
    				p3score=k;
    			}
    			
    			}
    		if(player3_role.equals("CHOR"))
    			{
    			
    			p3score=k;
    			
    			
    			if(player1_role.equals("RAJA")){
    				
    				i = i+100;
    				l = l+50;
    				p1score=i;
    				p4score=l;
    				
    			}else{
    				
    				l = l+100;
    				i = i+50;
    				p1score=i;
    				p4score=l;
    				
    			}
    			
    			}
    		if(player4_role.equals("CHOR"))
    			{
    			
    			p4score=l;
    			
    			if(player1_role.equals("RAJA")){
    				
    				i = i+100;
    				k = k+50;
    				p1score=i;
        			p3score=k;
    				
    			}else{
    				
    				k = k+100;
    				i = i+50;
    				p1score=i;
        			p3score=k;
    			
    			
    			}
    			
    			
    			}
    		}
    	else
    		{
    		 
    		j=j-80;
    		p2score = j;
    		turn_text.setText(player2_name+" is wrong!");
    		btnPod1.setText(player1);
			btnPod2.setText(player2);
			btnPod3.setText(player3);
			btnPod4.setText(player4);
			btnPod1.setBackgroundResource(R.drawable.podopen);
			btnPod2.setBackgroundResource(R.drawable.podopen);
			btnPod3.setBackgroundResource(R.drawable.podopen);
			btnPod4.setBackgroundResource(R.drawable.podopen);
			if(player1_role.equals("CHOR"))
			{
				i = i+25;
			p1score=i;
			
			if(player3_role.equals("RAJA")){
			
				k = k+100;
				l = l+50;
				p3score=k;
				p4score=l;
			
			}else{
				
				l = l+100;
				k = k+50;
				p4score=l;
				p3score=k;
			}
			
			}
		if(player3_role.equals("CHOR"))
			{
			k = k+25;
			p3score=k;
			
			
			if(player1_role.equals("RAJA")){
				
				i = i+100;
				l = l+50;
				p1score=i;
				p4score=l;
				
			}else{
				
				l = l+100;
				i = i+50;
				p1score=i;
				p4score=l;
				
			}
			
			}
		if(player4_role.equals("CHOR"))
			{
			l = l+25;
			p4score=l;
			
			if(player1_role.equals("RAJA")){
				
				i = i+100;
				k = k+50;
				p1score=i;
    			p3score=k;
				
			}else{
				
				k = k+100;
				i = i+50;
				p1score=i;
    			p3score=k;
			
			
			}
			
			
			}
    		}

    	}
    if(player3_role.equals("MANTRI"))
    	{
    	Log.v("AkhandBakar", "##########Mantri"+ player3_name);
    	if(guess)
    		{
    		k = k+80;
    		p3score = k;
    		turn_text.setText(player3_name+" is right!");
    		btnPod1.setText(player1);
			btnPod2.setText(player2);
			btnPod3.setText(player3);
			btnPod4.setText(player4);
			btnPod1.setBackgroundResource(R.drawable.podopen);
			btnPod2.setBackgroundResource(R.drawable.podopen);
			btnPod3.setBackgroundResource(R.drawable.podopen);
			btnPod4.setBackgroundResource(R.drawable.podopen);
    		if(player1_role.equals("CHOR"))
    			{
    			p1score=i;
    			
    			if(player2_role.equals("RAJA")){
    				
    				j = j+100;
    				l = l+50;
    				p2score=j;
        			p4score=l;
        			
    				
    			}else{
    				
    				l = l+100;
    				j = j+50;
    				p2score=j;
        			p4score=l;
    				
    				
    			}
    			
    			}
    		if(player2_role.equals("CHOR"))
    			{
    			
    			p2score=j;
    			
    			
    			if(player1_role.equals("RAJA")){
    				
    				i = i+100;
    				l = l+50;
    				p1score=i;
    				p4score=l;
    				
    			}else{
    				
    				i = i+50;
    				l = l+100;
    				p1score=i;
    				p4score=l;
    				
    			}
    			
    			}
    		if(player4_role.equals("CHOR"))
    			{
    			
    			p4score=l;
    			
    			if(player2_role.equals("RAJA")){
    				
    				j = j+100;
    				i = i+50;
    				p1score=i;
        			p2score=j;
    				
    			}else{
    				
    				j = j+50;
    				i = i+100;
    				p1score=i;
        			p2score=j;
    				
    			}
    			
    			
    			}
    		}
    	else
    		{
    		k = k-80;
    		p3score = k;
    		turn_text.setText(player3_name+" is wrong!");
    		btnPod1.setText(player1);
			btnPod2.setText(player2);
			btnPod3.setText(player3);
			btnPod4.setText(player4);
			btnPod1.setBackgroundResource(R.drawable.podopen);
			btnPod2.setBackgroundResource(R.drawable.podopen);
			btnPod3.setBackgroundResource(R.drawable.podopen);
			btnPod4.setBackgroundResource(R.drawable.podopen);
			if(player1_role.equals("CHOR"))
			{
				i = i+25;
			p1score=i;
			
			if(player2_role.equals("RAJA")){
				
				j = j+100;
				l = l+50;
				p2score=j;
    			p4score=l;
    			
				
			}else{
				
				l = l+100;
				j = j+50;
				p2score=j;
    			p4score=l;
				
				
			}
			
			}
		if(player2_role.equals("CHOR"))
			{
			j = j+25;
			p2score=j;
			
			
			if(player1_role.equals("RAJA")){
				
				i = i+100;
				l = l+50;
				p1score=i;
				p4score=l;
				
			}else{
				
				i = i+50;
				l = l+100;
				p1score=i;
				p4score=l;
				
			}
			
			}
		if(player4_role.equals("CHOR"))
			{
			l = l+25;
			p4score=l;
			
			if(player2_role.equals("RAJA")){
				
				j = j+100;
				i = i+50;
				p1score=i;
    			p2score=j;
				
			}else{
				
				j = j+50;
				i = i+100;
				p1score=i;
    			p2score=j;
				
			}
			
			
			}
    		}

    	}
    if(player4_role.equals("MANTRI"))
    	{
    	Log.v("AkhandBakar", "##########Mantri"+ player4_name);
    	if(guess)
    		{
    		l = l+80;
    		p4score=l;
    		turn_text.setText(player4_name+" is right!");
    		btnPod1.setText(player1);
			btnPod2.setText(player2);
			btnPod3.setText(player3);
			btnPod4.setText(player4);
			btnPod1.setBackgroundResource(R.drawable.podopen);
			btnPod2.setBackgroundResource(R.drawable.podopen);
			btnPod3.setBackgroundResource(R.drawable.podopen);
			btnPod4.setBackgroundResource(R.drawable.podopen);
    		if(player1_role.equals("CHOR"))
    			{
    			p1score=i;
    			
    			
    			if(player2_role.equals("RAJA")){
    				
    				j = j+100;
    				k = k+50;
    				p2score=j;
        			p3score=k;
    				
    			}else{
    				
    				j = j+50;
    				k = k+100;
    				p2score=j;
        			p3score=k;
    				
    			}
    			}
    		if(player2_role.equals("CHOR"))
    			{
    			
    			p2score=j;
    			
    			
    			if(player1_role.equals("RAJA")){
    				
    				i = i+100;
    				k = k+50;
    				p1score=i;
    				p3score=k;
    			}else{
    				
    				i = i+50;
    				k = k+100;
    				p1score=i;
    				p3score=k;
    				
    			}
    			
    			}
    		if(player3_role.equals("CHOR"))
    			{
    			
    			p3score=k;
    			
    			if(player1_role.equals("RAJA")){
    				
    				i = i+100;
    				j = j+50;
    				p1score=i;
        			p2score=j;
    			}else{
    				
    				i = i+50;
    				j = j+100;
    				p1score=i;
        			p2score=j;
    				
    			}
    			
    			
    			}
    		}
    	else
    		{
    		l = l-80;
    		p4score = l;
    		turn_text.setText(player4_name+" is wrong!");
    		btnPod1.setText(player1);
			btnPod2.setText(player2);
			btnPod3.setText(player3);
			btnPod4.setText(player4);
			btnPod1.setBackgroundResource(R.drawable.podopen);
			btnPod2.setBackgroundResource(R.drawable.podopen);
			btnPod3.setBackgroundResource(R.drawable.podopen);
			btnPod4.setBackgroundResource(R.drawable.podopen);
			if(player1_role.equals("CHOR"))
			{
				i = i+25;
			    p1score=i;

			    if(player2_role.equals("RAJA")){
			 	    j = j+100;
				    k = k+50;
				    p2score=j;
    			    p3score=k;
				
		    	}else{
				    j = j+50;
				    k = k+100;
				    p2score=j;
    			    p3score=k;
			    }
			}
	        if(player2_role.equals("CHOR"))
			{
			    j=j+25;
			    p2score=j;

			    if(player1_role.equals("RAJA")){
				    i = i+100;
				    k = k+50;
				    p1score=i;
				    p3score=k;
			    }else{
				    i = i+50;
				    k = k+100;
				    p1score=i;
				    p3score=k;
			    }
			}
		    if(player3_role.equals("CHOR"))
			{
			    k=k+25;
			    p3score=k;
			    if(player1_role.equals("RAJA")){
				    i = i+100;
				    j = j+50;
				    p1score=i;
    			    p2score=j;
			        }else{
				        i = i+50;
				        j = j+100;
				        p1score=i;
    			        p2score=j;
			        }
			    }
    		}

    	}

        Log.v("AkhandBakar", "##########Score "+ i);
	    txtPlayer1.setText("1."+ player1_name + " [" + i + "]");
	    Log.v("AkhandBakar", player1 + " [" + i + "]");

	    txtPlayer2.setText("2." + player2_name+ " [" + j + "]");

	    Log.v("AkhandBakar", player2 + " [" + p2score + "]");

	    txtPlayer3.setText("3." + player3_name+ " [" + k + "]");
	    Log.v("AkhandBakar", player3 + " [" + p3score + "]");

	    txtPlayer4.setText("4."+player4_name+ " [" + l + "]");
	    Log.v("AkhandBakar", player4 + " [" + p4score + "]");
    }
}