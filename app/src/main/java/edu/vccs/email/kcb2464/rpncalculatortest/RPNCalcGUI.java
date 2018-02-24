package edu.vccs.email.kcb2464.rpncalculatortest;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class RPNCalcGUI extends AppCompatActivity {

    private RPNCalcGUIHelper helper = new RPNCalcGUIHelper();

    private Button m7Button;
    private Button m8Button;
    private Button m9Button;
    private Button mPiButton;
    private Button mFSlashButton;
    private Button m4Button;
    private Button m5Button;
    private Button m6Button;
    private Button mBlankButton;
    private Button mStarButton;
    private Button m1Button;
    private Button m2Button;
    private Button m3Button;
    private Button mBackButton;
    private Button mSubButton;
    private Button m0Button;
    private Button mDecButton;
    private Button mSignButton;
    private Button mEnterButton;
    private Button mPlusButton;

//          { "7", "8", "9", "pi", "/",
//            "4", "5", "6", " ", "*",
//            "1", "2", "3", "<", "-",
//            "0", ".", "+/-", "^", "+" }

    private TextView mDisplayView;

    private TextView updateDisplayView() {
        return null;
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_rpn);

        m7Button = (Button) findViewById(R.id.m7Button);
        m7Button.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View view) {
                //mDisplayView.setText(m7Button.getText());
            }
        });

        m8Button = (Button) findViewById(R.id.m8Button);
        m8Button.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View view) {

            }
        });

        m9Button = (Button) findViewById(R.id.m9Button);
        m9Button.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View view) {

            }
        });

        mPiButton = (Button) findViewById(R.id.mPiButton);
        mPiButton.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View view) {

            }
        });

        mFSlashButton = (Button) findViewById(R.id.mFSlashButton);
        mFSlashButton.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View view) {

            }
        });

        m4Button = (Button) findViewById(R.id.m4Button);
        m4Button.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View view) {

            }
        });

        m5Button = (Button) findViewById(R.id.m5Button);
        m5Button.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View view) {

            }
        });

        m6Button = (Button) findViewById(R.id.m6Button);
        m6Button.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View view) {

            }
        });

        mBlankButton = (Button) findViewById(R.id.mBlankButton);
        mBlankButton.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View view) {

            }
        });

        mStarButton = (Button) findViewById(R.id.mStarButton);
        mStarButton.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View view) {

            }
        });

        m1Button = (Button) findViewById(R.id.m1Button);
        m1Button.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View view) {

            }
        });

        m2Button = (Button) findViewById(R.id.m2Button);
        m2Button.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View view) {

            }
        });

        m3Button = (Button) findViewById(R.id.m3Button);
        m3Button.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View view) {

            }
        });

        mBackButton = (Button) findViewById(R.id.mBackButton);
        mBackButton.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View view) {

            }
        });

        mSubButton = (Button) findViewById(R.id.mSubButton);
        mSubButton.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View view) {

            }
        });

        m0Button = (Button) findViewById(R.id.m0Button);
        m0Button.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View view) {

            }
        });

        mDecButton = (Button) findViewById(R.id.mDecButton);
        mDecButton.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View view) {

            }
        });

        mSignButton = (Button) findViewById(R.id.mSignButton);
        mSignButton.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View view) {

            }
        });

        mEnterButton = (Button) findViewById(R.id.mEnterButton);
        mEnterButton.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View view) {

            }
        });

        mPlusButton = (Button) findViewById(R.id.mPlusButton);
        mPlusButton.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View view) {

            }
        });

    }
}
