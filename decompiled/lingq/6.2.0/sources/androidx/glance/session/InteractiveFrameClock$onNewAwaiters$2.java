package androidx.glance.session;

import kotlin.AbstractC3193b;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.internal.Ref$LongRef;
import p000.C3386nv;
import p000.C3611th;
import p000.c32;
import p000.un1;
import p000.w84;
import p000.xfa;
import p000.zi3;

/* JADX INFO: loaded from: classes2.dex */
@c32(m4290c = "androidx.glance.session.InteractiveFrameClock$onNewAwaiters$2", m4291f = "InteractiveFrameClock.kt", m4292l = {114, 117}, m4293m = "invokeSuspend", m4294v = 1)
final class InteractiveFrameClock$onNewAwaiters$2 extends SuspendLambda implements zi3 {

    /* JADX INFO: renamed from: a */
    public int f6128a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ Ref$LongRef f6129b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ Ref$LongRef f6130c;

    /* JADX INFO: renamed from: d */
    public final /* synthetic */ w84 f6131d;

    /* JADX INFO: renamed from: e */
    public final /* synthetic */ long f6132e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public InteractiveFrameClock$onNewAwaiters$2(Ref$LongRef ref$LongRef, Ref$LongRef ref$LongRef2, w84 w84Var, long j, Continuation continuation) {
        super(2, continuation);
        this.f6129b = ref$LongRef;
        this.f6130c = ref$LongRef2;
        this.f6131d = w84Var;
        this.f6132e = j;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new InteractiveFrameClock$onNewAwaiters$2(this.f6129b, this.f6130c, this.f6131d, this.f6132e, continuation);
    }

    @Override // p000.zi3
    public final Object invoke(Object obj, Object obj2) {
        return ((InteractiveFrameClock$onNewAwaiters$2) create((un1) obj, (Continuation) obj2)).invokeSuspend(xfa.f68157a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:13:0x0032, code lost:
    
        if (p000.dha.m10394f(r9) == r1) goto L25;
     */
    /* JADX WARN: Code restructure failed: missing block: B:24:0x0058, code lost:
    
        if (kotlinx.coroutines.AbstractC3208a.m15437d((r7 - r5) / 1000000, r9) == r1) goto L25;
     */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) throws Throwable {
        w84 w84Var = this.f6131d;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.f6128a;
        if (i == 0) {
            AbstractC3193b.m15359b(obj);
            long j = this.f6129b.f47717a;
            long j2 = this.f6130c.f47717a;
            if (j >= j2) {
                this.f6128a = 1;
            } else {
                this.f6128a = 2;
            }
            return coroutineSingletons;
        }
        if (i == 1) {
            AbstractC3193b.m15359b(obj);
            long j3 = this.f6132e;
            w84Var.f66515c.f60886b.m23726n(new C3611th(1, j3));
            synchronized (w84Var.f66516d) {
                w84Var.f66518f = j3;
            }
        } else {
            if (i != 2) {
                C3386nv.m17633t("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            AbstractC3193b.m15359b(obj);
            long jLongValue = ((Number) w84Var.f66514b.mo0a()).longValue();
            w84Var.f66515c.f60886b.m23726n(new C3611th(1, jLongValue));
            synchronized (w84Var.f66516d) {
                w84Var.f66518f = jLongValue;
            }
        }
        return xfa.f68157a;
    }
}
