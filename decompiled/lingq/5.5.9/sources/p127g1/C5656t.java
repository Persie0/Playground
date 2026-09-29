package p127g1;

import androidx.compose.p017ui.node.NodeCoordinator;
import androidx.compose.p017ui.platform.AbstractC0664t0;
import androidx.compose.p017ui.platform.C0661s0;
import cm.InterfaceC2052l;
import dm.C5207g;
import sl.C9072e;

/* JADX INFO: renamed from: g1.t */
/* JADX INFO: loaded from: classes.dex */
public final class C5656t extends AbstractC0664t0 implements InterfaceC5655s {

    /* JADX INFO: renamed from: b */
    public final InterfaceC2052l<InterfaceC5647k, C9072e> f34494b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public C5656t(InterfaceC2052l<? super InterfaceC5647k, C9072e> interfaceC2052l, InterfaceC2052l<? super C0661s0, C9072e> interfaceC2052l2) {
        super(interfaceC2052l2);
        C5207g.m11111f(interfaceC2052l2, "inspectorInfo");
        this.f34494b = interfaceC2052l;
    }

    @Override // p127g1.InterfaceC5655s
    /* JADX INFO: renamed from: A */
    public final void mo12014A(NodeCoordinator nodeCoordinator) {
        this.f34494b.mo528n(nodeCoordinator);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C5656t)) {
            return false;
        }
        return C5207g.m11106a(this.f34494b, ((C5656t) obj).f34494b);
    }

    public final int hashCode() {
        return this.f34494b.hashCode();
    }
}
