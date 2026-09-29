package p000;

import android.view.View;
import java.util.WeakHashMap;

/* JADX INFO: loaded from: classes2.dex */
public final class zt0 {

    /* JADX INFO: renamed from: a */
    public final float f72116a;

    /* JADX INFO: renamed from: b */
    public final float f72117b;

    /* JADX INFO: renamed from: c */
    public final float f72118c;

    /* JADX INFO: renamed from: d */
    public final float f72119d;

    /* JADX INFO: renamed from: e */
    public final float f72120e;

    /* JADX INFO: renamed from: f */
    public final float f72121f;

    /* JADX INFO: renamed from: g */
    public final float f72122g;

    /* JADX INFO: renamed from: h */
    public final float f72123h;

    public zt0(View view) {
        this.f72116a = view.getTranslationX();
        this.f72117b = view.getTranslationY();
        WeakHashMap weakHashMap = dta.f36217a;
        this.f72118c = view.getTranslationZ();
        this.f72119d = view.getScaleX();
        this.f72120e = view.getScaleY();
        this.f72121f = view.getRotationX();
        this.f72122g = view.getRotationY();
        this.f72123h = view.getRotation();
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof zt0)) {
            return false;
        }
        zt0 zt0Var = (zt0) obj;
        return zt0Var.f72116a == this.f72116a && zt0Var.f72117b == this.f72117b && zt0Var.f72118c == this.f72118c && zt0Var.f72119d == this.f72119d && zt0Var.f72120e == this.f72120e && zt0Var.f72121f == this.f72121f && zt0Var.f72122g == this.f72122g && zt0Var.f72123h == this.f72123h;
    }

    public final int hashCode() {
        float f = this.f72116a;
        int iFloatToIntBits = (f != 0.0f ? Float.floatToIntBits(f) : 0) * 31;
        float f2 = this.f72117b;
        int iFloatToIntBits2 = (iFloatToIntBits + (f2 != 0.0f ? Float.floatToIntBits(f2) : 0)) * 31;
        float f3 = this.f72118c;
        int iFloatToIntBits3 = (iFloatToIntBits2 + (f3 != 0.0f ? Float.floatToIntBits(f3) : 0)) * 31;
        float f4 = this.f72119d;
        int iFloatToIntBits4 = (iFloatToIntBits3 + (f4 != 0.0f ? Float.floatToIntBits(f4) : 0)) * 31;
        float f5 = this.f72120e;
        int iFloatToIntBits5 = (iFloatToIntBits4 + (f5 != 0.0f ? Float.floatToIntBits(f5) : 0)) * 31;
        float f6 = this.f72121f;
        int iFloatToIntBits6 = (iFloatToIntBits5 + (f6 != 0.0f ? Float.floatToIntBits(f6) : 0)) * 31;
        float f7 = this.f72122g;
        int iFloatToIntBits7 = (iFloatToIntBits6 + (f7 != 0.0f ? Float.floatToIntBits(f7) : 0)) * 31;
        float f8 = this.f72123h;
        return iFloatToIntBits7 + (f8 != 0.0f ? Float.floatToIntBits(f8) : 0);
    }
}
