package p000;

import java.util.ArrayList;
import kotlin.AbstractC3193b;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.jvm.internal.Ref$ObjectRef;
import kotlinx.coroutines.flow.FlowKt__ReduceKt$first$$inlined$collectWhile$2$1;
import kotlinx.coroutines.flow.internal.AbortFlowException;

/* JADX INFO: loaded from: classes.dex */
public final class r83 implements e83 {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f58873a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ Object f58874b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ Object f58875c;

    public /* synthetic */ r83(int i, Object obj, Object obj2) {
        this.f58873a = i;
        this.f58874b = obj;
        this.f58875c = obj2;
    }

    /* JADX WARN: Code duplicated, block: B:51:0x00bd  */
    @Override // p000.e83
    public final Object emit(Object obj, Continuation continuation) throws Throwable {
        FlowKt__ReduceKt$first$$inlined$collectWhile$2$1 flowKt__ReduceKt$first$$inlined$collectWhile$2$1;
        int i = this.f58873a;
        xfa xfaVar = xfa.f68157a;
        Object obj2 = this.f58874b;
        Object obj3 = this.f58875c;
        switch (i) {
            case 0:
                if (continuation instanceof FlowKt__ReduceKt$first$$inlined$collectWhile$2$1) {
                    flowKt__ReduceKt$first$$inlined$collectWhile$2$1 = (FlowKt__ReduceKt$first$$inlined$collectWhile$2$1) continuation;
                    int i2 = flowKt__ReduceKt$first$$inlined$collectWhile$2$1.f47914b;
                    if ((i2 & Integer.MIN_VALUE) != 0) {
                        flowKt__ReduceKt$first$$inlined$collectWhile$2$1.f47914b = i2 - Integer.MIN_VALUE;
                    } else {
                        flowKt__ReduceKt$first$$inlined$collectWhile$2$1 = new FlowKt__ReduceKt$first$$inlined$collectWhile$2$1(this, continuation);
                    }
                } else {
                    flowKt__ReduceKt$first$$inlined$collectWhile$2$1 = new FlowKt__ReduceKt$first$$inlined$collectWhile$2$1(this, continuation);
                }
                Object objInvoke = flowKt__ReduceKt$first$$inlined$collectWhile$2$1.f47913a;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                int i3 = flowKt__ReduceKt$first$$inlined$collectWhile$2$1.f47914b;
                if (i3 == 0) {
                    AbstractC3193b.m15359b(objInvoke);
                    flowKt__ReduceKt$first$$inlined$collectWhile$2$1.f47916d = obj;
                    flowKt__ReduceKt$first$$inlined$collectWhile$2$1.f47914b = 1;
                    objInvoke = ((zi3) obj2).invoke(obj, flowKt__ReduceKt$first$$inlined$collectWhile$2$1);
                    if (objInvoke == coroutineSingletons) {
                        return coroutineSingletons;
                    }
                } else {
                    if (i3 != 1) {
                        C3386nv.m17633t("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    obj = flowKt__ReduceKt$first$$inlined$collectWhile$2$1.f47916d;
                    AbstractC3193b.m15359b(objInvoke);
                }
                if (!((Boolean) objInvoke).booleanValue()) {
                    return xfaVar;
                }
                ((Ref$ObjectRef) obj3).f47718a = obj;
                throw new AbortFlowException(this);
            case 1:
                q84 q84Var = (q84) obj;
                ArrayList arrayList = (ArrayList) obj2;
                if (q84Var instanceof q93) {
                    arrayList.add(q84Var);
                } else if (q84Var instanceof r93) {
                    arrayList.remove(((r93) q84Var).f58940a);
                }
                ((t66) obj3).setValue(Boolean.valueOf(!arrayList.isEmpty()));
                return xfaVar;
            default:
                q84 q84Var2 = (q84) obj;
                he5 he5Var = (he5) obj3;
                h66 h66Var = (h66) obj2;
                if ((q84Var2 instanceof rv3) || (q84Var2 instanceof q93) || (q84Var2 instanceof lj7)) {
                    h66Var.m13090g(q84Var2);
                } else if (q84Var2 instanceof sv3) {
                    h66Var.m13094k(((sv3) q84Var2).f61480a);
                } else if (q84Var2 instanceof r93) {
                    h66Var.m13094k(((r93) q84Var2).f58940a);
                } else if (q84Var2 instanceof mj7) {
                    h66Var.m13094k(((mj7) q84Var2).f51399a);
                } else if (q84Var2 instanceof kj7) {
                    h66Var.m13094k(((kj7) q84Var2).f47397a);
                }
                Object[] objArr = h66Var.f1293a;
                int i4 = h66Var.f1294b;
                int i5 = 0;
                for (int i6 = 0; i6 < i4; i6++) {
                    q84 q84Var3 = (q84) objArr[i6];
                    if (q84Var3 instanceof rv3) {
                        he5Var.getClass();
                        i5 |= 2;
                    } else if (q84Var3 instanceof q93) {
                        he5Var.getClass();
                        i5 |= 1;
                    } else if (q84Var3 instanceof lj7) {
                        he5Var.getClass();
                        i5 |= 4;
                    }
                }
                he5Var.f42258b.m21223i(i5);
                return xfaVar;
        }
    }
}
