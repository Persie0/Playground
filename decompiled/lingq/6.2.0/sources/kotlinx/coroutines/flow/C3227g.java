package kotlinx.coroutines.flow;

import kotlin.AbstractC3193b;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.jvm.internal.Ref$IntRef;
import p000.C3386nv;
import p000.e83;
import p000.xfa;

/* JADX INFO: renamed from: kotlinx.coroutines.flow.g */
/* JADX INFO: loaded from: classes3.dex */
public final class C3227g implements e83 {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ Ref$IntRef f48054a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ e83 f48055b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ Object f48056c;

    public C3227g(Ref$IntRef ref$IntRef, e83 e83Var, Object obj) {
        this.f48054a = ref$IntRef;
        this.f48055b = e83Var;
        this.f48056c = obj;
    }

    /* JADX WARN: Code duplicated, block: B:25:0x0058 A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:26:0x0059 A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Override // p000.e83
    public final Object emit(Object obj, Continuation continuation) throws Throwable {
        FlowKt__LimitKt$take$2$1$emit$1 flowKt__LimitKt$take$2$1$emit$1;
        if (continuation instanceof FlowKt__LimitKt$take$2$1$emit$1) {
            flowKt__LimitKt$take$2$1$emit$1 = (FlowKt__LimitKt$take$2$1$emit$1) continuation;
            int i = flowKt__LimitKt$take$2$1$emit$1.f47898c;
            if ((i & Integer.MIN_VALUE) != 0) {
                flowKt__LimitKt$take$2$1$emit$1.f47898c = i - Integer.MIN_VALUE;
            } else {
                flowKt__LimitKt$take$2$1$emit$1 = new FlowKt__LimitKt$take$2$1$emit$1(this, continuation);
            }
        } else {
            flowKt__LimitKt$take$2$1$emit$1 = new FlowKt__LimitKt$take$2$1$emit$1(this, continuation);
        }
        Object obj2 = flowKt__LimitKt$take$2$1$emit$1.f47896a;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i2 = flowKt__LimitKt$take$2$1$emit$1.f47898c;
        xfa xfaVar = xfa.f68157a;
        if (i2 != 0) {
            if (i2 == 1) {
                AbstractC3193b.m15359b(obj2);
                return xfaVar;
            }
            if (i2 == 2) {
                AbstractC3193b.m15359b(obj2);
                return xfaVar;
            }
            C3386nv.m17633t("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        AbstractC3193b.m15359b(obj2);
        Ref$IntRef ref$IntRef = this.f48054a;
        int i3 = ref$IntRef.f47716a + 1;
        ref$IntRef.f47716a = i3;
        e83 e83Var = this.f48055b;
        if (i3 < 1) {
            flowKt__LimitKt$take$2$1$emit$1.f47898c = 1;
            if (e83Var.emit(obj, flowKt__LimitKt$take$2$1$emit$1) == coroutineSingletons) {
                return coroutineSingletons;
            }
            return xfaVar;
        }
        flowKt__LimitKt$take$2$1$emit$1.f47898c = 2;
        if (AbstractC3224d.m15522a(e83Var, obj, this.f48056c, flowKt__LimitKt$take$2$1$emit$1) == coroutineSingletons) {
            return coroutineSingletons;
        }
        return xfaVar;
    }
}
