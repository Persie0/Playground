package kotlinx.coroutines.flow;

import kotlin.AbstractC3193b;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlinx.coroutines.channels.BufferOverflow;
import kotlinx.coroutines.flow.internal.AbstractC3231a;
import p000.C3386nv;
import p000.eu0;
import p000.kl7;
import p000.kn1;
import p000.ll7;
import p000.xfa;
import p000.zi3;

/* JADX INFO: renamed from: kotlinx.coroutines.flow.b */
/* JADX INFO: loaded from: classes.dex */
public final class C3222b extends eu0 {

    /* JADX INFO: renamed from: e */
    public final zi3 f48045e;

    public C3222b(zi3 zi3Var, kn1 kn1Var, int i, BufferOverflow bufferOverflow) {
        super(zi3Var, kn1Var, i, bufferOverflow);
        this.f48045e = zi3Var;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Override // p000.eu0, kotlinx.coroutines.flow.internal.AbstractC3231a
    /* JADX INFO: renamed from: d */
    public final Object mo10648d(ll7 ll7Var, Continuation continuation) throws Throwable {
        CallbackFlowBuilder$collectTo$1 callbackFlowBuilder$collectTo$1;
        if (continuation instanceof CallbackFlowBuilder$collectTo$1) {
            callbackFlowBuilder$collectTo$1 = (CallbackFlowBuilder$collectTo$1) continuation;
            int i = callbackFlowBuilder$collectTo$1.f47807d;
            if ((i & Integer.MIN_VALUE) != 0) {
                callbackFlowBuilder$collectTo$1.f47807d = i - Integer.MIN_VALUE;
            } else {
                callbackFlowBuilder$collectTo$1 = new CallbackFlowBuilder$collectTo$1(this, (ContinuationImpl) continuation);
            }
        } else {
            callbackFlowBuilder$collectTo$1 = new CallbackFlowBuilder$collectTo$1(this, (ContinuationImpl) continuation);
        }
        Object obj = callbackFlowBuilder$collectTo$1.f47805b;
        Object obj2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i2 = callbackFlowBuilder$collectTo$1.f47807d;
        if (i2 == 0) {
            AbstractC3193b.m15359b(obj);
            callbackFlowBuilder$collectTo$1.f47804a = ll7Var;
            callbackFlowBuilder$collectTo$1.f47807d = 1;
            if (super.mo10648d(ll7Var, callbackFlowBuilder$collectTo$1) == obj2) {
                return obj2;
            }
        } else {
            if (i2 != 1) {
                C3386nv.m17633t("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            ll7Var = callbackFlowBuilder$collectTo$1.f47804a;
            AbstractC3193b.m15359b(obj);
        }
        if (((kl7) ll7Var).f47495f.m15457D()) {
            return xfa.f68157a;
        }
        C3386nv.m17633t("'awaitClose { yourCallbackOrListener.cancel() }' should be used in the end of callbackFlow block.\nOtherwise, a callback/listener may leak in case of external cancellation.\nSee callbackFlow API documentation for the details.");
        return null;
    }

    @Override // p000.eu0, kotlinx.coroutines.flow.internal.AbstractC3231a
    /* JADX INFO: renamed from: e */
    public final AbstractC3231a mo10649e(kn1 kn1Var, int i, BufferOverflow bufferOverflow) {
        return new C3222b(this.f48045e, kn1Var, i, bufferOverflow);
    }
}
