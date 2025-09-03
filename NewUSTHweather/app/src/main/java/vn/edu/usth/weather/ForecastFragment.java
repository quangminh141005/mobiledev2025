package vn.edu.usth.weather;

import android.os.Bundle;
import androidx.fragment.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;

public class ForecastFragment extends Fragment{
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_forecast1, container, false);

        Button button = view.findViewById(R.id.btnGoSecond);
        button.setOnClickListener(v -> {
            getParentFragmentManager().beginTransaction()
                    .replace(R.id.fragment_container, new ForecastFragment())
                    .addToBackStack(null)
                    .commit();
        });

        return view;
    }
}
