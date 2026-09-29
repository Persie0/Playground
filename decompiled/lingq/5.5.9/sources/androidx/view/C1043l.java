package androidx.view;

import dm.C5207g;
import no.InterfaceC7875v0;

/* JADX INFO: renamed from: androidx.lifecycle.l */
/* JADX INFO: loaded from: classes.dex */
public final class C1043l {

    /* JADX INFO: renamed from: a */
    public final Lifecycle f6672a;

    /* JADX INFO: renamed from: b */
    public final Lifecycle.State f6673b;

    /* JADX INFO: renamed from: c */
    public final C1031f f6674c;

    /* JADX INFO: renamed from: d */
    public final C1041k f6675d;

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r7v1, types: [androidx.lifecycle.k, androidx.lifecycle.p] */
    public C1043l(Lifecycle lifecycle, Lifecycle.State state, C1031f c1031f, final InterfaceC7875v0 interfaceC7875v0) {
        C5207g.m11111f(lifecycle, "lifecycle");
        C5207g.m11111f(state, "minState");
        C5207g.m11111f(c1031f, "dispatchQueue");
        this.f6672a = lifecycle;
        this.f6673b = state;
        this.f6674c = c1031f;
        ?? r10 = new InterfaceC1049o() { // from class: androidx.lifecycle.k
            /* JADX WARN: Unreachable blocks removed: 1, instructions: 1 */
            @Override // androidx.view.InterfaceC1049o
            /* JADX INFO: renamed from: e */
            public final void mo800e(InterfaceC1051q interfaceC1051q, Lifecycle.Event event) {
                C1043l c1043l = this.f6664a;
                C5207g.m11111f(c1043l, "this$0");
                InterfaceC7875v0 interfaceC7875v1 = interfaceC7875v0;
                C5207g.m11111f(interfaceC7875v1, "$parentJob");
                if (interfaceC1051q.mo786G().f6681d == Lifecycle.State.DESTROYED) {
                    interfaceC7875v1.mo15618a(null);
                    c1043l.m3950a();
                    return;
                }
                int iCompareTo = interfaceC1051q.mo786G().f6681d.compareTo(c1043l.f6673b);
                C1031f c1031f2 = c1043l.f6674c;
                if (iCompareTo < 0) {
                    c1031f2.f6643a = true;
                } else if (c1031f2.f6643a) {
                    if (!(!c1031f2.f6644b)) {
                        throw new IllegalStateException("Cannot resume a finished dispatcher".toString());
                    }
                    c1031f2.f6643a = false;
                    c1031f2.m3935a();
                }
            }
        };
        this.f6675d = r10;
        if (lifecycle.mo3884b() != Lifecycle.State.DESTROYED) {
            lifecycle.mo3883a(r10);
        } else {
            interfaceC7875v0.mo15618a(null);
            m3950a();
        }
    }

    /* JADX INFO: renamed from: a */
    public final void m3950a() {
        this.f6672a.mo3885c(this.f6675d);
        C1031f c1031f = this.f6674c;
        c1031f.f6644b = true;
        c1031f.m3935a();
    }
}
