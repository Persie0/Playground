package p000;

import java.util.concurrent.locks.ReentrantLock;

/* JADX INFO: renamed from: ww */
/* JADX INFO: loaded from: classes.dex */
public final class C3737ww extends Thread {
    @Override // java.lang.Thread, java.lang.Runnable
    public final void run() {
        while (true) {
            try {
                C3126ix c3126ix = C3774xw.f68871h;
                ReentrantLock reentrantLock = C3774xw.f68873j;
                reentrantLock.lock();
                try {
                    C3774xw c3774xwM21059c = s46.m21059c();
                    if (c3774xwM21059c == C3774xw.f68872i) {
                        C3774xw.f68872i = null;
                        reentrantLock.unlock();
                        return;
                    } else {
                        reentrantLock.unlock();
                        if (c3774xwM21059c != null) {
                            c3774xwM21059c.mo12998k();
                        }
                    }
                } catch (Throwable th) {
                    reentrantLock.unlock();
                    throw th;
                }
            } catch (InterruptedException unused) {
                continue;
            }
        }
    }
}
