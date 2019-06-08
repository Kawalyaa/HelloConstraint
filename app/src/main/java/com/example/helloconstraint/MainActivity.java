package com.example.helloconstraint;

import android.graphics.Color;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

import static android.graphics.Color.blue;
import static android.graphics.Color.rgb;

public class MainActivity extends AppCompatActivity {

    private int mCount = 0;
    private TextView mShowCount;
    // private Color red;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        mShowCount = (TextView) findViewById(R.id.show_count);
    }

    public void showToast(View view) {
        // Supply the context of the app Activity using shortcut "this"
        // Supply the message to display and duration length_short

        Toast toast = Toast.makeText(this, R.string.toast_message, Toast.LENGTH_SHORT);

        //Show the Toast by calling show()
        toast.show();
    }

    public void countUp(View view) {
        // change the color of zero button to dark red
       Button buttonZero = findViewById(R.id.button_zero);
       buttonZero.setBackgroundColor(rgb(102,0,0));
       
        mCount++;

        // use the variable >mShowCount to set the text in the TextView
        if (mShowCount != null)
            if (mCount % 2 == 0) {
                // change button color to green if mCount is even
                view.setBackgroundColor(Color.GREEN);
                mShowCount.setText(Integer.toString(mCount));
            }

            else {
                // change button color to red if mCount is odd
                view.setBackgroundColor(Color.RED);
                mShowCount.setText(Integer.toString(mCount));
            }

    }

    public void showZero(View view){
        // sets showCount to zero when clicked
        if (mShowCount != null)
            mCount = 0;
            mShowCount.setText(Integer.toString(mCount));


    }

}
