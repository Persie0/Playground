package p386t;

import androidx.compose.foundation.FocusedBoundsKt;
import androidx.compose.p017ui.node.NodeCoordinator;
import cm.InterfaceC2052l;
import dm.C5207g;
import p127g1.InterfaceC5647k;
import p127g1.InterfaceC5655s;
import p142h1.InterfaceC5873d;
import p142h1.InterfaceC5876g;
import sl.C9072e;

/* JADX INFO: renamed from: t.n */
/* JADX INFO: loaded from: classes.dex */
public final class C9122n implements InterfaceC5873d, InterfaceC5655s {

    /* JADX INFO: renamed from: a */
    public InterfaceC2052l<? super InterfaceC5647k, C9072e> f47626a;

    /* JADX INFO: renamed from: b */
    public InterfaceC5647k f47627b;

    @Override // p127g1.InterfaceC5655s
    /* JADX INFO: renamed from: A */
    public final void mo12014A(NodeCoordinator nodeCoordinator) {
        InterfaceC2052l<? super InterfaceC5647k, C9072e> interfaceC2052l;
        this.f47627b = nodeCoordinator;
        if (!nodeCoordinator.mo2190q()) {
            InterfaceC2052l<? super InterfaceC5647k, C9072e> interfaceC2052l2 = this.f47626a;
            if (interfaceC2052l2 != null) {
                interfaceC2052l2.mo528n(null);
                return;
            }
            return;
        }
        InterfaceC5647k interfaceC5647k = this.f47627b;
        if (interfaceC5647k == null || !interfaceC5647k.mo2190q() || (interfaceC2052l = this.f47626a) == null) {
            return;
        }
        interfaceC2052l.mo528n(this.f47627b);
    }

    @Override // p142h1.InterfaceC5873d
    /* JADX INFO: renamed from: X */
    public final void mo1428X(InterfaceC5876g interfaceC5876g) {
        InterfaceC2052l<? super InterfaceC5647k, C9072e> interfaceC2052l;
        C5207g.m11111f(interfaceC5876g, "scope");
        InterfaceC2052l<? super InterfaceC5647k, C9072e> interfaceC2052l2 = (InterfaceC2052l) interfaceC5876g.mo2083c(FocusedBoundsKt.f1840a);
        if (interfaceC2052l2 == null && (interfaceC2052l = this.f47626a) != null) {
            interfaceC2052l.mo528n(null);
        }
        this.f47626a = interfaceC2052l2;
    }
}
