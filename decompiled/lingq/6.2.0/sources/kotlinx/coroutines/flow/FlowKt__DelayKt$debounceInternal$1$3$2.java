package kotlinx.coroutines.flow;

import kotlin.AbstractC3193b;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.internal.Ref$ObjectRef;
import p000.C3386nv;
import p000.c32;
import p000.e83;
import p000.hu0;
import p000.iu0;
import p000.ju0;
import p000.thb;
import p000.xfa;
import p000.zi3;

/* JADX INFO: loaded from: classes.dex */
@c32(m4290c = "kotlinx.coroutines.flow.FlowKt__DelayKt$debounceInternal$1$3$2", m4291f = "Delay.kt", m4292l = {236}, m4293m = "invokeSuspend", m4294v = 1)
final class FlowKt__DelayKt$debounceInternal$1$3$2 extends SuspendLambda implements zi3 {

    /* JADX INFO: renamed from: a */
    public Ref$ObjectRef f47837a;

    /* JADX INFO: renamed from: b */
    public int f47838b;

    /* JADX INFO: renamed from: c */
    public /* synthetic */ Object f47839c;

    /* JADX INFO: renamed from: d */
    public final /* synthetic */ Ref$ObjectRef f47840d;

    /* JADX INFO: renamed from: e */
    public final /* synthetic */ e83 f47841e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public FlowKt__DelayKt$debounceInternal$1$3$2(e83 e83Var, Continuation continuation, Ref$ObjectRef ref$ObjectRef) {
        super(2, continuation);
        this.f47840d = ref$ObjectRef;
        this.f47841e = e83Var;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        FlowKt__DelayKt$debounceInternal$1$3$2 flowKt__DelayKt$debounceInternal$1$3$2 = new FlowKt__DelayKt$debounceInternal$1$3$2(this.f47841e, continuation, this.f47840d);
        flowKt__DelayKt$debounceInternal$1$3$2.f47839c = ((ju0) obj).f46151a;
        return flowKt__DelayKt$debounceInternal$1$3$2;
    }

    @Override // p000.zi3
    public final Object invoke(Object obj, Object obj2) {
        Object obj3 = ((ju0) obj).f46151a;
        Ref$ObjectRef ref$ObjectRef = this.f47840d;
        FlowKt__DelayKt$debounceInternal$1$3$2 flowKt__DelayKt$debounceInternal$1$3$2 = new FlowKt__DelayKt$debounceInternal$1$3$2(this.f47841e, (Continuation) obj2, ref$ObjectRef);
        flowKt__DelayKt$debounceInternal$1$3$2.f47839c = obj3;
        return flowKt__DelayKt$debounceInternal$1$3$2.invokeSuspend(xfa.f68157a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        Ref$ObjectRef ref$ObjectRef;
        Ref$ObjectRef ref$ObjectRef2;
        Object obj2 = this.f47839c;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.f47838b;
        if (i == 0) {
            AbstractC3193b.m15359b(obj);
            boolean z = obj2 instanceof iu0;
            ref$ObjectRef = this.f47840d;
            if (!z) {
                ref$ObjectRef.f47718a = obj2;
            }
            if (z) {
                hu0 hu0Var = obj2 instanceof hu0 ? (hu0) obj2 : null;
                Throwable th = hu0Var != null ? hu0Var.f42938a : null;
                if (th != null) {
                    throw th;
                }
                Object obj3 = ref$ObjectRef.f47718a;
                if (obj3 != null) {
                    if (obj3 == thb.f62314j) {
                        obj3 = null;
                    }
                    this.f47839c = null;
                    this.f47837a = ref$ObjectRef;
                    this.f47838b = 1;
                    if (this.f47841e.emit(obj3, this) == coroutineSingletons) {
                        return coroutineSingletons;
                    }
                    ref$ObjectRef2 = ref$ObjectRef;
                }
                ref$ObjectRef.f47718a = thb.f62316l;
            }
            return xfa.f68157a;
        }
        if (i != 1) {
            C3386nv.m17633t("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        ref$ObjectRef2 = this.f47837a;
        AbstractC3193b.m15359b(obj);
        ref$ObjectRef = ref$ObjectRef2;
        ref$ObjectRef.f47718a = thb.f62316l;
        return xfa.f68157a;
    }
}
