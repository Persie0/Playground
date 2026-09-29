package androidx.compose.foundation.layout;

import androidx.activity.result.C0204c;
import androidx.compose.p017ui.layout.AbstractC0526g;
import androidx.compose.p017ui.layout.InterfaceC0521b;
import androidx.compose.p017ui.layout.InterfaceC0524e;
import androidx.compose.p017ui.platform.AbstractC0664t0;
import cm.InterfaceC2052l;
import dm.C5207g;
import kotlin.collections.C6753d;
import p127g1.InterfaceC5644h;
import p127g1.InterfaceC5645i;
import p127g1.InterfaceC5651o;
import p127g1.InterfaceC5653q;
import p470x1.C10013a;
import p470x1.C10014b;
import p470x1.C10017e;
import p470x1.InterfaceC10015c;
import sl.C9072e;

/* JADX INFO: loaded from: classes.dex */
public final class SizeModifier extends AbstractC0664t0 implements InterfaceC0521b {

    /* JADX INFO: renamed from: b */
    public final float f2409b;

    /* JADX INFO: renamed from: c */
    public final float f2410c;

    /* JADX INFO: renamed from: d */
    public final float f2411d;

    /* JADX INFO: renamed from: e */
    public final float f2412e;

    /* JADX INFO: renamed from: f */
    public final boolean f2413f;

    public SizeModifier() {
        throw null;
    }

    public SizeModifier(float f3, float f10, float f11, float f12, InterfaceC2052l interfaceC2052l) {
        super(interfaceC2052l);
        this.f2409b = f3;
        this.f2410c = f10;
        this.f2411d = f11;
        this.f2412e = f12;
        this.f2413f = true;
    }

    public /* synthetic */ SizeModifier(float f3, float f10, float f11, float f12, InterfaceC2052l interfaceC2052l, int i10) {
        this((i10 & 1) != 0 ? Float.NaN : f3, (i10 & 2) != 0 ? Float.NaN : f10, (i10 & 4) != 0 ? Float.NaN : f11, (i10 & 8) != 0 ? Float.NaN : f12, interfaceC2052l);
    }

    @Override // androidx.compose.p017ui.layout.InterfaceC0521b
    /* JADX INFO: renamed from: a */
    public final int mo1422a(InterfaceC5645i interfaceC5645i, InterfaceC5644h interfaceC5644h, int i10) {
        C5207g.m11111f(interfaceC5645i, "<this>");
        long jM1515c = m1515c(interfaceC5645i);
        return C10013a.m18600e(jM1515c) ? C10013a.m18602g(jM1515c) : C10014b.m18615e(interfaceC5644h.mo2045a(i10), jM1515c);
    }

    @Override // androidx.compose.p017ui.layout.InterfaceC0521b
    /* JADX INFO: renamed from: b */
    public final int mo1423b(InterfaceC5645i interfaceC5645i, InterfaceC5644h interfaceC5644h, int i10) {
        C5207g.m11111f(interfaceC5645i, "<this>");
        long jM1515c = m1515c(interfaceC5645i);
        return C10013a.m18600e(jM1515c) ? C10013a.m18602g(jM1515c) : C10014b.m18615e(interfaceC5644h.mo2044R(i10), jM1515c);
    }

    /* JADX WARN: Code duplicated, block: B:27:0x0078  */
    /* JADX INFO: renamed from: c */
    public final long m1515c(InterfaceC10015c interfaceC10015c) {
        int iMo1464s0;
        int iMo1464s1;
        int iMo1464s2;
        float f3 = this.f2411d;
        int i10 = 0;
        if (C10017e.m18618a(f3, Float.NaN)) {
            iMo1464s0 = Integer.MAX_VALUE;
        } else {
            C10017e c10017e = new C10017e(f3);
            C10017e c10017e2 = new C10017e(0);
            if (c10017e.compareTo(c10017e2) < 0) {
                c10017e = c10017e2;
            }
            iMo1464s0 = interfaceC10015c.mo1464s0(c10017e.f50966a);
        }
        float f10 = this.f2412e;
        if (C10017e.m18618a(f10, Float.NaN)) {
            iMo1464s1 = Integer.MAX_VALUE;
        } else {
            C10017e c10017e3 = new C10017e(f10);
            C10017e c10017e4 = new C10017e(0);
            if (c10017e3.compareTo(c10017e4) < 0) {
                c10017e3 = c10017e4;
            }
            iMo1464s1 = interfaceC10015c.mo1464s0(c10017e3.f50966a);
        }
        float f11 = this.f2409b;
        if (C10017e.m18618a(f11, Float.NaN)) {
            iMo1464s2 = 0;
        } else {
            iMo1464s2 = interfaceC10015c.mo1464s0(f11);
            if (iMo1464s2 > iMo1464s0) {
                iMo1464s2 = iMo1464s0;
            }
            if (iMo1464s2 < 0) {
                iMo1464s2 = 0;
            }
            if (iMo1464s2 == Integer.MAX_VALUE) {
                iMo1464s2 = 0;
            }
        }
        float f12 = this.f2410c;
        if (!C10017e.m18618a(f12, Float.NaN)) {
            int iMo1464s3 = interfaceC10015c.mo1464s0(f12);
            if (iMo1464s3 > iMo1464s1) {
                iMo1464s3 = iMo1464s1;
            }
            if (iMo1464s3 < 0) {
                iMo1464s3 = 0;
            }
            if (iMo1464s3 != Integer.MAX_VALUE) {
                i10 = iMo1464s3;
            }
        }
        return C10014b.m18611a(iMo1464s2, iMo1464s0, i10, iMo1464s1);
    }

