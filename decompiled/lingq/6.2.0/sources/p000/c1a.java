package p000;

import java.io.InterruptedIOException;
import java.util.concurrent.TimeUnit;

/* JADX INFO: loaded from: classes.dex */
public class c1a {

    /* JADX INFO: renamed from: d */
    public static final b1a f9314d = new b1a();

    /* JADX INFO: renamed from: a */
    public boolean f9315a;

    /* JADX INFO: renamed from: b */
    public long f9316b;

    /* JADX INFO: renamed from: c */
    public long f9317c;

    /* JADX INFO: renamed from: a */
    public c1a mo4281a() {
        this.f9315a = false;
        return this;
    }

    /* JADX INFO: renamed from: b */
    public c1a mo4282b() {
        this.f9317c = 0L;
        return this;
    }

    /* JADX INFO: renamed from: c */
    public long mo4283c() {
        if (this.f9315a) {
            return this.f9316b;
        }
        C3386nv.m17633t("No deadline");
        return 0L;
    }

    /* JADX INFO: renamed from: d */
    public c1a mo3171d(long j) {
        this.f9315a = true;
        this.f9316b = j;
        return this;
    }

    /* JADX INFO: renamed from: e */
    public boolean mo4284e() {
        return this.f9315a;
    }

    /* JADX INFO: renamed from: f */
    public void mo3172f() throws InterruptedIOException {
        if (Thread.currentThread().isInterrupted()) {
            throw new InterruptedIOException("interrupted");
        }
        if (this.f9315a && this.f9316b - System.nanoTime() <= 0) {
            throw new InterruptedIOException("deadline reached");
        }
    }

    /* JADX INFO: renamed from: g */
    public c1a mo3173g(long j) {
        TimeUnit timeUnit = TimeUnit.MILLISECONDS;
        timeUnit.getClass();
        if (j >= 0) {
            this.f9317c = timeUnit.toNanos(j);
            return this;
        }
        C3386nv.m17624j(wq1.m24116l("timeout < 0: ", j));
        return null;
    }
}
