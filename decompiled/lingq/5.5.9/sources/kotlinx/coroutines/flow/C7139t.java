package kotlinx.coroutines.flow;

import no.C7843k;
import p349qo.AbstractC8655a;
import p349qo.AbstractC8657c;
import p464wl.InterfaceC9968c;

/* JADX INFO: renamed from: kotlinx.coroutines.flow.t */
/* JADX INFO: loaded from: classes2.dex */
public final class C7139t extends AbstractC8657c<C7138s<?>> {

    /* JADX INFO: renamed from: a */
    public long f40385a = -1;

    /* JADX INFO: renamed from: b */
    public C7843k f40386b;

    @Override // p349qo.AbstractC8657c
    /* JADX INFO: renamed from: a */
    public final boolean mo14402a(AbstractC8655a abstractC8655a) {
        C7138s c7138s = (C7138s) abstractC8655a;
        if (this.f40385a >= 0) {
            return false;
        }
        long j10 = c7138s.f40376i;
        if (j10 < c7138s.f40377j) {
            c7138s.f40377j = j10;
        }
        this.f40385a = j10;
        return true;
    }

    @Override // p349qo.AbstractC8657c
    /* JADX INFO: renamed from: b */
    public final InterfaceC9968c[] mo14403b(AbstractC8655a abstractC8655a) {
        long j10 = this.f40385a;
        this.f40385a = -1L;
        this.f40386b = null;
        return ((C7138s) abstractC8655a).m14401x(j10);
    }
}
