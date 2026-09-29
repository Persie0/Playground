package kotlinx.coroutines.flow;

import kotlin.AbstractC3193b;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.internal.Ref$ObjectRef;
import p000.C0842cc;
import p000.C3386nv;
import p000.c32;
import p000.e83;
import p000.thb;
import p000.vi3;
import p000.xfa;

/* JADX INFO: loaded from: classes.dex */
@c32(m4290c = "kotlinx.coroutines.flow.FlowKt__DelayKt$debounceInternal$1$3$1", m4291f = "Delay.kt", m4292l = {226}, m4293m = "invokeSuspend", m4294v = 1)
final class FlowKt__DelayKt$debounceInternal$1$3$1 extends SuspendLambda implements vi3 {

    /* JADX INFO: renamed from: a */
    public int f47834a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ e83 f47835b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ Ref$ObjectRef f47836c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public FlowKt__DelayKt$debounceInternal$1$3$1(e83 e83Var, Continuation continuation, Ref$ObjectRef ref$ObjectRef) {
        super(1, continuation);
        this.f47835b = e83Var;
        this.f47836c = ref$ObjectRef;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Continuation continuation) {
        return new FlowKt__DelayKt$debounceInternal$1$3$1(this.f47835b, continuation, this.f47836c);
    }

    @Override // p000.vi3
    public final Object invoke(Object obj) {
        return ((FlowKt__DelayKt$debounceInternal$1$3$1) create((Continuation) obj)).invokeSuspend(xfa.f68157a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.f47834a;
        Ref$ObjectRef ref$ObjectRef = this.f47836c;
        if (i == 0) {
            AbstractC3193b.m15359b(obj);
            C0842cc c0842cc = thb.f62314j;
            Object obj2 = ref$ObjectRef.f47718a;
            if (obj2 == c0842cc) {
                obj2 = null;
            }
            this.f47834a = 1;
            if (this.f47835b.emit(obj2, this) == coroutineSingletons) {
                return coroutineSingletons;
            }
        } else {
            if (i != 1) {
                C3386nv.m17633t("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            AbstractC3193b.m15359b(obj);
        }
        ref$ObjectRef.f47718a = null;
        return xfa.f68157a;
    }
}
