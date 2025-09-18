package vn.edu.usth.weather;

import android.os.Bundle;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentTransaction;
import androidx.viewpager2.widget.ViewPager2;

import android.util.Log;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_main);
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            return insets;
        });

        ViewPager2 viewPager = findViewById(R.id.viewpager);
        PageAdapter adapter = new PageAdapter(this);
        viewPager.setAdapter(adapter);

        Log.i(TAG, "activity created");
    }

    private static final String TAG = "USTH Weather App";
    @Override
    protected void onStart() {
        super.onStart();
        Log.i(TAG, "Activity started");
    }

    @Override
    protected void onResume() {
        super.onResume();
        Log.i(TAG, "Actitvity resumed");
    }

    @Override
    protected void onPause() {
        super.onPause();
        Log.i(TAG, "Activity paused");
    }

    @Override
    protected void onStop() {
        super.onStop();
        Log.i(TAG, "Activity stopped");
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        Log.i(TAG, "Activity destroyed");
    }

}