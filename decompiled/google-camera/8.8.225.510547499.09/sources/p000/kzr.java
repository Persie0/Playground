package p000;

import android.util.Log;
import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.Executor;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class kzr implements Executor {

    /* JADX INFO: renamed from: a */
    public final ArrayBlockingQueue f37785a = new ArrayBlockingQueue(16);

    /* JADX INFO: renamed from: b */
    public boolean f37786b;

    /* JADX INFO: renamed from: a */
    public final void m15097a() {
        execute(new kxw(this, 7));
    }

    @Override // java.util.concurrent.Executor
    public final void execute(Runnable runnable) {
        try {
            this.f37785a.put(runnable);
        } catch (InterruptedException e) {
            Log.w("BlockingEventLoop", "Interrupted while attempting to post event: Dropping event.");
        }
    }
}
