package hu.mark.dobo.sqat_project;

import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        this.initOnClickListeners();
    }

    protected void initOnClickListeners() {
        StringTransform transform = new StringTransform("yb5loo");
        // static inputs
        EditText editText = (EditText) findViewById(R.id.editText);
        TextView textView = (TextView) findViewById(R.id.textView);

        ((Button) findViewById(R.id.button1)).setOnClickListener(new Button.OnClickListener() {
            @Override
            public void onClick(View v) {
                // button 1 actions
                textView.setText(transform.charTranslate(editText.getText().toString()));
            }
        });

        ((Button) findViewById(R.id.button2)).setOnClickListener(new Button.OnClickListener() {
            @Override
            public void onClick(View v) {
                // button 2 actions
                textView.setText(transform.sumASCII(editText.getText().toString()));
            }
        });
    }
}