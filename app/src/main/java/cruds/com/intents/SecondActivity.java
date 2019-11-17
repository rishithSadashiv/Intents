package cruds.com.intents;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class SecondActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);

        if (getIntent().hasExtra("SOMETHING"))
        {
            TextView tv = findViewById(R.id.textView);
            String string = getIntent().getExtras().getString("SOMETHING");
            tv.setText(string);
        }
    }
}
