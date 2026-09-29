package kotlinx.coroutines.flow;

import kotlin.AbstractC3193b;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import p000.C3386nv;
import p000.aj3;
import p000.c32;
import p000.dj3;
import p000.e83;
import p000.xfa;

/* JADX INFO: loaded from: classes.dex */
@c32(m4290c = "kotlinx.coroutines.flow.FlowKt__ZipKt$combine$$inlined$combineUnsafe$FlowKt__ZipKt$3$2", m4291f = "Zip.kt", m4292l = {329, 258}, m4293m = "invokeSuspend", m4294v = 1)
public final class FlowKt__ZipKt$combine$$inlined$combineUnsafe$FlowKt__ZipKt$3$2 extends SuspendLambda implements aj3 {

    /* JADX INFO: renamed from: a */
    public e83 f47969a;

    /* JADX INFO: renamed from: b */
    public int f47970b;

    /* JADX INFO: renamed from: c */
    public /* synthetic */ e83 f47971c;

    /* JADX INFO: renamed from: d */
    public /* synthetic */ Object[] f47972d;

    /* JADX INFO: renamed from: e */
    public final /* synthetic */ dj3 f47973e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public FlowKt__ZipKt$combine$$inlined$combineUnsafe$FlowKt__ZipKt$3$2(Continuation continuation, dj3 dj3Var) {
        super(3, continuation);
        this.f47973e = dj3Var;
    }

    @Override // p000.aj3
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        FlowKt__ZipKt$combine$$inlined$combineUnsafe$FlowKt__ZipKt$3$2 flowKt__ZipKt$combine$$inlined$combineUnsafe$FlowKt__ZipKt$3$2 = new FlowKt__ZipKt$combine$$inlined$combineUnsafe$FlowKt__ZipKt$3$2((Continuation) obj3, this.f47973e);
        flowKt__ZipKt$combine$$inlined$combineUnsafe$FlowKt__ZipKt$3$2.f47971c = (e83) obj;
        flowKt__ZipKt$combine$$inlined$combineUnsafe$FlowKt__ZipKt$3$2.f47972d = (Object[]) obj2;
        return flowKt__ZipKt$combine$$inlined$combineUnsafe$FlowKt__ZipKt$3$2.invokeSuspend(xfa.f68157a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:14:0x0050, code lost:
    
        if (r0.emit(r15, r13) == r2) goto L15;
     */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) throws Throwable {
        FlowKt__ZipKt$combine$$inlined$combineUnsafe$FlowKt__ZipKt$3$2 flowKt__ZipKt$combine$$inlined$combineUnsafe$FlowKt__ZipKt$3$2;
        e83 e83Var = this.f47971c;
        Object[] objArr = this.f47972d;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.f47970b;
        if (i != 0) {
            if (i == 1) {
                e83Var = this.f47969a;
                AbstractC3193b.m15359b(obj);
                flowKt__ZipKt$combine$$inlined$combineUnsafe$FlowKt__ZipKt$3$2 = this;
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
        Object obj2 = objArr[0];
        Object obj3 = objArr[1];
        Object obj4 = objArr[2];
        Object obj5 = objArr[3];
        Object obj6 = objArr[4];
        this.f47971c = null;
        this.f47972d = null;
        this.f47969a = e83Var;
        this.f47970b = 1;
        flowKt__ZipKt$combine$$inlined$combineUnsafe$FlowKt__ZipKt$3$2 = this;
        obj = this.f47973e.mo1290h(obj2, obj3, obj4, obj5, obj6, flowKt__ZipKt$combine$$inlined$combineUnsafe$FlowKt__ZipKt$3$2);
        if (obj != coroutineSingletons) {
        }
        return coroutineSingletons;
        flowKt__ZipKt$combine$$inlined$combineUnsafe$FlowKt__ZipKt$3$2.f47971c = null;
        flowKt__ZipKt$combine$$inlined$combineUnsafe$FlowKt__ZipKt$3$2.f47972d = null;
        flowKt__ZipKt$combine$$inlined$combineUnsafe$FlowKt__ZipKt$3$2.f47969a = null;
        flowKt__ZipKt$combine$$inlined$combineUnsafe$FlowKt__ZipKt$3$2.f47970b = 2;
    }
}
