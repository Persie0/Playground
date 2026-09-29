package p166i1;

import androidx.compose.p017ui.node.LayoutNode;
import dm.C5207g;
import java.util.Comparator;

/* JADX INFO: renamed from: i1.e */
/* JADX INFO: loaded from: classes.dex */
public final class C6141e implements Comparator<LayoutNode> {
    @Override // java.util.Comparator
    public final int compare(LayoutNode layoutNode, LayoutNode layoutNode2) {
        LayoutNode layoutNode3 = layoutNode;
        LayoutNode layoutNode4 = layoutNode2;
        C5207g.m11111f(layoutNode3, "l1");
        C5207g.m11111f(layoutNode4, "l2");
        int iM11113h = C5207g.m11113h(layoutNode3.f3775i, layoutNode4.f3775i);
        return iM11113h != 0 ? iM11113h : C5207g.m11113h(layoutNode3.hashCode(), layoutNode4.hashCode());
    }
}
