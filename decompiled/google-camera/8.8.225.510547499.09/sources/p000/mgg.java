package p000;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.view.ViewGroup;
import android.widget.FrameLayout;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class mgg extends FrameLayout.LayoutParams {

    /* JADX INFO: renamed from: a */
    public int f40421a;

    /* JADX INFO: renamed from: b */
    public float f40422b;

    public mgg() {
        super(-1, -1);
        this.f40421a = 0;
        this.f40422b = 0.5f;
    }

    public mgg(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f40421a = 0;
        this.f40422b = 0.5f;
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, mgk.f40440d);
        this.f40421a = typedArrayObtainStyledAttributes.getInt(0, 0);
        this.f40422b = typedArrayObtainStyledAttributes.getFloat(1, 0.5f);
        typedArrayObtainStyledAttributes.recycle();
    }

    public mgg(ViewGroup.LayoutParams layoutParams) {
        super(layoutParams);
        this.f40421a = 0;
        this.f40422b = 0.5f;
    }
}
