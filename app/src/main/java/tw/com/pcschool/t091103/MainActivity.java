package tw.com.pcschool.t091103;

import android.app.FragmentTransaction;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
    public void click1(View v)
    {
        FragmentTransaction ft = getFragmentManager().beginTransaction();

        ft.replace(R.id.my_frag_layout, new FragmentA());
        ft.commit();

    }
    public void click2(View v)
    {
        FragmentTransaction ft = getFragmentManager().beginTransaction();
        ft.replace(R.id.my_frag_layout, new FragmentB());
        ft.commit();
    }
}
