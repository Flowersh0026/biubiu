package tests;

import android.test.ActivityInstrumentationTestCase2;
import android.widget.TextView;

import com.example.yuw248.bilibili.MainActivity;
import com.example.yuw248.bilibili.R;

/**
 * Created by yuw248 on 4/13/2016.
 */
public class JUnit_test extends ActivityInstrumentationTestCase2<MainActivity> {

    MainActivity mainActivity;
    public JUnit_test() {

        super(MainActivity.class);
    }

    public void test_first() {
        mainActivity = getActivity();

        TextView textView;
        textView = (TextView) mainActivity.findViewById(R.id.tv1);
        String tester = textView.getText().toString();

        assertEquals("Hello World !",tester);
    }

}
