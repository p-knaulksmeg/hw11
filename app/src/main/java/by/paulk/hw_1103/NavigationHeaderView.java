package by.paulk.hw_1103;

import android.graphics.Color;
import android.util.AttributeSet;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import android.content.Context;

import java.util.Random;

public class NavigationHeaderView extends LinearLayout {

    private ImageView userIcon;
    private TextView userName;
    private TextView userEmail;


    public NavigationHeaderView(Context context) {
        this(context, null);
    }

    public NavigationHeaderView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public NavigationHeaderView(Context context, AttributeSet attributeSet, int defStyleAttribute) {
        super(context, attributeSet, defStyleAttribute);
        initialize();
    }


    private void initialize() {

        inflate(getContext(), R.layout.navigation_compound_header, this);

        userIcon = findViewById(R.id.userIcon_nav);
        userName = findViewById(R.id.userName_nav);
        userEmail = findViewById(R.id.userEmail_nav);
    }

    private int generateColor() {

        Random random = new Random();
        int color = Color.argb(255, random.nextInt(256), random.nextInt(256), random.nextInt(256));

        return color;
    }

    public void changeProfileIconColor() {
        userIcon.setColorFilter(generateColor());

    }
}
