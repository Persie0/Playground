package kotlinx.coroutines;

import java.util.concurrent.CancellationException;
import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
import kotlin.AbstractC3193b;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import p000.c32;
import p000.kn1;
import p000.ui3;
import p000.un1;
import p000.vz9;
import p000.xfa;
import p000.zi3;

/* JADX INFO: loaded from: classes.dex */
@c32(m4290c = "kotlinx.coroutines.InterruptibleKt$runInterruptible$2", m4291f = "Interruptible.kt", m4292l = {}, m4293m = "invokeSuspend", m4294v = 1)
final class InterruptibleKt$runInterruptible$2 extends SuspendLambda implements zi3 {

    /* JADX INFO: renamed from: a */
    public /* synthetic */ Object f47749a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ ui3 f47750b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public InterruptibleKt$runInterruptible$2(ui3 ui3Var, Continuation continuation) {
        super(2, continuation);
        this.f47750b = ui3Var;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        InterruptibleKt$runInterruptible$2 interruptibleKt$runInterruptible$2 = new InterruptibleKt$runInterruptible$2(this.f47750b, continuation);
        interruptibleKt$runInterruptible$2.f47749a = obj;
        return interruptibleKt$runInterruptible$2;
    }

    @Override // p000.zi3
    public final Object invoke(Object obj, Object obj2) {
        return ((InterruptibleKt$runInterruptible$2) create((un1) obj, (Continuation) obj2)).invokeSuspend(xfa.f68157a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        int i;
        un1 un1Var = (un1) this.f47749a;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        AbstractC3193b.m15359b(obj);
        kn1 kn1VarMo1309x = un1Var.mo1309x();
        ui3 ui3Var = this.f47750b;
        try {
            vz9 vz9Var = new vz9();
            vz9Var.f66144i = AbstractC3208a.m15442i(AbstractC3208a.m15441h(kn1VarMo1309x), vz9Var);
            AtomicIntegerFieldUpdater atomicIntegerFieldUpdater = vz9.f66142j;
            do {
                i = atomicIntegerFieldUpdater.get(vz9Var);
                if (i != 0) {
                    if (i == 2 || i == 3) {
                        break;
                        break;
                    }
                    vz9.m23659u(i);
                    throw null;
                }
            } while (!atomicIntegerFieldUpdater.compareAndSet(vz9Var, i, 0));
            try {
                return ui3Var.mo0a();
            } finally {
                vz9Var.m23660t();
            }
        } catch (InterruptedException e) {
            throw new CancellationException("Blocking call was interrupted due to parent cancellation").initCause(e);
        }
    }
}
