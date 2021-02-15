package gleb.first_app.mytwoandroidproject;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentTransaction;

import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
    public void FragmentChange(View v) {
        FragmentManager fm = getSupportFragmentManager();
        FragmentTransaction ft = fm.beginTransaction();
        switch(v.getId()){
            case R.id.fr_1:
                InfoFragment info_fragment = new InfoFragment();
                ft.replace(R.id.fragment, info_fragment);
                break;
            case R.id.fr_2:
                SecondFragment second_fragment = new SecondFragment();
                ft.replace(R.id.fragment, second_fragment);
                break;
        }
        ft.commit();
    }
}