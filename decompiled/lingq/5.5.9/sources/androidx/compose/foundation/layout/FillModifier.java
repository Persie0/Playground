package androidx.compose.foundation.layout;

import ae.C0062b;
import androidx.compose.p017ui.layout.AbstractC0526g;
import androidx.compose.p017ui.layout.InterfaceC0521b;
import androidx.compose.p017ui.layout.InterfaceC0524e;
import androidx.compose.p017ui.platform.AbstractC0664t0;
import androidx.compose.p017ui.platform.C0661s0;
import cm.InterfaceC2052l;
import dm.C5207g;
import kotlin.collections.C6753d;
import p127g1.InterfaceC5651o;
import p127g1.InterfaceC5653q;
import p338qd.C8573r0;
import p470x1.C10013a;
import p470x1.C10014b;
import sl.C9072e;

/* JADX INFO: loaded from: classes.dex */
public final class FillModifier extends AbstractC0664t0 implements InterfaceC0521b {

    /* JADX INFO: renamed from: b */
    public final Direction f2331b;

    /* JADX INFO: renamed from: c */
    public final float f2332c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public FillModifier(Direction direction, float f3, InterfaceC2052l<? super C0661s0, C9072e> interfaceC2052l) {
        super(interfaceC2052l);
        C5207g.m11111f(direction, "direction");
        this.f2331b = direction;
        this.f2332c = f3;
    }

    @Override // androidx.compose.p017ui.layout.InterfaceC0521b
    /* JADX INFO: renamed from: e */
    public final InterfaceC5653q mo1352e(InterfaceC0524e interfaceC0524e, InterfaceC5651o interfaceC5651o, long j10) {
        int iM18605j;
        int iM18603h;
        int iM18602g;
        int iM361k0;
        C5207g.m11111f(interfaceC0524e, "$this$measure");
        boolean zM18599d = C10013a.m18599d(j10);
        float f3 = this.f2332c;
        Direction direction = this.f2331b;
        if (!zM18599d || direction == Direction.Vertical) {
            iM18605j = C10013a.m18605j(j10);
            iM18603h = C10013a.m18603h(j10);
        } else {
            iM18605j = C0062b.m361k0(C8573r0.m16710Y0(C10013a.m18603h(j10) * f3), C10013a.m18605j(j10), C10013a.m18603h(j10));
            iM18603h = iM18605j;
        }
        if (!C10013a.m18598c(j10) || direction == Direction.Horizontal) {
            int iM18604i = C10013a.m18604i(j10);
            iM18602g = C10013a.m18602g(j10);
            iM361k0 = iM18604i;
        } else {
            iM361k0 = C0062b.m361k0(C8573r0.m16710Y0(C10013a.m18602g(j10) * f3), C10013a.m18604i(j10), C10013a.m18602g(j10));
            iM18602g = iM361k0;
        }
        final AbstractC0526g abstractC0526gMo2048w = interfaceC5651o.mo2048w(C10014b.m18611a(iM18605j, iM18603h, iM361k0, iM18602g));
        return interfaceC0524e.m2043P(abstractC0526gMo2048w.f3686a, abstractC0526gMo2048w.f3687b, C6753d.m13459L0(), new InterfaceC2052l<AbstractC0526g.a, C9072e>() { // from class: androidx.compose.foundation.layout.FillModifier$measure$1
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
        if (obj instanceof FillModifier) {
            FillModifier fillModifier = (FillModifier) obj;
            if (this.f2331b == fillModifier.f2331b) {
                if (this.f2332c == fillModifier.f2332c) {
                    z10 = true;
                }
            }
        }
        return z10;
    }

    public final int hashCode() {
        return Float.hashCode(this.f2332c) + (this.f2331b.hashCode() * 31);
    }
}
