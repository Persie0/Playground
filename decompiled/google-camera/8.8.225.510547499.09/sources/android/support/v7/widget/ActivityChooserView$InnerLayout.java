package android.support.v7.widget;

import android.R;
import android.content.Context;
import android.util.AttributeSet;
import android.widget.LinearLayout;
import androidx.wear.ambient.AmbientDelegate;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public class ActivityChooserView$InnerLayout extends LinearLayout {

    /* JADX INFO: renamed from: a */
    private static final int[] f999a = {R.attr.background};

    public ActivityChooserView$InnerLayout(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        AmbientDelegate ambientDelegateM1567C = AmbientDelegate.m1567C(context, attributeSet, f999a);
        setBackgroundDrawable(ambientDelegateM1567C.m1618u(0));
        ambientDelegateM1567C.m1622y();
    }
}
