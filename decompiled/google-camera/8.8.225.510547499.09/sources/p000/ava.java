package p000;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.view.ViewGroup;
import android.widget.FrameLayout;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class ava extends FrameLayout.LayoutParams {

    /* JADX INFO: renamed from: a */
    public int f2474a;

    public ava(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f2474a = 0;
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, auv.f2443c, 0, 0);
        this.f2474a = typedArrayObtainStyledAttributes.getInt(true != typedArrayObtainStyledAttributes.hasValueOrEmpty(2) ? 0 : 2, 0);
        typedArrayObtainStyledAttributes.recycle();
    }

    public ava(ViewGroup.LayoutParams layoutParams) {
        super(layoutParams);
        this.f2474a = 0;
    }
}
