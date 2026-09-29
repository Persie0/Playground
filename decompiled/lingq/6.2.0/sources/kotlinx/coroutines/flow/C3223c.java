package kotlinx.coroutines.flow;

import kotlin.AbstractC3193b;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.jvm.internal.Ref$BooleanRef;
import kotlin.jvm.internal.Ref$ObjectRef;
import p000.C3386nv;
import p000.aj3;
import p000.e83;
import p000.fi2;
import p000.thb;
import p000.xfa;
import p000.zi3;

/* JADX INFO: renamed from: kotlinx.coroutines.flow.c */
/* JADX INFO: loaded from: classes.dex */
public final class C3223c implements e83 {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f48046a = 0;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ e83 f48047b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ Object f48048c;

    /* JADX INFO: renamed from: d */
    public final /* synthetic */ Object f48049d;

    public C3223c(fi2 fi2Var, Ref$ObjectRef ref$ObjectRef, e83 e83Var) {
        this.f48048c = fi2Var;
        this.f48049d = ref$ObjectRef;
        this.f48047b = e83Var;
    }

    /* JADX WARN: Code duplicated, block: B:30:0x007d  */
    /* JADX WARN: Code duplicated, block: B:58:0x00ea  */
    /* JADX WARN: Code duplicated, block: B:9:0x0027  */
    @Override // p000.e83
    public final Object emit(Object obj, Continuation continuation) throws Throwable {
        DistinctFlowImpl$collect$2$emit$1 distinctFlowImpl$collect$2$emit$1;
        FlowKt__LimitKt$dropWhile$1$1$emit$1 flowKt__LimitKt$dropWhile$1$1$emit$1;
        FlowKt__TransformKt$runningFold$1$1$emit$1 flowKt__TransformKt$runningFold$1$1$emit$1;
        Ref$ObjectRef ref$ObjectRef;
        int i = this.f48046a;
        xfa xfaVar = xfa.f68157a;
        e83 e83Var = this.f48047b;
        Object obj2 = this.f48048c;
        Object obj3 = this.f48049d;
        switch (i) {
            case 0:
                Ref$ObjectRef ref$ObjectRef2 = (Ref$ObjectRef) obj3;
                fi2 fi2Var = (fi2) obj2;
                if (continuation instanceof DistinctFlowImpl$collect$2$emit$1) {
                    distinctFlowImpl$collect$2$emit$1 = (DistinctFlowImpl$collect$2$emit$1) continuation;
                    int i2 = distinctFlowImpl$collect$2$emit$1.f47810c;
                    if ((i2 & Integer.MIN_VALUE) != 0) {
                        distinctFlowImpl$collect$2$emit$1.f47810c = i2 - Integer.MIN_VALUE;
                    } else {
                        distinctFlowImpl$collect$2$emit$1 = new DistinctFlowImpl$collect$2$emit$1(this, continuation);
                    }
                } else {
                    distinctFlowImpl$collect$2$emit$1 = new DistinctFlowImpl$collect$2$emit$1(this, continuation);
                }
                Object obj4 = distinctFlowImpl$collect$2$emit$1.f47808a;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                int i3 = distinctFlowImpl$collect$2$emit$1.f47810c;
                if (i3 != 0) {
                    if (i3 == 1) {
                        AbstractC3193b.m15359b(obj4);
                        return xfaVar;
                    }
                    C3386nv.m17633t("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                AbstractC3193b.m15359b(obj4);
                Object obj5 = ref$ObjectRef2.f47718a;
                if (obj5 != thb.f62314j && ((Boolean) fi2Var.f39138b.invoke(obj5, obj)).booleanValue()) {
                    return xfaVar;
                }
                ref$ObjectRef2.f47718a = obj;
                distinctFlowImpl$collect$2$emit$1.f47810c = 1;
                return e83Var.emit(obj, distinctFlowImpl$collect$2$emit$1) == coroutineSingletons ? coroutineSingletons : xfaVar;
            case 1:
                Ref$BooleanRef ref$BooleanRef = (Ref$BooleanRef) obj2;
                if (continuation instanceof FlowKt__LimitKt$dropWhile$1$1$emit$1) {
                    flowKt__LimitKt$dropWhile$1$1$emit$1 = (FlowKt__LimitKt$dropWhile$1$1$emit$1) continuation;
                    int i4 = flowKt__LimitKt$dropWhile$1$1$emit$1.f47888d;
                    if ((i4 & Integer.MIN_VALUE) != 0) {
                        flowKt__LimitKt$dropWhile$1$1$emit$1.f47888d = i4 - Integer.MIN_VALUE;
                    } else {
                        flowKt__LimitKt$dropWhile$1$1$emit$1 = new FlowKt__LimitKt$dropWhile$1$1$emit$1(this, continuation);
                    }
                } else {
                    flowKt__LimitKt$dropWhile$1$1$emit$1 = new FlowKt__LimitKt$dropWhile$1$1$emit$1(this, continuation);
                }
                Object objInvoke = flowKt__LimitKt$dropWhile$1$1$emit$1.f47886b;
                CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
                int i5 = flowKt__LimitKt$dropWhile$1$1$emit$1.f47888d;
                if (i5 != 0) {
                    if (i5 != 1) {
                        if (i5 == 2) {
                            obj = flowKt__LimitKt$dropWhile$1$1$emit$1.f47885a;
                            AbstractC3193b.m15359b(objInvoke);
                        } else if (i5 != 3) {
                            C3386nv.m17633t("call to 'resume' before 'invoke' with coroutine");
                            return null;
                        }
                    }
                    AbstractC3193b.m15359b(objInvoke);
                    return xfaVar;
                }
                AbstractC3193b.m15359b(objInvoke);
                if (ref$BooleanRef.f47713a) {
                    flowKt__LimitKt$dropWhile$1$1$emit$1.f47885a = null;
                    flowKt__LimitKt$dropWhile$1$1$emit$1.f47888d = 1;
                    if (e83Var.emit(obj, flowKt__LimitKt$dropWhile$1$1$emit$1) != coroutineSingletons2) {
                        return xfaVar;
                    }
                } else {
                    flowKt__LimitKt$dropWhile$1$1$emit$1.f47885a = obj;
                    flowKt__LimitKt$dropWhile$1$1$emit$1.f47888d = 2;
                    objInvoke = ((zi3) obj3).invoke(obj, flowKt__LimitKt$dropWhile$1$1$emit$1);
                    if (objInvoke != coroutineSingletons2) {
                    }
                }
                return coroutineSingletons2;
                if (((Boolean) objInvoke).booleanValue()) {
                    return xfaVar;
                }
                ref$BooleanRef.f47713a = true;
                flowKt__LimitKt$dropWhile$1$1$emit$1.f47885a = null;
                flowKt__LimitKt$dropWhile$1$1$emit$1.f47888d = 3;
                if (e83Var.emit(obj, flowKt__LimitKt$dropWhile$1$1$emit$1) != coroutineSingletons2) {
                    return xfaVar;
                }
                return coroutineSingletons2;
            default:
                Ref$ObjectRef ref$ObjectRef3 = (Ref$ObjectRef) obj3;
                if (continuation instanceof FlowKt__TransformKt$runningFold$1$1$emit$1) {
                    flowKt__TransformKt$runningFold$1$1$emit$1 = (FlowKt__TransformKt$runningFold$1$1$emit$1) continuation;
                    int i6 = flowKt__TransformKt$runningFold$1$1$emit$1.f47958d;
                    if ((i6 & Integer.MIN_VALUE) != 0) {
                        flowKt__TransformKt$runningFold$1$1$emit$1.f47958d = i6 - Integer.MIN_VALUE;
                    } else {
                        flowKt__TransformKt$runningFold$1$1$emit$1 = new FlowKt__TransformKt$runningFold$1$1$emit$1(this, continuation);
                    }
                } else {
                    flowKt__TransformKt$runningFold$1$1$emit$1 = new FlowKt__TransformKt$runningFold$1$1$emit$1(this, continuation);
                }
                Object objInvoke2 = flowKt__TransformKt$runningFold$1$1$emit$1.f47956b;
                CoroutineSingletons coroutineSingletons3 = CoroutineSingletons.COROUTINE_SUSPENDED;
                int i7 = flowKt__TransformKt$runningFold$1$1$emit$1.f47958d;
                if (i7 == 0) {
                    AbstractC3193b.m15359b(objInvoke2);
                    Object obj6 = ref$ObjectRef3.f47718a;
                    flowKt__TransformKt$runningFold$1$1$emit$1.f47955a = ref$ObjectRef3;
                    flowKt__TransformKt$runningFold$1$1$emit$1.f47958d = 1;
                    objInvoke2 = ((aj3) obj2).invoke(obj6, obj, flowKt__TransformKt$runningFold$1$1$emit$1);
                    if (objInvoke2 != coroutineSingletons3) {
                        ref$ObjectRef = ref$ObjectRef3;
                    }
                    return coroutineSingletons3;
                }
                if (i7 != 1) {
                    if (i7 == 2) {
                        AbstractC3193b.m15359b(objInvoke2);
                        return xfaVar;
                    }
                    C3386nv.m17633t("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                ref$ObjectRef = flowKt__TransformKt$runningFold$1$1$emit$1.f47955a;
                AbstractC3193b.m15359b(objInvoke2);
                ref$ObjectRef.f47718a = objInvoke2;
                Object obj7 = ref$ObjectRef3.f47718a;
                flowKt__TransformKt$runningFold$1$1$emit$1.f47955a = null;
                flowKt__TransformKt$runningFold$1$1$emit$1.f47958d = 2;
                if (e83Var.emit(obj7, flowKt__TransformKt$runningFold$1$1$emit$1) != coroutineSingletons3) {
                    return xfaVar;
                }
                return coroutineSingletons3;
        }
    }

    public C3223c(Ref$BooleanRef ref$BooleanRef, e83 e83Var, zi3 zi3Var) {
        this.f48048c = ref$BooleanRef;
        this.f48047b = e83Var;
        this.f48049d = zi3Var;
    }

    public C3223c(Ref$ObjectRef ref$ObjectRef, aj3 aj3Var, e83 e83Var) {
        this.f48049d = ref$ObjectRef;
        this.f48048c = aj3Var;
        this.f48047b = e83Var;
    }
}
