package android.support.v4.widget;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;

class RecyclerView extends View {
    public RecyclerView(Context context) {
        this(context, null);
    }

    public RecyclerView(Context context, AttributeSet attrs) {
        this(context, attrs, 0);
    }

    public RecyclerView(Context context, AttributeSet attrs, int defStyle) {
        super(context, attrs, defStyle);
    }
}
