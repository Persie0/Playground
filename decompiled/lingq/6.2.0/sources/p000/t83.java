package p000;

import kotlin.AbstractC3193b;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.jvm.internal.Ref$ObjectRef;
import kotlinx.coroutines.flow.C3223c;
import kotlinx.coroutines.flow.FlowKt__TransformKt$runningFold$$inlined$unsafeFlow$1$1;
import kotlinx.coroutines.flow.internal.C3236f;

/* JADX INFO: loaded from: classes.dex */
public final class t83 implements c83 {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ Object f61979a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ C3236f f61980b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ aj3 f61981c;

    public t83(Object obj, C3236f c3236f, aj3 aj3Var) {
        this.f61979a = obj;
        this.f61980b = c3236f;
        this.f61981c = aj3Var;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Code restructure failed: missing block: B:20:0x006e, code lost:
    
        if (r7.f61980b.collect(r9, r0) == r1) goto L21;
     */
    @Override // p000.c83
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object collect(e83 e83Var, Continuation continuation) throws Throwable {
        FlowKt__TransformKt$runningFold$$inlined$unsafeFlow$1$1 flowKt__TransformKt$runningFold$$inlined$unsafeFlow$1$1;
        Ref$ObjectRef ref$ObjectRef;
        int i;
        if (continuation instanceof FlowKt__TransformKt$runningFold$$inlined$unsafeFlow$1$1) {
            flowKt__TransformKt$runningFold$$inlined$unsafeFlow$1$1 = (FlowKt__TransformKt$runningFold$$inlined$unsafeFlow$1$1) continuation;
            int i2 = flowKt__TransformKt$runningFold$$inlined$unsafeFlow$1$1.f47950b;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                flowKt__TransformKt$runningFold$$inlined$unsafeFlow$1$1.f47950b = i2 - Integer.MIN_VALUE;
            } else {
                flowKt__TransformKt$runningFold$$inlined$unsafeFlow$1$1 = new FlowKt__TransformKt$runningFold$$inlined$unsafeFlow$1$1(this, continuation);
            }
        } else {
            flowKt__TransformKt$runningFold$$inlined$unsafeFlow$1$1 = new FlowKt__TransformKt$runningFold$$inlined$unsafeFlow$1$1(this, continuation);
        }
        Object obj = flowKt__TransformKt$runningFold$$inlined$unsafeFlow$1$1.f47949a;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i3 = flowKt__TransformKt$runningFold$$inlined$unsafeFlow$1$1.f47950b;
        if (i3 == 0) {
            AbstractC3193b.m15359b(obj);
            ref$ObjectRef = new Ref$ObjectRef();
            Object obj2 = this.f61979a;
            ref$ObjectRef.f47718a = obj2;
            flowKt__TransformKt$runningFold$$inlined$unsafeFlow$1$1.f47952d = e83Var;
            flowKt__TransformKt$runningFold$$inlined$unsafeFlow$1$1.f47953e = ref$ObjectRef;
            i = 0;
            flowKt__TransformKt$runningFold$$inlined$unsafeFlow$1$1.f47954f = 0;
            flowKt__TransformKt$runningFold$$inlined$unsafeFlow$1$1.f47950b = 1;
            if (e83Var.emit(obj2, flowKt__TransformKt$runningFold$$inlined$unsafeFlow$1$1) != coroutineSingletons) {
            }
            return coroutineSingletons;
        }
        if (i3 == 1) {
            int i4 = flowKt__TransformKt$runningFold$$inlined$unsafeFlow$1$1.f47954f;
            ref$ObjectRef = flowKt__TransformKt$runningFold$$inlined$unsafeFlow$1$1.f47953e;
            e83 e83Var2 = flowKt__TransformKt$runningFold$$inlined$unsafeFlow$1$1.f47952d;
            AbstractC3193b.m15359b(obj);
            i = i4;
            e83Var = e83Var2;
        } else {
            if (i3 != 2) {
                C3386nv.m17633t("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            AbstractC3193b.m15359b(obj);
        }
        return xfa.f68157a;
        C3223c c3223c = new C3223c(ref$ObjectRef, this.f61981c, e83Var);
        flowKt__TransformKt$runningFold$$inlined$unsafeFlow$1$1.f47952d = null;
        flowKt__TransformKt$runningFold$$inlined$unsafeFlow$1$1.f47953e = null;
        flowKt__TransformKt$runningFold$$inlined$unsafeFlow$1$1.f47954f = i;
        flowKt__TransformKt$runningFold$$inlined$unsafeFlow$1$1.f47950b = 2;
    }
}
