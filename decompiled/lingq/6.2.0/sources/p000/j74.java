package p000;

import com.google.firebase.perf.util.Timer;
import java.io.IOException;
import java.io.InputStream;

/* JADX INFO: loaded from: classes.dex */
public final class j74 extends InputStream {

    /* JADX INFO: renamed from: a */
    public final InputStream f45141a;

    /* JADX INFO: renamed from: b */
    public final lk6 f45142b;

    /* JADX INFO: renamed from: c */
    public final Timer f45143c;

    /* JADX INFO: renamed from: e */
    public long f45145e;

    /* JADX INFO: renamed from: d */
    public long f45144d = -1;

    /* JADX INFO: renamed from: f */
    public long f45146f = -1;

    public j74(InputStream inputStream, lk6 lk6Var, Timer timer) {
        this.f45143c = timer;
        this.f45141a = inputStream;
        this.f45142b = lk6Var;
        this.f45145e = ((kk6) lk6Var.f49770d.f64019b).m15316O();
    }

    /* JADX INFO: renamed from: a */
    public final void m14318a(long j) {
        long j2 = this.f45144d;
        if (j2 == -1) {
            this.f45144d = j;
        } else {
            this.f45144d = j2 + j;
        }
    }

    @Override // java.io.InputStream
    public final int available() throws IOException {
        try {
            return this.f45141a.available();
        } catch (IOException e) {
            Timer timer = this.f45143c;
            lk6 lk6Var = this.f45142b;
            wq1.m24129y(timer, lk6Var, lk6Var);
            throw e;
        }
    }

    @Override // java.io.InputStream, java.io.Closeable, java.lang.AutoCloseable
    public final void close() throws IOException {
        lk6 lk6Var = this.f45142b;
        Timer timer = this.f45143c;
        long jM6742a = timer.m6742a();
        if (this.f45146f == -1) {
            this.f45146f = jM6742a;
        }
        try {
            this.f45141a.close();
            long j = this.f45144d;
            if (j != -1) {
                lk6Var.m16322h(j);
            }
            long j2 = this.f45145e;
            if (j2 != -1) {
                ik6 ik6Var = lk6Var.f49770d;
                ik6Var.m22767h();
                kk6.m15307z((kk6) ik6Var.f64019b, j2);
            }
            lk6Var.m16323i(this.f45146f);
            lk6Var.m16316b();
        } catch (IOException e) {
            wq1.m24129y(timer, lk6Var, lk6Var);
            throw e;
        }
    }

    @Override // java.io.InputStream
    public final void mark(int i) {
        this.f45141a.mark(i);
    }

    @Override // java.io.InputStream
    public final boolean markSupported() {
        return this.f45141a.markSupported();
    }

    @Override // java.io.InputStream
    public final int read() throws IOException {
        Timer timer = this.f45143c;
        lk6 lk6Var = this.f45142b;
        try {
            int i = this.f45141a.read();
            long jM6742a = timer.m6742a();
            if (this.f45145e == -1) {
                this.f45145e = jM6742a;
            }
            if (i != -1 || this.f45146f != -1) {
                m14318a(1L);
                lk6Var.m16322h(this.f45144d);
                return i;
            }
            this.f45146f = jM6742a;
            lk6Var.m16323i(jM6742a);
            lk6Var.m16316b();
            return i;
        } catch (IOException e) {
            wq1.m24129y(timer, lk6Var, lk6Var);
            throw e;
        }
    }

    @Override // java.io.InputStream
    public final void reset() throws IOException {
        try {
            this.f45141a.reset();
        } catch (IOException e) {
            Timer timer = this.f45143c;
            lk6 lk6Var = this.f45142b;
            wq1.m24129y(timer, lk6Var, lk6Var);
            throw e;
        }
    }

    @Override // java.io.InputStream
    public final long skip(long j) throws IOException {
        Timer timer = this.f45143c;
        lk6 lk6Var = this.f45142b;
        try {
            long jSkip = this.f45141a.skip(j);
            long jM6742a = timer.m6742a();
            if (this.f45145e == -1) {
                this.f45145e = jM6742a;
            }
            if (jSkip == 0 && j != 0 && this.f45146f == -1) {
                this.f45146f = jM6742a;
                lk6Var.m16323i(jM6742a);
                return jSkip;
            }
            m14318a(jSkip);
            lk6Var.m16322h(this.f45144d);
            return jSkip;
        } catch (IOException e) {
            wq1.m24129y(timer, lk6Var, lk6Var);
            throw e;
        }
    }

    @Override // java.io.InputStream
    public final int read(byte[] bArr, int i, int i2) throws IOException {
        Timer timer = this.f45143c;
        lk6 lk6Var = this.f45142b;
        try {
            int i3 = this.f45141a.read(bArr, i, i2);
            long jM6742a = timer.m6742a();
            if (this.f45145e == -1) {
                this.f45145e = jM6742a;
            }
            if (i3 == -1 && this.f45146f == -1) {
                this.f45146f = jM6742a;
                lk6Var.m16323i(jM6742a);
                lk6Var.m16316b();
                return i3;
            }
            m14318a(i3);
            lk6Var.m16322h(this.f45144d);
            return i3;
        } catch (IOException e) {
            wq1.m24129y(timer, lk6Var, lk6Var);
            throw e;
        }
    }

    @Override // java.io.InputStream
    public final int read(byte[] bArr) throws IOException {
        Timer timer = this.f45143c;
        lk6 lk6Var = this.f45142b;
        try {
            int i = this.f45141a.read(bArr);
            long jM6742a = timer.m6742a();
            if (this.f45145e == -1) {
                this.f45145e = jM6742a;
            }
            if (i == -1 && this.f45146f == -1) {
                this.f45146f = jM6742a;
                lk6Var.m16323i(jM6742a);
                lk6Var.m16316b();
                return i;
            }
            m14318a(i);
            lk6Var.m16322h(this.f45144d);
            return i;
        } catch (IOException e) {
            wq1.m24129y(timer, lk6Var, lk6Var);
            throw e;
        }
    }
}
