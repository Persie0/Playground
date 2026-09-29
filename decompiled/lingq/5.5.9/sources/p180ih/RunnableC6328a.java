package p180ih;

import gh.C5793a;
import gh.C5802j;
import p075dh.C5174b;
import p075dh.InterfaceC5175c;

/* JADX INFO: renamed from: ih.a */
/* JADX INFO: loaded from: classes.dex */
public final class RunnableC6328a implements Runnable {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ C6330c f36562a;

    public RunnableC6328a(C6330c c6330c) {
        this.f36562a = c6330c;
    }

    /* JADX WARN: Unreachable blocks removed: 2, instructions: 2 */
    @Override // java.lang.Runnable
    public final void run() {
        InterfaceC5175c interfaceC5175c;
        synchronized (((C5793a) this.f36562a.f36566a).m12189o()) {
            C5802j c5802jM12189o = ((C5793a) this.f36562a.f36566a).m12189o();
            synchronized (c5802jM12189o) {
                interfaceC5175c = c5802jM12189o.f35065b;
            }
            if (interfaceC5175c == null) {
                return;
            }
            C6330c c6330c = this.f36562a;
            ((C5174b) interfaceC5175c).m10955f(c6330c.f36567b.f46128b, c6330c.f36569d);
            ((C5793a) this.f36562a.f36566a).m12189o().m12219g(interfaceC5175c);
        }
    }
}
