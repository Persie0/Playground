package p166i1;

import ae.C0062b;
import android.support.v4.media.AbstractC0140a;
import androidx.compose.p017ui.InterfaceC0500b;
import androidx.compose.p017ui.node.LayoutNode;
import androidx.compose.p017ui.node.NodeCoordinator;
import androidx.compose.p017ui.unit.LayoutDirection;
import dm.C5207g;
import p385sf.C9000b;
import p387t0.AbstractC9161o;
import p387t0.C9151j;
import p387t0.C9170v;
import p387t0.InterfaceC9138c0;
import p387t0.InterfaceC9165q;
import p387t0.InterfaceC9174z;
import p424v0.C9617a;
import p424v0.InterfaceC9619c;
import p424v0.InterfaceC9621e;
import p470x1.InterfaceC10015c;

/* JADX INFO: renamed from: i1.r */
/* JADX INFO: loaded from: classes.dex */
public final class C6163r implements InterfaceC9621e, InterfaceC9619c {

    /* JADX INFO: renamed from: a */
    public final C9617a f35991a = new C9617a();

    /* JADX INFO: renamed from: b */
    public InterfaceC6143f f35992b;

    @Override // p470x1.InterfaceC10015c
    /* JADX INFO: renamed from: A0 */
    public final float mo1459A0(long j10) {
        return this.f35991a.mo1459A0(j10);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // p424v0.InterfaceC9619c
    /* JADX INFO: renamed from: E0 */
    public final void mo12668E0() {
        InterfaceC0500b.c cVar;
        InterfaceC6143f interfaceC6143f;
        InterfaceC9165q interfaceC9165qMo18080b = this.f35991a.f49285b.mo18080b();
        InterfaceC6143f interfaceC6143f2 = this.f35992b;
        C5207g.m11108c(interfaceC6143f2);
        InterfaceC0500b.c cVar2 = interfaceC6143f2.mo1934v().f3330e;
        if (cVar2 != null && (cVar2.f3328c & 4) != 0) {
            while (true) {
                if (cVar != 0) {
                    int i10 = cVar.f3327b;
                    if ((i10 & 2) == 0) {
                        if ((i10 & 4) != 0) {
                            interfaceC6143f = (InterfaceC6143f) cVar;
                            break;
                        }
                        cVar = cVar.f3330e;
                    }
                }
                cVar = cVar2;
                interfaceC6143f = null;
                break;
            }
        } else {
            cVar = cVar2;
            interfaceC6143f = null;
            break;
        }
        InterfaceC6143f interfaceC6143f3 = interfaceC6143f;
        if (interfaceC6143f3 == null) {
            NodeCoordinator nodeCoordinatorM12651d = C6139d.m12651d(interfaceC6143f2, 4);
            if (nodeCoordinatorM12651d.mo2178e1() == interfaceC6143f2) {
                nodeCoordinatorM12651d = nodeCoordinatorM12651d.f3845h;
                C5207g.m11108c(nodeCoordinatorM12651d);
            }
            nodeCoordinatorM12651d.mo2192r1(interfaceC9165qMo18080b);
            return;
        }
        C5207g.m11111f(interfaceC9165qMo18080b, "canvas");
        NodeCoordinator nodeCoordinatorM12651d2 = C6139d.m12651d(interfaceC6143f3, 4);
        long jM17259y = C9000b.m17259y(nodeCoordinatorM12651d2.f3688c);
        LayoutNode layoutNode = nodeCoordinatorM12651d2.f3844g;
        layoutNode.getClass();
        C0062b.m296O1(layoutNode).getSharedDrawScope().m12672a(interfaceC9165qMo18080b, jM17259y, nodeCoordinatorM12651d2, interfaceC6143f3);
    }

    @Override // p424v0.InterfaceC9621e
    /* JADX INFO: renamed from: L */
    public final void mo12669L(AbstractC9161o abstractC9161o, long j10, long j11, float f3, AbstractC0140a abstractC0140a, C9170v c9170v, int i10) {
        C5207g.m11111f(abstractC9161o, "brush");
        C5207g.m11111f(abstractC0140a, "style");
        this.f35991a.mo12669L(abstractC9161o, j10, j11, f3, abstractC0140a, c9170v, i10);
    }

    @Override // p424v0.InterfaceC9621e
    /* JADX INFO: renamed from: S */
    public final void mo12670S(C9151j c9151j, long j10, float f3, AbstractC0140a abstractC0140a, C9170v c9170v, int i10) {
        C5207g.m11111f(c9151j, "path");
        C5207g.m11111f(abstractC0140a, "style");
        this.f35991a.mo12670S(c9151j, j10, f3, abstractC0140a, c9170v, i10);
    }

    @Override // p470x1.InterfaceC10015c
    /* JADX INFO: renamed from: W */
    public final float mo1460W(int i10) {
        return this.f35991a.mo1460W(i10);
    }

    @Override // p424v0.InterfaceC9621e
    /* JADX INFO: renamed from: Y */
    public final void mo12671Y(long j10, long j11, long j12, long j13, AbstractC0140a abstractC0140a, float f3, C9170v c9170v, int i10) {
        this.f35991a.mo12671Y(j10, j11, j12, j13, abstractC0140a, f3, c9170v, i10);
    }

    /* JADX INFO: renamed from: a */
    public final void m12672a(InterfaceC9165q interfaceC9165q, long j10, NodeCoordinator nodeCoordinator, InterfaceC6143f interfaceC6143f) {
        C5207g.m11111f(interfaceC9165q, "canvas");
        C5207g.m11111f(nodeCoordinator, "coordinator");
        InterfaceC6143f interfaceC6143f2 = this.f35992b;
        this.f35992b = interfaceC6143f;
        LayoutDirection layoutDirection = nodeCoordinator.f3844g.f3747J;
        C9617a c9617a = this.f35991a;
        C9617a.a aVar = c9617a.f49284a;
        InterfaceC10015c interfaceC10015c = aVar.f49288a;
        LayoutDirection layoutDirection2 = aVar.f49289b;
        InterfaceC9165q interfaceC9165q2 = aVar.f49290c;
        long j11 = aVar.f49291d;
        aVar.f49288a = nodeCoordinator;
        C5207g.m11111f(layoutDirection, "<set-?>");
        aVar.f49289b = layoutDirection;
        aVar.f49290c = interfaceC9165q;
        aVar.f49291d = j10;
        interfaceC9165q.mo17420d();
        interfaceC6143f.mo1946s(this);
        interfaceC9165q.mo17428o();
        C9617a.a aVar2 = c9617a.f49284a;
        aVar2.getClass();
        C5207g.m11111f(interfaceC10015c, "<set-?>");
        aVar2.f49288a = interfaceC10015c;
        C5207g.m11111f(layoutDirection2, "<set-?>");
        aVar2.f49289b = layoutDirection2;
        C5207g.m11111f(interfaceC9165q2, "<set-?>");
        aVar2.f49290c = interfaceC9165q2;
        aVar2.f49291d = j11;
        this.f35992b = interfaceC6143f2;
    }

    @Override // p424v0.InterfaceC9621e
    /* JADX INFO: renamed from: a0 */
    public final void mo12673a0(InterfaceC9174z interfaceC9174z, long j10, long j11, long j12, long j13, float f3, AbstractC0140a abstractC0140a, C9170v c9170v, int i10, int i11) {
        C5207g.m11111f(interfaceC9174z, "image");
        C5207g.m11111f(abstractC0140a, "style");
        this.f35991a.mo12673a0(interfaceC9174z, j10, j11, j12, j13, f3, abstractC0140a, c9170v, i10, i11);
    }

    @Override // p470x1.InterfaceC10015c
    /* JADX INFO: renamed from: c0 */
    public final float mo1462c0() {
        return this.f35991a.mo1462c0();
    }

    @Override // p424v0.InterfaceC9621e
    /* JADX INFO: renamed from: d */
    public final long mo12674d() {
        return this.f35991a.mo12674d();
    }

    @Override // p424v0.InterfaceC9621e
    /* JADX INFO: renamed from: d0 */
    public final void mo12675d0(long j10, long j11, long j12, float f3, AbstractC0140a abstractC0140a, C9170v c9170v, int i10) {
        C5207g.m11111f(abstractC0140a, "style");
        this.f35991a.mo12675d0(j10, j11, j12, f3, abstractC0140a, c9170v, i10);
    }

    @Override // p470x1.InterfaceC10015c
    public final float getDensity() {
        return this.f35991a.getDensity();
    }

    @Override // p424v0.InterfaceC9621e
    public final LayoutDirection getLayoutDirection() {
        return this.f35991a.f49284a.f49289b;
    }

    @Override // p470x1.InterfaceC10015c
    /* JADX INFO: renamed from: i0 */
    public final float mo1463i0(float f3) {
        return this.f35991a.getDensity() * f3;
    }

    @Override // p424v0.InterfaceC9621e
    /* JADX INFO: renamed from: l0 */
    public final C9617a.b mo12676l0() {
        return this.f35991a.f49285b;
    }

    @Override // p424v0.InterfaceC9621e
    /* JADX INFO: renamed from: p0 */
    public final void mo12677p0(InterfaceC9138c0 interfaceC9138c0, AbstractC9161o abstractC9161o, float f3, AbstractC0140a abstractC0140a, C9170v c9170v, int i10) {
        C5207g.m11111f(interfaceC9138c0, "path");
        C5207g.m11111f(abstractC9161o, "brush");
        C5207g.m11111f(abstractC0140a, "style");
        this.f35991a.mo12677p0(interfaceC9138c0, abstractC9161o, f3, abstractC0140a, c9170v, i10);
    }

    @Override // p424v0.InterfaceC9621e
    /* JADX INFO: renamed from: r0 */
    public final void mo12678r0(long j10, float f3, long j11, float f10, AbstractC0140a abstractC0140a, C9170v c9170v, int i10) {
        C5207g.m11111f(abstractC0140a, "style");
        this.f35991a.mo12678r0(j10, f3, j11, f10, abstractC0140a, c9170v, i10);
    }

    @Override // p470x1.InterfaceC10015c
    /* JADX INFO: renamed from: s0 */
    public final int mo1464s0(float f3) {
        return this.f35991a.mo1464s0(f3);
    }

    @Override // p424v0.InterfaceC9621e
    /* JADX INFO: renamed from: w0 */
    public final void mo12679w0(AbstractC9161o abstractC9161o, long j10, long j11, long j12, float f3, AbstractC0140a abstractC0140a, C9170v c9170v, int i10) {
        C5207g.m11111f(abstractC9161o, "brush");
        C5207g.m11111f(abstractC0140a, "style");
        this.f35991a.mo12679w0(abstractC9161o, j10, j11, j12, f3, abstractC0140a, c9170v, i10);
    }

    @Override // p424v0.InterfaceC9621e
    /* JADX INFO: renamed from: y0 */
    public final long mo12680y0() {
        return this.f35991a.mo12680y0();
    }

    @Override // p470x1.InterfaceC10015c
    /* JADX INFO: renamed from: z0 */
    public final long mo1466z0(long j10) {
        return this.f35991a.mo1466z0(j10);
    }
}
