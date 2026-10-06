package p000;

import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.ReentrantLock;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public class gqi {

    /* JADX INFO: renamed from: a */
    private int f26063a;

    /* JADX INFO: renamed from: b */
    private final ReentrantLock f26064b;

    /* JADX INFO: renamed from: c */
    private final Condition f26065c;

    public gqi() {
        ReentrantLock reentrantLock = new ReentrantLock();
        this.f26064b = reentrantLock;
        this.f26063a = 0;
        this.f26065c = reentrantLock.newCondition();
    }

    /* JADX INFO: renamed from: a */
    public final int m9637a(int i) {
        this.f26064b.lock();
        try {
            int i2 = this.f26063a + i;
            this.f26063a = i2;
            return i2;
        } finally {
            this.f26064b.unlock();
        }
    }

    /* JADX INFO: renamed from: b */
    public final int m9638b() {
        this.f26064b.lock();
        int i = this.f26063a;
        this.f26064b.unlock();
        return i;
    }

    /* JADX INFO: renamed from: c */
    public final void m9639c() {
        this.f26064b.lock();
        while (this.f26063a != 0) {
            try {
                try {
                    this.f26065c.await();
                } catch (InterruptedException e) {
                    throw e;
                }
            } catch (Throwable th) {
                this.f26064b.unlock();
                throw th;
            }
        }
        this.f26064b.unlock();
    }

    /* JADX INFO: renamed from: d */
    public final void m9640d() {
        this.f26064b.lock();
        this.f26065c.signal();
        this.f26064b.unlock();
    }

    /* JADX INFO: renamed from: e */
    public final void m9641e(int i) {
        this.f26064b.lock();
        this.f26063a = i;
        this.f26064b.unlock();
    }
}
