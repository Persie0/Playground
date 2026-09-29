package androidx.compose.material3;

import androidx.compose.animation.core.C0059a;
import androidx.compose.p002ui.node.InterfaceC0354d;
import androidx.compose.p002ui.unit.LayoutDirection;
import java.util.List;
import kotlin.collections.AbstractC3194a;
import p000.C2951e4;
import p000.bk1;
import p000.ct5;
import p000.d16;
import p000.dh9;
import p000.it5;
import p000.jda;
import p000.jq9;
import p000.jt5;
import p000.l43;
import p000.l87;
import p000.pk9;
import p000.wfb;
import p000.xc9;
import p000.xg0;
import p000.xj2;

/* JADX INFO: renamed from: androidx.compose.material3.h0 */
/* JADX INFO: loaded from: classes2.dex */
public final class C0234h0 extends d16 implements InterfaceC0354d {

    /* JADX INFO: renamed from: J */
    public dh9 f3432J;

    /* JADX INFO: renamed from: K */
    public int f3433K;

    /* JADX INFO: renamed from: L */
    public boolean f3434L;

    /* JADX INFO: renamed from: M */
    public l43 f3435M;

    /* JADX INFO: renamed from: N */
    public C0059a f3436N;

    /* JADX INFO: renamed from: O */
    public C0059a f3437O;

    /* JADX INFO: renamed from: P */
    public xj2 f3438P;

    /* JADX INFO: renamed from: Q */
    public xj2 f3439Q;

    @Override // androidx.compose.p002ui.node.InterfaceC0354d
    /* JADX INFO: renamed from: f */
    public final it5 mo575f(jt5 jt5Var, ct5 ct5Var, long j) {
        jda jdaVar = pk9.f56365j;
        if (((List) this.f3432J.getValue()).isEmpty()) {
            return jt5Var.mo9895M0(0, 0, AbstractC3194a.m15360M(), new C2951e4(29));
        }
        boolean z = this.f3434L;
        dh9 dh9Var = this.f3432J;
        float f = z ? ((jq9) ((List) dh9Var.getValue()).get(this.f3433K)).f46015c : ((jq9) ((List) dh9Var.getValue()).get(this.f3433K)).f46014b;
        xj2 xj2Var = this.f3439Q;
        if (xj2Var != null) {
            C0059a c0059a = this.f3437O;
            if (c0059a == null) {
                c0059a = new C0059a(xj2Var, jdaVar, null, 12);
                this.f3437O = c0059a;
            }
            if (!xj2.m24560b(f, ((xj2) ((xc9) c0059a.f1542e).getValue()).f68285a)) {
                wfb.m23926u(m9971N0(), null, null, new TabIndicatorOffsetNode$measure$2(c0059a, f, this, null), 3);
            }
        } else {
            this.f3439Q = new xj2(f);
        }
        float f2 = ((jq9) ((List) this.f3432J.getValue()).get(this.f3433K)).f46013a;
        xj2 xj2Var2 = this.f3438P;
        if (xj2Var2 != null) {
            C0059a c0059a2 = this.f3436N;
            if (c0059a2 == null) {
                c0059a2 = new C0059a(xj2Var2, jdaVar, null, 12);
                this.f3436N = c0059a2;
            }
            if (!xj2.m24560b(f2, ((xj2) ((xc9) c0059a2.f1542e).getValue()).f68285a)) {
                wfb.m23926u(m9971N0(), null, null, new TabIndicatorOffsetNode$measure$3(c0059a2, f2, this, null), 3);
            }
        } else {
            this.f3438P = new xj2(f2);
        }
        LayoutDirection layoutDirection = jt5Var.getLayoutDirection();
        LayoutDirection layoutDirection2 = LayoutDirection.Ltr;
        C0059a c0059a3 = this.f3436N;
        if (layoutDirection != layoutDirection2) {
            if (c0059a3 != null) {
                f2 = ((xj2) c0059a3.m745d()).f68285a;
            }
            f2 = -f2;
        } else if (c0059a3 != null) {
            f2 = ((xj2) c0059a3.m745d()).f68285a;
        }
        C0059a c0059a4 = this.f3437O;
        if (c0059a4 != null) {
            f = ((xj2) c0059a4.m745d()).f68285a;
        }
        l87 l87VarMo1514r = ct5Var.mo1514r(bk1.m3794b(jt5Var.mo916w0(f), jt5Var.mo916w0(f), 0, 0, 12, j));
        return jt5Var.mo9895M0(l87VarMo1514r.f49301a, l87VarMo1514r.f49302b, AbstractC3194a.m15360M(), new xg0(l87VarMo1514r, f2, 2));
    }
}
