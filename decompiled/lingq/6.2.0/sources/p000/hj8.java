package p000;

import androidx.compose.runtime.internal.C0282a;
import androidx.glance.layout.AbstractC0686a;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes3.dex */
public final class hj8 implements bj3 {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ ArrayList f42494a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ int f42495b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ float f42496c;

    /* JADX INFO: renamed from: d */
    public final /* synthetic */ float f42497d;

    /* JADX INFO: renamed from: e */
    public final /* synthetic */ on3 f42498e;

    /* JADX INFO: renamed from: f */
    public final /* synthetic */ C0282a f42499f;

    public hj8(ArrayList arrayList, int i, float f, float f2, on3 on3Var, C0282a c0282a) {
        this.f42494a = arrayList;
        this.f42495b = i;
        this.f42496c = f;
        this.f42497d = f2;
        this.f42498e = on3Var;
        this.f42499f = c0282a;
    }

    /* JADX WARN: Code duplicated, block: B:26:0x0058  */
    /* JADX WARN: Code duplicated, block: B:28:0x0073  */
    /* JADX WARN: Code duplicated, block: B:29:0x0075  */
    /* JADX WARN: Code duplicated, block: B:31:0x0079  */
    /* JADX WARN: Code duplicated, block: B:32:0x007b  */
    /* JADX WARN: Code duplicated, block: B:36:0x0081  */
    /* JADX WARN: Code duplicated, block: B:38:0x0084  */
    /* JADX WARN: Code duplicated, block: B:39:0x0086  */
    /* JADX WARN: Code duplicated, block: B:42:0x008b  */
    /* JADX WARN: Code duplicated, block: B:43:0x008d A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:44:0x008f  */
    /* JADX WARN: Code duplicated, block: B:45:0x0091  */
    /* JADX WARN: Code duplicated, block: B:47:0x0095  */
    /* JADX WARN: Code duplicated, block: B:48:0x0097 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:50:0x009a  */
    @Override // p000.bj3
    /* JADX INFO: renamed from: e */
    public final Object mo825e(Object obj, Object obj2, Object obj3, Object obj4) {
        int i;
        int i2;
        int i3;
        int i4;
        float f;
        float f2;
        float f3;
        float f4;
        float f5;
        cv4 cv4Var = (cv4) obj;
        int iIntValue = ((Number) obj2).intValue();
        ye1 ye1Var = (ye1) obj3;
        int iIntValue2 = ((Number) obj4).intValue();
        if ((iIntValue2 & 6) == 0) {
            i = ((iIntValue2 & 8) == 0 ? ((tj3) ye1Var).m22120g(cv4Var) : ((tj3) ye1Var).m22124i(cv4Var) ? 4 : 2) | iIntValue2;
        } else {
            i = iIntValue2;
        }
        if ((iIntValue2 & 48) == 0) {
            i |= ((tj3) ye1Var).m22116e(iIntValue) ? 32 : 16;
        }
        if ((i & 147) == 146) {
            tj3 tj3Var = (tj3) ye1Var;
            if (tj3Var.m22086D()) {
                tj3Var.m22102U();
            } else {
                Object obj5 = this.f42494a.get(iIntValue);
                tj3 tj3Var2 = (tj3) ye1Var;
                tj3Var2.m22111b0(-1542665809);
                i2 = iIntValue / 2;
                i3 = iIntValue % 2;
                i4 = this.f42495b;
                f = this.f42496c;
                f2 = 0.0f;
                if (i2 == 0) {
                    f3 = 0.0f;
                } else if (i2 == i4 - 1) {
                    f3 = f;
                } else {
                    f3 = f / 2.0f;
                }
                if (i2 != 0) {
                    if (i2 == i4 - 1) {
                        f = 0.0f;
                    } else {
                        f /= 2.0f;
                    }
                }
                f4 = this.f42497d;
                if (i3 == 0) {
                    f5 = 0.0f;
                } else if (i3 == 1) {
                    f5 = f4;
                } else {
                    f5 = f4 / 2.0f;
                }
                if (i3 == 0) {
                    f2 = f4;
                } else if (i3 != 1) {
                    f2 = f4 / 2.0f;
                }
                AbstractC0686a.m2485a(wfb.m23930y(ci8.m4734s(this.f42498e), f5, f3, f2, f), null, ci8.m4703P(1293605475, new gj8(0, this.f42499f, obj5), tj3Var2), tj3Var2, 384, 2);
                tj3Var2.m22139q(false);
            }
        } else {
            Object obj6 = this.f42494a.get(iIntValue);
            tj3 tj3Var3 = (tj3) ye1Var;
            tj3Var3.m22111b0(-1542665809);
            i2 = iIntValue / 2;
            i3 = iIntValue % 2;
            i4 = this.f42495b;
            f = this.f42496c;
            f2 = 0.0f;
            if (i2 == 0) {
                f3 = 0.0f;
            } else if (i2 == i4 - 1) {
                f3 = f;
            } else {
                f3 = f / 2.0f;
            }
            if (i2 != 0) {
                if (i2 == i4 - 1) {
                    f = 0.0f;
                } else {
                    f /= 2.0f;
                }
            }
            f4 = this.f42497d;
            if (i3 == 0) {
                f5 = 0.0f;
            } else if (i3 == 1) {
                f5 = f4;
            } else {
                f5 = f4 / 2.0f;
            }
            if (i3 == 0) {
                f2 = f4;
            } else if (i3 != 1) {
                f2 = f4 / 2.0f;
            }
            AbstractC0686a.m2485a(wfb.m23930y(ci8.m4734s(this.f42498e), f5, f3, f2, f), null, ci8.m4703P(1293605475, new gj8(0, this.f42499f, obj6), tj3Var3), tj3Var3, 384, 2);
            tj3Var3.m22139q(false);
        }
        return xfa.f68157a;
    }
}
