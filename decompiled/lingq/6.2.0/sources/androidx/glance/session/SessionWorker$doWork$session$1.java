package androidx.glance.session;

import kotlin.AbstractC3193b;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import p000.c32;
import p000.xfa;
import p000.zi3;

/* JADX INFO: loaded from: classes2.dex */
@c32(m4290c = "androidx.glance.session.SessionWorker$doWork$session$1", m4291f = "SessionWorker.kt", m4292l = {}, m4293m = "invokeSuspend", m4294v = 1)
final class SessionWorker$doWork$session$1 extends SuspendLambda implements zi3 {

    /* JADX INFO: renamed from: a */
    public /* synthetic */ Object f6187a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ SessionWorker f6188b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SessionWorker$doWork$session$1(SessionWorker sessionWorker, Continuation continuation) {
        super(2, continuation);
        this.f6188b = sessionWorker;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        SessionWorker$doWork$session$1 sessionWorker$doWork$session$1 = new SessionWorker$doWork$session$1(this.f6188b, continuation);
        sessionWorker$doWork$session$1.f6187a = obj;
        return sessionWorker$doWork$session$1;
    }

    @Override // p000.zi3
    public final Object invoke(Object obj, Object obj2) {
        return ((SessionWorker$doWork$session$1) create((C0697e) obj, (Continuation) obj2)).invokeSuspend(xfa.f68157a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        AbstractC3193b.m15359b(obj);
        C0697e c0697e = (C0697e) this.f6187a;
        return (AbstractC0696d) c0697e.f6265a.get(this.f6188b.f6162k);
    }
}
