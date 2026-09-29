package kotlinx.coroutines.flow.internal;

import dm.C5207g;
import java.util.ArrayList;
import kotlin.collections.C6752c;
import kotlin.coroutines.CoroutineContext;
import kotlin.coroutines.EmptyCoroutineContext;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlinx.coroutines.CoroutineContextKt;
import kotlinx.coroutines.CoroutineStart;
import kotlinx.coroutines.channels.AbstractChannel;
import kotlinx.coroutines.channels.BufferOverflow;
import kotlinx.coroutines.flow.InterfaceC7116c;
import kotlinx.coroutines.flow.InterfaceC7117d;
import kotlinx.coroutines.scheduling.C7178b;
import no.C7832g0;
import no.InterfaceC7882z;
import p003a2.C0009a;
import p260m8.C7499b;
import p325po.C8435k;
import p325po.InterfaceC8436l;
import p325po.InterfaceC8438n;
import p338qd.C8573r0;
import p349qo.InterfaceC8661g;
import p464wl.InterfaceC9968c;
import p464wl.InterfaceC9969d;
import sl.C9072e;

/* JADX INFO: renamed from: kotlinx.coroutines.flow.internal.a */
/* JADX INFO: loaded from: classes2.dex */
public abstract class AbstractC7125a<T> implements InterfaceC8661g<T> {

    /* JADX INFO: renamed from: a */
    public final CoroutineContext f40356a;

    /* JADX INFO: renamed from: b */
    public final int f40357b;

    /* JADX INFO: renamed from: c */
    public final BufferOverflow f40358c;

    public AbstractC7125a(CoroutineContext coroutineContext, int i10, BufferOverflow bufferOverflow) {
        this.f40356a = coroutineContext;
        this.f40357b = i10;
        this.f40358c = bufferOverflow;
    }

    @Override // kotlinx.coroutines.flow.InterfaceC7116c
    /* JADX INFO: renamed from: a */
    public Object mo9539a(InterfaceC7117d<? super T> interfaceC7117d, InterfaceC9968c<? super C9072e> interfaceC9968c) throws Throwable {
        Object objM14963s = C7499b.m14963s(new ChannelFlow$collect$2(null, interfaceC7117d, this), interfaceC9968c);
        return objM14963s == CoroutineSingletons.COROUTINE_SUSPENDED ? objM14963s : C9072e.f47360a;
    }

    @Override // p349qo.InterfaceC8661g
    /* JADX INFO: renamed from: b */
    public final InterfaceC7116c<T> mo14365b(CoroutineContext coroutineContext, int i10, BufferOverflow bufferOverflow) {
        CoroutineContext coroutineContext2 = this.f40356a;
        CoroutineContext coroutineContextMo1471C = coroutineContext.mo1471C(coroutineContext2);
        BufferOverflow bufferOverflow2 = BufferOverflow.SUSPEND;
        BufferOverflow bufferOverflow3 = this.f40358c;
        int i11 = this.f40357b;
        if (bufferOverflow == bufferOverflow2) {
            if (i11 != -3) {
                if (i10 == -3) {
                    i10 = i11;
                } else if (i11 != -2) {
                    if (i10 == -2) {
                        i10 = i11;
                    } else {
                        i10 += i11;
                        if (i10 < 0) {
                            i10 = Integer.MAX_VALUE;
                        }
                    }
                }
            }
            bufferOverflow = bufferOverflow3;
        }
        return (C5207g.m11106a(coroutineContextMo1471C, coroutineContext2) && i10 == i11 && bufferOverflow == bufferOverflow3) ? this : mo14374f(coroutineContextMo1471C, i10, bufferOverflow);
    }

    /* JADX INFO: renamed from: d */
    public String mo14372d() {
        return null;
    }

    /* JADX INFO: renamed from: e */
    public abstract Object mo14373e(InterfaceC8436l<? super T> interfaceC8436l, InterfaceC9968c<? super C9072e> interfaceC9968c);

    /* JADX INFO: renamed from: f */
    public abstract AbstractC7125a<T> mo14374f(CoroutineContext coroutineContext, int i10, BufferOverflow bufferOverflow);

    /* JADX INFO: renamed from: g */
    public InterfaceC7116c<T> mo14375g() {
        return null;
    }

    /* JADX INFO: renamed from: h */
    public InterfaceC8438n<T> mo14376h(InterfaceC7882z interfaceC7882z) {
        int i10 = this.f40357b;
        if (i10 == -3) {
            i10 = -2;
        }
        CoroutineStart coroutineStart = CoroutineStart.ATOMIC;
        ChannelFlow$collectToFun$1 channelFlow$collectToFun$1 = new ChannelFlow$collectToFun$1(this, null);
        AbstractChannel abstractChannelM16738m = C8573r0.m16738m(i10, this.f40358c, 4);
        CoroutineContext coroutineContextM14307a = CoroutineContextKt.m14307a(interfaceC7882z.getF6528b(), this.f40356a, true);
        C7178b c7178b = C7832g0.f42930a;
        if (coroutineContextM14307a != c7178b && coroutineContextM14307a.mo1474w(InterfaceC9969d.a.f50692a) == null) {
            coroutineContextM14307a = coroutineContextM14307a.mo1471C(c7178b);
        }
        C8435k c8435k = new C8435k(coroutineContextM14307a, abstractChannelM16738m);
        coroutineStart.invoke(channelFlow$collectToFun$1, c8435k, c8435k);
        return c8435k;
    }

    public String toString() {
        ArrayList arrayList = new ArrayList(4);
        String strMo14372d = mo14372d();
        if (strMo14372d != null) {
            arrayList.add(strMo14372d);
        }
        EmptyCoroutineContext emptyCoroutineContext = EmptyCoroutineContext.f38093a;
        CoroutineContext coroutineContext = this.f40356a;
        if (coroutineContext != emptyCoroutineContext) {
            arrayList.add("context=" + coroutineContext);
        }
        int i10 = this.f40357b;
        if (i10 != -3) {
            arrayList.add("capacity=" + i10);
        }
        BufferOverflow bufferOverflow = BufferOverflow.SUSPEND;
        BufferOverflow bufferOverflow2 = this.f40358c;
        if (bufferOverflow2 != bufferOverflow) {
            arrayList.add("onBufferOverflow=" + bufferOverflow2);
        }
        StringBuilder sb2 = new StringBuilder();
        sb2.append(getClass().getSimpleName());
        sb2.append('[');
        return C0009a.m22j(sb2, C6752c.m13430X(arrayList, ", ", null, null, null, 62), ']');
    }
}
