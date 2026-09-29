package androidx.compose.foundation.layout;

import androidx.compose.p017ui.layout.AbstractC0526g;
import androidx.compose.p017ui.layout.InterfaceC0521b;
import androidx.compose.p017ui.layout.InterfaceC0524e;
import androidx.compose.p017ui.platform.AbstractC0664t0;
import androidx.compose.p017ui.platform.C0661s0;
import androidx.compose.p017ui.unit.LayoutDirection;
import cm.InterfaceC2052l;
import dm.C5207g;
import kotlin.collections.C6753d;
import p127g1.InterfaceC5651o;
import p127g1.InterfaceC5653q;
import p443w.InterfaceC9781l;
import p470x1.C10014b;
import sl.C9072e;

/* JADX INFO: loaded from: classes.dex */
public final class PaddingValuesModifier extends AbstractC0664t0 implements InterfaceC0521b {

    /* JADX INFO: renamed from: b */
    public final InterfaceC9781l f2375b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public PaddingValuesModifier(InterfaceC9781l interfaceC9781l, InterfaceC2052l<? super C0661s0, C9072e> interfaceC2052l) {
        super(interfaceC2052l);
        C5207g.m11111f(interfaceC2052l, "inspectorInfo");
        this.f2375b = interfaceC9781l;
    }

    /* JADX WARN: Unreachable blocks removed: 1, instructions: 1 */
    @Override // androidx.compose.p017ui.layout.InterfaceC0521b
    /* JADX INFO: renamed from: e */
    public final InterfaceC5653q mo1352e(final InterfaceC0524e interfaceC0524e, InterfaceC5651o interfaceC5651o, long j10) {
        C5207g.m11111f(interfaceC0524e, "$this$measure");
        LayoutDirection layoutDirection = interfaceC0524e.getLayoutDirection();
        InterfaceC9781l interfaceC9781l = this.f2375b;
        boolean z10 = false;
        float f3 = 0;
        if (Float.compare(interfaceC9781l.mo18275b(layoutDirection), f3) >= 0 && Float.compare(interfaceC9781l.mo18277d(), f3) >= 0 && Float.compare(interfaceC9781l.mo18276c(interfaceC0524e.getLayoutDirection()), f3) >= 0 && Float.compare(interfaceC9781l.mo18274a(), f3) >= 0) {
            z10 = true;
        }
        if (!z10) {
            throw new IllegalArgumentException("Padding must be non-negative".toString());
        }
        int iMo1464s0 = interfaceC0524e.mo1464s0(interfaceC9781l.mo18276c(interfaceC0524e.getLayoutDirection())) + interfaceC0524e.mo1464s0(interfaceC9781l.mo18275b(interfaceC0524e.getLayoutDirection()));
        int iMo1464s1 = interfaceC0524e.mo1464s0(interfaceC9781l.mo18274a()) + interfaceC0524e.mo1464s0(interfaceC9781l.mo18277d());
        final AbstractC0526g abstractC0526gMo2048w = interfaceC5651o.mo2048w(C10014b.m18617g(-iMo1464s0, -iMo1464s1, j10));
        return interfaceC0524e.m2043P(C10014b.m18616f(abstractC0526gMo2048w.f3686a + iMo1464s0, j10), C10014b.m18615e(abstractC0526gMo2048w.f3687b + iMo1464s1, j10), C6753d.m13459L0(), new InterfaceC2052l<AbstractC0526g.a, C9072e>() { // from class: androidx.compose.foundation.layout.PaddingValuesModifier$measure$2
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(1);
            }

            @Override // cm.InterfaceC2052l
            /* JADX INFO: renamed from: n */
            public final C9072e mo528n(AbstractC0526g.a aVar) {
                AbstractC0526g.a aVar2 = aVar;
                C5207g.m11111f(aVar2, "$this$layout");
                PaddingValuesModifier paddingValuesModifier = this;
                InterfaceC9781l interfaceC9781l2 = paddingValuesModifier.f2375b;
                InterfaceC0524e interfaceC0524e2 = interfaceC0524e;
                AbstractC0526g.a.m2057c(aVar2, abstractC0526gMo2048w, interfaceC0524e2.mo1464s0(interfaceC9781l2.mo18275b(interfaceC0524e2.getLayoutDirection())), interfaceC0524e2.mo1464s0(paddingValuesModifier.f2375b.mo18277d()));
                return C9072e.f47360a;
            }
        });
    }

    public final boolean equals(Object obj) {
        PaddingValuesModifier paddingValuesModifier = obj instanceof PaddingValuesModifier ? (PaddingValuesModifier) obj : null;
        if (paddingValuesModifier == null) {
            return false;
        }
        return C5207g.m11106a(this.f2375b, paddingValuesModifier.f2375b);
    }

    public final int hashCode() {
        return this.f2375b.hashCode();
    }
}
