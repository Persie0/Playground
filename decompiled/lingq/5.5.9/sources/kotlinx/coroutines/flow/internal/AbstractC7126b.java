package kotlinx.coroutines.flow.internal;

import dm.C5206f;
import dm.C5207g;
import kotlin.coroutines.CoroutineContext;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlinx.coroutines.channels.BufferOverflow;
import kotlinx.coroutines.flow.InterfaceC7116c;
import kotlinx.coroutines.flow.InterfaceC7117d;
import kotlinx.coroutines.internal.ThreadContextKt;
import p325po.InterfaceC8436l;
import p349qo.C8663i;
import p349qo.C8664j;
import p464wl.InterfaceC9968c;
import p464wl.InterfaceC9969d;
import sl.C9072e;

/* JADX INFO: renamed from: kotlinx.coroutines.flow.internal.b */
/* JADX INFO: loaded from: classes2.dex */
public abstract class AbstractC7126b<S, T> extends AbstractC7125a<T> {

    /* JADX INFO: renamed from: d */
    public final InterfaceC7116c<S> f40359d;

    public AbstractC7126b(int i10, CoroutineContext coroutineContext, BufferOverflow bufferOverflow, InterfaceC7116c interfaceC7116c) {
        super(coroutineContext, i10, bufferOverflow);
        this.f40359d = interfaceC7116c;
    }

    @Override // kotlinx.coroutines.flow.internal.AbstractC7125a, kotlinx.coroutines.flow.InterfaceC7116c
    /* JADX INFO: renamed from: a */
    public final Object mo9539a(InterfaceC7117d<? super T> interfaceC7117d, InterfaceC9968c<? super C9072e> interfaceC9968c) throws Throwable {
        if (this.f40357b == -3) {
            CoroutineContext coroutineContextMo2029e = interfaceC9968c.mo2029e();
            CoroutineContext coroutineContextMo1471C = coroutineContextMo2029e.mo1471C(this.f40356a);
            if (C5207g.m11106a(coroutineContextMo1471C, coroutineContextMo2029e)) {
                Object objMo14384i = mo14384i(interfaceC7117d, interfaceC9968c);
                return objMo14384i == CoroutineSingletons.COROUTINE_SUSPENDED ? objMo14384i : C9072e.f47360a;
            }
            InterfaceC9969d.a aVar = InterfaceC9969d.a.f50692a;
            if (C5207g.m11106a(coroutineContextMo1471C.mo1474w(aVar), coroutineContextMo2029e.mo1474w(aVar))) {
                CoroutineContext coroutineContextMo2029e2 = interfaceC9968c.mo2029e();
                if (!(interfaceC7117d instanceof C8664j ? true : interfaceC7117d instanceof C8663i)) {
                    interfaceC7117d = new UndispatchedContextCollector(interfaceC7117d, coroutineContextMo2029e2);
                }
                Object objM11033z1 = C5206f.m11033z1(coroutineContextMo1471C, interfaceC7117d, ThreadContextKt.m14434b(coroutineContextMo1471C), new ChannelFlowOperator$collectWithContextUndispatched$2(this, null), interfaceC9968c);
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                if (objM11033z1 != coroutineSingletons) {
                    objM11033z1 = C9072e.f47360a;
                }
                return objM11033z1 == coroutineSingletons ? objM11033z1 : C9072e.f47360a;
            }
        }
        Object objMo9539a = super.mo9539a(interfaceC7117d, interfaceC9968c);
        return objMo9539a == CoroutineSingletons.COROUTINE_SUSPENDED ? objMo9539a : C9072e.f47360a;
    }

    @Override // kotlinx.coroutines.flow.internal.AbstractC7125a
    /* JADX INFO: renamed from: e */
    public final Object mo14373e(InterfaceC8436l<? super T> interfaceC8436l, InterfaceC9968c<? super C9072e> interfaceC9968c) {
        Object objMo14384i = mo14384i(new C8664j(interfaceC8436l), interfaceC9968c);
        return objMo14384i == CoroutineSingletons.COROUTINE_SUSPENDED ? objMo14384i : C9072e.f47360a;
    }

    /* JADX INFO: renamed from: i */
    public abstract Object mo14384i(InterfaceC7117d<? super T> interfaceC7117d, InterfaceC9968c<? super C9072e> interfaceC9968c);

    @Override // kotlinx.coroutines.flow.internal.AbstractC7125a
    public final String toString() {
        return this.f40359d + " -> " + super.toString();
    }
}
