package androidx.work.impl.constraints;

import kotlin.AbstractC3193b;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.AbstractC3208a;
import p000.C3386nv;
import p000.c32;
import p000.gk1;
import p000.kl7;
import p000.ll7;
import p000.oj5;
import p000.un1;
import p000.xfa;
import p000.zi3;

/* JADX INFO: loaded from: classes2.dex */
@c32(m4290c = "androidx.work.impl.constraints.NetworkRequestConstraintController$track$1$timeoutJob$1", m4291f = "WorkConstraintsTracker.kt", m4292l = {162}, m4293m = "invokeSuspend")
final class NetworkRequestConstraintController$track$1$timeoutJob$1 extends SuspendLambda implements zi3 {

    /* JADX INFO: renamed from: a */
    public int f7224a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ C0775a f7225b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ ll7 f7226c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public NetworkRequestConstraintController$track$1$timeoutJob$1(C0775a c0775a, ll7 ll7Var, Continuation continuation) {
        super(2, continuation);
        this.f7225b = c0775a;
        this.f7226c = ll7Var;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new NetworkRequestConstraintController$track$1$timeoutJob$1(this.f7225b, this.f7226c, continuation);
    }

    @Override // p000.zi3
    public final Object invoke(Object obj, Object obj2) {
        return ((NetworkRequestConstraintController$track$1$timeoutJob$1) create((un1) obj, (Continuation) obj2)).invokeSuspend(xfa.f68157a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.f7224a;
        if (i == 0) {
            AbstractC3193b.m15359b(obj);
            this.f7224a = 1;
            if (AbstractC3208a.m15437d(1000L, this) == coroutineSingletons) {
                return coroutineSingletons;
            }
        } else {
            if (i != 1) {
                C3386nv.m17633t("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            AbstractC3193b.m15359b(obj);
        }
        oj5.m18040f().m18042a(AbstractC0776b.f7235a, "NetworkRequestConstraintController didn't receive neither onCapabilitiesChanged/onLost callback, sending `ConstraintsNotMet` after 1000 ms");
        ((kl7) this.f7226c).mo4677k(new gk1(7));
        return xfa.f68157a;
    }
}
