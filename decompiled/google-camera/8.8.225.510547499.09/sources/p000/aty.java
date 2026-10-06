package p000;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.view.ViewGroup;
import androidx.viewpager.widget.ViewPager;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class aty extends ViewGroup.LayoutParams {

    /* JADX INFO: renamed from: a */
    public boolean f2396a;

    /* JADX INFO: renamed from: b */
    public int f2397b;

    /* JADX INFO: renamed from: c */
    public final float f2398c;

    public aty() {
        super(-1, -1);
        this.f2398c = 0.0f;
    }

    public aty(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f2398c = 0.0f;
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, ViewPager.f1636a);
        this.f2397b = typedArrayObtainStyledAttributes.getInteger(0, 48);
        typedArrayObtainStyledAttributes.recycle();
    }
}