    @Override // androidx.compose.p017ui.layout.InterfaceC0521b
    /* JADX INFO: renamed from: e */
    public final InterfaceC5653q mo1352e(InterfaceC0524e interfaceC0524e, InterfaceC5651o interfaceC5651o, long j10) {
        int iM18605j;
        int iM18603h;
        int iM18604i;
        int iM18602g;
        long jM18611a;
        C5207g.m11111f(interfaceC0524e, "$this$measure");
        long jM1515c = m1515c(interfaceC0524e);
        if (this.f2413f) {
            jM18611a = C10014b.m18614d(j10, jM1515c);
        } else {
            if (C10017e.m18618a(this.f2409b, Float.NaN)) {
                iM18605j = C10013a.m18605j(j10);
                int iM18603h2 = C10013a.m18603h(jM1515c);
                if (iM18605j > iM18603h2) {
                    iM18605j = iM18603h2;
                }
            } else {
                iM18605j = C10013a.m18605j(jM1515c);
            }
            if (C10017e.m18618a(this.f2411d, Float.NaN)) {
                iM18603h = C10013a.m18603h(j10);
                int iM18605j2 = C10013a.m18605j(jM1515c);
                if (iM18603h < iM18605j2) {
                    iM18603h = iM18605j2;
                }
            } else {
                iM18603h = C10013a.m18603h(jM1515c);
            }
            if (C10017e.m18618a(this.f2410c, Float.NaN)) {
                iM18604i = C10013a.m18604i(j10);
                int iM18602g2 = C10013a.m18602g(jM1515c);
                if (iM18604i > iM18602g2) {
                    iM18604i = iM18602g2;
                }
            } else {
                iM18604i = C10013a.m18604i(jM1515c);
            }
            if (C10017e.m18618a(this.f2412e, Float.NaN)) {
                iM18602g = C10013a.m18602g(j10);
                int iM18604i2 = C10013a.m18604i(jM1515c);
                if (iM18602g < iM18604i2) {
                    iM18602g = iM18604i2;
                }
            } else {
                iM18602g = C10013a.m18602g(jM1515c);
            }
            jM18611a = C10014b.m18611a(iM18605j, iM18603h, iM18604i, iM18602g);
        }
        final AbstractC0526g abstractC0526gMo2048w = interfaceC5651o.mo2048w(jM18611a);
        return interfaceC0524e.m2043P(abstractC0526gMo2048w.f3686a, abstractC0526gMo2048w.f3687b, C6753d.m13459L0(), new InterfaceC2052l<AbstractC0526g.a, C9072e>() { // from class: androidx.compose.foundation.layout.SizeModifier$measure$1
            {
                super(1);
            }

            @Override // cm.InterfaceC2052l
            /* JADX INFO: renamed from: n */
            public final C9072e mo528n(AbstractC0526g.a aVar) {
                AbstractC0526g.a aVar2 = aVar;
                C5207g.m11111f(aVar2, "$this$layout");
                AbstractC0526g.a.m2059e(aVar2, abstractC0526gMo2048w, 0, 0);
                return C9072e.f47360a;
            }
        });
    }

    public final boolean equals(Object obj) {
        boolean z10 = false;
        if (!(obj instanceof SizeModifier)) {
            return false;
        }
        SizeModifier sizeModifier = (SizeModifier) obj;
        if (C10017e.m18618a(this.f2409b, sizeModifier.f2409b) && C10017e.m18618a(this.f2410c, sizeModifier.f2410c) && C10017e.m18618a(this.f2411d, sizeModifier.f2411d) && C10017e.m18618a(this.f2412e, sizeModifier.f2412e) && this.f2413f == sizeModifier.f2413f) {
            z10 = true;
        }
        return z10;
    }

    @Override // androidx.compose.p017ui.layout.InterfaceC0521b
    /* JADX INFO: renamed from: f */
    public final int mo1424f(InterfaceC5645i interfaceC5645i, InterfaceC5644h interfaceC5644h, int i10) {
        C5207g.m11111f(interfaceC5645i, "<this>");
        long jM1515c = m1515c(interfaceC5645i);
        return C10013a.m18601f(jM1515c) ? C10013a.m18603h(jM1515c) : C10014b.m18616f(interfaceC5644h.mo2047u(i10), jM1515c);
    }

    @Override // androidx.compose.p017ui.layout.InterfaceC0521b
    /* JADX INFO: renamed from: g */
    public final int mo1425g(InterfaceC5645i interfaceC5645i, InterfaceC5644h interfaceC5644h, int i10) {
        C5207g.m11111f(interfaceC5645i, "<this>");
        long jM1515c = m1515c(interfaceC5645i);
        return C10013a.m18601f(jM1515c) ? C10013a.m18603h(jM1515c) : C10014b.m18616f(interfaceC5644h.mo2046s(i10), jM1515c);
    }

    public final int hashCode() {
        return C0204c.m846e(this.f2412e, C0204c.m846e(this.f2411d, C0204c.m846e(this.f2410c, Float.hashCode(this.f2409b) * 31, 31), 31), 31);
    }
}
