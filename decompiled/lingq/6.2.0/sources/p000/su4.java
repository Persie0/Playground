package p000;

import androidx.compose.foundation.gestures.Orientation;
import androidx.compose.foundation.lazy.layout.C0138g;
import androidx.compose.p002ui.semantics.AbstractC0421a;
import androidx.compose.p002ui.semantics.AbstractC0424d;
import androidx.compose.p002ui.semantics.AbstractC0426f;
import androidx.compose.p002ui.semantics.C0427g;
import p000.l54;
import p000.su4;
import p000.ux5;
import p000.wfb;
import p000.yt4;

/* JADX INFO: loaded from: classes.dex */
public final class su4 extends d16 implements ov8 {

    /* JADX INFO: renamed from: J */
    public ui3 f61410J;

    /* JADX INFO: renamed from: K */
    public nu4 f61411K;

    /* JADX INFO: renamed from: L */
    public Orientation f61412L;

    /* JADX INFO: renamed from: M */
    public boolean f61413M;

    /* JADX INFO: renamed from: N */
    public boolean f61414N;

    /* JADX INFO: renamed from: O */
    public mn8 f61415O;

    /* JADX INFO: renamed from: P */
    public final C0011a9 f61416P = new C0011a9(this, 27);

    /* JADX INFO: renamed from: Q */
    public C0138g f61417Q;

    public su4(ui3 ui3Var, nu4 nu4Var, Orientation orientation, boolean z, boolean z2) {
        this.f61410J = ui3Var;
        this.f61411K = nu4Var;
        this.f61412L = orientation;
        this.f61413M = z;
        this.f61414N = z2;
        m21743Z0();
    }

    @Override // p000.ov8
    /* JADX INFO: renamed from: H0 */
    public final void mo787H0(tv8 tv8Var) {
        AbstractC0426f.m1867k(tv8Var);
        tv8Var.mo3709d(AbstractC0424d.f4990N, this.f61416P);
        Orientation orientation = this.f61412L;
        Orientation orientation2 = Orientation.Vertical;
        mn8 mn8Var = this.f61415O;
        if (orientation == orientation2) {
            if (mn8Var == null) {
                fa4.m11636J("scrollAxisRange");
                throw null;
            }
            C0427g c0427g = AbstractC0424d.f5016w;
            bh4 bh4Var = AbstractC0426f.f5022a[13];
            tv8Var.mo3709d(c0427g, mn8Var);
        } else {
            if (mn8Var == null) {
                fa4.m11636J("scrollAxisRange");
                throw null;
            }
            C0427g c0427g2 = AbstractC0424d.f5015v;
            bh4 bh4Var2 = AbstractC0426f.f5022a[12];
            tv8Var.mo3709d(c0427g2, mn8Var);
        }
        C0138g c0138g = this.f61417Q;
        if (c0138g != null) {
            tv8Var.mo3709d(AbstractC0421a.f4950f, new C3024g3(null, c0138g));
        }
        AbstractC0426f.m1857a(tv8Var, new ru4(this, 2));
        e71 e71VarMo992f = this.f61411K.mo992f();
        C0427g c0427g3 = AbstractC0424d.f4999f;
        bh4 bh4Var3 = AbstractC0426f.f5022a[24];
        tv8Var.mo3709d(c0427g3, e71VarMo992f);
    }

    @Override // p000.d16
    /* JADX INFO: renamed from: O0 */
    public final boolean mo574O0() {
        return false;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: Z0 */
    public final void m21743Z0() {
        this.f61415O = new mn8(new ru4(this, 0), new ru4(this, 1), this.f61414N);
        this.f61417Q = this.f61413M ? new vi3() { // from class: androidx.compose.foundation.lazy.layout.g
            @Override // p000.vi3
            public final Object invoke(Object obj) {
                int iIntValue = ((Integer) obj).intValue();
                su4 su4Var = this.f2577a;
                yt4 yt4Var = (yt4) su4Var.f61410J.mo0a();
                if (iIntValue < 0 || iIntValue >= yt4Var.mo15745a()) {
                    StringBuilder sbM22998u = ux5.m22998u("Can't scroll to index ", iIntValue, ", it is out of bounds [0, ");
                    sbM22998u.append(yt4Var.mo15745a());
                    sbM22998u.append(')');
                    l54.m15814a(sbM22998u.toString());
                }
                wfb.m23926u(su4Var.m9971N0(), null, null, new LazyLayoutSemanticsModifierNode$updateCachedSemanticsValues$3$2(su4Var, iIntValue, null), 3);
                return Boolean.TRUE;
            }
        } : 0;
    }
}
