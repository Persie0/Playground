package p000;

import java.io.IOException;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.ReentrantLock;

/* JADX INFO: renamed from: xw */
/* JADX INFO: loaded from: classes.dex */
public class C3774xw extends c1a {

    /* JADX INFO: renamed from: h */
    public static final C3126ix f68871h;

    /* JADX INFO: renamed from: i */
    public static C3774xw f68872i;

    /* JADX INFO: renamed from: j */
    public static final ReentrantLock f68873j;

    /* JADX INFO: renamed from: k */
    public static final Condition f68874k;

    /* JADX INFO: renamed from: l */
    public static final long f68875l;

    /* JADX INFO: renamed from: m */
    public static final long f68876m;

    /* JADX INFO: renamed from: e */
    public int f68877e;

    /* JADX INFO: renamed from: f */
    public int f68878f = -1;

    /* JADX INFO: renamed from: g */
    public long f68879g;

    static {
        C3126ix c3126ix = new C3126ix(9, (byte) 0);
        c3126ix.f44721c = new C3774xw[8];
        f68871h = c3126ix;
        ReentrantLock reentrantLock = new ReentrantLock();
        f68873j = reentrantLock;
        Condition conditionNewCondition = reentrantLock.newCondition();
        conditionNewCondition.getClass();
        f68874k = conditionNewCondition;
        f68875l = 60000L;
        f68876m = TimeUnit.MILLISECONDS.toNanos(60000L);
    }

    /* JADX INFO: renamed from: h */
    public final void m24714h() {
        long j = this.f9317c;
        boolean z = this.f9315a;
        if (j != 0 || z) {
            ReentrantLock reentrantLock = f68873j;
            reentrantLock.lock();
            try {
                if (this.f68877e != 0) {
                    throw new IllegalStateException("Unbalanced enter/exit");
                }
                this.f68877e = 1;
                s46.m21057a(this);
                reentrantLock.unlock();
            } catch (Throwable th) {
                reentrantLock.unlock();
                throw th;
            }
        }
    }

    /* JADX INFO: renamed from: i */
    public final boolean m24715i() {
        ReentrantLock reentrantLock = f68873j;
        reentrantLock.lock();
        try {
            int i = this.f68877e;
            this.f68877e = 0;
            if (i != 1) {
                return i == 2;
            }
            f68871h.m14176l(this);
            return false;
        } finally {
            reentrantLock.unlock();
        }
    }

    /* JADX INFO: renamed from: j */
    public IOException mo15138j(IOException iOException) {
        throw null;
    }

    /* JADX INFO: renamed from: k */
    public void mo12998k() {
    }
}
