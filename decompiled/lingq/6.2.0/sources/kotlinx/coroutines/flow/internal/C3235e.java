package kotlinx.coroutines.flow.internal;

import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlinx.coroutines.channels.BufferOverflow;
import p000.aj3;
import p000.c83;
import p000.e83;
import p000.kn1;
import p000.vz1;
import p000.xfa;

/* JADX INFO: renamed from: kotlinx.coroutines.flow.internal.e */
/* JADX INFO: loaded from: classes.dex */
public final class C3235e extends AbstractC3233c {

    /* JADX INFO: renamed from: e */
    public final aj3 f48141e;

    public C3235e(aj3 aj3Var, c83 c83Var, kn1 kn1Var, int i, BufferOverflow bufferOverflow) {
        super(c83Var, kn1Var, i, bufferOverflow);
        this.f48141e = aj3Var;
    }

    @Override // kotlinx.coroutines.flow.internal.AbstractC3231a
    /* JADX INFO: renamed from: e */
    public final AbstractC3231a mo10649e(kn1 kn1Var, int i, BufferOverflow bufferOverflow) {
        return new C3235e(this.f48141e, this.f48136d, kn1Var, i, bufferOverflow);
    }

    @Override // kotlinx.coroutines.flow.internal.AbstractC3233c
    /* JADX INFO: renamed from: h */
    public final Object mo12141h(e83 e83Var, Continuation continuation) {
        Object objM23649s = vz1.m23649s(new ChannelFlowTransformLatest$flowCollect$3(this, e83Var, null), continuation);
        return objM23649s == CoroutineSingletons.COROUTINE_SUSPENDED ? objM23649s : xfa.f68157a;
    }
}
