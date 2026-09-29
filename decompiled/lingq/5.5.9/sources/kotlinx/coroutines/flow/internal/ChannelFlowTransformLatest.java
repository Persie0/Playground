package kotlinx.coroutines.flow.internal;

import cm.InterfaceC2057q;
import kotlin.coroutines.CoroutineContext;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlinx.coroutines.channels.BufferOverflow;
import kotlinx.coroutines.flow.InterfaceC7116c;
import kotlinx.coroutines.flow.InterfaceC7117d;
import p260m8.C7499b;
import p464wl.InterfaceC9968c;
import sl.C9072e;

/* JADX INFO: loaded from: classes2.dex */
public final class ChannelFlowTransformLatest<T, R> extends AbstractC7126b<T, R> {

    /* JADX INFO: renamed from: e */
    public final InterfaceC2057q<InterfaceC7117d<? super R>, T, InterfaceC9968c<? super C9072e>, Object> f40298e;

    /* JADX WARN: Multi-variable type inference failed */
    public ChannelFlowTransformLatest(InterfaceC2057q<? super InterfaceC7117d<? super R>, ? super T, ? super InterfaceC9968c<? super C9072e>, ? extends Object> interfaceC2057q, InterfaceC7116c<? extends T> interfaceC7116c, CoroutineContext coroutineContext, int i10, BufferOverflow bufferOverflow) {
        super(i10, coroutineContext, bufferOverflow, interfaceC7116c);
        this.f40298e = interfaceC2057q;
    }

    @Override // kotlinx.coroutines.flow.internal.AbstractC7125a
    /* JADX INFO: renamed from: f */
    public final AbstractC7125a<R> mo14374f(CoroutineContext coroutineContext, int i10, BufferOverflow bufferOverflow) {
        return new ChannelFlowTransformLatest(this.f40298e, this.f40359d, coroutineContext, i10, bufferOverflow);
    }

    @Override // kotlinx.coroutines.flow.internal.AbstractC7126b
    /* JADX INFO: renamed from: i */
    public final Object mo14384i(InterfaceC7117d<? super R> interfaceC7117d, InterfaceC9968c<? super C9072e> interfaceC9968c) throws Throwable {
        Object objM14963s = C7499b.m14963s(new ChannelFlowTransformLatest$flowCollect$3(this, interfaceC7117d, null), interfaceC9968c);
        return objM14963s == CoroutineSingletons.COROUTINE_SUSPENDED ? objM14963s : C9072e.f47360a;
    }
}
