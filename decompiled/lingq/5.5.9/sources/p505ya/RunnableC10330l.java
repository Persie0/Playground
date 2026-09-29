package p505ya;

import android.view.Surface;
import p479xa.C10134c0;

/* JADX INFO: renamed from: ya.l */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class RunnableC10330l implements Runnable {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ InterfaceC10331m.a f52006a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ Object f52007b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ long f52008c;

    public /* synthetic */ RunnableC10330l(InterfaceC10331m.a aVar, Surface surface, long j10) {
        this.f52006a = aVar;
        this.f52007b = surface;
        this.f52008c = j10;
    }

    @Override // java.lang.Runnable
    public final void run() {
        InterfaceC10331m.a aVar = this.f52006a;
        aVar.getClass();
        int i10 = C10134c0.f51354a;
        aVar.f52010b.mo7050p(this.f52008c, this.f52007b);
    }
}
