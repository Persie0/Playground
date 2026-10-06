package p000;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import com.google.android.apps.camera.bottombar.C0100R;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class mki extends mjj {

    /* JADX INFO: renamed from: g */
    public final int f40836g;

    /* JADX INFO: renamed from: h */
    public final int f40837h;

    /* JADX INFO: renamed from: i */
    public boolean f40838i;

    public mki(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, C0100R.attr.linearProgressIndicatorStyle, C0100R.style.Widget_MaterialComponents_LinearProgressIndicator);
        TypedArray typedArrayM16438a = mjb.m16438a(context, attributeSet, mkj.f40841c, C0100R.attr.linearProgressIndicatorStyle, C0100R.style.Widget_MaterialComponents_LinearProgressIndicator, new int[0]);
        this.f40836g = typedArrayM16438a.getInt(0, 1);
        int i = typedArrayM16438a.getInt(1, 0);
        this.f40837h = i;
        typedArrayM16438a.recycle();
        mo16449a();
        this.f40838i = i == 1;
    }

    @Override // p000.mjj
    /* JADX INFO: renamed from: a */
    public final void mo16449a() {
        if (this.f40836g == 0) {
            if (this.f40742b > 0) {
                throw new IllegalArgumentException("Rounded corners are not supported in contiguous indeterminate animation.");
            }
            if (this.f40743c.length < 3) {
                throw new IllegalArgumentException("Contiguous indeterminate animation must be used with 3 or more indicator colors.");
            }
        }
    }
}
