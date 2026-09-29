package androidx.glance.session;

import kotlin.AbstractC3193b;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.AbstractC3208a;
import p000.C3386nv;
import p000.c32;
import p000.fg2;
import p000.un1;
import p000.vz1;
import p000.xfa;
import p000.zi3;

/* JADX INFO: loaded from: classes2.dex */
@c32(m4290c = "androidx.glance.session.TimerScopeKt$withTimer$2$1$blockScope$1$startTimer$1", m4291f = "TimerScope.kt", m4292l = {122}, m4293m = "invokeSuspend", m4294v = 1)
final class TimerScopeKt$withTimer$2$1$blockScope$1$startTimer$1 extends SuspendLambda implements zi3 {

    /* JADX INFO: renamed from: a */
    public int f6247a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ C0701i f6248b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ fg2 f6249c;

    /* JADX INFO: renamed from: d */
    public final /* synthetic */ un1 f6250d;

    /* JADX INFO: renamed from: e */
    public final /* synthetic */ zi3 f6251e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public TimerScopeKt$withTimer$2$1$blockScope$1$startTimer$1(C0701i c0701i, fg2 fg2Var, un1 un1Var, zi3 zi3Var, Continuation continuation) {
        super(2, continuation);
        this.f6248b = c0701i;
        this.f6249c = fg2Var;
        this.f6250d = un1Var;
        this.f6251e = zi3Var;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new TimerScopeKt$withTimer$2$1$blockScope$1$startTimer$1(this.f6248b, this.f6249c, this.f6250d, this.f6251e, continuation);
    }

    @Override // p000.zi3
    public final Object invoke(Object obj, Object obj2) {
        return ((TimerScopeKt$withTimer$2$1$blockScope$1$startTimer$1) create((un1) obj, (Continuation) obj2)).invokeSuspend(xfa.f68157a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        long jM2499a;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.f6247a;
        if (i != 0 && i != 1) {
            C3386nv.m17633t("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        AbstractC3193b.m15359b(obj);
        do {
            C0701i c0701i = this.f6248b;
            Object obj2 = c0701i.f6279b.get();
            obj2.getClass();
            long jLongValue = ((Number) obj2).longValue();
            this.f6249c.getClass();
            if (jLongValue <= System.currentTimeMillis()) {
                vz1.m23637j(this.f6250d, new TimeoutCancellationException("Timed out of executing block.", this.f6251e.hashCode()));
                return xfa.f68157a;
            }
            jM2499a = c0701i.m2499a();
            this.f6247a = 1;
        } while (AbstractC3208a.m15438e(jM2499a, this) != coroutineSingletons);
        return coroutineSingletons;
    }
}
