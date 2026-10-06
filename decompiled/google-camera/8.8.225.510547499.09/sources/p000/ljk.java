package p000;

import java.util.concurrent.TimeUnit;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class ljk {

    /* JADX INFO: renamed from: a */
    static final long f38392a = TimeUnit.MINUTES.toMillis(1);

    /* JADX INFO: renamed from: d */
    private final msd f38395d;

    /* JADX INFO: renamed from: e */
    private volatile Process f38396e;

    /* JADX INFO: renamed from: c */
    public volatile boolean f38394c = false;

    /* JADX INFO: renamed from: b */
    public final mrf f38393b = new hgv(this, 20);

    public ljk(msn msnVar) {
        this.f38395d = msd.m16856c(msnVar);
    }

    /* JADX INFO: renamed from: a */
    public final void m15540a(String str) {
        if (str.isEmpty()) {
            return;
        }
        if (this.f38396e != null) {
            try {
                if (this.f38396e.exitValue() != 0) {
                    this.f38394c = true;
                    this.f38396e = null;
                }
            } catch (IllegalThreadStateException e) {
                return;
            }
        }
        if (this.f38394c) {
            return;
        }
        synchronized (this) {
            msd msdVar = this.f38395d;
            if (msdVar.f41535a && msdVar.m16857a(TimeUnit.MILLISECONDS) < f38392a) {
                return;
            }
            this.f38395d.m16859d();
            this.f38395d.m16860e();
            this.f38396e = (Process) this.f38393b.apply(str);
        }
    }
}
