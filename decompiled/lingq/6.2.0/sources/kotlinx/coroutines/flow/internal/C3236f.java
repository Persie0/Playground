package kotlinx.coroutines.flow.internal;

import java.util.Iterator;
import kotlin.coroutines.Continuation;
import kotlinx.coroutines.CoroutineStart;
import kotlinx.coroutines.channels.BufferOverflow;
import p000.c83;
import p000.cu0;
import p000.do7;
import p000.kl7;
import p000.kn1;
import p000.ll7;
import p000.te1;
import p000.un1;
import p000.wfb;
import p000.xfa;
import p000.zv8;

/* JADX INFO: renamed from: kotlinx.coroutines.flow.internal.f */
/* JADX INFO: loaded from: classes.dex */
public final class C3236f extends AbstractC3231a {

    /* JADX INFO: renamed from: d */
    public final Iterable f48142d;

    public C3236f(Iterable iterable, kn1 kn1Var, int i, BufferOverflow bufferOverflow) {
        super(kn1Var, i, bufferOverflow);
        this.f48142d = iterable;
    }

    @Override // kotlinx.coroutines.flow.internal.AbstractC3231a
    /* JADX INFO: renamed from: d */
    public final Object mo10648d(ll7 ll7Var, Continuation continuation) {
        zv8 zv8Var = new zv8(ll7Var);
        Iterator it = this.f48142d.iterator();
        while (it.hasNext()) {
            wfb.m23926u(ll7Var, null, null, new ChannelLimitedFlowMerge$collectTo$2$1((c83) it.next(), zv8Var, null), 3);
        }
        return xfa.f68157a;
    }

    @Override // kotlinx.coroutines.flow.internal.AbstractC3231a
    /* JADX INFO: renamed from: e */
    public final AbstractC3231a mo10649e(kn1 kn1Var, int i, BufferOverflow bufferOverflow) {
        return new C3236f(this.f48142d, kn1Var, i, bufferOverflow);
    }

    @Override // kotlinx.coroutines.flow.internal.AbstractC3231a
    /* JADX INFO: renamed from: g */
    public final cu0 mo10651g(un1 un1Var) {
        ChannelFlow$collectToFun$1 channelFlow$collectToFun$1 = new ChannelFlow$collectToFun$1(this, null);
        BufferOverflow bufferOverflow = BufferOverflow.SUSPEND;
        CoroutineStart coroutineStart = CoroutineStart.DEFAULT;
        kl7 kl7Var = new kl7(te1.m21970C(un1Var, this.f48133a), do7.m10525a(this.f48134b, 4, bufferOverflow));
        coroutineStart.invoke(channelFlow$collectToFun$1, kl7Var, kl7Var);
        return kl7Var;
    }
}
