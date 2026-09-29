package androidx.compose.foundation;

import androidx.compose.p002ui.focus.C0302d;
import androidx.compose.p002ui.node.AbstractC0356f;
import androidx.compose.p002ui.node.AbstractC0362l;
import androidx.compose.p002ui.semantics.AbstractC0421a;
import androidx.compose.p002ui.semantics.AbstractC0424d;
import androidx.compose.p002ui.semantics.AbstractC0426f;
import androidx.compose.p002ui.semantics.C0427g;
import kotlin.jvm.internal.Ref$ObjectRef;
import p000.C3006fm;
import p000.C3024g3;
import p000.C3704w;
import p000.bh4;
import p000.cd4;
import p000.fa2;
import p000.fa4;
import p000.hu4;
import p000.iy5;
import p000.nj0;
import p000.oa3;
import p000.ov8;
import p000.p58;
import p000.pba;
import p000.q84;
import p000.q93;
import p000.qba;
import p000.qp6;
import p000.r93;
import p000.tf1;
import p000.tv8;
import p000.un3;
import p000.v56;
import p000.vi3;
import p000.vl1;
import p000.wfb;

/* JADX INFO: renamed from: androidx.compose.foundation.i */
/* JADX INFO: loaded from: classes.dex */
public final class C0121i extends fa2 implements ov8, un3, tf1, qp6, pba {

    /* JADX INFO: renamed from: R */
    public static final iy5 f2386R = new iy5(11);

    /* JADX INFO: renamed from: L */
    public v56 f2387L;

    /* JADX INFO: renamed from: M */
    public final vi3 f2388M;

    /* JADX INFO: renamed from: N */
    public q93 f2389N;

    /* JADX INFO: renamed from: O */
    public hu4 f2390O;

    /* JADX INFO: renamed from: P */
    public AbstractC0362l f2391P;

    /* JADX INFO: renamed from: Q */
    public final C0302d f2392Q;

    public C0121i(v56 v56Var, int i, vi3 vi3Var) {
        this.f2387L = v56Var;
        this.f2388M = vi3Var;
        C0302d c0302d = new C0302d(i, new FocusableNode$focusTargetNode$1(2, this, C0121i.class, "onFocusStateChange", "onFocusStateChange(Landroidx/compose/ui/focus/FocusState;Landroidx/compose/ui/focus/FocusState;)V", 0), 10);
        m11624Z0(c0302d);
        this.f2392Q = c0302d;
    }

    @Override // p000.ov8
    /* JADX INFO: renamed from: H0 */
    public final void mo787H0(tv8 tv8Var) {
        boolean zIsFocused = this.f2392Q.m1373e1().isFocused();
        bh4[] bh4VarArr = AbstractC0426f.f5022a;
        C0427g c0427g = AbstractC0424d.f5005l;
        bh4 bh4Var = AbstractC0426f.f5022a[4];
        tv8Var.mo3709d(c0427g, Boolean.valueOf(zIsFocused));
        tv8Var.mo3709d(AbstractC0421a.f4967w, new C3024g3(null, new FocusableNode$applySemantics$1(0, this, C0121i.class, "requestFocus", "requestFocus()Z", 0)));
    }

    @Override // p000.un3
    /* JADX INFO: renamed from: J0 */
    public final void mo953J0(AbstractC0362l abstractC0362l) {
        this.f2391P = abstractC0362l;
        if (this.f2392Q.m1373e1().isFocused()) {
            boolean z = abstractC0362l.mo1543f1().f34836I;
            p58 p58Var = oa3.f54098J;
            if (!z) {
                if (this.f34836I) {
                    qba.m19849a(this, p58Var);
                }
            } else {
                AbstractC0362l abstractC0362l2 = this.f2391P;
                if (abstractC0362l2 != null && abstractC0362l2.mo1543f1().f34836I && this.f34836I) {
                    qba.m19849a(this, p58Var);
                }
            }
        }
    }

    @Override // p000.d16
    /* JADX INFO: renamed from: O0 */
    public final boolean mo574O0() {
        return false;
    }

    @Override // p000.d16
    /* JADX INFO: renamed from: T0 */
    public final void mo763T0() {
        hu4 hu4Var = this.f2390O;
        if (hu4Var != null) {
            hu4Var.m13464b();
        }
        this.f2390O = null;
    }

    /* JADX INFO: renamed from: c1 */
    public final void m954c1(v56 v56Var, q84 q84Var) {
        if (!this.f34836I) {
            v56Var.m23126b(q84Var);
        } else {
            cd4 cd4Var = (cd4) ((vl1) m9971N0()).f65559a.get(nj0.f52795N);
            wfb.m23926u(m9971N0(), null, null, new FocusableNode$emitWithFallback$1(v56Var, q84Var, cd4Var != null ? cd4Var.mo4540r(new C3704w(14, v56Var, q84Var)) : null, null), 3);
        }
    }

    /* JADX INFO: renamed from: d1 */
    public final void m955d1(v56 v56Var) {
        q93 q93Var;
        if (fa4.m11650l(this.f2387L, v56Var)) {
            return;
        }
        v56 v56Var2 = this.f2387L;
        if (v56Var2 != null && (q93Var = this.f2389N) != null) {
            v56Var2.m23126b(new r93(q93Var));
        }
        this.f2389N = null;
        this.f2387L = v56Var;
    }

    @Override // p000.pba
    /* JADX INFO: renamed from: r */
    public final Object mo956r() {
        return f2386R;
    }

    @Override // p000.qp6
    /* JADX INFO: renamed from: r0 */
    public final void mo804r0() {
        Ref$ObjectRef ref$ObjectRef = new Ref$ObjectRef();
        AbstractC0356f.m1552b(this, new C3006fm(8, ref$ObjectRef, this));
        hu4 hu4Var = (hu4) ref$ObjectRef.f47718a;
        if (this.f2392Q.m1373e1().isFocused()) {
            hu4 hu4Var2 = this.f2390O;
            if (hu4Var2 != null) {
                hu4Var2.m13464b();
            }
            if (hu4Var != null) {
                hu4Var.m13463a();
            } else {
                hu4Var = null;
            }
            this.f2390O = hu4Var;
        }
    }
}
