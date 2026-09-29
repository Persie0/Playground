package p166i1;

import androidx.compose.p017ui.InterfaceC0500b;
import androidx.compose.p017ui.node.LayoutNode;
import androidx.compose.p017ui.node.LayoutNodeLayoutDelegate;
import p105f0.C5458f;

/* JADX INFO: renamed from: i1.c0 */
/* JADX INFO: loaded from: classes.dex */
public final class C6138c0 {

    /* JADX INFO: renamed from: a */
    public final C5458f<LayoutNode> f35963a = new C5458f<>(new LayoutNode[16]);

    /* JADX INFO: renamed from: a */
    public static void m12647a(LayoutNode layoutNode) {
        LayoutNodeLayoutDelegate layoutNodeLayoutDelegate = layoutNode.f3759V;
        if (layoutNodeLayoutDelegate.f3784b == LayoutNode.LayoutState.Idle && !layoutNodeLayoutDelegate.f3786d && !layoutNodeLayoutDelegate.f3785c && layoutNode.f3749L) {
            InterfaceC0500b.c cVar = layoutNode.f3758U.f35999e;
            if ((cVar.f3328c & 256) != 0) {
                while (cVar != null) {
                    if ((cVar.f3327b & 256) != 0 && (cVar instanceof InterfaceC6149i)) {
                        InterfaceC6149i interfaceC6149i = (InterfaceC6149i) cVar;
                        interfaceC6149i.mo2077A(C6139d.m12651d(interfaceC6149i, 256));
                    }
                    if ((cVar.f3328c & 256) == 0) {
                        break;
                    } else {
                        cVar = cVar.f3330e;
                    }
                }
            }
        }
        int i10 = 0;
        layoutNode.f3765a0 = false;
        C5458f<LayoutNode> c5458fM2130t = layoutNode.m2130t();
        int i11 = c5458fM2130t.f34019c;
        if (i11 > 0) {
            LayoutNode[] layoutNodeArr = c5458fM2130t.f34017a;
            do {
                m12647a(layoutNodeArr[i10]);
                i10++;
            } while (i10 < i11);
        }
    }
}
