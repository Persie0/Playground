package kotlinx.coroutines.flow;

import java.io.Serializable;
import kotlin.AbstractC3193b;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.jvm.internal.Ref$IntRef;
import kotlin.jvm.internal.Ref$ObjectRef;
import p000.C3386nv;
import p000.e83;
import p000.xfa;

/* JADX INFO: renamed from: kotlinx.coroutines.flow.f */
/* JADX INFO: loaded from: classes.dex */
public final class C3226f implements e83 {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f48051a = 0;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ e83 f48052b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ Serializable f48053c;

    public C3226f(e83 e83Var, Ref$ObjectRef ref$ObjectRef) {
        this.f48052b = e83Var;
        this.f48053c = ref$ObjectRef;
    }

    /* JADX WARN: Code duplicated, block: B:28:0x0063  */
    /* JADX WARN: Code duplicated, block: B:9:0x0022  */
    @Override // p000.e83
    public final Object emit(Object obj, Continuation continuation) throws Throwable {
        FlowKt__ErrorsKt$catchImpl$2$emit$1 flowKt__ErrorsKt$catchImpl$2$emit$1;
        FlowKt__LimitKt$drop$2$1$emit$1 flowKt__LimitKt$drop$2$1$emit$1;
        int i = this.f48051a;
        e83 e83Var = this.f48052b;
        Serializable serializable = this.f48053c;
        xfa xfaVar = xfa.f68157a;
        switch (i) {
            case 0:
                if (continuation instanceof FlowKt__ErrorsKt$catchImpl$2$emit$1) {
                    flowKt__ErrorsKt$catchImpl$2$emit$1 = (FlowKt__ErrorsKt$catchImpl$2$emit$1) continuation;
                    int i2 = flowKt__ErrorsKt$catchImpl$2$emit$1.f47873c;
                    if ((i2 & Integer.MIN_VALUE) != 0) {
                        flowKt__ErrorsKt$catchImpl$2$emit$1.f47873c = i2 - Integer.MIN_VALUE;
                    } else {
                        flowKt__ErrorsKt$catchImpl$2$emit$1 = new FlowKt__ErrorsKt$catchImpl$2$emit$1(this, continuation);
                    }
                } else {
                    flowKt__ErrorsKt$catchImpl$2$emit$1 = new FlowKt__ErrorsKt$catchImpl$2$emit$1(this, continuation);
                }
                Object obj2 = flowKt__ErrorsKt$catchImpl$2$emit$1.f47871a;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                int i3 = flowKt__ErrorsKt$catchImpl$2$emit$1.f47873c;
                try {
                    if (i3 == 0) {
                        AbstractC3193b.m15359b(obj2);
                        flowKt__ErrorsKt$catchImpl$2$emit$1.f47873c = 1;
                        if (e83Var.emit(obj, flowKt__ErrorsKt$catchImpl$2$emit$1) == coroutineSingletons) {
                            return coroutineSingletons;
                        }
                    } else {
                        if (i3 != 1) {
                            C3386nv.m17633t("call to 'resume' before 'invoke' with coroutine");
                            return null;
                        }
                        AbstractC3193b.m15359b(obj2);
                    }
                    return xfaVar;
                } catch (Throwable th) {
                    ((Ref$ObjectRef) serializable).f47718a = th;
                    throw th;
                }
            default:
                if (continuation instanceof FlowKt__LimitKt$drop$2$1$emit$1) {
                    flowKt__LimitKt$drop$2$1$emit$1 = (FlowKt__LimitKt$drop$2$1$emit$1) continuation;
                    int i4 = flowKt__LimitKt$drop$2$1$emit$1.f47884c;
                    if ((i4 & Integer.MIN_VALUE) != 0) {
                        flowKt__LimitKt$drop$2$1$emit$1.f47884c = i4 - Integer.MIN_VALUE;
                    } else {
                        flowKt__LimitKt$drop$2$1$emit$1 = new FlowKt__LimitKt$drop$2$1$emit$1(this, continuation);
                    }
                } else {
                    flowKt__LimitKt$drop$2$1$emit$1 = new FlowKt__LimitKt$drop$2$1$emit$1(this, continuation);
                }
                Object obj3 = flowKt__LimitKt$drop$2$1$emit$1.f47882a;
                CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
                int i5 = flowKt__LimitKt$drop$2$1$emit$1.f47884c;
                if (i5 == 0) {
                    AbstractC3193b.m15359b(obj3);
                    Ref$IntRef ref$IntRef = (Ref$IntRef) serializable;
                    int i6 = ref$IntRef.f47716a;
                    if (i6 >= 1) {
                        flowKt__LimitKt$drop$2$1$emit$1.f47884c = 1;
                        if (e83Var.emit(obj, flowKt__LimitKt$drop$2$1$emit$1) == coroutineSingletons2) {
                            return coroutineSingletons2;
                        }
                    } else {
                        ref$IntRef.f47716a = i6 + 1;
                    }
                } else {
                    if (i5 != 1) {
                        C3386nv.m17633t("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    AbstractC3193b.m15359b(obj3);
                }
                return xfaVar;
        }
    }

    public C3226f(Ref$IntRef ref$IntRef, e83 e83Var) {
        this.f48053c = ref$IntRef;
        this.f48052b = e83Var;
    }
}
