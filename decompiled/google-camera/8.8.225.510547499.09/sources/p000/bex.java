package p000;

import android.os.Handler;
import java.util.concurrent.Executor;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class bex implements Executor {

    /* JADX INFO: renamed from: a */
    final /* synthetic */ C1058va f3073a;

    public bex(C1058va c1058va, byte[] bArr) {
        this.f3073a = c1058va;
    }

    @Override // java.util.concurrent.Executor
    public final void execute(Runnable runnable) {
        ((Handler) this.f3073a.f47804c).post(runnable);
    }
}
