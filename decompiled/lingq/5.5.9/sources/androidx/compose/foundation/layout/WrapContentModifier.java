package androidx.compose.foundation.layout;

import ae.C0062b;
import androidx.compose.p017ui.layout.AbstractC0526g;
import androidx.compose.p017ui.layout.InterfaceC0521b;
import androidx.compose.p017ui.layout.InterfaceC0524e;
import androidx.compose.p017ui.platform.AbstractC0664t0;
import androidx.compose.p017ui.platform.C0661s0;
import androidx.compose.p017ui.unit.LayoutDirection;
import cm.InterfaceC2052l;
import cm.InterfaceC2056p;
import dm.C5207g;
import kotlin.collections.C6753d;
import p127g1.InterfaceC5651o;
import p127g1.InterfaceC5653q;
import p385sf.C9000b;
import p470x1.C10013a;
import p470x1.C10014b;
import p470x1.C10020h;
import p470x1.C10022j;
import sl.C9072e;

/* JADX INFO: loaded from: classes.dex */
public final class WrapContentModifier extends AbstractC0664t0 implements InterfaceC0521b {

    /* JADX INFO: renamed from: b */
    public final Direction f2420b;

    /* JADX INFO: renamed from: c */
    public final boolean f2421c;

    /* JADX INFO: renamed from: d */
    public final InterfaceC2056p<C10022j, LayoutDirection, C10020h> f2422d;

    /* JADX INFO: renamed from: e */
    public final Object f2423e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public WrapContentModifier(Direction direction, boolean z10, InterfaceC2056p<? super C10022j, ? super LayoutDirection, C10020h> interfaceC2056p, Object obj, InterfaceC2052l<? super C0661s0, C9072e> interfaceC2052l) {
        super(interfaceC2052l);
        C5207g.m11111f(direction, "direction");
        this.f2420b = direction;
        this.f2421c = z10;
        this.f2422d = interfaceC2056p;
        this.f2423e = obj;
    }

    @Override // androidx.compose.p017ui.layout.InterfaceC0521b
    /* JADX INFO: renamed from: e */
    public final InterfaceC5653q mo1352e(final InterfaceC0524e interfaceC0524e, InterfaceC5651o interfaceC5651o, long j10) {
        C5207g.m11111f(interfaceC0524e, "$this$measure");
        Direction direction = Direction.Vertical;
        int iM18604i = 0;
        Direction direction2 = this.f2420b;
        int iM18605j = direction2 != direction ? 0 : C10013a.m18605j(j10);
        Direction direction3 = Direction.Horizontal;
        if (direction2 == direction3) {
            iM18604i = C10013a.m18604i(j10);
        }
        int iM18602g = Integer.MAX_VALUE;
        boolean z10 = this.f2421c;
        int iM18603h = (direction2 == direction || !z10) ? C10013a.m18603h(j10) : Integer.MAX_VALUE;
        if (direction2 == direction3 || !z10) {
            iM18602g = C10013a.m18602g(j10);
        }
        final AbstractC0526g abstractC0526gMo2048w = interfaceC5651o.mo2048w(C10014b.m18611a(iM18605j, iM18603h, iM18604i, iM18602g));
        final int iM361k0 = C0062b.m361k0(abstractC0526gMo2048w.f3686a, C10013a.m18605j(j10), C10013a.m18603h(j10));
        final int iM361k1 = C0062b.m361k0(abstractC0526gMo2048w.f3687b, C10013a.m18604i(j10), C10013a.m18602g(j10));
        return interfaceC0524e.m2043P(iM361k0, iM361k1, C6753d.m13459L0(), new InterfaceC2052l<AbstractC0526g.a, C9072e>() { // from class: androidx.compose.foundation.layout.WrapContentModifier$measure$1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(1);
            }

            @Override // cm.InterfaceC2052l
            /* JADX INFO: renamed from: n */
            public final C9072e mo528n(AbstractC0526g.a aVar) {
                C5207g.m11111f(aVar, "$this$layout");
                InterfaceC2056p<C10022j, LayoutDirection, C10020h> interfaceC2056p = this.f2424b.f2422d;
                AbstractC0526g abstractC0526g = abstractC0526gMo2048w;
                AbstractC0526g.a.m2058d(abstractC0526g, interfaceC2056p.mo1337m0(new C10022j(C9000b.m17236a(iM361k0 - abstractC0526g.f3686a, iM361k1 - abstractC0526g.f3687b)), interfaceC0524e.getLayoutDirection()).f50975a, 0.0f);
                return C9072e.f47360a;
            }
        });
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof WrapContentModifier)) {
            return false;
        }
        WrapContentModifier wrapContentModifier = (WrapContentModifier) obj;
        return this.f2420b == wrapContentModifier.f2420b && this.f2421c == wrapContentModifier.f2421c && C5207g.m11106a(this.f2423e, wrapContentModifier.f2423e);
    }

    public final int hashCode() {
        return this.f2423e.hashCode() + ((Boolean.hashCode(this.f2421c) + (this.f2420b.hashCode() * 31)) * 31);
    }
}
