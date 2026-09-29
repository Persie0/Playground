package p468x;

import androidx.compose.foundation.relocation.BringIntoViewKt;
import androidx.compose.p017ui.node.NodeCoordinator;
import dm.C5207g;
import p127g1.InterfaceC5647k;
import p127g1.InterfaceC5657u;
import p142h1.InterfaceC5873d;
import p142h1.InterfaceC5876g;

/* JADX INFO: renamed from: x.b */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC9994b implements InterfaceC5873d, InterfaceC5657u {

    /* JADX INFO: renamed from: a */
    public final InterfaceC9995c f50808a;

    /* JADX INFO: renamed from: b */
    public InterfaceC9995c f50809b;

    /* JADX INFO: renamed from: c */
    public InterfaceC5647k f50810c;

    public AbstractC9994b(C9993a c9993a) {
        C5207g.m11111f(c9993a, "defaultParent");
        this.f50808a = c9993a;
    }

    @Override // p142h1.InterfaceC5873d
    /* JADX INFO: renamed from: X */
    public final void mo1428X(InterfaceC5876g interfaceC5876g) {
        C5207g.m11111f(interfaceC5876g, "scope");
        this.f50809b = (InterfaceC9995c) interfaceC5876g.mo2083c(BringIntoViewKt.f2437a);
    }

    /* JADX INFO: renamed from: d */
    public final InterfaceC5647k m18582d() {
        InterfaceC5647k interfaceC5647k = this.f50810c;
        if (interfaceC5647k == null || !interfaceC5647k.mo2190q()) {
            return null;
        }
        return interfaceC5647k;
    }

    @Override // p127g1.InterfaceC5657u
    /* JADX INFO: renamed from: q */
    public final void mo1441q(NodeCoordinator nodeCoordinator) {
        C5207g.m11111f(nodeCoordinator, "coordinates");
        this.f50810c = nodeCoordinator;
    }
}
