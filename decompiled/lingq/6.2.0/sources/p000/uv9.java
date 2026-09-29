package p000;

import androidx.compose.p002ui.node.InterfaceC0354d;
import androidx.compose.p002ui.platform.AbstractC0402n;
import androidx.compose.p002ui.unit.LayoutDirection;
import kotlin.collections.AbstractC3194a;

/* JADX INFO: loaded from: classes.dex */
public final class uv9 extends d16 implements tf1, InterfaceC0354d {

    /* JADX INFO: renamed from: J */
    public final vx9 f64412J;

    /* JADX INFO: renamed from: K */
    public wda f64413K;

    /* JADX INFO: renamed from: L */
    public ce4 f64414L;

    public uv9(vx9 vx9Var) {
        this.f64412J = vx9Var;
    }

    @Override // p000.d16
    /* JADX INFO: renamed from: O0 */
    public final boolean mo574O0() {
        return false;
    }

    @Override // p000.d16
    /* JADX INFO: renamed from: R0 */
    public final void mo36R0() {
        vx9 vx9VarM23615W = vz1.m23615W(this.f64412J, te1.m21979L(this).f4328U);
        wa3 wa3Var = (wa3) thb.m22050i(this, AbstractC0402n.f4819k);
        m22946Z0(vx9VarM23615W, wa3Var);
        LayoutDirection layoutDirection = te1.m21979L(this).f4328U;
        fb2 fb2Var = te1.m21979L(this).f4327T;
        wda wdaVar = this.f64413K;
        if (wdaVar == null) {
            throw wq1.m24126v("Font resolution state is not set.");
        }
        this.f64414L = new ce4(layoutDirection, fb2Var, wa3Var, vx9VarM23615W, wdaVar.getValue());
    }

    @Override // p000.d16
    /* JADX INFO: renamed from: S0 */
    public final void mo37S0() {
        this.f64413K = null;
        this.f64414L = null;
    }

    @Override // p000.ea2
    /* JADX INFO: renamed from: V */
    public final void mo1344V() {
        ce4 ce4Var = this.f64414L;
        if (ce4Var != null) {
            ce4.m4570a(ce4Var, te1.m21979L(this).f4328U, null, null, 30);
        }
        d32.m10020R(this);
    }

    /* JADX INFO: renamed from: Z0 */
    public final void m22946Z0(vx9 vx9Var, wa3 wa3Var) {
        he9 he9Var = vx9Var.f66065a;
        xa3 xa3Var = he9Var.f42269f;
        bc3 bc3Var = he9Var.f42266c;
        if (bc3Var == null) {
            bc3Var = bc3.f8321g;
        }
        wb3 wb3Var = he9Var.f42267d;
        int i = wb3Var != null ? wb3Var.f66583a : 0;
        xb3 xb3Var = he9Var.f42268e;
        this.f64413K = ((ya3) wa3Var).m25018b(xa3Var, bc3Var, i, xb3Var != null ? xb3Var.f68021a : 65535);
        d32.m10020R(this);
    }

    @Override // androidx.compose.p002ui.node.InterfaceC0354d
    /* JADX INFO: renamed from: f */
    public final it5 mo575f(jt5 jt5Var, ct5 ct5Var, long j) {
        ce4 ce4Var = this.f64414L;
        if (ce4Var == null) {
            throw wq1.m24126v("Min size state is not set.");
        }
        t66 t66Var = (t66) ce4Var.f9972g;
        wda wdaVar = this.f64413K;
        if (wdaVar == null) {
            throw wq1.m24126v("Font resolution state is not set.");
        }
        Object value = wdaVar.getValue();
        if (!fa4.m11650l(value, ce4Var.f9971f)) {
            ce4Var.f9971f = value;
            ((xc9) t66Var).setValue(Boolean.TRUE);
        }
        if (((Boolean) ((xc9) t66Var).getValue()).booleanValue()) {
            ce4Var.f9966a = ju9.m14657a((vx9) ce4Var.f9970e, (fb2) ce4Var.f9968c, (wa3) ce4Var.f9969d);
            ((xc9) t66Var).setValue(Boolean.FALSE);
        }
        long j2 = ce4Var.f9966a;
        l87 l87VarMo1514r = ct5Var.mo1514r(dk1.m10427e(j, dk1.m10424b((int) (j2 >> 32), 0, (int) (j2 & 4294967295L), 0, 10)));
        return jt5Var.mo9895M0(l87VarMo1514r.f49301a, l87VarMo1514r.f49302b, AbstractC3194a.m15360M(), new C3773xv(l87VarMo1514r, 13));
    }

    @Override // p000.ea2, p000.ng7
    /* JADX INFO: renamed from: g */
    public final void mo840g() {
        ce4 ce4Var = this.f64414L;
        if (ce4Var != null) {
            ce4.m4570a(ce4Var, null, te1.m21979L(this).f4327T, null, 29);
        }
        d32.m10020R(this);
    }
}
