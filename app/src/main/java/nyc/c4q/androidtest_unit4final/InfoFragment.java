package nyc.c4q.androidtest_unit4final;

import android.app.Fragment;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.TextView;

/**
 * Created by justiceo on 1/9/18.
 */

public class InfoFragment extends Fragment {

    Button extraButton;
    TextView textView;


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {

        View v = inflater.inflate(R.layout.info_fragment, container, false);
        extraButton = v.findViewById(R.id.more_textView);
        extraButton.setOnClickListener() {
            textView.setVisibility(View.VISIBLE);
            extraButton.setVisibility(View.INVISIBLE);
        }
        ;

    }
}

        return v;
    }
}
