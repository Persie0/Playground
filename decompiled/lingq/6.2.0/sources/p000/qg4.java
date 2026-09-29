package p000;

import java.io.Closeable;
import java.io.RandomAccessFile;
import java.util.concurrent.locks.ReentrantLock;

/* JADX INFO: loaded from: classes.dex */
public final class qg4 implements Closeable {

    /* JADX INFO: renamed from: a */
    public final boolean f57752a;

    /* JADX INFO: renamed from: b */
    public boolean f57753b;

    /* JADX INFO: renamed from: c */
    public int f57754c;

    /* JADX INFO: renamed from: d */
    public final ReentrantLock f57755d = new ReentrantLock();

    /* JADX INFO: renamed from: e */
    public final RandomAccessFile f57756e;

    public qg4(boolean z, RandomAccessFile randomAccessFile) {
        this.f57752a = z;
        this.f57756e = randomAccessFile;
    }

    /* JADX INFO: renamed from: a */
    public static l33 m19947a(qg4 qg4Var) {
        if (!qg4Var.f57752a) {
            C3386nv.m17633t("file handle is read-only");
            return null;
        }
        ReentrantLock reentrantLock = qg4Var.f57755d;
        reentrantLock.lock();
        try {
            if (qg4Var.f57753b) {
                throw new IllegalStateException("closed");
            }
            qg4Var.f57754c++;
            reentrantLock.unlock();
            return new l33(qg4Var);
        } catch (Throwable th) {
            reentrantLock.unlock();
            throw th;
        }
    }

    /* JADX INFO: renamed from: b */
    public final m33 m19948b(long j) {
        ReentrantLock reentrantLock = this.f57755d;
        reentrantLock.lock();
        try {
            if (this.f57753b) {
                throw new IllegalStateException("closed");
            }
            this.f57754c++;
            reentrantLock.unlock();
            return new m33(this, j);
        } catch (Throwable th) {
            reentrantLock.unlock();
            throw th;
        }
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        ReentrantLock reentrantLock = this.f57755d;
        reentrantLock.lock();
        try {
            if (this.f57753b) {
                reentrantLock.unlock();
                return;
            }
            this.f57753b = true;
            if (this.f57754c != 0) {
                reentrantLock.unlock();
                return;
            }
            reentrantLock.unlock();
            synchronized (this) {
                this.f57756e.close();
            }
        } catch (Throwable th) {
            reentrantLock.unlock();
            throw th;
        }
    }

    public final void flush() {
        if (!this.f57752a) {
            C3386nv.m17633t("file handle is read-only");
            return;
        }
        ReentrantLock reentrantLock = this.f57755d;
        reentrantLock.lock();
        try {
            if (this.f57753b) {
                throw new IllegalStateException("closed");
            }
            reentrantLock.unlock();
            synchronized (this) {
                this.f57756e.getFD().sync();
            }
        } catch (Throwable th) {
            reentrantLock.unlock();
            throw th;
        }
    }

    public final long size() {
        long length;
        ReentrantLock reentrantLock = this.f57755d;
        reentrantLock.lock();
        try {
            if (this.f57753b) {
                throw new IllegalStateException("closed");
            }
            reentrantLock.unlock();
            synchronized (this) {
                length = this.f57756e.length();
            }
            return length;
        } catch (Throwable th) {
            reentrantLock.unlock();
            throw th;
        }
    }
}
