package p166i1;

import androidx.compose.p017ui.InterfaceC0500b;
import androidx.compose.p017ui.node.InterfaceC0549h;
import androidx.compose.p017ui.node.LayoutNode;
import androidx.compose.p017ui.node.NodeCoordinator;
import dm.C5207g;
import java.util.ArrayList;
import p105f0.C5458f;

/* JADX INFO: renamed from: i1.d */
/* JADX INFO: loaded from: classes.dex */
public final class C6139d {
    /* JADX INFO: renamed from: a */
    public static final void m12648a(C5458f c5458f, InterfaceC0500b.c cVar) {
        C5458f<LayoutNode> c5458fM2130t = m12652e(cVar).m2130t();
        int i10 = c5458fM2130t.f34019c;
        if (i10 > 0) {
            int i11 = i10 - 1;
            LayoutNode[] layoutNodeArr = c5458fM2130t.f34017a;
            do {
                c5458f.m11687b(layoutNodeArr[i11].f3758U.f35999e);
                i11--;
            } while (i11 >= 0);
        }
    }

    /* JADX INFO: renamed from: b */
    public static final ArrayList m12649b(InterfaceC6137c interfaceC6137c, int i10) {
        C6166u c6166u;
        if (!interfaceC6137c.mo1934v().f3335j) {
            throw new IllegalStateException("Check failed.".toString());
        }
        InterfaceC0500b.c cVar = interfaceC6137c.mo1934v().f3329d;
        LayoutNode layoutNodeM12652e = m12652e(interfaceC6137c);
        ArrayList arrayList = null;
        while (layoutNodeM12652e != null) {
            if ((layoutNodeM12652e.f3758U.f35999e.f3328c & i10) != 0) {
                while (cVar != null) {
                    if ((cVar.f3327b & i10) != 0) {
                        if (arrayList == null) {
                            arrayList = new ArrayList();
                        }
                        arrayList.add(cVar);
                    }
                    cVar = cVar.f3329d;
                }
            }
            layoutNodeM12652e = layoutNodeM12652e.m2128r();
            cVar = (layoutNodeM12652e == null || (c6166u = layoutNodeM12652e.f3758U) == null) ? null : c6166u.f35998d;
        }
        return arrayList;
    }

    /* JADX INFO: renamed from: c */
    public static final InterfaceC0500b.c m12650c(InterfaceC6137c interfaceC6137c, int i10) {
        C6166u c6166u;
        C5207g.m11111f(interfaceC6137c, "<this>");
        if (!interfaceC6137c.mo1934v().f3335j) {
            throw new IllegalStateException("Check failed.".toString());
        }
        InterfaceC0500b.c cVar = interfaceC6137c.mo1934v().f3329d;
        LayoutNode layoutNodeM12652e = m12652e(interfaceC6137c);
        while (layoutNodeM12652e != null) {
            if ((layoutNodeM12652e.f3758U.f35999e.f3328c & i10) != 0) {
                while (cVar != null) {
                    if ((cVar.f3327b & i10) != 0) {
                        return cVar;
                    }
                    cVar = cVar.f3329d;
                }
            }
            layoutNodeM12652e = layoutNodeM12652e.m2128r();
            cVar = (layoutNodeM12652e == null || (c6166u = layoutNodeM12652e.f3758U) == null) ? null : c6166u.f35998d;
        }
        return null;
    }

    /* JADX INFO: renamed from: d */
    public static final NodeCoordinator m12651d(InterfaceC6137c interfaceC6137c, int i10) {
        C5207g.m11111f(interfaceC6137c, "$this$requireCoordinator");
        NodeCoordinator nodeCoordinator = interfaceC6137c.mo1934v().f3332g;
        C5207g.m11108c(nodeCoordinator);
        if (nodeCoordinator.mo2178e1() != interfaceC6137c || !C6169x.m12694c(i10)) {
            return nodeCoordinator;
        }
        NodeCoordinator nodeCoordinator2 = nodeCoordinator.f3845h;
        C5207g.m11108c(nodeCoordinator2);
        return nodeCoordinator2;
    }

    /* JADX WARN: Unreachable blocks removed: 1, instructions: 1 */
    /* JADX INFO: renamed from: e */
    public static final LayoutNode m12652e(InterfaceC6137c interfaceC6137c) {
        C5207g.m11111f(interfaceC6137c, "<this>");
        NodeCoordinator nodeCoordinator = interfaceC6137c.mo1934v().f3332g;
        if (nodeCoordinator != null) {
            return nodeCoordinator.f3844g;
        }
        throw new IllegalStateException("Required value was null.".toString());
    }

    /* JADX WARN: Unreachable blocks removed: 1, instructions: 1 */
    /* JADX INFO: renamed from: f */
    public static final InterfaceC0549h m12653f(InterfaceC6137c interfaceC6137c) {
        C5207g.m11111f(interfaceC6137c, "<this>");
        InterfaceC0549h interfaceC0549h = m12652e(interfaceC6137c).f3774h;
        if (interfaceC0549h != null) {
            return interfaceC0549h;
        }
        throw new IllegalStateException("Required value was null.".toString());
    }
}
