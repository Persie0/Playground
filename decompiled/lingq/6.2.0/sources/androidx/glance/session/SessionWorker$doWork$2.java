package androidx.glance.session;

import kotlin.AbstractC3193b;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import p000.C3386nv;
import p000.c32;
import p000.xfa;
import p000.zi3;

/* JADX INFO: loaded from: classes2.dex */
@c32(m4290c = "androidx.glance.session.SessionWorker$doWork$2", m4291f = "SessionWorker.kt", m4292l = {151}, m4293m = "invokeSuspend", m4294v = 1)
final class SessionWorker$doWork$2 extends SuspendLambda implements zi3 {

    /* JADX INFO: renamed from: a */
    public int f6168a;

    /* JADX INFO: renamed from: b */
    public /* synthetic */ Object f6169b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ AbstractC0696d f6170c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SessionWorker$doWork$2(AbstractC0696d abstractC0696d, Continuation continuation) {
        super(2, continuation);
        this.f6170c = abstractC0696d;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        SessionWorker$doWork$2 sessionWorker$doWork$2 = new SessionWorker$doWork$2(this.f6170c, continuation);
        sessionWorker$doWork$2.f6169b = obj;
        return sessionWorker$doWork$2;
    }

    @Override // p000.zi3
    public final Object invoke(Object obj, Object obj2) {
        return ((SessionWorker$doWork$2) create((C0697e) obj, (Continuation) obj2)).invokeSuspend(xfa.f68157a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.f6168a;
        if (i != 0) {
            if (i == 1) {
                AbstractC3193b.m15359b(obj);
                return obj;
            }
            C3386nv.m17633t("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        AbstractC3193b.m15359b(obj);
        C0697e c0697e = (C0697e) this.f6169b;
        this.f6168a = 1;
        Object objM2495b = c0697e.m2495b(this.f6170c, this);
        return objM2495b == coroutineSingletons ? coroutineSingletons : objM2495b;
    }
}
