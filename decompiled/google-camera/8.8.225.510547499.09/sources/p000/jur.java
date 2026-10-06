package p000;

import android.os.Process;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class jur extends Thread {

    /* JADX INFO: renamed from: a */
    private final int f34852a;

    public jur(int i, Runnable runnable, String str) {
        super(runnable);
        this.f34852a = i;
        setName(str);
    }

    @Override // java.lang.Thread, java.lang.Runnable
    public final void run() {
        Process.setThreadPriority(this.f34852a);
        super.run();
    }
}
