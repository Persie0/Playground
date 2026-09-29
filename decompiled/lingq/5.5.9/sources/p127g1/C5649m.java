package p127g1;

import androidx.compose.p017ui.node.AbstractC0546e;
import androidx.compose.p017ui.node.NodeCoordinator;
import dm.C5207g;
import p375s0.C8942d;

/* JADX INFO: renamed from: g1.m */
/* JADX INFO: loaded from: classes.dex */
public final class C5649m implements InterfaceC5647k {

    /* JADX INFO: renamed from: a */
    public final AbstractC0546e f34493a;

    public C5649m(AbstractC0546e abstractC0546e) {
        C5207g.m11111f(abstractC0546e, "lookaheadDelegate");
        this.f34493a = abstractC0546e;
    }

    @Override // p127g1.InterfaceC5647k
    /* JADX INFO: renamed from: A */
    public final NodeCoordinator mo2156A() {
        return this.f34493a.f3905g.mo2156A();
    }

    @Override // p127g1.InterfaceC5647k
    /* JADX INFO: renamed from: N */
    public final long mo2159N(long j10) {
        return this.f34493a.f3905g.mo2159N(j10);
    }

    @Override // p127g1.InterfaceC5647k
    /* JADX INFO: renamed from: b */
    public final long mo2173b(long j10) {
        return this.f34493a.f3905g.mo2173b(j10);
    }

    @Override // p127g1.InterfaceC5647k
    /* JADX INFO: renamed from: c */
    public final long mo2175c() {
        return this.f34493a.f3905g.f3688c;
    }

    @Override // p127g1.InterfaceC5647k
    /* JADX INFO: renamed from: q */
    public final boolean mo2190q() {
        return this.f34493a.f3905g.mo2190q();
    }

    @Override // p127g1.InterfaceC5647k
    /* JADX INFO: renamed from: t */
    public final C8942d mo2194t(InterfaceC5647k interfaceC5647k, boolean z10) {
        C5207g.m11111f(interfaceC5647k, "sourceCoordinates");
        return this.f34493a.f3905g.mo2194t(interfaceC5647k, z10);
    }
}
