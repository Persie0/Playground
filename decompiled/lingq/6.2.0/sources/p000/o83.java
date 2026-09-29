package p000;

import kotlin.AbstractC3193b;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlinx.coroutines.flow.FlowKt__LimitKt$takeWhile$lambda$0$$inlined$collectWhile$1$1;
import kotlinx.coroutines.flow.FlowKt__TransformKt$onEach$$inlined$unsafeTransform$1$2$1;
import kotlinx.coroutines.flow.internal.AbortFlowException;

/* JADX INFO: loaded from: classes.dex */
public final class o83 implements e83 {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f53970a = 1;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ e83 f53971b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ zi3 f53972c;

    public o83(e83 e83Var, zi3 zi3Var) {
        this.f53971b = e83Var;
        this.f53972c = zi3Var;
    }

    /* JADX WARN: Code duplicated, block: B:29:0x007b  */
    /* JADX WARN: Code duplicated, block: B:9:0x0024  */
    @Override // p000.e83
    public final Object emit(Object obj, Continuation continuation) throws Throwable {
        FlowKt__LimitKt$takeWhile$lambda$0$$inlined$collectWhile$1$1 flowKt__LimitKt$takeWhile$lambda$0$$inlined$collectWhile$1$1;
        FlowKt__TransformKt$onEach$$inlined$unsafeTransform$1$2$1 flowKt__TransformKt$onEach$$inlined$unsafeTransform$1$2$1;
        int i = this.f53970a;
        xfa xfaVar = xfa.f68157a;
        zi3 zi3Var = this.f53972c;
        int i2 = 0;
        e83 e83Var = this.f53971b;
        switch (i) {
            case 0:
                if (continuation instanceof FlowKt__LimitKt$takeWhile$lambda$0$$inlined$collectWhile$1$1) {
                    flowKt__LimitKt$takeWhile$lambda$0$$inlined$collectWhile$1$1 = (FlowKt__LimitKt$takeWhile$lambda$0$$inlined$collectWhile$1$1) continuation;
                    int i3 = flowKt__LimitKt$takeWhile$lambda$0$$inlined$collectWhile$1$1.f47904b;
                    if ((i3 & Integer.MIN_VALUE) != 0) {
                        flowKt__LimitKt$takeWhile$lambda$0$$inlined$collectWhile$1$1.f47904b = i3 - Integer.MIN_VALUE;
                    } else {
                        flowKt__LimitKt$takeWhile$lambda$0$$inlined$collectWhile$1$1 = new FlowKt__LimitKt$takeWhile$lambda$0$$inlined$collectWhile$1$1(this, continuation);
                    }
                } else {
                    flowKt__LimitKt$takeWhile$lambda$0$$inlined$collectWhile$1$1 = new FlowKt__LimitKt$takeWhile$lambda$0$$inlined$collectWhile$1$1(this, continuation);
                }
                Object objInvoke = flowKt__LimitKt$takeWhile$lambda$0$$inlined$collectWhile$1$1.f47903a;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                int i4 = flowKt__LimitKt$takeWhile$lambda$0$$inlined$collectWhile$1$1.f47904b;
                if (i4 == 0) {
                    AbstractC3193b.m15359b(objInvoke);
                    flowKt__LimitKt$takeWhile$lambda$0$$inlined$collectWhile$1$1.f47906d = obj;
                    flowKt__LimitKt$takeWhile$lambda$0$$inlined$collectWhile$1$1.f47907e = 0;
                    flowKt__LimitKt$takeWhile$lambda$0$$inlined$collectWhile$1$1.f47904b = 1;
                    objInvoke = zi3Var.invoke(obj, flowKt__LimitKt$takeWhile$lambda$0$$inlined$collectWhile$1$1);
                    if (objInvoke != coroutineSingletons) {
                    }
                    return coroutineSingletons;
                }
                if (i4 != 1) {
                    if (i4 == 2) {
                        AbstractC3193b.m15359b(objInvoke);
                        return xfaVar;
                    }
                    C3386nv.m17633t("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                i2 = flowKt__LimitKt$takeWhile$lambda$0$$inlined$collectWhile$1$1.f47907e;
                obj = flowKt__LimitKt$takeWhile$lambda$0$$inlined$collectWhile$1$1.f47906d;
                AbstractC3193b.m15359b(objInvoke);
                if (!((Boolean) objInvoke).booleanValue()) {
                    throw new AbortFlowException(this);
                }
                flowKt__LimitKt$takeWhile$lambda$0$$inlined$collectWhile$1$1.f47906d = null;
                flowKt__LimitKt$takeWhile$lambda$0$$inlined$collectWhile$1$1.f47907e = i2;
                flowKt__LimitKt$takeWhile$lambda$0$$inlined$collectWhile$1$1.f47904b = 2;
                if (e83Var.emit(obj, flowKt__LimitKt$takeWhile$lambda$0$$inlined$collectWhile$1$1) != coroutineSingletons) {
                    return xfaVar;
                }
                return coroutineSingletons;
            default:
                if (continuation instanceof FlowKt__TransformKt$onEach$$inlined$unsafeTransform$1$2$1) {
                    flowKt__TransformKt$onEach$$inlined$unsafeTransform$1$2$1 = (FlowKt__TransformKt$onEach$$inlined$unsafeTransform$1$2$1) continuation;
                    int i5 = flowKt__TransformKt$onEach$$inlined$unsafeTransform$1$2$1.f47944b;
                    if ((i5 & Integer.MIN_VALUE) != 0) {
                        flowKt__TransformKt$onEach$$inlined$unsafeTransform$1$2$1.f47944b = i5 - Integer.MIN_VALUE;
                    } else {
                        flowKt__TransformKt$onEach$$inlined$unsafeTransform$1$2$1 = new FlowKt__TransformKt$onEach$$inlined$unsafeTransform$1$2$1(this, continuation);
                    }
                } else {
                    flowKt__TransformKt$onEach$$inlined$unsafeTransform$1$2$1 = new FlowKt__TransformKt$onEach$$inlined$unsafeTransform$1$2$1(this, continuation);
                }
                Object obj2 = flowKt__TransformKt$onEach$$inlined$unsafeTransform$1$2$1.f47943a;
                CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
                int i6 = flowKt__TransformKt$onEach$$inlined$unsafeTransform$1$2$1.f47944b;
                if (i6 == 0) {
                    AbstractC3193b.m15359b(obj2);
                    flowKt__TransformKt$onEach$$inlined$unsafeTransform$1$2$1.f47946d = obj;
                    flowKt__TransformKt$onEach$$inlined$unsafeTransform$1$2$1.f47947e = e83Var;
                    flowKt__TransformKt$onEach$$inlined$unsafeTransform$1$2$1.f47948f = 0;
                    flowKt__TransformKt$onEach$$inlined$unsafeTransform$1$2$1.f47944b = 1;
                    if (zi3Var.invoke(obj, flowKt__TransformKt$onEach$$inlined$unsafeTransform$1$2$1) != coroutineSingletons2) {
                    }
                    return coroutineSingletons2;
                }
                if (i6 != 1) {
                    if (i6 == 2) {
                        AbstractC3193b.m15359b(obj2);
                        return xfaVar;
                    }
                    C3386nv.m17633t("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                i2 = flowKt__TransformKt$onEach$$inlined$unsafeTransform$1$2$1.f47948f;
                e83Var = flowKt__TransformKt$onEach$$inlined$unsafeTransform$1$2$1.f47947e;
                obj = flowKt__TransformKt$onEach$$inlined$unsafeTransform$1$2$1.f47946d;
                AbstractC3193b.m15359b(obj2);
                flowKt__TransformKt$onEach$$inlined$unsafeTransform$1$2$1.f47946d = null;
                flowKt__TransformKt$onEach$$inlined$unsafeTransform$1$2$1.f47947e = null;
                flowKt__TransformKt$onEach$$inlined$unsafeTransform$1$2$1.f47948f = i2;
                flowKt__TransformKt$onEach$$inlined$unsafeTransform$1$2$1.f47944b = 2;
                if (e83Var.emit(obj, flowKt__TransformKt$onEach$$inlined$unsafeTransform$1$2$1) != coroutineSingletons2) {
                    return xfaVar;
                }
                return coroutineSingletons2;
        }
    }

    public o83(zi3 zi3Var, e83 e83Var) {
        this.f53972c = zi3Var;
        this.f53971b = e83Var;
    }
}
