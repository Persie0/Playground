package kotlinx.coroutines.flow;

import kotlin.coroutines.CoroutineContext;
import kotlinx.coroutines.channels.BufferOverflow;
import no.C7848l1;
import no.InterfaceC7875v0;
import p349qo.C8658d;
import p349qo.InterfaceC8661g;
import p464wl.InterfaceC9968c;

/* JADX INFO: renamed from: kotlinx.coroutines.flow.o */
/* JADX INFO: loaded from: classes2.dex */
public final class C7134o<T> implements InterfaceC7137r<T>, InterfaceC7116c, InterfaceC8661g<T> {

    /* JADX INFO: renamed from: a */
    public final InterfaceC7875v0 f40367a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ InterfaceC7137r<T> f40368b;

    public C7134o(C7138s c7138s, C7848l1 c7848l1) {
        this.f40367a = c7848l1;
        this.f40368b = c7138s;
    }

    @Override // kotlinx.coroutines.flow.InterfaceC7116c
    /* JADX INFO: renamed from: a */
    public final Object mo9539a(InterfaceC7117d<? super T> interfaceC7117d, InterfaceC9968c<?> interfaceC9968c) {
        return this.f40368b.mo9539a(interfaceC7117d, interfaceC9968c);
    }

    @Override // p349qo.InterfaceC8661g
    /* JADX INFO: renamed from: b */
    public final InterfaceC7116c<T> mo14365b(CoroutineContext coroutineContext, int i10, BufferOverflow bufferOverflow) {
        if (i10 == 0 || i10 == -3) {
            if (bufferOverflow == BufferOverflow.SUSPEND) {
                return this;
            }
        }
        return new C8658d(i10, coroutineContext, bufferOverflow, this);
    }
}
