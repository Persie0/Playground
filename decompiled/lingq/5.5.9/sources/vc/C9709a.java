package vc;

import ae.C0062b;
import android.content.Context;
import android.graphics.Color;
import com.linguist.R;
import p072dd.C5149b;
import p312p2.C8169a;

/* JADX INFO: renamed from: vc.a */
/* JADX INFO: loaded from: classes.dex */
public final class C9709a {

    /* JADX INFO: renamed from: f */
    public static final int f49715f = (int) Math.round(5.1000000000000005d);

    /* JADX INFO: renamed from: a */
    public final boolean f49716a;

    /* JADX INFO: renamed from: b */
    public final int f49717b;

    /* JADX INFO: renamed from: c */
    public final int f49718c;

    /* JADX INFO: renamed from: d */
    public final int f49719d;

    /* JADX INFO: renamed from: e */
    public final float f49720e;

    public C9709a(Context context) {
        boolean zM10923b = C5149b.m10923b(context, R.attr.elevationOverlayEnabled, false);
        int iM334b1 = C0062b.m334b1(R.attr.elevationOverlayColor, context, 0);
        int iM334b2 = C0062b.m334b1(R.attr.elevationOverlayAccentColor, context, 0);
        int iM334b3 = C0062b.m334b1(R.attr.colorSurface, context, 0);
        float f3 = context.getResources().getDisplayMetrics().density;
        this.f49716a = zM10923b;
        this.f49717b = iM334b1;
        this.f49718c = iM334b2;
        this.f49719d = iM334b3;
        this.f49720e = f3;
    }

    /* JADX INFO: renamed from: a */
    public final int m18216a(int i10, float f3) {
        int i11;
        if (!this.f49716a) {
            return i10;
        }
        if (!(C8169a.m16216h(i10, 255) == this.f49719d)) {
            return i10;
        }
        float f10 = this.f49720e;
        float fMin = (f10 <= 0.0f || f3 <= 0.0f) ? 0.0f : Math.min(((((float) Math.log1p(f3 / f10)) * 4.5f) + 2.0f) / 100.0f, 1.0f);
        int iAlpha = Color.alpha(i10);
        int iM250B1 = C0062b.m250B1(fMin, C8169a.m16216h(i10, 255), this.f49717b);
        if (fMin > 0.0f && (i11 = this.f49718c) != 0) {
            iM250B1 = C8169a.m16215g(C8169a.m16216h(i11, f49715f), iM250B1);
        }
        return C8169a.m16216h(iM250B1, iAlpha);
    }
}
