package p000;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.Executor;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class ckg implements Executor {

    /* JADX INFO: renamed from: c */
    private final Executor f5978c;

    /* JADX INFO: renamed from: b */
    private final List f5977b = new ArrayList();

    /* JADX INFO: renamed from: a */
    private boolean f5976a = false;

    public ckg(Executor executor) {
        this.f5978c = executor;
    }

    /* JADX INFO: renamed from: a */
    public final synchronized void m3836a() {
        lku.m15613H(!this.f5976a);
        this.f5976a = true;
    }

    /* JADX INFO: renamed from: b */
    public final synchronized void m3837b() {
        lku.m15613H(this.f5976a);
        this.f5976a = false;
        Iterator it = this.f5977b.iterator();
        while (it.hasNext()) {
            this.f5978c.execute((Runnable) it.next());
        }
        this.f5977b.clear();
    }

    @Override // java.util.concurrent.Executor
    public final synchronized void execute(Runnable runnable) {
        if (this.f5976a) {
            this.f5977b.add(runnable);
        } else {
            lku.m15614I(this.f5977b.isEmpty(), "LatchExecutor: Bad pending task.");
            this.f5978c.execute(runnable);
        }
    }
}
