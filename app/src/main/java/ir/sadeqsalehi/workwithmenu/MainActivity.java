package ir.sadeqsalehi.workwithmenu;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.Menu;
import android.view.MenuItem;
import android.view.SubMenu;
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
        //روش اول
        /*MenuInflater menuInflater = new MenuInflater(getApplicationContext());
        menuInflater.inflate(R.menu.menu_main,menu); */
        //روش دوم
        /* getMenuInflater().inflate(R.menu.menu_main, menu);*/
        //روش سوم
        //در این روش بدون استفاده از فایل xml قابلیت ایجاد منو وجود دارد
        MenuItem searchItem = menu.add("Search");
        searchItem.setShowAsAction(MenuItem.SHOW_AS_ACTION_ALWAYS);
        searchItem.setIcon(android.R.drawable.ic_menu_search);
        searchItem.setOnMenuItemClickListener(new MenuItem.OnMenuItemClickListener() {
            @Override
            public boolean onMenuItemClick(MenuItem item) {
                tvMessage.setText("Search Item Clicked");
                return false;
            }
        });
        menu.add("Option 1");
        menu.add("Option 2");
        SubMenu subMenu = menu.addSubMenu("Options 3");
        subMenu.add("Option 3 Sub 1");
        subMenu.add("Option 3 Sub 2");
        return super.onCreateOptionsMenu(menu);
    }

    //First method to handle the Click Event
 /*
    public void onMenuClick(MenuItem item) {
      Toast.makeText(this, (String.format("%s Clicked", item.getTitle())), Toast.LENGTH_SHORT).show();
    }
  */
    //Second method to handle the Click Event
//در این روش دیگر نیازی به نوشتن دستور در فایل xml ندارد و مستقیما این متد را می نویسیم
    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        switch (item.getItemId()) {
            case R.id.mnuSearch:
                tvMessage.setText("Saearch Item Clicked");
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
        return super.onOptionsItemSelected(item);
    }
}
