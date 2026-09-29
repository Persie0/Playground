package androidx.compose.material3;

import androidx.compose.p017ui.layout.AbstractC0526g;
import androidx.compose.p017ui.layout.InterfaceC0521b;
import androidx.compose.p017ui.layout.InterfaceC0524e;
import cm.InterfaceC2052l;
import dm.C5207g;
import kotlin.collections.C6753d;
import p127g1.InterfaceC5651o;
import p127g1.InterfaceC5653q;
import p338qd.C8573r0;
import p470x1.C10019g;
import sl.C9072e;

/* JADX INFO: loaded from: classes.dex */
public final class MinimumTouchTargetModifier implements InterfaceC0521b {

    /* JADX INFO: renamed from: a */
    public final long f2779a;

    public MinimumTouchTargetModifier(long j10) {
        this.f2779a = j10;
    }

    @Override // androidx.compose.p017ui.layout.InterfaceC0521b
    /* JADX INFO: renamed from: e */
    public final InterfaceC5653q mo1352e(InterfaceC0524e interfaceC0524e, InterfaceC5651o interfaceC5651o, long j10) {
        C5207g.m11111f(interfaceC0524e, "$this$measure");
        final AbstractC0526g abstractC0526gMo2048w = interfaceC5651o.mo2048w(j10);
        int i10 = abstractC0526gMo2048w.f3686a;
        long j11 = this.f2779a;
        final int iMax = Math.max(i10, interfaceC0524e.mo1464s0(C10019g.m18624b(j11)));
        final int iMax2 = Math.max(abstractC0526gMo2048w.f3687b, interfaceC0524e.mo1464s0(C10019g.m18623a(j11)));
        return interfaceC0524e.m2043P(iMax, iMax2, C6753d.m13459L0(), new InterfaceC2052l<AbstractC0526g.a, C9072e>() { // from class: androidx.compose.material3.MinimumTouchTargetModifier$measure$1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(1);
            }

            @Override // cm.InterfaceC2052l
            /* JADX INFO: renamed from: n */
            public final C9072e mo528n(AbstractC0526g.a aVar) {
                AbstractC0526g.a aVar2 = aVar;
                C5207g.m11111f(aVar2, "$this$layout");
                AbstractC0526g abstractC0526g = abstractC0526gMo2048w;
                AbstractC0526g.a.m2057c(aVar2, abstractC0526g, C8573r0.m16710Y0((iMax - abstractC0526g.f3686a) / 2.0f), C8573r0.m16710Y0((iMax2 - abstractC0526g.f3687b) / 2.0f));
                return C9072e.f47360a;
            }
        });
    }

    public final boolean equals(Object obj) {
        MinimumTouchTargetModifier minimumTouchTargetModifier = obj instanceof MinimumTouchTargetModifier ? (MinimumTouchTargetModifier) obj : null;
        if (minimumTouchTargetModifier == null) {
            return false;
        }
        int i10 = C10019g.f50972c;
        return this.f2779a == minimumTouchTargetModifier.f2779a;
    }

    public final int hashCode() {
        int i10 = C10019g.f50972c;
        return Long.hashCode(this.f2779a);
    }
}
