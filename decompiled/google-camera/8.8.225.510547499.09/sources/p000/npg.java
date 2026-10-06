package p000;

import java.util.concurrent.Executor;
import java.util.concurrent.Future;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public abstract class npg extends npe implements nps {
    protected npg() {
    }

    @Override // p000.npe
    /* JADX INFO: renamed from: b */
    protected /* bridge */ /* synthetic */ Future mo17601b() {
        throw null;
    }

    /* JADX INFO: renamed from: c */
    protected abstract nps mo17602c();

    @Override // p000.nps
    /* JADX INFO: renamed from: d */
    public final void mo2282d(Runnable runnable, Executor executor) {
        mo17602c().mo2282d(runnable, executor);
    }
}
