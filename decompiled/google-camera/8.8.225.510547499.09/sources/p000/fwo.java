package p000;

import java.util.HashSet;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;
import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.ReentrantLock;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class fwo extends kfv {

    /* JADX INFO: renamed from: a */
    public final ReentrantLock f23755a;

    /* JADX INFO: renamed from: b */
    public final Condition f23756b;

    /* JADX INFO: renamed from: c */
    public long f23757c;

    /* JADX INFO: renamed from: d */
    private final TreeMap f23758d;

    /* JADX INFO: renamed from: e */
    private long f23759e;

    /* JADX INFO: renamed from: f */
    private final Set f23760f;

    public fwo() {
        ReentrantLock reentrantLock = new ReentrantLock();
        this.f23755a = reentrantLock;
        this.f23756b = reentrantLock.newCondition();
        this.f23758d = new TreeMap();
        this.f23757c = -1L;
        this.f23759e = -1L;
        this.f23760f = new HashSet();
    }

    @Override // p000.kfv
    /* JADX INFO: renamed from: bn */
    public final void mo8901bn(kfd kfdVar) {
        this.f23755a.lock();
        try {
            long j = kfdVar.f35813d;
            if (this.f23757c < j) {
                this.f23757c = j;
                this.f23759e = kfdVar.f35811b;
                this.f23756b.signal();
                while (!this.f23758d.isEmpty() && ((Long) this.f23758d.firstKey()).longValue() >= this.f23757c) {
                    Map.Entry entryPollFirstEntry = this.f23758d.pollFirstEntry();
                    entryPollFirstEntry.getClass();
                    ((Runnable) entryPollFirstEntry.getValue()).run();
                }
                for (fwn fwnVar : this.f23760f) {
                    long j2 = this.f23757c;
                    long j3 = fwnVar.f23752a;
                    long j4 = fwnVar.f23753b;
                    if (j2 % 0 == 0) {
                        Runnable runnable = fwnVar.f23754c;
                        throw null;
                    }
                }
            }
            this.f23755a.unlock();
        } catch (Throwable th) {
            this.f23755a.unlock();
            throw th;
        }
    }

    /* JADX INFO: renamed from: i */
    public final long m8902i() {
        this.f23755a.lock();
        try {
            return this.f23757c;
        } finally {
            this.f23755a.unlock();
        }
    }

    /* JADX INFO: renamed from: j */
    public final long m8903j() {
        this.f23755a.lock();
        try {
            return this.f23759e;
        } finally {
            this.f23755a.unlock();
        }
    }
}
