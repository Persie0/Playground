package p070db;

import android.content.Context;
import java.util.concurrent.locks.ReentrantLock;

/* JADX INFO: renamed from: db.n */
/* JADX INFO: loaded from: classes.dex */
public final class C5134n {

    /* JADX INFO: renamed from: b */
    public static C5134n f33117b;

    /* JADX INFO: renamed from: a */
    public final C5121a f33118a;

    public C5134n(Context context) {
        C5121a c5121aM10901a = C5121a.m10901a(context);
        this.f33118a = c5121aM10901a;
        c5121aM10901a.m10903b();
        c5121aM10901a.m10904c();
    }

    /* JADX INFO: renamed from: a */
    public static synchronized C5134n m10914a(Context context) {
        C5134n c5134n;
        try {
            Context applicationContext = context.getApplicationContext();
            synchronized (C5134n.class) {
                try {
                    c5134n = f33117b;
                    if (c5134n == null) {
                        c5134n = new C5134n(applicationContext);
                        f33117b = c5134n;
                    }
                } catch (Throwable th2) {
                    throw th2;
                }
            }
            return c5134n;
        } catch (Throwable th3) {
            throw th3;
        }
        return c5134n;
    }

    /* JADX WARN: Unreachable blocks removed: 1, instructions: 1 */
    /* JADX INFO: renamed from: b */
    public final synchronized void m10915b() {
        try {
            C5121a c5121a = this.f33118a;
            ReentrantLock reentrantLock = c5121a.f33106a;
            reentrantLock.lock();
            try {
                c5121a.f33107b.edit().clear().apply();
                reentrantLock.unlock();
            } catch (Throwable th2) {
                reentrantLock.unlock();
                throw th2;
            }
        } catch (Throwable th3) {
            throw th3;
        }
    }
}
