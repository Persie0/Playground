package p000;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import java.util.concurrent.atomic.AtomicBoolean;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
final class kug extends BroadcastReceiver {

    /* JADX INFO: renamed from: a */
    final /* synthetic */ AtomicBoolean f37218a;

    /* JADX INFO: renamed from: b */
    final /* synthetic */ Runnable f37219b;

    /* JADX INFO: renamed from: c */
    final /* synthetic */ C1132xu f37220c;

    public kug(AtomicBoolean atomicBoolean, Runnable runnable, C1132xu c1132xu) {
        this.f37218a = atomicBoolean;
        this.f37219b = runnable;
        this.f37220c = c1132xu;
    }

    @Override // android.content.BroadcastReceiver
    public final void onReceive(Context context, Intent intent) {
        if (this.f37218a.compareAndSet(false, true)) {
            context.unregisterReceiver(this);
            this.f37219b.run();
            this.f37220c.m19591a(null);
        }
    }
}
