package p166i1;

import androidx.compose.p017ui.node.AlignmentLines;
import androidx.compose.p017ui.node.NodeCoordinator;
import dm.C5207g;
import java.util.Map;
import p127g1.AbstractC5636a;

/* JADX INFO: renamed from: i1.q */
/* JADX INFO: loaded from: classes.dex */
public final class C6162q extends AlignmentLines {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C6162q(InterfaceC6133a interfaceC6133a) {
        super(interfaceC6133a);
        C5207g.m11111f(interfaceC6133a, "alignmentLinesOwner");
    }

    @Override // androidx.compose.p017ui.node.AlignmentLines
    /* JADX INFO: renamed from: b */
    public final long mo2069b(NodeCoordinator nodeCoordinator, long j10) {
        C5207g.m11111f(nodeCoordinator, "$this$calculatePositionInParent");
        return nodeCoordinator.m2197v1(j10);
    }

    @Override // androidx.compose.p017ui.node.AlignmentLines
    /* JADX INFO: renamed from: c */
    public final Map<AbstractC5636a, Integer> mo2070c(NodeCoordinator nodeCoordinator) {
        C5207g.m11111f(nodeCoordinator, "<this>");
        return nodeCoordinator.mo2162P0().mo2040e();
    }

    @Override // androidx.compose.p017ui.node.AlignmentLines
    /* JADX INFO: renamed from: d */
    public final int mo2071d(NodeCoordinator nodeCoordinator, AbstractC5636a abstractC5636a) {
        C5207g.m11111f(abstractC5636a, "alignmentLine");
        return nodeCoordinator.m12682K0(abstractC5636a);
    }
}
