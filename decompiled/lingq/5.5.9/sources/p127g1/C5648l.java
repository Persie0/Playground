package p127g1;

import androidx.compose.p017ui.InterfaceC0500b;
import androidx.compose.p017ui.layout.InterfaceC0524e;
import androidx.compose.p017ui.node.InterfaceC0544c;
import cm.InterfaceC2057q;
import dm.C5207g;
import p470x1.C10013a;

/* JADX INFO: renamed from: g1.l */
/* JADX INFO: loaded from: classes.dex */
public final class C5648l extends InterfaceC0500b.c implements InterfaceC0544c {

    /* JADX INFO: renamed from: k */
    public InterfaceC2057q<? super InterfaceC0524e, ? super InterfaceC5651o, ? super C10013a, ? extends InterfaceC5653q> f34492k;

    public C5648l(InterfaceC2057q<? super InterfaceC0524e, ? super InterfaceC5651o, ? super C10013a, ? extends InterfaceC5653q> interfaceC2057q) {
        C5207g.m11111f(interfaceC2057q, "measureBlock");
        this.f34492k = interfaceC2057q;
    }

    @Override // androidx.compose.p017ui.node.InterfaceC0544c
    /* JADX INFO: renamed from: e */
    public final InterfaceC5653q mo1943e(InterfaceC0524e interfaceC0524e, InterfaceC5651o interfaceC5651o, long j10) {
        C5207g.m11111f(interfaceC0524e, "$this$measure");
        return this.f34492k.mo1343M(interfaceC0524e, interfaceC5651o, new C10013a(j10));
    }

    public final String toString() {
        return "LayoutModifierImpl(measureBlock=" + this.f34492k + ')';
    }
}
