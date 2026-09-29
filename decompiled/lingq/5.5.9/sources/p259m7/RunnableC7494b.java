package p259m7;

import p111f7.InterfaceC5474b;
import p216k7.C6627b;

/* JADX INFO: renamed from: m7.b */
/* JADX INFO: loaded from: classes.dex */
public final class RunnableC7494b implements Runnable {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ C7493a f41405a;

    public RunnableC7494b(C7493a c7493a) {
        this.f41405a = c7493a;
    }

    @Override // java.lang.Runnable
    public final void run() {
        C7493a c7493a = this.f41405a;
        InterfaceC5474b interfaceC5474b = c7493a.f41400n;
        if (interfaceC5474b != null) {
            interfaceC5474b.mo9444b();
        }
        c7493a.f41399m = null;
        c7493a.f41400n = null;
        C6627b.m13257b().f37573a.remove(Integer.valueOf(c7493a.f41401o));
    }
}
