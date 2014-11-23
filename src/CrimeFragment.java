import android.os.Bundle;
import android.support.v4.app.Fragment;

import com.bignerdranch.android.criminalintent.Crime;


public class CrimeFragment extends Fragment {
    private Crime mCrime;
    
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        mCrime = new Crime();
    }
}
