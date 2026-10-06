package p000;

import java.util.ArrayDeque;
import java.util.Deque;
import java.util.concurrent.Executor;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class lfn implements Executor {

    /* JADX INFO: renamed from: b */
    public final Executor f38154b;

    /* JADX INFO: renamed from: a */
    public final Object f38153a = new Object();

    /* JADX INFO: renamed from: c */
    public final Deque f38155c = new ArrayDeque();

    /* JADX INFO: renamed from: d */
    public boolean f38156d = false;

    public lfn(Executor executor) {
        this.f38154b = executor;
    }

    @Override // java.util.concurrent.Executor
    public final void execute(Runnable runnable) {
        synchronized (this.f38153a) {
            this.f38155c.addLast(runnable);
            if (!this.f38156d) {
                this.f38156d = true;
                this.f38154b.execute(new kxw(this, 17));
            }
        }
    }
}
