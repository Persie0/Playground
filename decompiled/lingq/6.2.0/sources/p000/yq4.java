package p000;

import androidx.compose.p002ui.layout.C0339f;
import androidx.compose.p002ui.node.C0357g;
import androidx.compose.p002ui.platform.ViewTreeObserverOnGlobalLayoutListenerC0391c;

/* JADX INFO: loaded from: classes.dex */
public final class yq4 implements pm9 {

    /* JADX INFO: renamed from: a */
    public final u56 f70288a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ C0339f f70289b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ Object f70290c;

    public yq4(C0339f c0339f, Object obj) {
        this.f70289b = c0339f;
        this.f70290c = obj;
        int[] iArr = m84.f50750a;
        this.f70288a = new u56();
    }

    @Override // p000.pm9
    /* JADX INFO: renamed from: a */
    public final void mo19394a() {
        C0339f.m1494c(this.f70289b, this.f70290c);
    }

    @Override // p000.pm9
    /* JADX INFO: renamed from: b */
    public final void mo19395b(n31 n31Var) {
        k40 k40Var;
        C0357g c0357g = (C0357g) this.f70289b.f4202j.m17255g(this.f70290c);
        d16 d16Var = (c0357g == null || (k40Var = c0357g.f4335a0) == null) ? null : (d16) k40Var.f46679g;
        if (d16Var == null || !d16Var.f34836I) {
            return;
        }
        qba.m19854f(d16Var, "androidx.compose.foundation.lazy.layout.TraversablePrefetchStateNode", n31Var);
    }

    @Override // p000.pm9
    /* JADX INFO: renamed from: c */
    public final long mo19396c(int i) {
        C0357g c0357g = (C0357g) this.f70289b.f4202j.m17255g(this.f70290c);
        if (c0357g == null || !c0357g.m1569L()) {
            return 0L;
        }
        int i2 = ((x66) ((f66) c0357g.m1602o()).f38520b).f67832c;
        if (i < 0 || i >= i2) {
            i54.m13665d("Index (" + i + ") is out of bound of [0, " + i2 + ')');
        }
        if (!this.f70288a.m22476c(i)) {
            return 0L;
        }
        int i3 = ((C0357g) ((f66) c0357g.m1602o()).get(i)).f4337b0.f58070p.f49301a;
        return (((long) ((C0357g) ((f66) c0357g.m1602o()).get(i)).f4337b0.f58070p.f49302b) & 4294967295L) | (((long) i3) << 32);
    }

    @Override // p000.pm9
    /* JADX INFO: renamed from: d */
    public final int mo19397d() {
        C0357g c0357g = (C0357g) this.f70289b.f4202j.m17255g(this.f70290c);
        if (c0357g != null) {
            return ((x66) ((f66) c0357g.m1602o()).f38520b).f67832c;
        }
        return 0;
    }

    @Override // p000.pm9
    /* JADX INFO: renamed from: e */
    public final void mo19398e(int i, long j) {
        C0339f c0339f = this.f70289b;
        C0357g c0357g = (C0357g) c0339f.f4202j.m17255g(this.f70290c);
        if (c0357g == null || !c0357g.m1569L()) {
            return;
        }
        int i2 = ((x66) ((f66) c0357g.m1602o()).f38520b).f67832c;
        if (i < 0 || i >= i2) {
            i54.m13665d("Index (" + i + ") is out of bound of [0, " + i2 + ')');
        }
        if (c0357g.m1570M()) {
            i54.m13662a("Pre-measure called on node that is not placed");
        }
        C0357g c0357g2 = c0339f.f4193a;
        c0357g2.f4319L = true;
        ((ViewTreeObserverOnGlobalLayoutListenerC0391c) pq4.m19457a(c0357g)).m1755y((C0357g) ((f66) c0357g.m1602o()).get(i), j);
        c0357g2.f4319L = false;
        this.f70288a.m22474a(i);
    }
}
