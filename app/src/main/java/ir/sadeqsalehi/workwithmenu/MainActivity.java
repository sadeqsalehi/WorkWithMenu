package ir.sadeqsalehi.workwithmenu;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    TextView tvMessage;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        tvMessage = findViewById(R.id.tv_Message);
        //options menu
        // 1 - Programmatically
        // 2 - Resource menu file

    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        /*MenuInflater menuInflater = new MenuInflater(getApplicationContext());
        menuInflater.inflate(R.menu.menu_main,menu); */
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return super.onCreateOptionsMenu(menu);
    }

    public void onMenuClick(MenuItem item) {

        switch (item.getItemId()) {
            case R.id.mnuSearch:
                tvMessage.setText("Search Item Clicked");
                break;
            case R.id.mnuFirst:
                tvMessage.setText("First Item Clicked");
                break;
            case R.id.mnuSecond:
                tvMessage.setText("Second Item Clicked");
                break;
            case R.id.mnuFirstSub:
                tvMessage.setText("First  Sub Item Clicked");
                break;
            case R.id.mnuSecondSub:
                tvMessage.setText("Second Sub Item Clicked");
                break;

            default:
                break;
        }
    }
}
