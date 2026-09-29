package p210k1;

import androidx.compose.p017ui.node.LayoutNode;
import androidx.compose.p017ui.semantics.SemanticsNode;
import dm.C5207g;
import p166i1.C6139d;
import p166i1.InterfaceC6154k0;
import p338qd.C8573r0;

/* JADX INFO: renamed from: k1.m */
/* JADX INFO: loaded from: classes.dex */
public final class C6575m {

    /* JADX INFO: renamed from: a */
    public final LayoutNode f37396a;

    public C6575m(LayoutNode layoutNode) {
        C5207g.m11111f(layoutNode, "rootNode");
        this.f37396a = layoutNode;
    }

    /* JADX INFO: renamed from: a */
    public final SemanticsNode m13166a() {
        InterfaceC6154k0 interfaceC6154k0M16750q0 = C8573r0.m16750q0(this.f37396a);
        C5207g.m11108c(interfaceC6154k0M16750q0);
        return new SemanticsNode(interfaceC6154k0M16750q0, false, C6139d.m12652e(interfaceC6154k0M16750q0));
    }
}
