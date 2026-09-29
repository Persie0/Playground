package p000;

import java.util.ArrayDeque;
import java.util.Deque;

/* JADX INFO: loaded from: classes2.dex */
public final class xx8 implements Runnable {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f68928a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ Runnable f68929b;

    public /* synthetic */ xx8(Runnable runnable, int i) {
        this.f68928a = i;
        this.f68929b = runnable;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i = this.f68928a;
        Runnable runnable = this.f68929b;
        switch (i) {
            case 0:
                runnable.run();
                break;
            case 1:
                Deque deque = (Deque) h06.f41613b.get();
                lda.m16130p(deque);
                deque.add(runnable);
                if (deque.size() <= 1) {
                    do {
                        runnable.run();
                        deque.removeFirst();
                        runnable = (Runnable) deque.peekFirst();
                    } while (runnable != null);
                }
                break;
            default:
                h06.f41613b.set(new ArrayDeque());
                runnable.run();
                break;
        }
    }

    public String toString() {
        switch (this.f68928a) {
            case 0:
                return this.f68929b.toString();
            default:
                return super.toString();
        }
    }
}
