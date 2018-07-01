package com.example.android.codeiq;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.Toast;

public class quiz extends AppCompatActivity {

    // Initialize score, Str1(passes the score as a string) and name.
    int score = 0;
    String strI;
    String name;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_quiz);

        //Find editText View that collects the name from user
       final EditText txtname = (EditText)findViewById(R.id.editName);

        // Find the View that submits the question(Submit button)
        Button click = (Button) findViewById(R.id.submit);

        // Set a click listener on Submit button
        click.setOnClickListener(new View.OnClickListener() {
            // The code in this method will be executed when the numbers View is clicked on.
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getBaseContext(), Score.class);
                intent.putExtra("MY_INTENT", strI = Integer.toString(score));
                intent.putExtra("USERNAME", name = txtname.getText().toString());
                startActivity(intent);
            }
        });

    }


    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_quiz, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }


    //Checks if correct answer is clicked for question 1
    //Adds 25 to the score variable if correct answer is clicked
    public void onRadioButtonClick(View viewGroup1) {

        boolean checked = ((RadioButton) viewGroup1).isChecked();

        switch (viewGroup1.getId()) {

            case R.id.button1:
                if (checked)
                    score = score + 25;
                break;
        }
    }

    //Checks if correct answer is clicked for question 2
    //Adds 25 to the score variable if correct answer is clicked
    public void onRadioButtonClick2(View viewGroup2) {
        boolean checked1 = ((RadioButton) viewGroup2).isChecked();
        switch (viewGroup2.getId()) {
            case R.id.button2B:
                if (checked1)
                    score = score + 25;
                break;
        }
    }

    //Checks if correct answer is clicked for question 3
    //Adds 25 to the score variable if correct answer is clicked
    public void onRadioButtonClick3(View viewGroup3) {
        boolean checked3 = ((RadioButton) viewGroup3).isChecked();
        switch (viewGroup3.getId()) {
            case R.id.button1C:
                if (checked3)
                    score = score + 25;
                break;
        }
    }

    //Checks if correct answer is clicked for question 4
    //Adds 25 to the score variable if correct answer is clicked
    public void onRadioButtonClick4(View viewGroup4){
        boolean checked4 = ((RadioButton) viewGroup4).isChecked();
        switch (viewGroup4.getId()){
            case R.id.button3D:
                if(checked4)
                    score = score + 25;
                break;

            }

        }



    //Displays Toast Message if Yes checkbox is clicked
    public void toastMessage(View view){
        //Finds checkbox view
        CheckBox yesClick = (CheckBox) findViewById(R.id.yes_checkbox);
        if (yesClick.isChecked()){
            Toast.makeText(this,
                    "You'll receive emails from CodePlanet!", Toast.LENGTH_SHORT).show();
        }
    }
}




