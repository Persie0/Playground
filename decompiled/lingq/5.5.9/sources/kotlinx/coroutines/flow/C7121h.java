package kotlinx.coroutines.flow;

import dm.C5207g;
import java.io.Serializable;
import java.util.concurrent.CancellationException;
import kotlin.coroutines.CoroutineContext;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.jvm.internal.Ref$ObjectRef;
import no.InterfaceC7875v0;
import p260m8.C7499b;
import p349qo.C8656b;
import p464wl.InterfaceC9968c;

/* JADX INFO: renamed from: kotlinx.coroutines.flow.h */
/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class C7121h {
    /* JADX WARN: Code duplicated, block: B:7:0x0017  */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Unreachable blocks removed: 2, instructions: 2 */
    /* JADX INFO: renamed from: a */
    public static final Serializable m14383a(InterfaceC9968c interfaceC9968c, InterfaceC7116c interfaceC7116c, InterfaceC7117d interfaceC7117d) throws Throwable {
        FlowKt__ErrorsKt$catchImpl$1 flowKt__ErrorsKt$catchImpl$1;
        Ref$ObjectRef ref$ObjectRef;
        Throwable th2;
        if (interfaceC9968c instanceof FlowKt__ErrorsKt$catchImpl$1) {
            flowKt__ErrorsKt$catchImpl$1 = (FlowKt__ErrorsKt$catchImpl$1) interfaceC9968c;
            int i10 = flowKt__ErrorsKt$catchImpl$1.f40114f;
            if ((i10 & Integer.MIN_VALUE) != 0) {
                flowKt__ErrorsKt$catchImpl$1.f40114f = i10 - Integer.MIN_VALUE;
            } else {
                flowKt__ErrorsKt$catchImpl$1 = new FlowKt__ErrorsKt$catchImpl$1(interfaceC9968c);
            }
        } else {
            flowKt__ErrorsKt$catchImpl$1 = new FlowKt__ErrorsKt$catchImpl$1(interfaceC9968c);
        }
        Object obj = flowKt__ErrorsKt$catchImpl$1.f40113e;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i11 = flowKt__ErrorsKt$catchImpl$1.f40114f;
        if (i11 == 0) {
            C7499b.m14977z0(obj);
            Ref$ObjectRef ref$ObjectRef2 = new Ref$ObjectRef();
            try {
                FlowKt__ErrorsKt$catchImpl$2 flowKt__ErrorsKt$catchImpl$2 = new FlowKt__ErrorsKt$catchImpl$2(interfaceC7117d, ref$ObjectRef2);
                flowKt__ErrorsKt$catchImpl$1.f40112d = ref$ObjectRef2;
                flowKt__ErrorsKt$catchImpl$1.f40114f = 1;
                if (interfaceC7116c.mo9539a(flowKt__ErrorsKt$catchImpl$2, flowKt__ErrorsKt$catchImpl$1) == coroutineSingletons) {
                    return coroutineSingletons;
                }
                return null;
            } catch (Throwable th3) {
                ref$ObjectRef = ref$ObjectRef2;
                th2 = th3;
            }
        } else {
            if (i11 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ref$ObjectRef = flowKt__ErrorsKt$catchImpl$1.f40112d;
            try {
                C7499b.m14977z0(obj);
                return null;
            } catch (Throwable th4) {
                th2 = th4;
            }
        }
        Throwable th5 = (Throwable) ref$ObjectRef.f38127a;
        boolean z10 = false;
        if (!(th5 != null && C5207g.m11106a(th5, th2))) {
            CoroutineContext coroutineContext = flowKt__ErrorsKt$catchImpl$1.f38105b;
            C5207g.m11108c(coroutineContext);
            InterfaceC7875v0 interfaceC7875v0 = (InterfaceC7875v0) coroutineContext.mo1474w(InterfaceC7875v0.b.f42976a);
            if (interfaceC7875v0 != null) {
                if (interfaceC7875v0.isCancelled()) {
                    CancellationException cancellationExceptionMo15617Q = interfaceC7875v0.mo15617Q();
                    z10 = cancellationExceptionMo15617Q != null && C5207g.m11106a(cancellationExceptionMo15617Q, th2);
                }
            }
            if (!z10) {
                if (th5 == null) {
                    return th2;
                }
                if (th2 instanceof CancellationException) {
                    C8656b.m16899g(th5, th2);
                    throw th5;
                }
                C8656b.m16899g(th2, th5);
                throw th2;
            }
        }
        throw th2;
    }
}
