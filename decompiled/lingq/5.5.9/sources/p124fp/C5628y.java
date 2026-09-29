package p124fp;

import android.support.v4.media.session.C0166e;
import dm.C5207g;
import java.io.IOException;
import java.io.InterruptedIOException;
import java.util.concurrent.TimeUnit;

/* JADX INFO: renamed from: fp.y */
/* JADX INFO: loaded from: classes2.dex */
public class C5628y {

    /* JADX INFO: renamed from: d */
    public static final a f34474d = new a();

    /* JADX INFO: renamed from: a */
    public boolean f34475a;

    /* JADX INFO: renamed from: b */
    public long f34476b;

    /* JADX INFO: renamed from: c */
    public long f34477c;

    /* JADX INFO: renamed from: fp.y$a */
    public static final class a extends C5628y {
        @Override // p124fp.C5628y
        /* JADX INFO: renamed from: d */
        public final C5628y mo11983d(long j10) {
            return this;
        }

        @Override // p124fp.C5628y
        /* JADX INFO: renamed from: f */
        public final void mo11985f() {
        }

        @Override // p124fp.C5628y
        /* JADX INFO: renamed from: g */
        public final C5628y mo11986g(long j10, TimeUnit timeUnit) {
            C5207g.m11111f(timeUnit, "unit");
            return this;
        }
    }

    /* JADX INFO: renamed from: a */
    public C5628y mo11980a() {
        this.f34475a = false;
        return this;
    }

    /* JADX INFO: renamed from: b */
    public C5628y mo11981b() {
        this.f34477c = 0L;
        return this;
    }

    /* JADX WARN: Unreachable blocks removed: 1, instructions: 1 */
    /* JADX INFO: renamed from: c */
    public long mo11982c() {
        if (this.f34475a) {
            return this.f34476b;
        }
        throw new IllegalStateException("No deadline".toString());
    }

    /* JADX INFO: renamed from: d */
    public C5628y mo11983d(long j10) {
        this.f34475a = true;
        this.f34476b = j10;
        return this;
    }

    /* JADX INFO: renamed from: e */
    public boolean mo11984e() {
        return this.f34475a;
    }

    /* JADX WARN: Unreachable blocks removed: 1, instructions: 1 */
    /* JADX INFO: renamed from: f */
    public void mo11985f() throws IOException {
        if (Thread.currentThread().isInterrupted()) {
            throw new InterruptedIOException("interrupted");
        }
        if (this.f34475a && this.f34476b - System.nanoTime() <= 0) {
            throw new InterruptedIOException("deadline reached");
        }
    }

    /* JADX INFO: renamed from: g */
    public C5628y mo11986g(long j10, TimeUnit timeUnit) {
        C5207g.m11111f(timeUnit, "unit");
        if (!(j10 >= 0)) {
            throw new IllegalArgumentException(C0166e.m763i("timeout < 0: ", j10).toString());
        }
        this.f34477c = timeUnit.toNanos(j10);
        return this;
    }
}
