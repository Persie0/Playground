package p166i1;

import androidx.compose.p017ui.InterfaceC0500b;
import androidx.compose.p017ui.focus.FocusTargetModifierNode;
import androidx.compose.p017ui.layout.InterfaceC0521b;
import androidx.compose.p017ui.node.InterfaceC0544c;
import androidx.compose.p017ui.node.LayoutNodeLayoutDelegate;
import androidx.compose.p017ui.node.NodeCoordinator;
import com.kochava.tracker.BuildConfig;
import dm.C5207g;
import p060d1.InterfaceC5034u;
import p105f0.C5458f;
import p127g1.C5650n;
import p127g1.InterfaceC5643g;
import p127g1.InterfaceC5655s;
import p127g1.InterfaceC5657u;
import p127g1.InterfaceC5658v;
import p127g1.InterfaceC5660x;
import p142h1.InterfaceC5873d;
import p142h1.InterfaceC5875f;
import p210k1.InterfaceC6573k;
import p327q0.InterfaceC8460f;
import p351r0.InterfaceC8685d;
import p351r0.InterfaceC8686e;
import p351r0.InterfaceC8689h;
import p351r0.InterfaceC8692k;

/* JADX INFO: renamed from: i1.x */
/* JADX INFO: loaded from: classes.dex */
public final class C6169x {
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Unreachable blocks removed: 1, instructions: 1 */
    /* JADX INFO: renamed from: a */
    public static final void m12692a(InterfaceC0500b.c cVar, int i10) {
        if (!cVar.f3335j) {
            throw new IllegalStateException("Check failed.".toString());
        }
        boolean z10 = false;
        if (((cVar.f3327b & 2) != 0) && (cVar instanceof InterfaceC0544c)) {
            C6139d.m12652e((InterfaceC0544c) cVar).m2134x();
            if (i10 == 2) {
                NodeCoordinator nodeCoordinatorM12651d = C6139d.m12651d(cVar, 2);
                nodeCoordinatorM12651d.f3847j = true;
                if (nodeCoordinatorM12651d.f3843T != null) {
                    nodeCoordinatorM12651d.m2187n1(null, false);
                }
            }
        }
        if (((cVar.f3327b & 256) != 0) && (cVar instanceof InterfaceC6149i)) {
            C6139d.m12652e(cVar).m2134x();
        }
        if (((cVar.f3327b & 4) != 0) && (cVar instanceof InterfaceC6143f)) {
            C6145g.m12654a((InterfaceC6143f) cVar);
        }
        if (((cVar.f3327b & 8) != 0) && (cVar instanceof InterfaceC6154k0)) {
            C6139d.m12653f((InterfaceC6154k0) cVar).mo2234m();
        }
        if (((cVar.f3327b & 64) != 0) && (cVar instanceof InterfaceC6144f0)) {
            LayoutNodeLayoutDelegate layoutNodeLayoutDelegate = C6139d.m12652e((InterfaceC6144f0) cVar).f3759V;
            layoutNodeLayoutDelegate.f3791i.f3800j = true;
            layoutNodeLayoutDelegate.getClass();
        }
        if (((cVar.f3327b & 1024) != 0) && (cVar instanceof FocusTargetModifierNode)) {
            if (i10 == 2) {
                cVar.mo1933H();
            } else {
                C6139d.m12653f(cVar).getFocusOwner().mo1960g((FocusTargetModifierNode) cVar);
            }
        }
        if (((cVar.f3327b & 2048) != 0) && (cVar instanceof InterfaceC8692k)) {
            InterfaceC8692k interfaceC8692k = (InterfaceC8692k) cVar;
            C6135b.f35961b = null;
            interfaceC8692k.mo2087m(C6135b.f35960a);
            if (C6135b.f35961b != null) {
                if (i10 != 2) {
                    C6139d.m12653f(cVar).getFocusOwner().mo1954a(interfaceC8692k);
                } else {
                    if (!interfaceC8692k.mo1934v().f3335j) {
                        throw new IllegalStateException("Check failed.".toString());
                    }
                    C5458f c5458f = new C5458f(new InterfaceC0500b.c[16]);
                    InterfaceC0500b.c cVar2 = interfaceC8692k.mo1934v().f3330e;
                    if (cVar2 == null) {
                        C6139d.m12648a(c5458f, interfaceC8692k.mo1934v());
                    } else {
                        c5458f.m11687b(cVar2);
                    }
                    while (c5458f.m11695l()) {
                        InterfaceC0500b.c cVar3 = (InterfaceC0500b.c) c5458f.m11697n(c5458f.f34019c - 1);
                        if ((cVar3.f3328c & 1024) == 0) {
                            C6139d.m12648a(c5458f, cVar3);
                        } else {
                            while (cVar3 != null) {
                                if ((cVar3.f3327b & 1024) != 0) {
                                    if (!(cVar3 instanceof FocusTargetModifierNode)) {
                                        break;
                                    }
                                    C6139d.m12653f(interfaceC8692k).getFocusOwner().mo1960g((FocusTargetModifierNode) cVar3);
                                    break;
                                }
                                cVar3 = cVar3.f3330e;
                            }
                        }
                    }
                }
            }
        }
        if ((cVar.f3327b & 4096) != 0) {
            z10 = true;
        }
        if (z10 && (cVar instanceof InterfaceC8686e) && i10 != 2) {
            C6139d.m12653f(cVar).getFocusOwner().mo1958e((InterfaceC8686e) cVar);
        }
    }

    /* JADX INFO: renamed from: b */
    public static final int m12693b(InterfaceC0500b.b bVar) {
        C5207g.m11111f(bVar, "element");
        int i10 = bVar instanceof InterfaceC0521b ? 3 : 1;
        if (bVar instanceof InterfaceC5643g) {
            i10 |= 512;
        }
        if (bVar instanceof InterfaceC8460f) {
            i10 |= 4;
        }
        if (bVar instanceof InterfaceC6573k) {
            i10 |= 8;
        }
        if (bVar instanceof InterfaceC5034u) {
            i10 |= 16;
        }
        if ((bVar instanceof InterfaceC5873d) || (bVar instanceof InterfaceC5875f)) {
            i10 |= 32;
        }
        if (bVar instanceof InterfaceC8685d) {
            i10 |= 4096;
        }
        if (bVar instanceof InterfaceC8689h) {
            i10 |= 2048;
        }
        if (bVar instanceof InterfaceC5655s) {
            i10 |= 256;
        }
        if (bVar instanceof InterfaceC5660x) {
            i10 |= 64;
        }
        if (!(bVar instanceof InterfaceC5657u) && !(bVar instanceof InterfaceC5658v) && !(bVar instanceof C5650n)) {
            return i10;
        }
        return i10 | BuildConfig.SDK_TRUNCATE_LENGTH;
    }

    /* JADX INFO: renamed from: c */
    public static final boolean m12694c(int i10) {
        return (i10 & BuildConfig.SDK_TRUNCATE_LENGTH) != 0;
    }
}
