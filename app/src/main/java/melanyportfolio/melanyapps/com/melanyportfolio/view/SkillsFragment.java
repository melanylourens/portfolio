package melanyportfolio.melanyapps.com.melanyportfolio.view;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import melanyportfolio.melanyapps.com.melanyportfolio.R;

public class SkillsFragment extends Fragment {

    public SkillsFragment() {
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View skillsView = inflater.inflate(R.layout.fragment_skills, container, false);
        return skillsView;
    }

}
