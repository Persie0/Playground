package p000;

import android.graphics.PointF;
import java.util.List;

/* JADX INFO: loaded from: classes2.dex */
public final class ha1 extends lj4 {

    /* JADX INFO: renamed from: i */
    public final /* synthetic */ int f42081i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ ha1(int i, List list) {
        super(list);
        this.f42081i = i;
    }

    @Override // p000.m90
    /* JADX INFO: renamed from: g */
    public final Object mo3293g(kj4 kj4Var, float f) {
        int i;
        int iIntValue;
        Integer num;
        Object obj;
        switch (this.f42081i) {
            case 0:
                return Integer.valueOf(m13153m(kj4Var, f));
            case 1:
                Object obj2 = kj4Var.f47378b;
                if (obj2 == null) {
                    C3386nv.m17633t("Missing values for keyframe.");
                    return null;
                }
                Object obj3 = kj4Var.f47379c;
                if (obj3 == null) {
                    if (kj4Var.f47387k == 784923401) {
                        kj4Var.f47387k = ((Integer) obj2).intValue();
                    }
                    i = kj4Var.f47387k;
                } else {
                    if (kj4Var.f47388l == 784923401) {
                        kj4Var.f47388l = ((Integer) obj3).intValue();
                    }
                    i = kj4Var.f47388l;
                }
                int i2 = i;
                p33 p33Var = this.f50800e;
                if (p33Var == null || (num = (Integer) p33Var.m18870N(kj4Var.f47383g, kj4Var.f47384h.floatValue(), (Integer) obj2, Integer.valueOf(i2), f, m16691e(), this.f50799d)) == null) {
                    if (kj4Var.f47387k == 784923401) {
                        kj4Var.f47387k = ((Integer) obj2).intValue();
                    }
                    int i3 = kj4Var.f47387k;
                    PointF pointF = f06.f38140a;
                    iIntValue = (int) ((f * (i2 - i3)) + i3);
                } else {
                    iIntValue = num.intValue();
                }
                return Integer.valueOf(iIntValue);
            default:
                Object obj4 = kj4Var.f47378b;
                p33 p33Var2 = this.f50800e;
                if (p33Var2 == null) {
                    return (f != 1.0f || (obj = kj4Var.f47379c) == null) ? (pi2) obj4 : (pi2) obj;
                }
                float f2 = kj4Var.f47383g;
                Float f3 = kj4Var.f47384h;
                float fFloatValue = f3 == null ? Float.MAX_VALUE : f3.floatValue();
                pi2 pi2Var = (pi2) obj4;
                Object obj5 = kj4Var.f47379c;
                return (pi2) p33Var2.m18870N(f2, fFloatValue, pi2Var, obj5 == null ? pi2Var : (pi2) obj5, f, m16690d(), this.f50799d);
        }
    }

    /* JADX INFO: renamed from: m */
    public int m13153m(kj4 kj4Var, float f) {
        float f2;
        Float f3;
        Object obj = kj4Var.f47378b;
        Object obj2 = kj4Var.f47378b;
        if (obj == null || kj4Var.f47379c == null) {
            C3386nv.m17633t("Missing values for keyframe.");
            return 0;
        }
        p33 p33Var = this.f50800e;
        if (p33Var == null || (f3 = kj4Var.f47384h) == null) {
            f2 = f;
        } else {
            f2 = f;
            Integer num = (Integer) p33Var.m18870N(kj4Var.f47383g, f3.floatValue(), (Integer) obj2, (Integer) kj4Var.f47379c, f2, m16691e(), this.f50799d);
            if (num != null) {
                return num.intValue();
            }
        }
        return ked.m15165c(((Integer) obj2).intValue(), f06.m11421b(f2, 0.0f, 1.0f), ((Integer) kj4Var.f47379c).intValue());
    }
}
