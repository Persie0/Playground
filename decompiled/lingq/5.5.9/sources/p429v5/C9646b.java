package p429v5;

import ae.C0062b;
import java.util.ArrayDeque;
import java.util.HashMap;
import java.util.concurrent.locks.ReentrantLock;

/* JADX INFO: renamed from: v5.b */
/* JADX INFO: loaded from: classes.dex */
public final class C9646b {

    /* JADX INFO: renamed from: a */
    public final HashMap f49420a = new HashMap();

    /* JADX INFO: renamed from: b */
    public final b f49421b = new b();

    /* JADX INFO: renamed from: v5.b$a */
    public static class a {

        /* JADX INFO: renamed from: a */
        public final ReentrantLock f49422a = new ReentrantLock();

        /* JADX INFO: renamed from: b */
        public int f49423b;
    }

    /* JADX INFO: renamed from: v5.b$b */
    public static class b {

        /* JADX INFO: renamed from: a */
        public final ArrayDeque f49424a = new ArrayDeque();
    }

    /* JADX WARN: Unreachable blocks removed: 2, instructions: 2 */
    /* JADX INFO: renamed from: a */
    public final void m18115a(String str) {
        a aVar;
        synchronized (this) {
            Object obj = this.f49420a.get(str);
            C0062b.m345f0(obj);
            aVar = (a) obj;
            int i10 = aVar.f49423b;
            if (i10 < 1) {
                throw new IllegalStateException("Cannot release a lock that is not held, safeKey: " + str + ", interestedThreads: " + aVar.f49423b);
            }
            int i11 = i10 - 1;
            aVar.f49423b = i11;
            if (i11 == 0) {
                a aVar2 = (a) this.f49420a.remove(str);
                if (!aVar2.equals(aVar)) {
                    throw new IllegalStateException("Removed the wrong lock, expected to remove: " + aVar + ", but actually removed: " + aVar2 + ", safeKey: " + str);
                }
                b bVar = this.f49421b;
                synchronized (bVar.f49424a) {
                    try {
                        if (bVar.f49424a.size() < 10) {
                            bVar.f49424a.offer(aVar2);
                        }
                    } catch (Throwable th2) {
                        throw th2;
                    }
                }
            }
        }
        aVar.f49422a.unlock();
    }
}
