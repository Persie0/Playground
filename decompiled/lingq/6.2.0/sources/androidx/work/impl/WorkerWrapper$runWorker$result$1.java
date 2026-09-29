package androidx.work.impl;

import android.content.Context;
import androidx.work.impl.utils.AbstractC0779a;
import kotlin.AbstractC3193b;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import p000.C3386nv;
import p000.c32;
import p000.e8b;
import p000.gm0;
import p000.h9b;
import p000.oj5;
import p000.p8b;
import p000.pg5;
import p000.un1;
import p000.xfa;
import p000.z7b;
import p000.zi3;

/* JADX INFO: loaded from: classes2.dex */
@c32(m4290c = "androidx.work.impl.WorkerWrapper$runWorker$result$1", m4291f = "WorkerWrapper.kt", m4292l = {297, 308}, m4293m = "invokeSuspend")
final class WorkerWrapper$runWorker$result$1 extends SuspendLambda implements zi3 {

    /* JADX INFO: renamed from: a */
    public int f7194a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ C0778d f7195b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ pg5 f7196c;

    /* JADX INFO: renamed from: d */
    public final /* synthetic */ z7b f7197d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public WorkerWrapper$runWorker$result$1(C0778d c0778d, pg5 pg5Var, z7b z7bVar, Continuation continuation) {
        super(2, continuation);
        this.f7195b = c0778d;
        this.f7196c = pg5Var;
        this.f7197d = z7bVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new WorkerWrapper$runWorker$result$1(this.f7195b, this.f7196c, this.f7197d, continuation);
    }

    @Override // p000.zi3
    public final Object invoke(Object obj, Object obj2) {
        return ((WorkerWrapper$runWorker$result$1) create((un1) obj, (Continuation) obj2)).invokeSuspend(xfa.f68157a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        WorkerWrapper$runWorker$result$1 workerWrapper$runWorker$result$1;
        C0778d c0778d = this.f7195b;
        p8b p8bVar = c0778d.f7240a;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.f7194a;
        pg5 pg5Var = this.f7196c;
        if (i == 0) {
            AbstractC3193b.m15359b(obj);
            Context context = c0778d.f7241b;
            e8b e8bVar = c0778d.f7243d;
            this.f7194a = 1;
            workerWrapper$runWorker$result$1 = this;
            if (AbstractC0779a.m2934a(context, p8bVar, pg5Var, this.f7197d, e8bVar, workerWrapper$runWorker$result$1) != coroutineSingletons) {
            }
        }
        if (i != 1) {
            if (i == 2) {
                AbstractC3193b.m15359b(obj);
                return obj;
            }
            C3386nv.m17633t("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        AbstractC3193b.m15359b(obj);
        workerWrapper$runWorker$result$1 = this;
        String str = h9b.f42060a;
        oj5.m18040f().m18042a(str, "Starting work for " + p8bVar.f55774c);
        gm0 gm0VarMo2900c = pg5Var.mo2900c();
        workerWrapper$runWorker$result$1.f7194a = 2;
        Object objM13148a = h9b.m13148a(gm0VarMo2900c, pg5Var, workerWrapper$runWorker$result$1);
        return objM13148a == coroutineSingletons ? coroutineSingletons : objM13148a;
    }
}
