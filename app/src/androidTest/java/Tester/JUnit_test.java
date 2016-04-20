package Tester;

import android.test.ActivityInstrumentationTestCase2;
import android.widget.TextView;

import com.example.saantoni.screwthislab.MainActivity;
import com.example.saantoni.screwthislab.R;

/**
 * Created by saantoni on 4/19/2016.
 */
public class JUnit_test extends ActivityInstrumentationTestCase2<MainActivity> {

        MainActivity mainActivity;

        public JUnit_test(){
            super(MainActivity.class);
        }

        public void test_first() {
            mainActivity = getActivity();
            TextView textView = (TextView) mainActivity.findViewById(R.id.textView2);

            String tester = textView.getText().toString();
            int number = Integer.parseInt(tester);

            assertEquals(10,number);
        }


}
