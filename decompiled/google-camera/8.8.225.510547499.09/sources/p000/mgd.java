package p000;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.view.ViewGroup;
import android.view.animation.AnimationUtils;
import android.view.animation.Interpolator;
import android.widget.LinearLayout;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class mgd extends LinearLayout.LayoutParams {

    /* JADX INFO: renamed from: a */
    public int f40417a;

    /* JADX INFO: renamed from: b */
    public Interpolator f40418b;

    /* JADX INFO: renamed from: c */
    public mbb f40419c;

    public mgd() {
        super(-1, -2);
        this.f40417a = 1;
    }

    public mgd(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f40417a = 1;
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, mgk.f40438b);
        this.f40417a = typedArrayObtainStyledAttributes.getInt(1, 0);
        mbb mbbVar = null;
        switch (typedArrayObtainStyledAttributes.getInt(0, 0)) {
            case 1:
                mbbVar = new mbb((byte[]) null, (byte[]) null);
                break;
        }
        this.f40419c = mbbVar;
        if (typedArrayObtainStyledAttributes.hasValue(2)) {
            this.f40418b = AnimationUtils.loadInterpolator(context, typedArrayObtainStyledAttributes.getResourceId(2, 0));
        }
        typedArrayObtainStyledAttributes.recycle();
    }

    public mgd(ViewGroup.LayoutParams layoutParams) {
        super(layoutParams);
        this.f40417a = 1;
    }

    public mgd(ViewGroup.MarginLayoutParams marginLayoutParams) {
        super(marginLayoutParams);
        this.f40417a = 1;
    }

    public mgd(LinearLayout.LayoutParams layoutParams) {
        super(layoutParams);
        this.f40417a = 1;
    }
}
