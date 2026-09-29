package androidx.glance.session;

import java.util.concurrent.atomic.AtomicReference;
import kotlin.AbstractC3193b;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import p000.C3386nv;
import p000.c32;
import p000.cd4;
import p000.fg2;
import p000.un1;
import p000.vz1;
import p000.xfa;
import p000.zi3;

/* JADX INFO: loaded from: classes2.dex */
@c32(m4290c = "androidx.glance.session.TimerScopeKt$withTimer$2", m4291f = "TimerScope.kt", m4292l = {82}, m4293m = "invokeSuspend", m4294v = 1)
final class TimerScopeKt$withTimer$2 extends SuspendLambda implements zi3 {

    /* JADX INFO: renamed from: a */
    public int f6237a;

    /* JADX INFO: renamed from: b */
    public /* synthetic */ Object f6238b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ zi3 f6239c;

    /* JADX INFO: renamed from: d */
    public final /* synthetic */ fg2 f6240d;

    /* JADX INFO: renamed from: androidx.glance.session.TimerScopeKt$withTimer$2$1 */
    @c32(m4290c = "androidx.glance.session.TimerScopeKt$withTimer$2$1", m4291f = "TimerScope.kt", m4292l = {135}, m4293m = "invokeSuspend", m4294v = 1)
    final class C06921 extends SuspendLambda implements zi3 {

        /* JADX INFO: renamed from: a */
        public int f6241a;

        /* JADX INFO: renamed from: b */
        public /* synthetic */ Object f6242b;

        /* JADX INFO: renamed from: c */
        public final /* synthetic */ zi3 f6243c;

        /* JADX INFO: renamed from: d */
        public final /* synthetic */ fg2 f6244d;

        /* JADX INFO: renamed from: e */
        public final /* synthetic */ un1 f6245e;

        /* JADX INFO: renamed from: f */
        public final /* synthetic */ AtomicReference f6246f;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C06921(zi3 zi3Var, fg2 fg2Var, un1 un1Var, AtomicReference atomicReference, Continuation continuation) {
            super(2, continuation);
            this.f6243c = zi3Var;
            this.f6244d = fg2Var;
            this.f6245e = un1Var;
            this.f6246f = atomicReference;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation create(Object obj, Continuation continuation) {
            C06921 c06921 = new C06921(this.f6243c, this.f6244d, this.f6245e, this.f6246f, continuation);
            c06921.f6242b = obj;
            return c06921;
        }

        @Override // p000.zi3
        public final Object invoke(Object obj, Object obj2) {
            return ((C06921) create((un1) obj, (Continuation) obj2)).invokeSuspend(xfa.f68157a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) throws Throwable {
            CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
            int i = this.f6241a;
            if (i != 0) {
                if (i == 1) {
                    AbstractC3193b.m15359b(obj);
                    return obj;
                }
                C3386nv.m17633t("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            AbstractC3193b.m15359b(obj);
            C0701i c0701i = new C0701i((un1) this.f6242b, this.f6244d, this.f6245e, this.f6243c, this.f6246f);
            this.f6241a = 1;
            Object objInvoke = this.f6243c.invoke(c0701i, this);
            return objInvoke == coroutineSingletons ? coroutineSingletons : objInvoke;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public TimerScopeKt$withTimer$2(zi3 zi3Var, fg2 fg2Var, Continuation continuation) {
        super(2, continuation);
        this.f6239c = zi3Var;
        this.f6240d = fg2Var;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        TimerScopeKt$withTimer$2 timerScopeKt$withTimer$2 = new TimerScopeKt$withTimer$2(this.f6239c, this.f6240d, continuation);
        timerScopeKt$withTimer$2.f6238b = obj;
        return timerScopeKt$withTimer$2;
    }

    @Override // p000.zi3
    public final Object invoke(Object obj, Object obj2) {
        return ((TimerScopeKt$withTimer$2) create((un1) obj, (Continuation) obj2)).invokeSuspend(xfa.f68157a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        AtomicReference atomicReference;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.f6237a;
        if (i == 0) {
            AbstractC3193b.m15359b(obj);
            un1 un1Var = (un1) this.f6238b;
            AtomicReference atomicReference2 = new AtomicReference(null);
            C06921 c06921 = new C06921(this.f6239c, this.f6240d, un1Var, atomicReference2, null);
            this.f6238b = atomicReference2;
            this.f6237a = 1;
            obj = vz1.m23649s(c06921, this);
            if (obj == coroutineSingletons) {
                return coroutineSingletons;
            }
            atomicReference = atomicReference2;
        } else {
            if (i != 1) {
                C3386nv.m17633t("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            atomicReference = (AtomicReference) this.f6238b;
            AbstractC3193b.m15359b(obj);
        }
        cd4 cd4Var = (cd4) atomicReference.get();
        if (cd4Var != null) {
            cd4Var.mo4537a(null);
        }
        return obj;
    }
}
