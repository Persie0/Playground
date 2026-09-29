package androidx.compose.material3;

import androidx.compose.animation.AbstractC0054a;
import androidx.compose.animation.core.C0059a;
import androidx.compose.p002ui.draw.C0295b;
import androidx.compose.p002ui.draw.C0296c;
import java.util.ArrayList;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.flow.C3229i;
import p000.C3602t8;
import p000.C3741x;
import p000.aa1;
import p000.eu9;
import p000.fa2;
import p000.jda;
import p000.mkd;
import p000.ms5;
import p000.mx9;
import p000.nx9;
import p000.o39;
import p000.pg9;
import p000.pk9;
import p000.ps5;
import p000.tf1;
import p000.thb;
import p000.v56;
import p000.wfb;
import p000.xfa;
import p000.xj2;

/* JADX INFO: renamed from: androidx.compose.material3.r */
/* JADX INFO: loaded from: classes2.dex */
public final class C0261r extends fa2 implements tf1 {

    /* JADX INFO: renamed from: L */
    public boolean f3615L;

    /* JADX INFO: renamed from: M */
    public boolean f3616M;

    /* JADX INFO: renamed from: N */
    public v56 f3617N;

    /* JADX INFO: renamed from: O */
    public float f3618O = 2.0f;

    /* JADX INFO: renamed from: P */
    public float f3619P = 1.0f;

    /* JADX INFO: renamed from: Q */
    public boolean f3620Q;

    /* JADX INFO: renamed from: R */
    public pg9 f3621R;

    /* JADX INFO: renamed from: S */
    public eu9 f3622S;

    /* JADX INFO: renamed from: T */
    public C0059a f3623T;

    /* JADX INFO: renamed from: U */
    public o39 f3624U;

    /* JADX INFO: renamed from: V */
    public final C0059a f3625V;

    /* JADX INFO: renamed from: W */
    public final C0295b f3626W;

    public C0261r(boolean z, boolean z2, v56 v56Var, eu9 eu9Var, o39 o39Var) {
        this.f3615L = z;
        this.f3616M = z2;
        this.f3617N = v56Var;
        this.f3622S = eu9Var;
        this.f3624U = o39Var;
        this.f3625V = new C0059a(new xj2((this.f3620Q && z) ? 2.0f : 1.0f), pk9.f56365j, null, 12);
        C0295b c0295b = new C0295b(new C0296c(), new C3741x(this, 25));
        m11624Z0(c0295b);
        this.f3626W = c0295b;
    }

    /* JADX INFO: renamed from: c1 */
    public static final Object m1199c1(C0261r c0261r, SuspendLambda suspendLambda) throws Throwable {
        c0261r.f3620Q = false;
        ArrayList arrayList = new ArrayList();
        C3229i c3229i = c0261r.f3617N.f64886a;
        C3602t8 c3602t8 = new C3602t8(5, arrayList, c0261r);
        c3229i.getClass();
        CoroutineSingletons coroutineSingletonsM15548j = C3229i.m15548j(c3229i, c3602t8, suspendLambda);
        return coroutineSingletonsM15548j == CoroutineSingletons.COROUTINE_SUSPENDED ? coroutineSingletonsM15548j : xfa.f68157a;
    }

    @Override // p000.d16
    /* JADX INFO: renamed from: O0 */
    public final boolean mo574O0() {
        return false;
    }

    @Override // p000.d16
    /* JADX INFO: renamed from: R0 */
    public final void mo36R0() {
        this.f3621R = wfb.m23926u(m9971N0(), null, null, new IndicatorLineNode$onAttach$1(this, null), 3);
        if (this.f3623T == null) {
            eu9 eu9VarM16907k = this.f3622S;
            if (eu9VarM16907k == null) {
                eu9VarM16907k = mkd.m16907k(((ms5) thb.m22050i(this, ps5.f56764b)).f51799a, (mx9) thb.m22050i(this, nx9.f53367a));
            }
            long jM11349d = eu9VarM16907k.m11349d(this.f3615L, this.f3616M, this.f3620Q);
            aa1 aa1Var = new aa1(jM11349d);
            int i = aa1.f413l;
            this.f3623T = new C0059a(aa1Var, (jda) AbstractC0054a.m735j().invoke(aa1.m202f(jM11349d)), null, 12);
        }
    }

    /* JADX INFO: renamed from: d1 */
    public final void m1200d1() {
        wfb.m23926u(m9971N0(), null, null, new IndicatorLineNode$invalidateIndicator$1(this, null), 3);
        wfb.m23926u(m9971N0(), null, null, new IndicatorLineNode$invalidateIndicator$2(this, null), 3);
    }
}
