package p180ih;

import android.content.Context;
import gh.C5793a;
import p075dh.C5174b;
import p075dh.InterfaceC5175c;

/* JADX INFO: renamed from: ih.b */
/* JADX INFO: loaded from: classes.dex */
public final class RunnableC6329b implements Runnable {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ InterfaceC5175c f36563a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ C6330c f36564b;

    public RunnableC6329b(C6330c c6330c, C5174b c5174b) {
        this.f36564b = c6330c;
        this.f36563a = c5174b;
    }

    @Override // java.lang.Runnable
    public final void run() {
        C6330c c6330c = this.f36564b;
        Context context = c6330c.f36567b.f46128b;
        InterfaceC5175c interfaceC5175c = this.f36563a;
        ((C5174b) interfaceC5175c).m10955f(context, c6330c.f36569d);
        ((C5793a) c6330c.f36566a).m12190p().m10962b(interfaceC5175c);
    }
}
