package p000;

import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlinx.coroutines.channels.BufferOverflow;
import kotlinx.coroutines.flow.internal.AbstractC3231a;

/* JADX INFO: loaded from: classes.dex */
public class eu0 extends AbstractC3231a {

    /* JADX INFO: renamed from: d */
    public final zi3 f37853d;

    public eu0(zi3 zi3Var, kn1 kn1Var, int i, BufferOverflow bufferOverflow) {
        super(kn1Var, i, bufferOverflow);
        this.f37853d = zi3Var;
    }

    @Override // kotlinx.coroutines.flow.internal.AbstractC3231a
    /* JADX INFO: renamed from: d */
    public Object mo10648d(ll7 ll7Var, Continuation continuation) {
        Object objInvoke = this.f37853d.invoke(ll7Var, continuation);
        return objInvoke == CoroutineSingletons.COROUTINE_SUSPENDED ? objInvoke : xfa.f68157a;
    }

    @Override // kotlinx.coroutines.flow.internal.AbstractC3231a
    /* JADX INFO: renamed from: e */
    public AbstractC3231a mo10649e(kn1 kn1Var, int i, BufferOverflow bufferOverflow) {
        return new eu0(this.f37853d, kn1Var, i, bufferOverflow);
    }

    @Override // kotlinx.coroutines.flow.internal.AbstractC3231a
    public final String toString() {
        return "block[" + this.f37853d + "] -> " + super.toString();
    }
}
