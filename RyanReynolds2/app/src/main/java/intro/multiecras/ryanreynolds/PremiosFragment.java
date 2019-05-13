package intro.multiecras.ryanreynolds;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;


/**
 * A simple {@link Fragment} subclass.
 */
public class PremiosFragment extends Fragment {


    public PremiosFragment() {
        // É necessário um contrutor público vazio
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Expande o layout para este fragmento
        return inflater.inflate(R.layout.fragment_premios, container, false);
    }

}
