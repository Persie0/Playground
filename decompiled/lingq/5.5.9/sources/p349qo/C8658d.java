package p349qo;

import kotlin.coroutines.CoroutineContext;
import kotlin.coroutines.EmptyCoroutineContext;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlinx.coroutines.CoroutineDispatcher;
import kotlinx.coroutines.channels.BufferOverflow;
import kotlinx.coroutines.flow.InterfaceC7116c;
import kotlinx.coroutines.flow.InterfaceC7117d;
import kotlinx.coroutines.flow.internal.AbstractC7125a;
import kotlinx.coroutines.flow.internal.AbstractC7126b;
import p464wl.InterfaceC9968c;
import sl.C9072e;

/* JADX INFO: renamed from: qo.d */
/* JADX INFO: loaded from: classes2.dex */
public final class C8658d<T> extends AbstractC7126b<T, T> {
    public C8658d(int i10, CoroutineContext coroutineContext, BufferOverflow bufferOverflow, InterfaceC7116c interfaceC7116c) {
        super(i10, coroutineContext, bufferOverflow, interfaceC7116c);
    }

    public C8658d(InterfaceC7116c interfaceC7116c, CoroutineDispatcher coroutineDispatcher, int i10, BufferOverflow bufferOverflow, int i11) {
        super((i11 & 4) != 0 ? -3 : i10, (i11 & 2) != 0 ? EmptyCoroutineContext.f38093a : coroutineDispatcher, (i11 & 8) != 0 ? BufferOverflow.SUSPEND : bufferOverflow, interfaceC7116c);
    }

    @Override // kotlinx.coroutines.flow.internal.AbstractC7125a
    /* JADX INFO: renamed from: f */
    public final AbstractC7125a<T> mo14374f(CoroutineContext coroutineContext, int i10, BufferOverflow bufferOverflow) {
        return new C8658d(i10, coroutineContext, bufferOverflow, this.f40359d);
    }

    @Override // kotlinx.coroutines.flow.internal.AbstractC7125a
    /* JADX INFO: renamed from: g */
    public final InterfaceC7116c<T> mo14375g() {
        return (InterfaceC7116c<T>) this.f40359d;
    }

    /* JADX WARN: Type inference incomplete: some casts might be missing */
    @Override // kotlinx.coroutines.flow.internal.AbstractC7126b
    /* JADX INFO: renamed from: i */
    public final Object mo14384i(InterfaceC7117d<? super T> interfaceC7117d, InterfaceC9968c<? super C9072e> interfaceC9968c) {
        Object objMo9539a = this.f40359d.mo9539a((InterfaceC7117d<? super S>) interfaceC7117d, interfaceC9968c);
        return objMo9539a == CoroutineSingletons.COROUTINE_SUSPENDED ? objMo9539a : C9072e.f47360a;
    }
}
