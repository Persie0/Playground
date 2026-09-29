package p142h1;

import android.support.v4.media.AbstractC0140a;
import androidx.compose.p017ui.InterfaceC0500b;
import androidx.compose.p017ui.node.LayoutNode;
import dm.C5207g;
import p166i1.C6139d;
import p166i1.C6166u;
import p166i1.InterfaceC6137c;

/* JADX INFO: renamed from: h1.e */
/* JADX INFO: loaded from: classes.dex */
public interface InterfaceC5874e extends InterfaceC5876g, InterfaceC6137c {
    /* JADX WARN: Unreachable blocks removed: 1, instructions: 1 */
    @Override // p142h1.InterfaceC5876g
    /* JADX INFO: renamed from: c */
    default Object mo2083c(C5877h c5877h) {
        C6166u c6166u;
        C5207g.m11111f(c5877h, "<this>");
        if (!mo1934v().f3335j) {
            throw new IllegalArgumentException("Failed requirement.".toString());
        }
        if (!mo1934v().f3335j) {
            throw new IllegalStateException("Check failed.".toString());
        }
        InterfaceC0500b.c cVar = mo1934v().f3329d;
        LayoutNode layoutNodeM12652e = C6139d.m12652e(this);
        while (layoutNodeM12652e != null) {
            if ((layoutNodeM12652e.f3758U.f35999e.f3328c & 32) != 0) {
                while (cVar != null) {
                    if ((cVar.f3327b & 32) != 0 && (cVar instanceof InterfaceC5874e)) {
                        InterfaceC5874e interfaceC5874e = (InterfaceC5874e) cVar;
                        if (interfaceC5874e.mo2092r().mo602o(c5877h)) {
                            return interfaceC5874e.mo2092r().mo607y(c5877h);
                        }
                    }
                    cVar = cVar.f3329d;
                }
            }
            layoutNodeM12652e = layoutNodeM12652e.m2128r();
            cVar = (layoutNodeM12652e == null || (c6166u = layoutNodeM12652e.f3758U) == null) ? null : c6166u.f35998d;
        }
        return c5877h.f35151a.mo807E();
    }

    /* JADX INFO: renamed from: r */
    default AbstractC0140a mo2092r() {
        return C5871b.f35150a;
    }
}
