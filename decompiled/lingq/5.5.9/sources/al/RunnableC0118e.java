package al;

import kotlin.Pair;
import p122fl.InterfaceC5585h;

/* JADX INFO: renamed from: al.e */
/* JADX INFO: loaded from: classes2.dex */
public final class RunnableC0118e implements Runnable {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ C0121h f294a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ Pair f295b;

    public RunnableC0118e(C0121h c0121h, Pair pair) {
        this.f294a = c0121h;
        this.f295b = pair;
    }

    @Override // java.lang.Runnable
    public final void run() {
        InterfaceC5585h interfaceC5585h = this.f294a.f300b;
        if (interfaceC5585h != null) {
            interfaceC5585h.mo520d(this.f295b.f38013b);
        }
    }
}
