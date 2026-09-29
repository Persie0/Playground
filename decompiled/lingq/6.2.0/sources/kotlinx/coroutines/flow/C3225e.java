package kotlinx.coroutines.flow;

import kotlin.AbstractC3193b;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import p000.C3386nv;
import p000.e83;
import p000.kl7;
import p000.ll7;
import p000.thb;
import p000.xfa;

/* JADX INFO: renamed from: kotlinx.coroutines.flow.e */
/* JADX INFO: loaded from: classes.dex */
public final class C3225e implements e83 {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ ll7 f48050a;

    public C3225e(ll7 ll7Var) {
        this.f48050a = ll7Var;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Override // p000.e83
    public final Object emit(Object obj, Continuation continuation) throws Throwable {
        FlowKt__DelayKt$debounceInternal$1$values$1$1$emit$1 flowKt__DelayKt$debounceInternal$1$values$1$1$emit$1;
        if (continuation instanceof FlowKt__DelayKt$debounceInternal$1$values$1$1$emit$1) {
            flowKt__DelayKt$debounceInternal$1$values$1$1$emit$1 = (FlowKt__DelayKt$debounceInternal$1$values$1$1$emit$1) continuation;
            int i = flowKt__DelayKt$debounceInternal$1$values$1$1$emit$1.f47847c;
            if ((i & Integer.MIN_VALUE) != 0) {
                flowKt__DelayKt$debounceInternal$1$values$1$1$emit$1.f47847c = i - Integer.MIN_VALUE;
            } else {
                flowKt__DelayKt$debounceInternal$1$values$1$1$emit$1 = new FlowKt__DelayKt$debounceInternal$1$values$1$1$emit$1(this, continuation);
            }
        } else {
            flowKt__DelayKt$debounceInternal$1$values$1$1$emit$1 = new FlowKt__DelayKt$debounceInternal$1$values$1$1$emit$1(this, continuation);
        }
        Object obj2 = flowKt__DelayKt$debounceInternal$1$values$1$1$emit$1.f47845a;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i2 = flowKt__DelayKt$debounceInternal$1$values$1$1$emit$1.f47847c;
        if (i2 == 0) {
            AbstractC3193b.m15359b(obj2);
            if (obj == null) {
                obj = thb.f62314j;
            }
            flowKt__DelayKt$debounceInternal$1$values$1$1$emit$1.f47847c = 1;
            if (((kl7) this.f48050a).f47495f.mo4678m(obj, flowKt__DelayKt$debounceInternal$1$values$1$1$emit$1) == coroutineSingletons) {
                return coroutineSingletons;
            }
        } else {
            if (i2 != 1) {
                C3386nv.m17633t("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            AbstractC3193b.m15359b(obj2);
        }
        return xfa.f68157a;
    }
}
