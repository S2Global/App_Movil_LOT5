package montero.app_movil_lot5.Fragments;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import montero.app_movil_lot5.R;

/**
 * A simple {@link Fragment} subclass.
 */
public class RollingRulesFragment extends Fragment {


    public RollingRulesFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_rolling_rules, container, false);
    }

}
