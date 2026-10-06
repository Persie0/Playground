package p000;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.view.ViewGroup;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class hzb extends C1178zm {

    /* JADX INFO: renamed from: ax */
    public int f30004ax;

    public hzb(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, hzc.f30005a);
        if (typedArrayObtainStyledAttributes.hasValue(0)) {
            this.f30004ax = new int[]{1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, 17}[typedArrayObtainStyledAttributes.getInt(0, 0)];
        }
        typedArrayObtainStyledAttributes.recycle();
    }

    public hzb(ViewGroup.LayoutParams layoutParams) {
        super(layoutParams);
    }

    public hzb() {
        super(-1, -1);
        this.f30004ax = 1;
    }
}
