package p000;

import kotlin.AbstractC3193b;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.jvm.internal.Ref$IntRef;
import kotlinx.coroutines.flow.C3226f;
import kotlinx.coroutines.flow.C3227g;
import kotlinx.coroutines.flow.FlowKt__LimitKt$take$$inlined$unsafeFlow$1$1;
import kotlinx.coroutines.flow.internal.AbortFlowException;

/* JADX INFO: renamed from: rl */
/* JADX INFO: loaded from: classes.dex */
public final class C3540rl implements c83 {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f59462a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ c83 f59463b;

    public /* synthetic */ C3540rl(c83 c83Var, int i) {
        this.f59462a = i;
        this.f59463b = c83Var;
    }

    /* JADX WARN: Code duplicated, block: B:33:0x0082  */
    @Override // p000.c83
    public final Object collect(e83 e83Var, Continuation continuation) throws Throwable {
        FlowKt__LimitKt$take$$inlined$unsafeFlow$1$1 flowKt__LimitKt$take$$inlined$unsafeFlow$1$1;
        Object obj;
        AbortFlowException e;
        int i = this.f59462a;
        int i2 = 1;
        xfa xfaVar = xfa.f68157a;
        c83 c83Var = this.f59463b;
        switch (i) {
            case 0:
                Object objCollect = c83Var.collect(new C3502ql(e83Var, 0), continuation);
                return objCollect == CoroutineSingletons.COROUTINE_SUSPENDED ? objCollect : xfaVar;
            case 1:
                Object objCollect2 = c83Var.collect(new C3502ql(e83Var, i2), continuation);
                return objCollect2 == CoroutineSingletons.COROUTINE_SUSPENDED ? objCollect2 : xfaVar;
            case 2:
                Object objCollect3 = c83Var.collect(new C3502ql(e83Var, 5), continuation);
                return objCollect3 == CoroutineSingletons.COROUTINE_SUSPENDED ? objCollect3 : xfaVar;
            case 3:
                Object objCollect4 = c83Var.collect(new C3226f(new Ref$IntRef(), e83Var), continuation);
                return objCollect4 == CoroutineSingletons.COROUTINE_SUSPENDED ? objCollect4 : xfaVar;
            case 4:
                if (continuation instanceof FlowKt__LimitKt$take$$inlined$unsafeFlow$1$1) {
                    flowKt__LimitKt$take$$inlined$unsafeFlow$1$1 = (FlowKt__LimitKt$take$$inlined$unsafeFlow$1$1) continuation;
                    int i3 = flowKt__LimitKt$take$$inlined$unsafeFlow$1$1.f47893b;
                    if ((i3 & Integer.MIN_VALUE) != 0) {
                        flowKt__LimitKt$take$$inlined$unsafeFlow$1$1.f47893b = i3 - Integer.MIN_VALUE;
                    } else {
                        flowKt__LimitKt$take$$inlined$unsafeFlow$1$1 = new FlowKt__LimitKt$take$$inlined$unsafeFlow$1$1(this, continuation);
                    }
                } else {
                    flowKt__LimitKt$take$$inlined$unsafeFlow$1$1 = new FlowKt__LimitKt$take$$inlined$unsafeFlow$1$1(this, continuation);
                }
                Object obj2 = flowKt__LimitKt$take$$inlined$unsafeFlow$1$1.f47892a;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                int i4 = flowKt__LimitKt$take$$inlined$unsafeFlow$1$1.f47893b;
                if (i4 == 0) {
                    AbstractC3193b.m15359b(obj2);
                    Object obj3 = new Object();
                    try {
                        C3227g c3227g = new C3227g(new Ref$IntRef(), e83Var, obj3);
                        flowKt__LimitKt$take$$inlined$unsafeFlow$1$1.f47895d = obj3;
                        flowKt__LimitKt$take$$inlined$unsafeFlow$1$1.f47893b = 1;
                        return c83Var.collect(c3227g, flowKt__LimitKt$take$$inlined$unsafeFlow$1$1) == coroutineSingletons ? coroutineSingletons : xfaVar;
                    } catch (AbortFlowException e2) {
                        obj = obj3;
                        e = e2;
                    }
                } else {
                    if (i4 != 1) {
                        C3386nv.m17633t("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    obj = flowKt__LimitKt$take$$inlined$unsafeFlow$1$1.f47895d;
                    try {
                        AbstractC3193b.m15359b(obj2);
                        return xfaVar;
                    } catch (AbortFlowException e3) {
                        e = e3;
                    }
                }
                if (e.f48068a == obj) {
                    return xfaVar;
                }
                throw e;
            case 5:
                Object objCollect5 = c83Var.collect(new C3502ql(e83Var, 7), continuation);
                return objCollect5 == CoroutineSingletons.COROUTINE_SUSPENDED ? objCollect5 : xfaVar;
            case 6:
                Object objCollect6 = c83Var.collect(new C3502ql(e83Var, 10), continuation);
                return objCollect6 == CoroutineSingletons.COROUTINE_SUSPENDED ? objCollect6 : xfaVar;
            case 7:
                Object objCollect7 = c83Var.collect(new C3502ql(e83Var, 12), continuation);
                return objCollect7 == CoroutineSingletons.COROUTINE_SUSPENDED ? objCollect7 : xfaVar;
            case 8:
                Object objCollect8 = c83Var.collect(new C3502ql(e83Var, 13), continuation);
                return objCollect8 == CoroutineSingletons.COROUTINE_SUSPENDED ? objCollect8 : xfaVar;
            case 9:
                Object objCollect9 = c83Var.collect(new C3502ql(e83Var, 14), continuation);
                return objCollect9 == CoroutineSingletons.COROUTINE_SUSPENDED ? objCollect9 : xfaVar;
            default:
                Object objCollect10 = c83Var.collect(new C3502ql(e83Var, 16), continuation);
                return objCollect10 == CoroutineSingletons.COROUTINE_SUSPENDED ? objCollect10 : xfaVar;
        }
    }
}
