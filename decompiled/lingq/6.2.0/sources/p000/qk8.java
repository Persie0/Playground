package p000;

import android.os.Process;

/* JADX INFO: loaded from: classes.dex */
public final class qk8 implements Runnable {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f57874a;

    /* JADX INFO: renamed from: b */
    public final Runnable f57875b;

    public /* synthetic */ qk8(Runnable runnable, int i) {
        this.f57874a = i;
        this.f57875b = runnable;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i = this.f57874a;
        Runnable runnable = this.f57875b;
        switch (i) {
            case 0:
                try {
                    runnable.run();
                } catch (Exception e) {
                    x74.m24359p("Executor", "Background execution failure.", e);
                    return;
                }
                break;
            case 1:
                runnable.run();
                break;
            default:
                Process.setThreadPriority(0);
                runnable.run();
                break;
        }
    }

    public String toString() {
        switch (this.f57874a) {
            case 1:
                return this.f57875b.toString();
            default:
                return super.toString();
        }
    }
}
