package androidx.compose.runtime;

import kotlin.AbstractC3193b;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import p000.C3386nv;
import p000.c32;
import p000.jl7;
import p000.t66;
import p000.un1;
import p000.xfa;
import p000.zi3;

/* JADX INFO: loaded from: classes.dex */
@c32(m4290c = "androidx.compose.runtime.SnapshotStateKt__ProduceStateKt$produceState$5$1", m4291f = "ProduceState.kt", m4292l = {204}, m4293m = "invokeSuspend", m4294v = 1)
final class SnapshotStateKt__ProduceStateKt$produceState$5$1 extends SuspendLambda implements zi3 {

    /* JADX INFO: renamed from: a */
    public int f3699a;

    /* JADX INFO: renamed from: b */
    public /* synthetic */ Object f3700b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ zi3 f3701c;

    /* JADX INFO: renamed from: d */
    public final /* synthetic */ t66 f3702d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SnapshotStateKt__ProduceStateKt$produceState$5$1(zi3 zi3Var, t66 t66Var, Continuation continuation) {
        super(2, continuation);
        this.f3701c = zi3Var;
        this.f3702d = t66Var;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        SnapshotStateKt__ProduceStateKt$produceState$5$1 snapshotStateKt__ProduceStateKt$produceState$5$1 = new SnapshotStateKt__ProduceStateKt$produceState$5$1(this.f3701c, this.f3702d, continuation);
        snapshotStateKt__ProduceStateKt$produceState$5$1.f3700b = obj;
        return snapshotStateKt__ProduceStateKt$produceState$5$1;
    }

    @Override // p000.zi3
    public final Object invoke(Object obj, Object obj2) {
        return ((SnapshotStateKt__ProduceStateKt$produceState$5$1) create((un1) obj, (Continuation) obj2)).invokeSuspend(xfa.f68157a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.f3699a;
        if (i == 0) {
            AbstractC3193b.m15359b(obj);
            jl7 jl7Var = new jl7(this.f3702d, ((un1) this.f3700b).mo1309x());
            this.f3699a = 1;
            if (this.f3701c.invoke(jl7Var, this) == coroutineSingletons) {
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
