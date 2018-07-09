package melanyportfolio.melanyapps.com.melanyportfolio.view;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import melanyportfolio.melanyapps.com.melanyportfolio.R;

public class WorkFragment extends Fragment {

    public WorkFragment() {
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View workView = inflater.inflate(R.layout.fragment_work, container, false);
        return workView;
    }

}
