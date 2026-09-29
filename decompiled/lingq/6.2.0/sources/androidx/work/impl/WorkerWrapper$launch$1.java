package androidx.work.impl;

import java.util.concurrent.CancellationException;
import kotlin.AbstractC3193b;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import p000.C3386nv;
import p000.c32;
import p000.d9b;
import p000.e13;
import p000.f9b;
import p000.g9b;
import p000.h9b;
import p000.hz4;
import p000.oj5;
import p000.sd4;
import p000.un1;
import p000.wfb;
import p000.xfa;
import p000.zi3;

/* JADX INFO: loaded from: classes2.dex */
@c32(m4290c = "androidx.work.impl.WorkerWrapper$launch$1", m4291f = "WorkerWrapper.kt", m4292l = {98}, m4293m = "invokeSuspend")
final class WorkerWrapper$launch$1 extends SuspendLambda implements zi3 {

    /* JADX INFO: renamed from: a */
    public int f7187a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ C0778d f7188b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public WorkerWrapper$launch$1(C0778d c0778d, Continuation continuation) {
        super(2, continuation);
        this.f7188b = c0778d;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new WorkerWrapper$launch$1(this.f7188b, continuation);
    }

    @Override // p000.zi3
    public final Object invoke(Object obj, Object obj2) {
        return ((WorkerWrapper$launch$1) create((un1) obj, (Continuation) obj2)).invokeSuspend(xfa.f68157a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        Object d9bVar;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.f7187a;
        C0778d c0778d = this.f7188b;
        try {
            if (i == 0) {
                AbstractC3193b.m15359b(obj);
                sd4 sd4Var = c0778d.f7252m;
                WorkerWrapper$launch$1$resolution$1 workerWrapper$launch$1$resolution$1 = new WorkerWrapper$launch$1$resolution$1(c0778d, null);
                this.f7187a = 1;
                obj = wfb.m23905G(workerWrapper$launch$1$resolution$1, sd4Var, this);
                if (obj == coroutineSingletons) {
                    return coroutineSingletons;
                }
            } else {
                if (i != 1) {
                    C3386nv.m17633t("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                AbstractC3193b.m15359b(obj);
            }
            d9bVar = (g9b) obj;
        } catch (WorkerStoppedException e) {
            d9bVar = new f9b(e.f7186a);
        } catch (CancellationException unused) {
            d9bVar = new d9b();
        } catch (Throwable th) {
            oj5.m18040f().m18044e(h9b.f42060a, "Unexpected error in WorkerWrapper", th);
            d9bVar = new d9b();
        }
        Object objM2845r = c0778d.f7247h.m2845r(new hz4(new e13(2, d9bVar, c0778d), 28));
        objM2845r.getClass();
        return objM2845r;
    }
}
