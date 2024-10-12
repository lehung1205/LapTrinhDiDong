package dayhocstem.com.baitapcanhan.order;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentStatePagerAdapter;

import dayhocstem.com.baitapcanhan.fragment.AccountFragment;
import dayhocstem.com.baitapcanhan.fragment.MenuFragment;
import dayhocstem.com.baitapcanhan.fragment.SettingFragment;

public class OrderViewPagerAdapter extends FragmentStatePagerAdapter {


    public OrderViewPagerAdapter(@NonNull FragmentManager fm, int behavior) {
        super(fm, behavior);
    }

    @NonNull
    @Override
    public Fragment getItem(int position) {
        switch (position){
            case 0 :
                return new Tab1Fragment();
            case 1 :
                return new Tab2Fragment();
            case 2 :
                return new Tab3Fragment();
            default:
                return new Tab1Fragment();
        }
    }

    @Override
    public int getCount() {
        return 3;
    }

    @Nullable
    @Override
    public CharSequence getPageTitle(int position) {
        switch (position){
            case 0:
                return "Tên";
            case 1:
                return "MSV";
            case 2:
                return "Lớp";
            default:
                return "Tên";
        }
    }
}
