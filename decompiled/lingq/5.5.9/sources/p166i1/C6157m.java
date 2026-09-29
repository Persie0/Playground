package p166i1;

import androidx.compose.p017ui.node.LayoutNode;
import androidx.compose.runtime.ParcelableSnapshotMutableState;
import dm.C5207g;
import p127g1.InterfaceC5652p;
import p338qd.C8573r0;

/* JADX INFO: renamed from: i1.m */
/* JADX INFO: loaded from: classes.dex */
public final class C6157m {

    /* JADX INFO: renamed from: a */
    public final LayoutNode f35979a;

    /* JADX INFO: renamed from: b */
    public final ParcelableSnapshotMutableState f35980b;

    public C6157m(LayoutNode layoutNode) {
        C5207g.m11111f(layoutNode, "layoutNode");
        this.f35979a = layoutNode;
        this.f35980b = C8573r0.m16684L0(null);
    }

    /* JADX INFO: renamed from: a */
    public final InterfaceC5652p m12667a() {
        InterfaceC5652p interfaceC5652p = (InterfaceC5652p) this.f35980b.getValue();
        if (interfaceC5652p != null) {
            return interfaceC5652p;
        }
        throw new IllegalStateException("Intrinsic size is queried but there is no measure policy in place.".toString());
    }
}
