package androidx.glance.session;

import android.content.Context;
import kotlin.AbstractC3193b;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import p000.C3386nv;
import p000.c32;
import p000.e1a;
import p000.ks8;
import p000.og5;
import p000.vi3;
import p000.vz1;
import p000.xfa;
import p000.zi3;

/* JADX INFO: loaded from: classes2.dex */
@c32(m4290c = "androidx.glance.session.SessionWorker$doWork$result$1", m4291f = "SessionWorker.kt", m4292l = {125}, m4293m = "invokeSuspend", m4294v = 1)
final class SessionWorker$doWork$result$1 extends SuspendLambda implements zi3 {

    /* JADX INFO: renamed from: a */
    public int f6177a;

    /* JADX INFO: renamed from: b */
    public /* synthetic */ Object f6178b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ SessionWorker f6179c;

    /* JADX INFO: renamed from: d */
    public final /* synthetic */ AbstractC0696d f6180d;

    /* JADX INFO: renamed from: androidx.glance.session.SessionWorker$doWork$result$1$1 */
    @c32(m4290c = "androidx.glance.session.SessionWorker$doWork$result$1$1", m4291f = "SessionWorker.kt", m4292l = {}, m4293m = "invokeSuspend", m4294v = 1)
    final class C06891 extends SuspendLambda implements vi3 {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ C0701i f6181a;

        /* JADX INFO: renamed from: b */
        public final /* synthetic */ SessionWorker f6182b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C06891(C0701i c0701i, SessionWorker sessionWorker, Continuation continuation) {
            super(1, continuation);
            this.f6181a = c0701i;
            this.f6182b = sessionWorker;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation create(Continuation continuation) {
            return new C06891(this.f6181a, this.f6182b, continuation);
        }

        @Override // p000.vi3
        public final Object invoke(Object obj) throws Throwable {
            C06891 c06891 = (C06891) create((Continuation) obj);
            xfa xfaVar = xfa.f68157a;
            c06891.invokeSuspend(xfaVar);
            return xfaVar;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) throws Throwable {
            CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
            AbstractC3193b.m15359b(obj);
            this.f6181a.m2500b(this.f6182b.f6160i.f36580c);
            return xfa.f68157a;
        }
    }

    /* JADX INFO: renamed from: androidx.glance.session.SessionWorker$doWork$result$1$2 */
    @c32(m4290c = "androidx.glance.session.SessionWorker$doWork$result$1$2", m4291f = "SessionWorker.kt", m4292l = {133}, m4293m = "invokeSuspend", m4294v = 1)
    final class C06902 extends SuspendLambda implements vi3 {

        /* JADX INFO: renamed from: a */
        public int f6183a;

        /* JADX INFO: renamed from: b */
        public final /* synthetic */ C0701i f6184b;

        /* JADX INFO: renamed from: c */
        public final /* synthetic */ SessionWorker f6185c;

        /* JADX INFO: renamed from: d */
        public final /* synthetic */ AbstractC0696d f6186d;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C06902(C0701i c0701i, SessionWorker sessionWorker, AbstractC0696d abstractC0696d, Continuation continuation) {
            super(1, continuation);
            this.f6184b = c0701i;
            this.f6185c = sessionWorker;
            this.f6186d = abstractC0696d;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation create(Continuation continuation) {
            return new C06902(this.f6184b, this.f6185c, this.f6186d, continuation);
        }

        @Override // p000.vi3
        public final Object invoke(Object obj) {
            return ((C06902) create((Continuation) obj)).invokeSuspend(xfa.f68157a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) throws Throwable {
            CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
            int i = this.f6183a;
            int i2 = 1;
            if (i == 0) {
                AbstractC3193b.m15359b(obj);
                SessionWorker sessionWorker = this.f6185c;
                Context context = sessionWorker.f56131a;
                e1a e1aVar = sessionWorker.f6160i;
                ks8 ks8Var = new ks8(sessionWorker, i2);
                this.f6183a = 1;
                if (AbstractC0693a.m2489a(this.f6184b, context, this.f6186d, e1aVar, ks8Var, this) == coroutineSingletons) {
                    return coroutineSingletons;
                }
            } else {
                if (i != 1) {
                    C3386nv.m17633t("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                AbstractC3193b.m15359b(obj);
            }
            return og5.m17981a();
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SessionWorker$doWork$result$1(SessionWorker sessionWorker, AbstractC0696d abstractC0696d, Continuation continuation) {
        super(2, continuation);
        this.f6179c = sessionWorker;
        this.f6180d = abstractC0696d;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        SessionWorker$doWork$result$1 sessionWorker$doWork$result$1 = new SessionWorker$doWork$result$1(this.f6179c, this.f6180d, continuation);
        sessionWorker$doWork$result$1.f6178b = obj;
        return sessionWorker$doWork$result$1;
    }

    @Override // p000.zi3
    public final Object invoke(Object obj, Object obj2) {
        return ((SessionWorker$doWork$result$1) create((C0701i) obj, (Continuation) obj2)).invokeSuspend(xfa.f68157a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.f6177a;
        if (i != 0) {
            if (i == 1) {
                AbstractC3193b.m15359b(obj);
                return obj;
            }
            C3386nv.m17633t("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        AbstractC3193b.m15359b(obj);
        C0701i c0701i = (C0701i) this.f6178b;
        SessionWorker sessionWorker = this.f6179c;
        Context context = sessionWorker.f56131a;
        C06891 c06891 = new C06891(c0701i, sessionWorker, null);
        C06902 c06902 = new C06902(c0701i, sessionWorker, this.f6180d, null);
        this.f6177a = 1;
        Object objM23649s = vz1.m23649s(new IdleEventBroadcastReceiverKt$observeIdleEvents$2(context, c06902, c06891, null), this);
        return objM23649s == coroutineSingletons ? coroutineSingletons : objM23649s;
    }
}
