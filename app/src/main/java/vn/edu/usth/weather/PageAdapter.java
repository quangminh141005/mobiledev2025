package vn.edu.usth.weather;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;
import androidx.viewpager2.adapter.FragmentStateAdapter;

public class PageAdapter extends FragmentStateAdapter{

    private final String[] copys = {"copy1", "copy2", "copy3"};
    public PageAdapter(@NonNull FragmentActivity fa) {
        super(fa);
    }

    @NonNull
    @Override
    public Fragment createFragment(int position) {
        return WeatherAndForecastFragment.newInstance(copys[position]);
    }

    @Override
    public int getItemCount() {
        return copys.length;
    }
}

