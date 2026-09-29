package androidx.compose.foundation.layout;

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
import sl.C9072e;

/* JADX INFO: loaded from: classes.dex */
public final class UnspecifiedConstraintsModifier extends AbstractC0664t0 implements InterfaceC0521b {

    /* JADX INFO: renamed from: b */
    public final float f2417b;

    /* JADX INFO: renamed from: c */
    public final float f2418c;

    /* JADX WARN: Unreachable blocks removed: 1, instructions: 1 */
    public UnspecifiedConstraintsModifier() {
        throw null;
    }

    public UnspecifiedConstraintsModifier(float f3, float f10, InterfaceC2052l interfaceC2052l) {
        super(interfaceC2052l);
        this.f2417b = f3;
        this.f2418c = f10;
    }

    @Override // androidx.compose.p017ui.layout.InterfaceC0521b
    /* JADX INFO: renamed from: a */
    public final int mo1422a(InterfaceC5645i interfaceC5645i, InterfaceC5644h interfaceC5644h, int i10) {
        C5207g.m11111f(interfaceC5645i, "<this>");
        int iMo2045a = interfaceC5644h.mo2045a(i10);
        float f3 = this.f2418c;
        int iMo1464s0 = !C10017e.m18618a(f3, Float.NaN) ? interfaceC5645i.mo1464s0(f3) : 0;
        return iMo2045a < iMo1464s0 ? iMo1464s0 : iMo2045a;
    }

    @Override // androidx.compose.p017ui.layout.InterfaceC0521b
    /* JADX INFO: renamed from: b */
    public final int mo1423b(InterfaceC5645i interfaceC5645i, InterfaceC5644h interfaceC5644h, int i10) {
        C5207g.m11111f(interfaceC5645i, "<this>");
        int iMo2044R = interfaceC5644h.mo2044R(i10);
        float f3 = this.f2418c;
        int iMo1464s0 = !C10017e.m18618a(f3, Float.NaN) ? interfaceC5645i.mo1464s0(f3) : 0;
        if (iMo2044R < iMo1464s0) {
            iMo2044R = iMo1464s0;
        }
        return iMo2044R;
    }

    /* JADX WARN: Code duplicated, block: B:25:0x005d  */
    @Override // androidx.compose.p017ui.layout.InterfaceC0521b
    /* JADX INFO: renamed from: e */
    public final InterfaceC5653q mo1352e(InterfaceC0524e interfaceC0524e, InterfaceC5651o interfaceC5651o, long j10) {
        int iM18605j;
        float f3;
        C5207g.m11111f(interfaceC0524e, "$this$measure");
        float f10 = this.f2417b;
        int iM18604i = 0;
        if (!C10017e.m18618a(f10, Float.NaN) && C10013a.m18605j(j10) == 0) {
            iM18605j = interfaceC0524e.mo1464s0(f10);
            int iM18603h = C10013a.m18603h(j10);
            if (iM18605j > iM18603h) {
                iM18605j = iM18603h;
            }
            if (iM18605j < 0) {
                iM18605j = 0;
            }
            int iM18603h2 = C10013a.m18603h(j10);
            f3 = this.f2418c;
            if (C10017e.m18618a(f3, Float.NaN) && C10013a.m18604i(j10) == 0) {
                int iMo1464s0 = interfaceC0524e.mo1464s0(f3);
                int iM18602g = C10013a.m18602g(j10);
                if (iMo1464s0 > iM18602g) {
                    iMo1464s0 = iM18602g;
                }
                if (iMo1464s0 >= 0) {
                    iM18604i = iMo1464s0;
                }
            } else {
                iM18604i = C10013a.m18604i(j10);
            }
            final AbstractC0526g abstractC0526gMo2048w = interfaceC5651o.mo2048w(C10014b.m18611a(iM18605j, iM18603h2, iM18604i, C10013a.m18602g(j10)));
            return interfaceC0524e.m2043P(abstractC0526gMo2048w.f3686a, abstractC0526gMo2048w.f3687b, C6753d.m13459L0(), new InterfaceC2052l<AbstractC0526g.a, C9072e>() { // from class: androidx.compose.foundation.layout.UnspecifiedConstraintsModifier$measure$1
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
        iM18605j = C10013a.m18605j(j10);
        int iM18603h3 = C10013a.m18603h(j10);
        f3 = this.f2418c;
        if (C10017e.m18618a(f3, Float.NaN)) {
            iM18604i = C10013a.m18604i(j10);
        } else {
            iM18604i = C10013a.m18604i(j10);
        }
        final AbstractC0526g abstractC0526gMo2048w2 = interfaceC5651o.mo2048w(C10014b.m18611a(iM18605j, iM18603h3, iM18604i, C10013a.m18602g(j10)));
        return interfaceC0524e.m2043P(abstractC0526gMo2048w2.f3686a, abstractC0526gMo2048w2.f3687b, C6753d.m13459L0(), new InterfaceC2052l<AbstractC0526g.a, C9072e>() { // from class: androidx.compose.foundation.layout.UnspecifiedConstraintsModifier$measure$1
            {
                super(1);
            }

            @Override // cm.InterfaceC2052l
            /* JADX INFO: renamed from: n */
            public final C9072e mo528n(AbstractC0526g.a aVar) {
                AbstractC0526g.a aVar2 = aVar;
                C5207g.m11111f(aVar2, "$this$layout");
                AbstractC0526g.a.m2059e(aVar2, abstractC0526gMo2048w2, 0, 0);
                return C9072e.f47360a;
            }
        });
    }

    public final boolean equals(Object obj) {
        boolean z10 = false;
        if (!(obj instanceof UnspecifiedConstraintsModifier)) {
            return false;
        }
        UnspecifiedConstraintsModifier unspecifiedConstraintsModifier = (UnspecifiedConstraintsModifier) obj;
        if (C10017e.m18618a(this.f2417b, unspecifiedConstraintsModifier.f2417b) && C10017e.m18618a(this.f2418c, unspecifiedConstraintsModifier.f2418c)) {
            z10 = true;
        }
        return z10;
    }

    @Override // androidx.compose.p017ui.layout.InterfaceC0521b
    /* JADX INFO: renamed from: f */
    public final int mo1424f(InterfaceC5645i interfaceC5645i, InterfaceC5644h interfaceC5644h, int i10) {
        C5207g.m11111f(interfaceC5645i, "<this>");
        int iMo2047u = interfaceC5644h.mo2047u(i10);
        float f3 = this.f2417b;
        int iMo1464s0 = !C10017e.m18618a(f3, Float.NaN) ? interfaceC5645i.mo1464s0(f3) : 0;
        if (iMo2047u < iMo1464s0) {
            iMo2047u = iMo1464s0;
        }
        return iMo2047u;
    }

    @Override // androidx.compose.p017ui.layout.InterfaceC0521b
    /* JADX INFO: renamed from: g */
    public final int mo1425g(InterfaceC5645i interfaceC5645i, InterfaceC5644h interfaceC5644h, int i10) {
        C5207g.m11111f(interfaceC5645i, "<this>");
        int iMo2046s = interfaceC5644h.mo2046s(i10);
        float f3 = this.f2417b;
        int iMo1464s0 = !C10017e.m18618a(f3, Float.NaN) ? interfaceC5645i.mo1464s0(f3) : 0;
        if (iMo2046s < iMo1464s0) {
            iMo2046s = iMo1464s0;
        }
        return iMo2046s;
    }

    public final int hashCode() {
        return Float.hashCode(this.f2418c) + (Float.hashCode(this.f2417b) * 31);
    }
}
