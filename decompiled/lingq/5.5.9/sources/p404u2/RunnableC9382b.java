package p404u2;

import p286o2.C7906f;
import p312p2.C8173e;
import p338qd.C8584v;

/* JADX INFO: renamed from: u2.b */
/* JADX INFO: loaded from: classes.dex */
public final class RunnableC9382b implements Runnable {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ C8584v f48173a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ int f48174b;

    public RunnableC9382b(C8584v c8584v, int i10) {
        this.f48173a = c8584v;
        this.f48174b = i10;
    }

    @Override // java.lang.Runnable
    public final void run() {
        C7906f.e eVar = ((C8173e.a) this.f48173a).f44311I;
        if (eVar != null) {
            eVar.mo1296c(this.f48174b);
        }
    }
}
