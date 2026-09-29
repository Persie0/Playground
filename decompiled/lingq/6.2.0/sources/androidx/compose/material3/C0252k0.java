package androidx.compose.material3;

import androidx.compose.foundation.C0145m;
import androidx.compose.foundation.MutatePriority;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import p000.sm0;
import p000.w66;
import p000.xc9;
import p000.xfa;

/* JADX INFO: renamed from: androidx.compose.material3.k0 */
/* JADX INFO: loaded from: classes2.dex */
public final class C0252k0 {

    /* JADX INFO: renamed from: a */
    public final C0145m f3548a;

    /* JADX INFO: renamed from: b */
    public final w66 f3549b = new w66(Boolean.FALSE);

    /* JADX INFO: renamed from: c */
    public sm0 f3550c;

    public C0252k0(C0145m c0145m) {
        this.f3548a = c0145m;
    }

    /* JADX INFO: renamed from: a */
    public final void m1177a() {
        ((xc9) this.f3549b.f66458c).setValue(Boolean.FALSE);
    }

    /* JADX INFO: renamed from: b */
    public final boolean m1178b() {
        w66 w66Var = this.f3549b;
        return ((Boolean) ((xc9) w66Var.f66457b).getValue()).booleanValue() || ((Boolean) ((xc9) w66Var.f66458c).getValue()).booleanValue();
    }

    /* JADX INFO: renamed from: c */
    public final Object m1179c(MutatePriority mutatePriority, SuspendLambda suspendLambda) {
        Object objM1026b = this.f3548a.m1026b(mutatePriority, new TooltipStateImpl$show$2(this, mutatePriority, new TooltipStateImpl$show$cancellableShow$1(this, null), null), suspendLambda);
        return objM1026b == CoroutineSingletons.COROUTINE_SUSPENDED ? objM1026b : xfa.f68157a;
    }
}
