package p000;

import androidx.compose.foundation.gestures.Orientation;
import androidx.compose.foundation.pager.AbstractC0150d;
import androidx.compose.p002ui.unit.LayoutDirection;
import java.util.Map;

/* JADX INFO: loaded from: classes.dex */
public final class g27 implements ni0 {

    /* JADX INFO: renamed from: b */
    public final AbstractC0150d f40078b;

    /* JADX INFO: renamed from: c */
    public final ni0 f40079c;

    /* JADX INFO: renamed from: d */
    public final LayoutDirection f40080d;

    public g27(AbstractC0150d abstractC0150d, ni0 ni0Var, LayoutDirection layoutDirection) {
        this.f40078b = abstractC0150d;
        this.f40079c = ni0Var;
        this.f40080d = layoutDirection;
    }

    /* JADX WARN: Code duplicated, block: B:6:0x0012  */
    @Override // p000.ni0
    /* JADX INFO: renamed from: a */
    public final float mo12303a(float f, float f2, float f3) {
        int iM1041p;
        int iM1041p2;
        int iM1041p3;
        float fMo12303a = this.f40079c.mo12303a(f, f2, f3);
        boolean z = false;
        if (f <= 0.0f) {
            float f4 = f + f2;
            Map map = jwa.f46325a;
            if (f4 <= 1.0f) {
                z = true;
            }
        } else if (f + f2 > f3) {
            z = true;
        }
        float fAbs = Math.abs(fMo12303a);
        LayoutDirection layoutDirection = this.f40080d;
        AbstractC0150d abstractC0150d = this.f40078b;
        if (fAbs != 0.0f && z) {
            if (layoutDirection == LayoutDirection.Rtl && abstractC0150d.m1038m().f52223e == Orientation.Horizontal) {
                iM1041p3 = abstractC0150d.m1041p() + (-abstractC0150d.f2676f);
            } else {
                iM1041p3 = abstractC0150d.f2676f;
            }
            float fM1041p = iM1041p3 * (-1.0f);
            while (fMo12303a > 0.0f && fM1041p < fMo12303a) {
                fM1041p += abstractC0150d.m1041p();
            }
            while (fMo12303a < 0.0f && fM1041p > fMo12303a) {
                fM1041p -= abstractC0150d.m1041p();
            }
            return fM1041p;
        }
        int i = abstractC0150d.f2676f;
        t66 t66Var = abstractC0150d.f2669F;
        if (Math.abs(i) < 1.0E-6d) {
            return 0.0f;
        }
        LayoutDirection layoutDirection2 = LayoutDirection.Rtl;
        if (layoutDirection == layoutDirection2 && abstractC0150d.m1038m().f52223e == Orientation.Horizontal) {
            iM1041p = abstractC0150d.m1041p() + (-abstractC0150d.f2676f);
        } else {
            iM1041p = abstractC0150d.f2676f;
        }
        float f5 = iM1041p * (-1.0f);
        if (layoutDirection == layoutDirection2 && abstractC0150d.m1038m().f52223e == Orientation.Horizontal) {
            if (!((Boolean) ((xc9) t66Var).getValue()).booleanValue()) {
                iM1041p2 = abstractC0150d.m1041p();
                f5 += iM1041p2;
            }
        } else if (((Boolean) ((xc9) t66Var).getValue()).booleanValue()) {
            iM1041p2 = abstractC0150d.m1041p();
            f5 += iM1041p2;
        }
        return l70.m15944g(f5, -f3, f3);
    }
}
