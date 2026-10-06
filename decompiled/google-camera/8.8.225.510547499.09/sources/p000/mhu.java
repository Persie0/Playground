package p000;

import android.content.Context;
import android.graphics.Color;
import com.google.android.apps.camera.bottombar.C0100R;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class mhu {

    /* JADX INFO: renamed from: c */
    private static final int f40545c = (int) Math.round(5.1000000000000005d);

    /* JADX INFO: renamed from: a */
    public final boolean f40546a;

    /* JADX INFO: renamed from: b */
    public final int f40547b;

    /* JADX INFO: renamed from: d */
    private final int f40548d;

    /* JADX INFO: renamed from: e */
    private final int f40549e;

    /* JADX INFO: renamed from: f */
    private final float f40550f;

    public mhu(Context context) {
        boolean zM15396D = lij.m15396D(context, C0100R.attr.elevationOverlayEnabled, false);
        int iM15025r = kxk.m15025r(context, C0100R.attr.elevationOverlayColor, 0);
        int iM15025r2 = kxk.m15025r(context, C0100R.attr.elevationOverlayAccentColor, 0);
        int iM15025r3 = kxk.m15025r(context, C0100R.attr.colorSurface, 0);
        float f = context.getResources().getDisplayMetrics().density;
        this.f40546a = zM15396D;
        this.f40548d = iM15025r;
        this.f40549e = iM15025r2;
        this.f40547b = iM15025r3;
        this.f40550f = f;
    }

    /* JADX INFO: renamed from: b */
    public final int m16395b(int i, float f) {
        return (this.f40546a && acp.m212d(i, 255) == this.f40547b) ? m16394a(i, f) : i;
    }

    /* JADX INFO: renamed from: a */
    public final int m16394a(int i, float f) {
        int i2;
        float f2 = this.f40550f;
        float fMin = (f2 <= 0.0f || f <= 0.0f) ? 0.0f : Math.min(((((float) Math.log1p(f / f2)) * 4.5f) + 2.0f) / 100.0f, 1.0f);
        int iAlpha = Color.alpha(i);
        int iM15026s = kxk.m15026s(acp.m212d(i, 255), this.f40548d, fMin);
        if (fMin > 0.0f && (i2 = this.f40549e) != 0) {
            iM15026s = acp.m211c(acp.m212d(i2, f40545c), iM15026s);
        }
        return acp.m212d(iM15026s, iAlpha);
    }
}
