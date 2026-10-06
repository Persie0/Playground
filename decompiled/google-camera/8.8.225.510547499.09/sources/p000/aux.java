package p000;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.view.ViewGroup;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class aux extends ViewGroup.MarginLayoutParams {

    /* JADX INFO: renamed from: a */
    public boolean f2452a;

    /* JADX INFO: renamed from: b */
    public int f2453b;

    /* JADX INFO: renamed from: c */
    public float f2454c;

    /* JADX INFO: renamed from: d */
    public float f2455d;

    /* JADX INFO: renamed from: e */
    public float f2456e;

    /* JADX INFO: renamed from: f */
    public float f2457f;

    public aux() {
        super(-1, -1);
        this.f2452a = true;
        this.f2453b = 1;
    }

    public aux(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f2452a = true;
        this.f2453b = 1;
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, auv.f2442b);
        this.f2452a = typedArrayObtainStyledAttributes.getBoolean(0, true);
        this.f2453b = typedArrayObtainStyledAttributes.getInt(1, 1);
        this.f2457f = typedArrayObtainStyledAttributes.getFloat(2, 0.0f);
        typedArrayObtainStyledAttributes.recycle();
    }

    public aux(ViewGroup.LayoutParams layoutParams) {
        super(layoutParams);
        this.f2452a = true;
        this.f2453b = 1;
    }
}
