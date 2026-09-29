package androidx.compose.material3;

import kotlin.AbstractC3193b;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import p000.AbstractC3584sr;
import p000.C3386nv;
import p000.c32;
import p000.sm0;
import p000.vi3;
import p000.w66;
import p000.xc9;
import p000.xfa;

/* JADX INFO: loaded from: classes2.dex */
@c32(m4290c = "androidx.compose.material3.TooltipStateImpl$show$cancellableShow$1", m4291f = "Tooltip.kt", m4292l = {1507}, m4293m = "invokeSuspend", m4294v = 1)
final class TooltipStateImpl$show$cancellableShow$1 extends SuspendLambda implements vi3 {

    /* JADX INFO: renamed from: a */
    public int f3359a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ C0252k0 f3360b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public TooltipStateImpl$show$cancellableShow$1(C0252k0 c0252k0, Continuation continuation) {
        super(1, continuation);
        this.f3360b = c0252k0;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Continuation continuation) {
        return new TooltipStateImpl$show$cancellableShow$1(this.f3360b, continuation);
    }

    @Override // p000.vi3
    public final Object invoke(Object obj) {
        return ((TooltipStateImpl$show$cancellableShow$1) create((Continuation) obj)).invokeSuspend(xfa.f68157a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.f3359a;
        if (i == 0) {
            AbstractC3193b.m15359b(obj);
            this.f3359a = 1;
            sm0 sm0Var = new sm0(1, AbstractC3584sr.m21600K(this));
            sm0Var.m21468u();
            C0252k0 c0252k0 = this.f3360b;
            w66 w66Var = c0252k0.f3549b;
            ((xc9) w66Var.f66458c).setValue(Boolean.TRUE);
            c0252k0.f3550c = sm0Var;
            if (sm0Var.m21466r() == coroutineSingletons) {
                return coroutineSingletons;
            }
        } else {
            if (i != 1) {
                C3386nv.m17633t("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            AbstractC3193b.m15359b(obj);
        }
        return xfa.f68157a;
    }
}
