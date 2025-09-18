package vn.edu.usth.weather;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;


import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

public class WeatherAndForecastFragment extends Fragment{

    private static final String ARG_TEXT = "arg_text";

    public static WeatherAndForecastFragment newInstance(String text) {
        WeatherAndForecastFragment fragment = new WeatherAndForecastFragment();
        Bundle args = new Bundle();
        args.putString(ARG_TEXT, text);
        fragment.setArguments(args);
        return fragment;
    }

    @Nullable
    @Override
    public View onCreateView(
            LayoutInflater inflater,
            @Nullable ViewGroup container,
            @Nullable Bundle savedInstanceState
    ) {
        View view = (inflater.inflate(R.layout.fragment_weatherandforecast, container, false));
        return view;
    }
}
