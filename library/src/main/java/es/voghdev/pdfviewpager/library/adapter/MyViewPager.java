package es.voghdev.pdfviewpager.library.adapter;

import android.content.Context;
import android.support.v4.view.ViewPager;
import android.util.AttributeSet;
import android.view.MotionEvent;

/**
 * Created by Cristian on 22/09/2017.
 */

public class MyViewPager extends ViewPager {
    private boolean paging = true;

    public MyViewPager(Context context) {
        super(context);
    }

    public MyViewPager(Context context, AttributeSet attributeSet){
        super(context, attributeSet);
    }


    @Override
    public boolean onInterceptTouchEvent(MotionEvent e) {
        try {
            return super.onTouchEvent(e);
        } catch (IllegalArgumentException ex) {
            ex.printStackTrace();
        }

        return false;
    }

}
