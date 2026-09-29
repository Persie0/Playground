package p000;

import java.util.concurrent.locks.ReentrantLock;

/* JADX INFO: loaded from: classes3.dex */
public final class m33 implements yd9 {

    /* JADX INFO: renamed from: a */
    public final qg4 f50505a;

    /* JADX INFO: renamed from: b */
    public long f50506b;

    /* JADX INFO: renamed from: c */
    public boolean f50507c;

    public m33(qg4 qg4Var, long j) {
        this.f50505a = qg4Var;
        this.f50506b = j;
    }

    @Override // p000.yd9
    /* JADX INFO: renamed from: F */
    public final long mo459F(aj0 aj0Var, long j) {
        long j2;
        long j3;
        int i;
        aj0Var.getClass();
        if (this.f50507c) {
            C3386nv.m17633t("closed");
            return 0L;
        }
        qg4 qg4Var = this.f50505a;
        long j4 = this.f50506b;
        if (j < 0) {
            C3386nv.m17624j(wq1.m24116l("byteCount < 0: ", j));
            return 0L;
        }
        long j5 = j + j4;
        long j6 = j4;
        while (true) {
            if (j6 < j5) {
                zt8 zt8VarM485i0 = aj0Var.m485i0(1);
                byte[] bArr = zt8VarM485i0.f72153a;
                int i2 = zt8VarM485i0.f72155c;
                j2 = -1;
                int iMin = (int) Math.min(j5 - j6, 8192 - i2);
                synchronized (qg4Var) {
                    bArr.getClass();
                    qg4Var.f57756e.seek(j6);
                    i = 0;
                    while (true) {
                        if (i < iMin) {
                            int i3 = qg4Var.f57756e.read(bArr, i2, iMin - i);
                            if (i3 != -1) {
                                i += i3;
                            } else if (i == 0) {
                                i = -1;
                                break;
                            }
                        }
                        break;
                    }
                }
                if (i == -1) {
                    if (zt8VarM485i0.f72154b == zt8VarM485i0.f72155c) {
                        aj0Var.f722a = zt8VarM485i0.m25776a();
                        cu8.m9897a(zt8VarM485i0);
                    }
                    if (j4 == j6) {
                        j3 = -1;
                        break;
                    }
                } else {
                    zt8VarM485i0.f72155c += i;
                    long j7 = i;
                    j6 += j7;
                    aj0Var.f723b += j7;
                }
            } else {
                j2 = -1;
            }
            j3 = j6 - j4;
            break;
        }
        if (j3 != j2) {
            this.f50506b += j3;
        }
        return j3;
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        qg4 qg4Var = this.f50505a;
        if (this.f50507c) {
            return;
        }
        this.f50507c = true;
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

    @Override // p000.yd9, p000.t89
    /* JADX INFO: renamed from: i */
    public final c1a mo484i() {
        return c1a.f9314d;
    }
}
