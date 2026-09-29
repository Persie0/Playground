package kotlinx.coroutines.flow;

import kotlin.AbstractC3193b;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import p000.C3386nv;
import p000.aj3;
import p000.c32;
import p000.e83;
import p000.xfa;
import p000.zi3;

/* JADX INFO: loaded from: classes.dex */
@c32(m4290c = "kotlinx.coroutines.flow.FlowKt__MergeKt$mapLatest$1", m4291f = "Merge.kt", m4292l = {213, 213}, m4293m = "invokeSuspend", m4294v = 1)
final class FlowKt__MergeKt$mapLatest$1 extends SuspendLambda implements aj3 {

    /* JADX INFO: renamed from: a */
    public e83 f47908a;

    /* JADX INFO: renamed from: b */
    public int f47909b;

    /* JADX INFO: renamed from: c */
    public /* synthetic */ e83 f47910c;

    /* JADX INFO: renamed from: d */
    public /* synthetic */ Object f47911d;

    /* JADX INFO: renamed from: e */
    public final /* synthetic */ zi3 f47912e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public FlowKt__MergeKt$mapLatest$1(zi3 zi3Var, Continuation continuation) {
        super(3, continuation);
        this.f47912e = zi3Var;
    }

    @Override // p000.aj3
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        FlowKt__MergeKt$mapLatest$1 flowKt__MergeKt$mapLatest$1 = new FlowKt__MergeKt$mapLatest$1(this.f47912e, (Continuation) obj3);
        flowKt__MergeKt$mapLatest$1.f47910c = (e83) obj;
        flowKt__MergeKt$mapLatest$1.f47911d = obj2;
        return flowKt__MergeKt$mapLatest$1.invokeSuspend(xfa.f68157a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:14:0x0041, code lost:
    
        if (r0.emit(r8, r7) == r2) goto L15;
     */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) throws Throwable {
        e83 e83Var = this.f47910c;
        Object obj2 = this.f47911d;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.f47909b;
        if (i != 0) {
            if (i == 1) {
                e83Var = this.f47908a;
                AbstractC3193b.m15359b(obj);
            } else {
                if (i != 2) {
                    C3386nv.m17633t("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                AbstractC3193b.m15359b(obj);
            }
            return xfa.f68157a;
        }
        AbstractC3193b.m15359b(obj);
        this.f47910c = null;
        this.f47911d = null;
        this.f47908a = e83Var;
        this.f47909b = 1;
        obj = this.f47912e.invoke(obj2, this);
        if (obj != coroutineSingletons) {
        }
        return coroutineSingletons;
        this.f47910c = null;
        this.f47911d = null;
        this.f47908a = null;
        this.f47909b = 2;
    }
}
