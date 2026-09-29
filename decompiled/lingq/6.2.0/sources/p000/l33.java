package p000;

import java.util.concurrent.locks.ReentrantLock;

/* JADX INFO: loaded from: classes3.dex */
public final class l33 implements t89 {

    /* JADX INFO: renamed from: a */
    public final qg4 f48980a;

    /* JADX INFO: renamed from: b */
    public long f48981b;

    /* JADX INFO: renamed from: c */
    public boolean f48982c;

    public l33(qg4 qg4Var) {
        qg4Var.getClass();
        this.f48980a = qg4Var;
        this.f48981b = 0L;
    }

    @Override // p000.t89
    /* JADX INFO: renamed from: X */
    public final void mo471X(aj0 aj0Var, long j) {
        if (this.f48982c) {
            C3386nv.m17633t("closed");
            return;
        }
        qg4 qg4Var = this.f48980a;
        long j2 = this.f48981b;
        qg4Var.getClass();
        te1.m22001o(aj0Var.f723b, 0L, j);
        long j3 = j2 + j;
        while (j2 < j3) {
            zt8 zt8Var = aj0Var.f722a;
            zt8Var.getClass();
            int iMin = (int) Math.min(j3 - j2, zt8Var.f72155c - zt8Var.f72154b);
            byte[] bArr = zt8Var.f72153a;
            int i = zt8Var.f72154b;
            synchronized (qg4Var) {
                bArr.getClass();
                qg4Var.f57756e.seek(j2);
                qg4Var.f57756e.write(bArr, i, iMin);
            }
            int i2 = zt8Var.f72154b + iMin;
            zt8Var.f72154b = i2;
            long j4 = iMin;
            j2 += j4;
            aj0Var.f723b -= j4;
            if (i2 == zt8Var.f72155c) {
                aj0Var.f722a = zt8Var.m25776a();
                cu8.m9897a(zt8Var);
            }
        }
        this.f48981b += j;
    }

    @Override // p000.t89, java.lang.AutoCloseable, java.nio.channels.Channel
    public final void close() {
        qg4 qg4Var = this.f48980a;
        if (this.f48982c) {
            return;
        }
        this.f48982c = true;
        ReentrantLock reentrantLock = qg4Var.f57755d;
        reentrantLock.lock();
        try {
            int i = qg4Var.f57754c - 1;
            qg4Var.f57754c = i;
            if (i == 0 && qg4Var.f57753b) {
                reentrantLock.unlock();
                synchronized (qg4Var) {
                    qg4Var.f57756e.close();
                }
            }
        } finally {
            reentrantLock.unlock();
        }
    }

    @Override // p000.t89, java.io.Flushable
    public final void flush() {
        if (this.f48982c) {
            C3386nv.m17633t("closed");
            return;
        }
        qg4 qg4Var = this.f48980a;
        synchronized (qg4Var) {
            qg4Var.f57756e.getFD().sync();
        }
    }

    @Override // p000.t89
    /* JADX INFO: renamed from: i */
    public final c1a mo484i() {
        return c1a.f9314d;
    }
}
