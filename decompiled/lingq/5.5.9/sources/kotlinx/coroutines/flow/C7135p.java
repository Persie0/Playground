package kotlinx.coroutines.flow;

import kotlin.coroutines.CoroutineContext;
import kotlinx.coroutines.channels.BufferOverflow;
import no.C7848l1;
import no.InterfaceC7875v0;
import p349qo.C8658d;
import p349qo.InterfaceC8661g;
import p464wl.InterfaceC9968c;

/* JADX INFO: renamed from: kotlinx.coroutines.flow.p */
/* JADX INFO: loaded from: classes2.dex */
public final class C7135p<T> implements InterfaceC7142w<T>, InterfaceC7116c, InterfaceC8661g<T> {

    /* JADX INFO: renamed from: a */
    public final InterfaceC7875v0 f40369a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ InterfaceC7142w<T> f40370b;

    public C7135p(StateFlowImpl stateFlowImpl, C7848l1 c7848l1) {
        this.f40369a = c7848l1;
        this.f40370b = stateFlowImpl;
    }

    @Override // kotlinx.coroutines.flow.InterfaceC7116c
    /* JADX INFO: renamed from: a */
    public final Object mo9539a(InterfaceC7117d<? super T> interfaceC7117d, InterfaceC9968c<?> interfaceC9968c) {
        return this.f40370b.mo9539a(interfaceC7117d, interfaceC9968c);
    }

    /* JADX WARN: Code restructure failed: missing block: B:19:0x0023, code lost:
    
        if (r8 == kotlinx.coroutines.channels.BufferOverflow.SUSPEND) goto L20;
     */
    @Override // p349qo.InterfaceC8661g
    /* JADX INFO: renamed from: b */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final InterfaceC7116c<T> mo14365b(CoroutineContext coroutineContext, int i10, BufferOverflow bufferOverflow) {
        if ((!(i10 >= 0 && i10 < 2) && i10 != -2) || bufferOverflow != BufferOverflow.DROP_OLDEST) {
            if (i10 == 0 || i10 == -3) {
            }
            return new C8658d(i10, coroutineContext, bufferOverflow, this);
        }
        return this;
    }

    @Override // kotlinx.coroutines.flow.InterfaceC7142w
    public final T getValue() {
        return this.f40370b.getValue();
    }
}
