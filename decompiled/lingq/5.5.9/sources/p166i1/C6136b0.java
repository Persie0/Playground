package p166i1;

import androidx.compose.p017ui.node.LayoutNode;
import dm.C5207g;
import java.util.Comparator;

/* JADX INFO: renamed from: i1.b0 */
/* JADX INFO: loaded from: classes.dex */
public final class C6136b0 implements Comparator<LayoutNode> {

    /* JADX INFO: renamed from: a */
    public static final C6136b0 f35962a = new C6136b0();

    @Override // java.util.Comparator
    public final int compare(LayoutNode layoutNode, LayoutNode layoutNode2) {
        LayoutNode layoutNode3 = layoutNode;
        LayoutNode layoutNode4 = layoutNode2;
        C5207g.m11111f(layoutNode3, "a");
        C5207g.m11111f(layoutNode4, "b");
        int iM11113h = C5207g.m11113h(layoutNode4.f3775i, layoutNode3.f3775i);
        return iM11113h != 0 ? iM11113h : C5207g.m11113h(layoutNode3.hashCode(), layoutNode4.hashCode());
    }
}
