package p404u2;

import android.os.Handler;
import p312p2.C8173e;
import p338qd.C8584v;

/* JADX INFO: renamed from: u2.c */
/* JADX INFO: loaded from: classes.dex */
public final class C9383c {

    /* JADX INFO: renamed from: a */
    public final C8584v f48175a;

    /* JADX INFO: renamed from: b */
    public final Handler f48176b;

    public C9383c(C8173e.a aVar, Handler handler) {
        this.f48175a = aVar;
        this.f48176b = handler;
    }

    /* JADX INFO: renamed from: a */
    public final void m17752a(C9391k.a aVar) {
        int i10 = aVar.f48199b;
        boolean z10 = i10 == 0;
        Handler handler = this.f48176b;
        C8584v c8584v = this.f48175a;
        if (z10) {
            handler.post(new RunnableC9381a(c8584v, aVar.f48198a));
        } else {
            handler.post(new RunnableC9382b(c8584v, i10));
        }
    }
}
