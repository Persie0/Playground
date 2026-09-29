package kotlinx.coroutines.channels;

import java.util.concurrent.CancellationException;
import kotlin.AbstractC3193b;
import kotlin.coroutines.EmptyCoroutineContext;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import p000.AbstractC3584sr;
import p000.C3386nv;
import p000.cu0;
import p000.iu0;
import p000.ju0;
import p000.kl7;
import p000.ll7;
import p000.nj0;
import p000.rcd;
import p000.ri0;
import p000.sm0;
import p000.ui3;
import p000.wfb;
import p000.xfa;

/* JADX INFO: renamed from: kotlinx.coroutines.channels.b */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC3212b {
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX INFO: renamed from: a */
    public static final Object m15484a(ll7 ll7Var, ui3 ui3Var, ContinuationImpl continuationImpl) throws Throwable {
        ProduceKt$awaitClose$1 produceKt$awaitClose$1;
        if (continuationImpl instanceof ProduceKt$awaitClose$1) {
            produceKt$awaitClose$1 = (ProduceKt$awaitClose$1) continuationImpl;
            int i = produceKt$awaitClose$1.f47780c;
            if ((i & Integer.MIN_VALUE) != 0) {
                produceKt$awaitClose$1.f47780c = i - Integer.MIN_VALUE;
            } else {
                produceKt$awaitClose$1 = new ProduceKt$awaitClose$1(continuationImpl);
            }
        } else {
            produceKt$awaitClose$1 = new ProduceKt$awaitClose$1(continuationImpl);
        }
        Object obj = produceKt$awaitClose$1.f47779b;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i2 = produceKt$awaitClose$1.f47780c;
        try {
            if (i2 == 0) {
                AbstractC3193b.m15359b(obj);
                if (produceKt$awaitClose$1.getContext().get(nj0.f52795N) != ll7Var) {
                    C3386nv.m17633t("awaitClose() can only be invoked from the producer context");
                    return null;
                }
                produceKt$awaitClose$1.f47778a = ui3Var;
                produceKt$awaitClose$1.f47780c = 1;
                sm0 sm0Var = new sm0(1, AbstractC3584sr.m21600K(produceKt$awaitClose$1));
                sm0Var.m21468u();
                ((kl7) ll7Var).f47495f.m15454A(new ri0(sm0Var, 3));
                if (sm0Var.m21466r() == coroutineSingletons) {
                    return coroutineSingletons;
                }
            } else {
                if (i2 != 1) {
                    C3386nv.m17633t("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                ui3Var = produceKt$awaitClose$1.f47778a;
                AbstractC3193b.m15359b(obj);
            }
            ui3Var.mo0a();
            return xfa.f68157a;
        } catch (Throwable th) {
            ui3Var.mo0a();
            throw th;
        }
    }

    /* JADX INFO: renamed from: b */
    public static final void m15485b(cu0 cu0Var, Throwable th) {
        CancellationException cancellationExceptionM20580a = th instanceof CancellationException ? (CancellationException) th : null;
        if (cancellationExceptionM20580a == null) {
            cancellationExceptionM20580a = rcd.m20580a("Channel was consumed, consumer had failed", th);
        }
        cu0Var.mo4537a(cancellationExceptionM20580a);
    }

    /* JADX INFO: renamed from: c */
    public static final void m15486c(ll7 ll7Var) {
        Object objMo4677k = ((kl7) ll7Var).f47495f.mo4677k(xfa.f68157a);
        if (!(objMo4677k instanceof iu0)) {
        } else {
            Object obj = ((ju0) wfb.m23900B(EmptyCoroutineContext.f47685a, new ChannelsKt__ChannelsKt$trySendBlocking$2(ll7Var, null))).f46151a;
        }
    }
}
