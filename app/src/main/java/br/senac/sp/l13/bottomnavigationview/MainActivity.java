package br.senac.sp.l13.bottomnavigationview;


import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.design.widget.BottomNavigationView;
import android.support.v7.app.AppCompatActivity;
import android.view.MenuItem;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity implements BottomNavigationView.OnNavigationItemSelectedListener {

    BottomNavigationView bottomNavigationView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        bottomNavigationView = (BottomNavigationView) findViewById(R.id.bttNav);
        bottomNavigationView.setOnNavigationItemSelectedListener(this);
    }

    @Override
    public boolean onNavigationItemSelected(@NonNull MenuItem item) {
        switch (item.getItemId()) {
            case R.id.nav_favoritos:
                Toast.makeText(getApplicationContext(), "Cliquei em favoritos", Toast.LENGTH_SHORT).show();
                break;
            case R.id.nav_audio:
                Toast.makeText(getApplicationContext(), "Cliquei em audio", Toast.LENGTH_SHORT).show();
                break;
            case R.id.nav_access:
                Toast.makeText(getApplicationContext(), "Cliquei em hora", Toast.LENGTH_SHORT).show();
                break;
        }

        return false;
    }


}
