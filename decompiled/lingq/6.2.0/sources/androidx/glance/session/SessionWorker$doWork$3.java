package androidx.glance.session;

import androidx.glance.appwidget.C0656d;
import kotlin.AbstractC3193b;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import p000.C3386nv;
import p000.c32;
import p000.iz8;
import p000.un1;
import p000.xfa;
import p000.zi3;

/* JADX INFO: loaded from: classes2.dex */
@c32(m4290c = "androidx.glance.session.SessionWorker$doWork$3", m4291f = "SessionWorker.kt", m4292l = {156}, m4293m = "invokeSuspend", m4294v = 1)
final class SessionWorker$doWork$3 extends SuspendLambda implements zi3 {

    /* JADX INFO: renamed from: a */
    public int f6171a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ SessionWorker f6172b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ AbstractC0696d f6173c;

    /* JADX INFO: renamed from: androidx.glance.session.SessionWorker$doWork$3$1 */
    @c32(m4290c = "androidx.glance.session.SessionWorker$doWork$3$1", m4291f = "SessionWorker.kt", m4292l = {156}, m4293m = "invokeSuspend", m4294v = 1)
    final class C06881 extends SuspendLambda implements zi3 {

        /* JADX INFO: renamed from: a */
        public int f6174a;

        /* JADX INFO: renamed from: b */
        public /* synthetic */ Object f6175b;

        /* JADX INFO: renamed from: c */
        public final /* synthetic */ AbstractC0696d f6176c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C06881(AbstractC0696d abstractC0696d, Continuation continuation) {
            super(2, continuation);
            this.f6176c = abstractC0696d;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation create(Object obj, Continuation continuation) {
            C06881 c06881 = new C06881(this.f6176c, continuation);
            c06881.f6175b = obj;
            return c06881;
        }

        @Override // p000.zi3
        public final Object invoke(Object obj, Object obj2) {
            return ((C06881) create((C0697e) obj, (Continuation) obj2)).invokeSuspend(xfa.f68157a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) throws Throwable {
            CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
            int i = this.f6174a;
            xfa xfaVar = xfa.f68157a;
            if (i != 0) {
                if (i == 1) {
                    AbstractC3193b.m15359b(obj);
                    return xfaVar;
                }
                C3386nv.m17633t("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            AbstractC3193b.m15359b(obj);
            C0697e c0697e = (C0697e) this.f6175b;
            String str = this.f6176c.f6261a;
            this.f6174a = 1;
            AbstractC0696d abstractC0696d = (AbstractC0696d) c0697e.f6265a.remove(str);
            if (abstractC0696d != null) {
                abstractC0696d.f6264d.mo15331i(null);
                abstractC0696d.f6262b.set(false);
                ((C0656d) abstractC0696d).f6006m.mo4537a(null);
            }
            return xfaVar == coroutineSingletons ? coroutineSingletons : xfaVar;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SessionWorker$doWork$3(SessionWorker sessionWorker, AbstractC0696d abstractC0696d, Continuation continuation) {
        super(2, continuation);
        this.f6172b = sessionWorker;
        this.f6173c = abstractC0696d;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new SessionWorker$doWork$3(this.f6172b, this.f6173c, continuation);
    }

    @Override // p000.zi3
    public final Object invoke(Object obj, Object obj2) {
        return ((SessionWorker$doWork$3) create((un1) obj, (Continuation) obj2)).invokeSuspend(xfa.f68157a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.f6171a;
        if (i == 0) {
            AbstractC3193b.m15359b(obj);
            iz8 iz8Var = this.f6172b.f6159h;
            C06881 c06881 = new C06881(this.f6173c, null);
            this.f6171a = 1;
            C0698f c0698f = (C0698f) iz8Var;
            c0698f.getClass();
            if (C0698f.m2497b(c0698f, c06881, this) == coroutineSingletons) {
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
