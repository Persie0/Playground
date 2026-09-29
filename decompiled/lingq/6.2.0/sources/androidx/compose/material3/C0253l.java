package androidx.compose.material3;

import androidx.compose.foundation.MutatePriority;
import androidx.compose.foundation.gestures.C0097e;
import androidx.compose.runtime.AbstractC0278f;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import p000.AbstractC3720wf;
import p000.C3539rk;
import p000.InterfaceC0025an;
import p000.ae1;
import p000.f32;
import p000.fda;
import p000.l43;
import p000.ss5;
import p000.t66;
import p000.vi3;
import p000.xc9;
import p000.xfa;

/* JADX INFO: renamed from: androidx.compose.material3.l */
/* JADX INFO: loaded from: classes2.dex */
public final class C0253l {

    /* JADX INFO: renamed from: a */
    public final vi3 f3551a;

    /* JADX INFO: renamed from: b */
    public final C0097e f3552b;

    /* JADX INFO: renamed from: c */
    public final t66 f3553c;

    /* JADX INFO: renamed from: d */
    public l43 f3554d;

    /* JADX INFO: renamed from: e */
    public l43 f3555e;

    public C0253l(DrawerValue drawerValue, vi3 vi3Var) {
        this.f3551a = vi3Var;
        fda fdaVar = AbstractC0266w.f3635a;
        f32 f32Var = AbstractC3720wf.f66746c;
        ae1 ae1Var = new ae1(19);
        C3539rk c3539rk = new C3539rk(this, 15);
        C0097e c0097e = new C0097e(drawerValue, vi3Var);
        c0097e.f2233b = ae1Var;
        c0097e.f2234c = c3539rk;
        c0097e.f2235d = fdaVar;
        c0097e.f2236e = f32Var;
        this.f3552b = c0097e;
        this.f3553c = AbstractC0278f.m1260j(null);
        this.f3554d = ss5.m21697X();
        this.f3555e = ss5.m21697X();
    }

    /* JADX INFO: renamed from: a */
    public static Object m1180a(C0253l c0253l, DrawerValue drawerValue, InterfaceC0025an interfaceC0025an, SuspendLambda suspendLambda) throws Throwable {
        Object objM848a = c0253l.f3552b.m848a(drawerValue, MutatePriority.Default, new DrawerState$animateTo$3(c0253l, c0253l.f3552b.f2242k.m19861h(), interfaceC0025an, null), suspendLambda);
        return objM848a == CoroutineSingletons.COROUTINE_SUSPENDED ? objM848a : xfa.f68157a;
    }

    /* JADX INFO: renamed from: b */
    public final Object m1181b(SuspendLambda suspendLambda) throws Throwable {
        Object objM1180a = m1180a(this, DrawerValue.Closed, this.f3555e, suspendLambda);
        return objM1180a == CoroutineSingletons.COROUTINE_SUSPENDED ? objM1180a : xfa.f68157a;
    }

    /* JADX INFO: renamed from: c */
    public final boolean m1182c() {
        return ((DrawerValue) ((xc9) this.f3552b.f2239h).getValue()) == DrawerValue.Open;
    }
}
