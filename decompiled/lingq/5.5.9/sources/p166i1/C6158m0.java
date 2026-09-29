package p166i1;

import android.support.v4.media.session.C0166e;
import androidx.appcompat.widget.C0322j;
import androidx.compose.p017ui.node.C0543b;
import androidx.compose.p017ui.node.InterfaceC0549h;
import androidx.compose.p017ui.node.LayoutNode;
import androidx.compose.p017ui.node.LayoutNodeLayoutDelegate;
import androidx.compose.p017ui.node.NodeCoordinator;
import cm.InterfaceC2041a;
import dm.C5207g;
import p081e0.AbstractC5293a;
import p105f0.C5458f;

/* JADX INFO: renamed from: i1.m0 */
/* JADX INFO: loaded from: classes.dex */
public final class C6158m0 extends AbstractC5293a<LayoutNode> {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C6158m0(LayoutNode layoutNode) {
        super(layoutNode);
        C5207g.m11111f(layoutNode, "root");
    }

    /* JADX WARN: Code duplicated, block: B:42:0x00f2  */
    /* JADX WARN: Code duplicated, block: B:45:0x00fe  */
    /* JADX WARN: Code duplicated, block: B:52:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Unreachable blocks removed: 1, instructions: 1 */
    @Override // p081e0.InterfaceC5299c
    /* JADX INFO: renamed from: a */
    public final void mo11443a(int i10, Object obj) {
        C0543b c0543b;
        C0543b c0543b2;
        InterfaceC0549h interfaceC0549h;
        C5458f c5458f;
        int i11;
        Object[] objArr;
        String strM2123l;
        LayoutNode layoutNode = (LayoutNode) obj;
        C5207g.m11111f(layoutNode, "instance");
        LayoutNode layoutNode2 = (LayoutNode) this.f33565c;
        layoutNode2.getClass();
        int i12 = 0;
        C0543b c0543b3 = null;
        if (!(layoutNode.f3773g == null)) {
            StringBuilder sb2 = new StringBuilder("Cannot insert ");
            sb2.append(layoutNode);
            sb2.append(" because it already has a parent. This tree: ");
            sb2.append(layoutNode2.m2123l(0));
            sb2.append(" Other tree: ");
            LayoutNode layoutNode3 = layoutNode.f3773g;
            if (layoutNode3 != null) {
                strM2123l = c0543b3;
                strM2123l = layoutNode3.m2123l(0);
            }
            strM2123l = c0543b3;
            sb2.append(strM2123l);
            throw new IllegalStateException(sb2.toString().toString());
        }
        if (!(layoutNode.f3774h == null)) {
            throw new IllegalStateException(("Cannot insert " + layoutNode + " because it already has an owner. This tree: " + layoutNode2.m2123l(0) + " Other tree: " + layoutNode.m2123l(0)).toString());
        }
        layoutNode.f3773g = layoutNode2;
        C0322j c0322j = layoutNode2.f3770d;
        ((C5458f) c0322j.f1238b).m11686a(i10, layoutNode);
        ((InterfaceC2041a) c0322j.f1239c).mo807E();
        layoutNode2.m2109E();
        boolean z10 = layoutNode2.f3764a;
        boolean z11 = layoutNode.f3764a;
        if (z11) {
            if (!(!z10)) {
                throw new IllegalArgumentException("Virtual LayoutNode can't be added into a virtual parent".toString());
            }
            layoutNode2.f3768c++;
        }
        layoutNode2.m2135y();
        NodeCoordinator nodeCoordinator = layoutNode.f3758U.f35997c;
        C6166u c6166u = layoutNode2.f3758U;
        if (z10) {
            LayoutNode layoutNode4 = layoutNode2.f3773g;
            if (layoutNode4 != null) {
                c0543b = c0543b3;
                c0543b2 = layoutNode4.f3758U.f35996b;
            }
            nodeCoordinator.f3846i = c0543b2;
            if (z11 && (i11 = (c5458f = (C5458f) layoutNode.f3770d.f1238b).f34019c) > 0) {
                objArr = c5458f.f34017a;
                do {
                    ((LayoutNode) objArr[i12]).f3758U.f35997c.f3846i = c6166u.f35996b;
                    i12++;
                } while (i12 < i11);
            }
            interfaceC0549h = layoutNode2.f3774h;
            if (interfaceC0549h != null) {
                layoutNode.m2120i(interfaceC0549h);
            }
            if (layoutNode.f3759V.f3790h > 0) {
                LayoutNodeLayoutDelegate layoutNodeLayoutDelegate = layoutNode2.f3759V;
                layoutNodeLayoutDelegate.m2142c(layoutNodeLayoutDelegate.f3790h + 1);
            }
        }
        c0543b = c6166u.f35996b;
        c0543b = c0543b3;
        c0543b2 = c0543b;
        nodeCoordinator.f3846i = c0543b2;
        if (z11) {
            objArr = c5458f.f34017a;
            do {
                ((LayoutNode) objArr[i12]).f3758U.f35997c.f3846i = c6166u.f35996b;
                i12++;
            } while (i12 < i11);
        }
        interfaceC0549h = layoutNode2.f3774h;
        if (interfaceC0549h != null) {
            layoutNode.m2120i(interfaceC0549h);
        }
        if (layoutNode.f3759V.f3790h > 0) {
            LayoutNodeLayoutDelegate layoutNodeLayoutDelegate2 = layoutNode2.f3759V;
            layoutNodeLayoutDelegate2.m2142c(layoutNodeLayoutDelegate2.f3790h + 1);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // p081e0.InterfaceC5299c
    /* JADX INFO: renamed from: c */
    public final void mo11444c(int i10, int i11, int i12) {
        LayoutNode layoutNode = (LayoutNode) this.f33565c;
        layoutNode.getClass();
        if (i10 == i11) {
            return;
        }
        for (int i13 = 0; i13 < i12; i13++) {
            int i14 = i10 > i11 ? i10 + i13 : i10;
            int i15 = i10 > i11 ? i11 + i13 : (i11 + i12) - 2;
            C0322j c0322j = layoutNode.f3770d;
            Object objM11697n = ((C5458f) c0322j.f1238b).m11697n(i14);
            ((InterfaceC2041a) c0322j.f1239c).mo807E();
            ((C5458f) c0322j.f1238b).m11686a(i15, (LayoutNode) objM11697n);
            ((InterfaceC2041a) c0322j.f1239c).mo807E();
        }
        layoutNode.m2109E();
        layoutNode.m2135y();
        layoutNode.m2134x();
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // p081e0.InterfaceC5299c
    /* JADX INFO: renamed from: d */
    public final void mo11445d(int i10, int i11) {
        LayoutNode layoutNode = (LayoutNode) this.f33565c;
        layoutNode.getClass();
        if (!(i11 >= 0)) {
            throw new IllegalArgumentException(C0166e.m762h("count (", i11, ") must be greater than 0").toString());
        }
        int i12 = (i11 + i10) - 1;
        if (i10 <= i12) {
            while (true) {
                C0322j c0322j = layoutNode.f3770d;
                Object objM11697n = ((C5458f) c0322j.f1238b).m11697n(i12);
                ((InterfaceC2041a) c0322j.f1239c).mo807E();
                layoutNode.m2108D((LayoutNode) objM11697n);
                if (i12 == i10) {
                    break;
                } else {
                    i12--;
                }
            }
        }
    }

    @Override // p081e0.InterfaceC5299c
    /* JADX INFO: renamed from: f */
    public final void mo11446f(int i10, Object obj) {
        C5207g.m11111f((LayoutNode) obj, "instance");
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // p081e0.InterfaceC5299c
    /* JADX INFO: renamed from: g */
    public final void mo11447g() {
        InterfaceC0549h interfaceC0549h = ((LayoutNode) this.f33563a).f3774h;
        if (interfaceC0549h != null) {
            interfaceC0549h.mo2233l();
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // p081e0.AbstractC5293a
    /* JADX INFO: renamed from: i */
    public final void mo11433i() {
        int i10;
        LayoutNode layoutNode = (LayoutNode) this.f33563a;
        C0322j c0322j = layoutNode.f3770d;
        int i11 = c0322j.f1237a;
        Object obj = c0322j.f1238b;
        switch (i11) {
            case 1:
                i10 = ((C5458f) obj).f34019c;
                break;
            default:
                c0322j.m1215c();
                i10 = ((C5458f) obj).f34019c;
                break;
        }
        int i12 = i10 - 1;
        while (true) {
            Object obj2 = c0322j.f1238b;
            if (-1 >= i12) {
                ((C5458f) obj2).m11691h();
                ((InterfaceC2041a) c0322j.f1239c).mo807E();
                return;
            } else {
                layoutNode.m2108D((LayoutNode) ((C5458f) obj2).f34017a[i12]);
                i12--;
            }
        }
    }
}
