package androidx.compose.foundation.layout;

import androidx.activity.result.C0204c;
import androidx.compose.p017ui.layout.AbstractC0526g;
import androidx.compose.p017ui.layout.InterfaceC0521b;
import androidx.compose.p017ui.layout.InterfaceC0524e;
import androidx.compose.p017ui.platform.AbstractC0664t0;
import cm.InterfaceC2052l;
import dm.C5207g;
import kotlin.collections.C6753d;
import p127g1.InterfaceC5651o;
import p127g1.InterfaceC5653q;
import p470x1.C10014b;
import p470x1.C10017e;
import sl.C9072e;

/* JADX INFO: loaded from: classes.dex */
public final class PaddingModifier extends AbstractC0664t0 implements InterfaceC0521b {

    /* JADX INFO: renamed from: b */
    public final float f2367b;

    /* JADX INFO: renamed from: c */
    public final float f2368c;

    /* JADX INFO: renamed from: d */
    public final float f2369d;

    /* JADX INFO: renamed from: e */
    public final float f2370e;

    /* JADX INFO: renamed from: f */
    public final boolean f2371f;

    /* JADX WARN: Unreachable blocks removed: 1, instructions: 1 */
    public PaddingModifier() {
        throw null;
    }

    /* JADX WARN: Code duplicated, block: B:20:0x004a  */
    public PaddingModifier(float f3, float f10, float f11, float f12, InterfaceC2052l interfaceC2052l) {
        super(interfaceC2052l);
        this.f2367b = f3;
        this.f2368c = f10;
        this.f2369d = f11;
        this.f2370e = f12;
        boolean z10 = true;
        this.f2371f = true;
        if (f3 < 0.0f && !C10017e.m18618a(f3, Float.NaN)) {
            z10 = false;
        } else if ((f10 < 0.0f && !C10017e.m18618a(f10, Float.NaN)) || ((f11 < 0.0f && !C10017e.m18618a(f11, Float.NaN)) || (f12 < 0.0f && !C10017e.m18618a(f12, Float.NaN)))) {
            z10 = false;
        }
        if (!z10) {
            throw new IllegalArgumentException("Padding must be non-negative".toString());
        }
    }

    @Override // androidx.compose.p017ui.layout.InterfaceC0521b
    /* JADX INFO: renamed from: e */
    public final InterfaceC5653q mo1352e(final InterfaceC0524e interfaceC0524e, InterfaceC5651o interfaceC5651o, long j10) {
        C5207g.m11111f(interfaceC0524e, "$this$measure");
        int iMo1464s0 = interfaceC0524e.mo1464s0(this.f2369d) + interfaceC0524e.mo1464s0(this.f2367b);
        int iMo1464s1 = interfaceC0524e.mo1464s0(this.f2370e) + interfaceC0524e.mo1464s0(this.f2368c);
        final AbstractC0526g abstractC0526gMo2048w = interfaceC5651o.mo2048w(C10014b.m18617g(-iMo1464s0, -iMo1464s1, j10));
        return interfaceC0524e.m2043P(C10014b.m18616f(abstractC0526gMo2048w.f3686a + iMo1464s0, j10), C10014b.m18615e(abstractC0526gMo2048w.f3687b + iMo1464s1, j10), C6753d.m13459L0(), new InterfaceC2052l<AbstractC0526g.a, C9072e>() { // from class: androidx.compose.foundation.layout.PaddingModifier$measure$1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(1);
            }

            @Override // cm.InterfaceC2052l
            /* JADX INFO: renamed from: n */
            public final C9072e mo528n(AbstractC0526g.a aVar) {
                AbstractC0526g.a aVar2 = aVar;
                C5207g.m11111f(aVar2, "$this$layout");
                PaddingModifier paddingModifier = this.f2372b;
                boolean z10 = paddingModifier.f2371f;
                AbstractC0526g abstractC0526g = abstractC0526gMo2048w;
                float f3 = paddingModifier.f2368c;
                float f10 = paddingModifier.f2367b;
                InterfaceC0524e interfaceC0524e2 = interfaceC0524e;
                if (z10) {
                    AbstractC0526g.a.m2059e(aVar2, abstractC0526g, interfaceC0524e2.mo1464s0(f10), interfaceC0524e2.mo1464s0(f3));
                } else {
                    AbstractC0526g.a.m2057c(aVar2, abstractC0526g, interfaceC0524e2.mo1464s0(f10), interfaceC0524e2.mo1464s0(f3));
                }
                return C9072e.f47360a;
            }
        });
    }

    public final boolean equals(Object obj) {
        PaddingModifier paddingModifier = obj instanceof PaddingModifier ? (PaddingModifier) obj : null;
        return paddingModifier != null && C10017e.m18618a(this.f2367b, paddingModifier.f2367b) && C10017e.m18618a(this.f2368c, paddingModifier.f2368c) && C10017e.m18618a(this.f2369d, paddingModifier.f2369d) && C10017e.m18618a(this.f2370e, paddingModifier.f2370e) && this.f2371f == paddingModifier.f2371f;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f2371f) + C0204c.m846e(this.f2370e, C0204c.m846e(this.f2369d, C0204c.m846e(this.f2368c, Float.hashCode(this.f2367b) * 31, 31), 31), 31);
    }
}
