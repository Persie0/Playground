package kotlinx.coroutines.flow;

import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
import kotlin.coroutines.CoroutineContext;
import kotlin.coroutines.EmptyCoroutineContext;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlinx.coroutines.channels.BufferOverflow;
import kotlinx.coroutines.flow.internal.AbstractC7125a;
import no.InterfaceC7882z;
import p325po.InterfaceC8436l;
import p325po.InterfaceC8438n;
import p349qo.C8664j;
import p464wl.InterfaceC9968c;
import sl.C9072e;

/* JADX INFO: renamed from: kotlinx.coroutines.flow.a */
/* JADX INFO: loaded from: classes2.dex */
public final class C7114a<T> extends AbstractC7125a<T> {

    /* JADX INFO: renamed from: f */
    public static final /* synthetic */ AtomicIntegerFieldUpdater f40278f = AtomicIntegerFieldUpdater.newUpdater(C7114a.class, "consumed");
    private volatile /* synthetic */ int consumed;

    /* JADX INFO: renamed from: d */
    public final InterfaceC8438n<T> f40279d;

    /* JADX INFO: renamed from: e */
    public final boolean f40280e;

    public /* synthetic */ C7114a(InterfaceC8438n interfaceC8438n, boolean z10) {
        this(interfaceC8438n, z10, EmptyCoroutineContext.f38093a, -3, BufferOverflow.SUSPEND);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public C7114a(InterfaceC8438n<? extends T> interfaceC8438n, boolean z10, CoroutineContext coroutineContext, int i10, BufferOverflow bufferOverflow) {
        super(coroutineContext, i10, bufferOverflow);
        this.f40279d = interfaceC8438n;
        this.f40280e = z10;
        this.consumed = 0;
    }

    @Override // kotlinx.coroutines.flow.internal.AbstractC7125a, kotlinx.coroutines.flow.InterfaceC7116c
    /* JADX INFO: renamed from: a */
    public final Object mo9539a(InterfaceC7117d<? super T> interfaceC7117d, InterfaceC9968c<? super C9072e> interfaceC9968c) throws Throwable {
        if (this.f40357b != -3) {
            Object objMo9539a = super.mo9539a(interfaceC7117d, interfaceC9968c);
            return objMo9539a == CoroutineSingletons.COROUTINE_SUSPENDED ? objMo9539a : C9072e.f47360a;
        }
        m14377i();
        Object objM14359a = FlowKt__ChannelsKt.m14359a(interfaceC7117d, this.f40279d, this.f40280e, interfaceC9968c);
        return objM14359a == CoroutineSingletons.COROUTINE_SUSPENDED ? objM14359a : C9072e.f47360a;
    }

    @Override // kotlinx.coroutines.flow.internal.AbstractC7125a
    /* JADX INFO: renamed from: d */
    public final String mo14372d() {
        return "channel=" + this.f40279d;
    }

    @Override // kotlinx.coroutines.flow.internal.AbstractC7125a
    /* JADX INFO: renamed from: e */
    public final Object mo14373e(InterfaceC8436l<? super T> interfaceC8436l, InterfaceC9968c<? super C9072e> interfaceC9968c) throws Throwable {
        Object objM14359a = FlowKt__ChannelsKt.m14359a(new C8664j(interfaceC8436l), this.f40279d, this.f40280e, interfaceC9968c);
        return objM14359a == CoroutineSingletons.COROUTINE_SUSPENDED ? objM14359a : C9072e.f47360a;
    }

    @Override // kotlinx.coroutines.flow.internal.AbstractC7125a
    /* JADX INFO: renamed from: f */
    public final AbstractC7125a<T> mo14374f(CoroutineContext coroutineContext, int i10, BufferOverflow bufferOverflow) {
        return new C7114a(this.f40279d, this.f40280e, coroutineContext, i10, bufferOverflow);
    }

    @Override // kotlinx.coroutines.flow.internal.AbstractC7125a
    /* JADX INFO: renamed from: g */
    public final InterfaceC7116c<T> mo14375g() {
        return new C7114a(this.f40279d, this.f40280e);
    }

    @Override // kotlinx.coroutines.flow.internal.AbstractC7125a
    /* JADX INFO: renamed from: h */
    public final InterfaceC8438n<T> mo14376h(InterfaceC7882z interfaceC7882z) {
        m14377i();
        return this.f40357b == -3 ? this.f40279d : super.mo14376h(interfaceC7882z);
    }

    /* JADX WARN: Unreachable blocks removed: 1, instructions: 1 */
    /* JADX INFO: renamed from: i */
    public final void m14377i() {
        if (this.f40280e) {
            if (!(f40278f.getAndSet(this, 1) == 0)) {
                throw new IllegalStateException("ReceiveChannel.consumeAsFlow can be collected just once".toString());
            }
        }
    }
}
