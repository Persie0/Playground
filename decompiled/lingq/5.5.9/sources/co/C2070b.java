package co;

import dm.C5207g;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

/* JADX INFO: renamed from: co.b */
/* JADX INFO: loaded from: classes2.dex */
public class C2070b implements InterfaceC2075g {

    /* JADX INFO: renamed from: a */
    public final Lock f10522a;

    public /* synthetic */ C2070b(int i10) {
        this(new ReentrantLock());
    }

    public C2070b(Lock lock) {
        C5207g.m11111f(lock, "lock");
        this.f10522a = lock;
    }

    @Override // co.InterfaceC2075g
    public void lock() {
        this.f10522a.lock();
    }

    @Override // co.InterfaceC2075g
    public final void unlock() {
        this.f10522a.unlock();
    }
}
