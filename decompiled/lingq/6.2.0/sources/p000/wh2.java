package p000;

import androidx.compose.foundation.lazy.layout.C0134c;
import androidx.compose.foundation.lazy.layout.C0135d;
import androidx.compose.p002ui.graphics.layer.C0312a;
import androidx.compose.p002ui.node.C0358h;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes.dex */
public final class wh2 extends d16 implements ll2 {

    /* JADX INFO: renamed from: J */
    public C0135d f66815J;

    @Override // p000.d16
    /* JADX INFO: renamed from: R0 */
    public final void mo36R0() {
        this.f66815J.f2563j = this;
    }

    @Override // p000.d16
    /* JADX INFO: renamed from: S0 */
    public final void mo37S0() {
        C0135d c0135d = this.f66815J;
        c0135d.m1012e();
        c0135d.f2555b = null;
        c0135d.f2556c = -1;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof wh2) && fa4.m11650l(this.f66815J, ((wh2) obj).f66815J);
    }

    public final int hashCode() {
        return this.f66815J.hashCode();
    }

    @Override // p000.ll2
    /* JADX INFO: renamed from: i0 */
    public final void mo952i0(C0358h c0358h) {
        ArrayList arrayList = this.f66815J.f2562i;
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            C0134c c0134c = (C0134c) arrayList.get(i);
            C0312a c0312a = c0134c.f2550o;
            if (c0312a != null) {
                long j = c0134c.f2548m;
                long j2 = c0312a.f3996t;
                float f = ((int) (j >> 32)) - ((int) (j2 >> 32));
                float f2 = ((int) (j & 4294967295L)) - ((int) (4294967295L & j2));
                an0 an0Var = c0358h.f4358a;
                ((qn3) an0Var.f853b.f50064b).m20067V(f, f2);
                try {
                    lda.m16134t(c0358h, c0312a);
                    ((qn3) an0Var.f853b.f50064b).m20067V(-f, -f2);
                } catch (Throwable th) {
                    ((qn3) an0Var.f853b.f50064b).m20067V(-f, -f2);
                    throw th;
                }
            }
        }
        c0358h.m1614b();
    }

    public final String toString() {
        return "DisplayingDisappearingItemsNode(animator=" + this.f66815J + ')';
    }
}
