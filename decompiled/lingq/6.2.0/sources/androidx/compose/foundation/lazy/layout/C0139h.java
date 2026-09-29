package androidx.compose.foundation.lazy.layout;

import p000.AbstractC3423or;
import p000.C3047gq;
import p000.d66;
import p000.hp6;
import p000.i84;
import p000.l54;
import p000.ux5;
import p000.vi3;
import p000.x66;
import p000.x94;

/* JADX INFO: renamed from: androidx.compose.foundation.lazy.layout.h */
/* JADX INFO: loaded from: classes.dex */
public final class C0139h {

    /* JADX INFO: renamed from: a */
    public final d66 f2578a;

    /* JADX INFO: renamed from: b */
    public final Object[] f2579b;

    /* JADX INFO: renamed from: c */
    public final int f2580c;

    /* JADX WARN: Code duplicated, block: B:31:0x00cb  */
    public C0139h(i84 i84Var, AbstractC0133b abstractC0133b) {
        Object defaultLazyKey;
        C3047gq c3047gqMo997d = abstractC0133b.mo997d();
        int i = i84Var.f40379a;
        if (i < 0) {
            l54.m15816c("negative nearestRange.first");
        }
        int iMin = Math.min(i84Var.f40380b, c3047gqMo997d.f41171b - 1);
        if (iMin < i) {
            d66 d66Var = hp6.f42737a;
            d66Var.getClass();
            this.f2578a = d66Var;
            this.f2579b = new Object[0];
            this.f2580c = 0;
            return;
        }
        int i2 = (iMin - i) + 1;
        this.f2579b = new Object[i2];
        this.f2580c = i;
        d66 d66Var2 = new d66(i2);
        x66 x66Var = (x66) c3047gqMo997d.f41172c;
        if (i < 0 || i >= c3047gqMo997d.f41171b) {
            StringBuilder sbM22998u = ux5.m22998u("Index ", i, ", size ");
            sbM22998u.append(c3047gqMo997d.f41171b);
            l54.m15818e(sbM22998u.toString());
        }
        if (iMin < 0 || iMin >= c3047gqMo997d.f41171b) {
            StringBuilder sbM22998u2 = ux5.m22998u("Index ", iMin, ", size ");
            sbM22998u2.append(c3047gqMo997d.f41171b);
            l54.m15818e(sbM22998u2.toString());
        }
        if (iMin < i) {
            l54.m15814a("toIndex (" + iMin + ") should be not smaller than fromIndex (" + i + ')');
        }
        int iM18254g = AbstractC3423or.m18254g(i, x66Var);
        int i3 = ((x94) x66Var.f67830a[iM18254g]).f67972a;
        while (i3 <= iMin) {
            x94 x94Var = (x94) x66Var.f67830a[iM18254g];
            vi3 key = x94Var.f67974c.getKey();
            int i4 = x94Var.f67972a;
            int iMax = Math.max(i, i4);
            int iMin2 = Math.min(iMin, (x94Var.f67973b + i4) - 1);
            if (iMax <= iMin2) {
                while (true) {
                    if (key != null) {
                        defaultLazyKey = key.invoke(Integer.valueOf(iMax - i4));
                        defaultLazyKey = defaultLazyKey == null ? new DefaultLazyKey(iMax) : defaultLazyKey;
                    }
                    d66Var2.m10128g(iMax, defaultLazyKey);
                    this.f2579b[iMax - this.f2580c] = defaultLazyKey;
                    iMax = iMax != iMin2 ? iMax + 1 : iMax;
                }
            }
            i3 += x94Var.f67973b;
            iM18254g++;
        }
        this.f2578a = d66Var2;
    }

    /* JADX INFO: renamed from: a */
    public final int m1018a(Object obj) {
        d66 d66Var = this.f2578a;
        int iM10125d = d66Var.m10125d(obj);
        if (iM10125d >= 0) {
            return d66Var.f35036c[iM10125d];
        }
        return -1;
    }

    /* JADX INFO: renamed from: b */
    public final Object m1019b(int i) {
        int i2 = i - this.f2580c;
        if (i2 < 0) {
            return null;
        }
        Object[] objArr = this.f2579b;
        if (i2 < objArr.length) {
            return objArr[i2];
        }
        return null;
    }
}
