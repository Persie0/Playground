package androidx.glance.session;

import kotlin.AbstractC3193b;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import p000.AbstractC3584sr;
import p000.C3050gt;
import p000.C3386nv;
import p000.c32;
import p000.sm0;
import p000.un1;
import p000.w84;
import p000.xfa;
import p000.zi3;

/* JADX INFO: loaded from: classes2.dex */
@c32(m4290c = "androidx.glance.session.InteractiveFrameClock$startInteractive$2", m4291f = "InteractiveFrameClock.kt", m4292l = {132}, m4293m = "invokeSuspend", m4294v = 1)
final class InteractiveFrameClock$startInteractive$2 extends SuspendLambda implements zi3 {

    /* JADX INFO: renamed from: a */
    public int f6133a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ w84 f6134b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public InteractiveFrameClock$startInteractive$2(w84 w84Var, Continuation continuation) {
        super(2, continuation);
        this.f6134b = w84Var;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new InteractiveFrameClock$startInteractive$2(this.f6134b, continuation);
    }

    @Override // p000.zi3
    public final Object invoke(Object obj, Object obj2) {
        return ((InteractiveFrameClock$startInteractive$2) create((un1) obj, (Continuation) obj2)).invokeSuspend(xfa.f68157a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.f6133a;
        if (i == 0) {
            AbstractC3193b.m15359b(obj);
            this.f6134b.m23812d();
            w84 w84Var = this.f6134b;
            this.f6133a = 1;
            sm0 sm0Var = new sm0(1, AbstractC3584sr.m21600K(this));
            sm0Var.m21468u();
            synchronized (w84Var.f66516d) {
                w84Var.f66517e = 20;
                w84Var.f66519g = sm0Var;
            }
            sm0Var.m21470w(new C3050gt(w84Var, 1));
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
