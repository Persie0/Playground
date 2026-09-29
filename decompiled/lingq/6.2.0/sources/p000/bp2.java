package p000;

import android.content.Context;
import com.google.android.material.R$attr;

/* JADX INFO: loaded from: classes.dex */
public final class bp2 {

    /* JADX INFO: renamed from: f */
    public static final int f8783f = (int) Math.round(5.1000000000000005d);

    /* JADX INFO: renamed from: a */
    public final boolean f8784a;

    /* JADX INFO: renamed from: b */
    public final int f8785b;

    /* JADX INFO: renamed from: c */
    public final int f8786c;

    /* JADX INFO: renamed from: d */
    public final int f8787d;

    /* JADX INFO: renamed from: e */
    public final float f8788e;

    public bp2(Context context) {
        boolean zM24749V = xwc.m24749V(context.getTheme(), R$attr.elevationOverlayEnabled, false);
        Integer numM18120H = omd.m18120H(context, R$attr.elevationOverlayColor);
        int iIntValue = numM18120H != null ? numM18120H.intValue() : 0;
        Integer numM18120H2 = omd.m18120H(context, R$attr.elevationOverlayAccentColor);
        int iIntValue2 = numM18120H2 != null ? numM18120H2.intValue() : 0;
        Integer numM18120H3 = omd.m18120H(context, R$attr.colorSurface);
        int iIntValue3 = numM18120H3 != null ? numM18120H3.intValue() : 0;
        float f = context.getResources().getDisplayMetrics().density;
        this.f8784a = zM24749V;
        this.f8785b = iIntValue;
        this.f8786c = iIntValue2;
        this.f8787d = iIntValue3;
        this.f8788e = f;
    }
}
