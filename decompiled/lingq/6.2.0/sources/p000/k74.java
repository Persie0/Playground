package p000;

import com.google.firebase.perf.util.Timer;
import java.io.IOException;
import java.io.OutputStream;

/* JADX INFO: loaded from: classes.dex */
public final class k74 extends OutputStream {

    /* JADX INFO: renamed from: a */
    public final OutputStream f46809a;

    /* JADX INFO: renamed from: b */
    public final Timer f46810b;

    /* JADX INFO: renamed from: c */
    public final lk6 f46811c;

    /* JADX INFO: renamed from: d */
    public long f46812d = -1;

    public k74(OutputStream outputStream, lk6 lk6Var, Timer timer) {
        this.f46809a = outputStream;
        this.f46811c = lk6Var;
        this.f46810b = timer;
    }

    @Override // java.io.OutputStream, java.io.Closeable, java.lang.AutoCloseable
    public final void close() throws IOException {
        long j = this.f46812d;
        lk6 lk6Var = this.f46811c;
        if (j != -1) {
            lk6Var.m16319e(j);
        }
        Timer timer = this.f46810b;
        long jM6742a = timer.m6742a();
        ik6 ik6Var = lk6Var.f49770d;
        ik6Var.m22767h();
        kk6.m15306y((kk6) ik6Var.f64019b, jM6742a);
        try {
            this.f46809a.close();
        } catch (IOException e) {
            wq1.m24129y(timer, lk6Var, lk6Var);
            throw e;
        }
    }

    @Override // java.io.OutputStream, java.io.Flushable
    public final void flush() throws IOException {
        try {
            this.f46809a.flush();
        } catch (IOException e) {
            Timer timer = this.f46810b;
            lk6 lk6Var = this.f46811c;
            wq1.m24129y(timer, lk6Var, lk6Var);
            throw e;
        }
    }

    @Override // java.io.OutputStream
    public final void write(int i) throws IOException {
        lk6 lk6Var = this.f46811c;
        try {
            this.f46809a.write(i);
            long j = this.f46812d + 1;
            this.f46812d = j;
            lk6Var.m16319e(j);
        } catch (IOException e) {
            wq1.m24129y(this.f46810b, lk6Var, lk6Var);
            throw e;
        }
    }

    @Override // java.io.OutputStream
    public final void write(byte[] bArr) throws IOException {
        lk6 lk6Var = this.f46811c;
        try {
            this.f46809a.write(bArr);
            long length = this.f46812d + ((long) bArr.length);
            this.f46812d = length;
            lk6Var.m16319e(length);
        } catch (IOException e) {
            wq1.m24129y(this.f46810b, lk6Var, lk6Var);
            throw e;
        }
    }

    @Override // java.io.OutputStream
    public final void write(byte[] bArr, int i, int i2) throws IOException {
        lk6 lk6Var = this.f46811c;
        try {
            this.f46809a.write(bArr, i, i2);
            long j = this.f46812d + ((long) i2);
            this.f46812d = j;
            lk6Var.m16319e(j);
        } catch (IOException e) {
            wq1.m24129y(this.f46810b, lk6Var, lk6Var);
            throw e;
        }
    }
}
