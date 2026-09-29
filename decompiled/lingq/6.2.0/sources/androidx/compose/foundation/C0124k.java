package androidx.compose.foundation;

import android.view.View;
import android.widget.Magnifier;
import androidx.compose.p002ui.node.AbstractC0356f;
import androidx.compose.p002ui.node.AbstractC0362l;
import androidx.compose.p002ui.node.C0358h;
import androidx.compose.runtime.AbstractC0278f;
import kotlinx.coroutines.CoroutineStart;
import kotlinx.coroutines.channels.C3211a;
import p000.bk2;
import p000.bq1;
import p000.d16;
import p000.do7;
import p000.fb2;
import p000.gc2;
import p000.gq6;
import p000.gz8;
import p000.ll2;
import p000.n84;
import p000.no1;
import p000.omd;
import p000.or3;
import p000.ov8;
import p000.po5;
import p000.qo5;
import p000.qp6;
import p000.s46;
import p000.sy0;
import p000.t66;
import p000.te1;
import p000.tv8;
import p000.un3;
import p000.wfb;
import p000.xc9;
import p000.xfa;

/* JADX INFO: renamed from: androidx.compose.foundation.k */
/* JADX INFO: loaded from: classes.dex */
public final class C0124k extends d16 implements un3, ll2, ov8, qp6 {

    /* JADX INFO: renamed from: J */
    public sy0 f2398J;

    /* JADX INFO: renamed from: K */
    public no1 f2399K;

    /* JADX INFO: renamed from: L */
    public gz8 f2400L;

    /* JADX INFO: renamed from: M */
    public View f2401M;

    /* JADX INFO: renamed from: N */
    public fb2 f2402N;

    /* JADX INFO: renamed from: O */
    public or3 f2403O;

    /* JADX INFO: renamed from: Q */
    public gc2 f2405Q;

    /* JADX INFO: renamed from: S */
    public n84 f2407S;

    /* JADX INFO: renamed from: T */
    public C3211a f2408T;

    /* JADX INFO: renamed from: P */
    public final t66 f2404P = AbstractC0278f.m1259i(null, s46.f60289d);

    /* JADX INFO: renamed from: R */
    public long f2406R = 9205357640488583168L;

    public C0124k(sy0 sy0Var, no1 no1Var, gz8 gz8Var) {
        this.f2398J = sy0Var;
        this.f2399K = no1Var;
        this.f2400L = gz8Var;
    }

    @Override // p000.ov8
    /* JADX INFO: renamed from: H0 */
    public final void mo787H0(tv8 tv8Var) {
        tv8Var.mo3709d(qo5.f58016a, new po5(this, 1));
    }

    @Override // p000.un3
    /* JADX INFO: renamed from: J0 */
    public final void mo953J0(AbstractC0362l abstractC0362l) {
        ((xc9) this.f2404P).setValue(abstractC0362l);
    }

    @Override // p000.d16
    /* JADX INFO: renamed from: R0 */
    public final void mo36R0() {
        mo804r0();
        this.f2408T = do7.m10525a(0, 7, null);
        wfb.m23926u(m9971N0(), null, CoroutineStart.UNDISPATCHED, new MagnifierNode$onAttach$1(this, null), 1);
    }

    @Override // p000.d16
    /* JADX INFO: renamed from: S0 */
    public final void mo37S0() {
        or3 or3Var = this.f2403O;
        if (or3Var != null) {
            ((Magnifier) or3Var.f54782a).dismiss();
        }
        this.f2403O = null;
    }

    /* JADX INFO: renamed from: Z0 */
    public final long m961Z0() {
        if (this.f2405Q == null) {
            this.f2405Q = AbstractC0278f.m1254d(new po5(this, 2));
        }
        gc2 gc2Var = this.f2405Q;
        if (gc2Var != null) {
            return ((gq6) gc2Var.getValue()).f41189a;
        }
        return 9205357640488583168L;
    }

    /* JADX INFO: renamed from: a1 */
    public final void m962a1() {
        or3 or3Var = this.f2403O;
        if (or3Var != null) {
            ((Magnifier) or3Var.f54782a).dismiss();
        }
        View viewM4067t0 = this.f2401M;
        if (viewM4067t0 == null) {
            viewM4067t0 = bq1.m4067t0(this);
        }
        this.f2401M = viewM4067t0;
        fb2 fb2Var = this.f2402N;
        if (fb2Var == null) {
            fb2Var = te1.m21979L(this).f4327T;
        }
        this.f2402N = fb2Var;
        this.f2403O = new or3(new Magnifier(viewM4067t0));
        m964c1();
    }

    /* JADX INFO: renamed from: b1 */
    public final void m963b1() {
        fb2 fb2Var = this.f2402N;
        if (fb2Var == null) {
            fb2Var = te1.m21979L(this).f4327T;
            this.f2402N = fb2Var;
        }
        long j = ((gq6) this.f2398J.invoke(fb2Var)).f41189a;
        if ((j & 9223372034707292159L) == 9205357640488583168L || (m961Z0() & 9223372034707292159L) == 9205357640488583168L) {
            this.f2406R = 9205357640488583168L;
            or3 or3Var = this.f2403O;
            if (or3Var != null) {
                ((Magnifier) or3Var.f54782a).dismiss();
                return;
            }
            return;
        }
        this.f2406R = gq6.m12825f(m961Z0(), j);
        if (this.f2403O == null) {
            m962a1();
        }
        or3 or3Var2 = this.f2403O;
        if (or3Var2 != null) {
            long j2 = this.f2406R;
            Magnifier magnifier = (Magnifier) or3Var2.f54782a;
            if (!Float.isNaN(Float.NaN)) {
                magnifier.setZoom(Float.NaN);
            }
            if ((9205357640488583168L & 9223372034707292159L) != 9205357640488583168L) {
                magnifier.show(Float.intBitsToFloat((int) (j2 >> 32)), Float.intBitsToFloat((int) (j2 & 4294967295L)), Float.intBitsToFloat((int) (9205357640488583168L >> 32)), Float.intBitsToFloat((int) (4294967295L & 9205357640488583168L)));
            } else {
                magnifier.show(Float.intBitsToFloat((int) (j2 >> 32)), Float.intBitsToFloat((int) (4294967295L & j2)));
            }
        }
        m964c1();
    }

    /* JADX INFO: renamed from: c1 */
    public final void m964c1() {
        fb2 fb2Var;
        or3 or3Var = this.f2403O;
        if (or3Var == null || (fb2Var = this.f2402N) == null) {
            return;
        }
        long jM18294E = or3Var.m18294E();
        n84 n84Var = this.f2407S;
        if (n84Var != null && jM18294E == n84Var.f52482a) {
            return;
        }
        this.f2399K.invoke(new bk2(fb2Var.mo915v(omd.m18152h0(or3Var.m18294E()))));
        this.f2407S = new n84(or3Var.m18294E());
    }

    @Override // p000.ll2
    /* JADX INFO: renamed from: i0 */
    public final void mo952i0(C0358h c0358h) {
        c0358h.m1614b();
        C3211a c3211a = this.f2408T;
        if (c3211a != null) {
            c3211a.mo4677k(xfa.f68157a);
        }
    }

    @Override // p000.qp6
    /* JADX INFO: renamed from: r0 */
    public final void mo804r0() {
        AbstractC0356f.m1552b(this, new po5(this, 0));
    }
}
