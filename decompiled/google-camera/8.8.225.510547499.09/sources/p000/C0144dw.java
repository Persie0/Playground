package p000;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.view.ViewGroup;

/* JADX INFO: renamed from: dw */
/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public class C0144dw extends ViewGroup.MarginLayoutParams {

    /* JADX INFO: renamed from: a */
    public int f12698a;

    public C0144dw() {
        super(-2, -2);
        this.f12698a = 8388627;
    }

    public C0144dw(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f12698a = 0;
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, C0193fr.f23258b);
        this.f12698a = typedArrayObtainStyledAttributes.getInt(0, 0);
        typedArrayObtainStyledAttributes.recycle();
    }

    public C0144dw(C0144dw c0144dw) {
        super((ViewGroup.MarginLayoutParams) c0144dw);
        this.f12698a = 0;
        this.f12698a = c0144dw.f12698a;
    }

    public C0144dw(ViewGroup.LayoutParams layoutParams) {
        super(layoutParams);
        this.f12698a = 0;
    }
}
