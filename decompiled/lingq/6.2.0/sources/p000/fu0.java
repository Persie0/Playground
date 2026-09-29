package p000;

import kotlin.coroutines.Continuation;
import kotlin.coroutines.EmptyCoroutineContext;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlinx.coroutines.channels.BufferOverflow;
import kotlinx.coroutines.flow.internal.AbstractC3231a;
import kotlinx.coroutines.flow.internal.AbstractC3233c;

/* JADX INFO: loaded from: classes.dex */
public final class fu0 extends AbstractC3233c {
    public fu0(c83 c83Var, kn1 kn1Var, int i, BufferOverflow bufferOverflow, int i2) {
        super(c83Var, (i2 & 2) != 0 ? EmptyCoroutineContext.f47685a : kn1Var, (i2 & 4) != 0 ? -3 : i, (i2 & 8) != 0 ? BufferOverflow.SUSPEND : bufferOverflow);
    }

    @Override // kotlinx.coroutines.flow.internal.AbstractC3231a
    /* JADX INFO: renamed from: e */
    public final AbstractC3231a mo10649e(kn1 kn1Var, int i, BufferOverflow bufferOverflow) {
        return new fu0(this.f48136d, kn1Var, i, bufferOverflow);
    }

    @Override // kotlinx.coroutines.flow.internal.AbstractC3231a
    /* JADX INFO: renamed from: f */
    public final c83 mo10650f() {
        return this.f48136d;
    }

    @Override // kotlinx.coroutines.flow.internal.AbstractC3233c
    /* JADX INFO: renamed from: h */
    public final Object mo12141h(e83 e83Var, Continuation continuation) {
        Object objCollect = this.f48136d.collect(e83Var, continuation);
        return objCollect == CoroutineSingletons.COROUTINE_SUSPENDED ? objCollect : xfa.f68157a;
    }
}
