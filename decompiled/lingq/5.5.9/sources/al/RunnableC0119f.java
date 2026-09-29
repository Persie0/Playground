package al;

import kotlin.Pair;
import p122fl.InterfaceC5585h;

/* JADX INFO: renamed from: al.f */
/* JADX INFO: loaded from: classes2.dex */
public final class RunnableC0119f implements Runnable {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ C0121h f296a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ Pair f297b;

    public RunnableC0119f(C0121h c0121h, Pair pair) {
        this.f296a = c0121h;
        this.f297b = pair;
    }

    @Override // java.lang.Runnable
    public final void run() {
        InterfaceC5585h interfaceC5585h = this.f296a.f301c;
        if (interfaceC5585h != null) {
            interfaceC5585h.mo520d(this.f297b.f38012a);
        }
    }
}
