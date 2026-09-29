package p166i1;

import androidx.compose.p017ui.layout.AbstractC0526g;
import androidx.compose.p017ui.layout.InterfaceC0524e;
import androidx.compose.p017ui.node.LayoutNode;
import androidx.compose.p017ui.node.LayoutNodeLayoutDelegate;
import androidx.compose.p017ui.node.NodeCoordinator;
import dm.C5207g;
import p127g1.AbstractC5636a;
import p127g1.InterfaceC5647k;
import p127g1.InterfaceC5653q;
import p470x1.C10020h;

/* JADX INFO: renamed from: i1.s */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC6164s extends AbstractC0526g implements InterfaceC0524e {

    /* JADX INFO: renamed from: e */
    public boolean f35993e;

    /* JADX INFO: renamed from: f */
    public boolean f35994f;

    /* JADX INFO: renamed from: S0 */
    public static void m12681S0(NodeCoordinator nodeCoordinator) {
        C6162q c6162q;
        C5207g.m11111f(nodeCoordinator, "<this>");
        NodeCoordinator nodeCoordinator2 = nodeCoordinator.f3845h;
        LayoutNode layoutNode = nodeCoordinator2 != null ? nodeCoordinator2.f3844g : null;
        LayoutNode layoutNode2 = nodeCoordinator.f3844g;
        if (!C5207g.m11106a(layoutNode, layoutNode2)) {
            layoutNode2.f3759V.f3791i.f3802l.m2074g();
            return;
        }
        InterfaceC6133a interfaceC6133aMo2154j = layoutNode2.f3759V.f3791i.mo2154j();
        if (interfaceC6133aMo2154j != null && (c6162q = ((LayoutNodeLayoutDelegate.MeasurePassDelegate) interfaceC6133aMo2154j).f3802l) != null) {
            c6162q.m2074g();
        }
    }

    /* JADX INFO: renamed from: J0 */
    public abstract int mo2208J0(AbstractC5636a abstractC5636a);

    /* JADX INFO: renamed from: K0 */
    public final int m12682K0(AbstractC5636a abstractC5636a) {
        int iMo2208J0;
        C5207g.m11111f(abstractC5636a, "alignmentLine");
        if (mo2160N0() && (iMo2208J0 = mo2208J0(abstractC5636a)) != Integer.MIN_VALUE) {
            return C10020h.m18625a(m2053V()) + iMo2208J0;
        }
        return Integer.MIN_VALUE;
    }

    /* JADX INFO: renamed from: L0 */
    public abstract AbstractC6164s mo2157L0();

    /* JADX INFO: renamed from: M0 */
    public abstract InterfaceC5647k mo2158M0();

    /* JADX INFO: renamed from: N0 */
    public abstract boolean mo2160N0();

    /* JADX INFO: renamed from: O0 */
    public abstract LayoutNode mo2161O0();

    /* JADX INFO: renamed from: P0 */
    public abstract InterfaceC5653q mo2162P0();

    /* JADX INFO: renamed from: Q0 */
    public abstract AbstractC6164s mo2163Q0();

    /* JADX INFO: renamed from: R0 */
    public abstract long mo2164R0();

    /* JADX INFO: renamed from: T0 */
    public abstract void mo2165T0();
}
