package p000;

import java.util.WeakHashMap;
import java.util.concurrent.locks.ReentrantReadWriteLock;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
final class oyh extends oxe {

    /* JADX INFO: renamed from: a */
    public static final oyh f46818a = new oyh();

    /* JADX INFO: renamed from: b */
    private static final ReentrantReadWriteLock f46819b = new ReentrantReadWriteLock();

    /* JADX INFO: renamed from: c */
    private static final WeakHashMap f46820c = new WeakHashMap();

    private oyh() {
    }

    @Override // p000.oxe
    /* JADX INFO: renamed from: a */
    public final oni mo19116a(Class cls) {
        cls.getClass();
        ReentrantReadWriteLock reentrantReadWriteLock = f46819b;
        ReentrantReadWriteLock.ReadLock lock = reentrantReadWriteLock.readLock();
        lock.lock();
        try {
            oni oniVar = (oni) f46820c.get(cls);
            lock.unlock();
            if (oniVar != null) {
                return oniVar;
            }
            ReentrantReadWriteLock.ReadLock lock2 = reentrantReadWriteLock.readLock();
            int i = 0;
            int readHoldCount = reentrantReadWriteLock.getWriteHoldCount() == 0 ? reentrantReadWriteLock.getReadHoldCount() : 0;
            for (int i2 = 0; i2 < readHoldCount; i2++) {
                lock2.unlock();
            }
            ReentrantReadWriteLock.WriteLock writeLock = reentrantReadWriteLock.writeLock();
            writeLock.lock();
            try {
                WeakHashMap weakHashMap = f46820c;
                oni oniVar2 = (oni) weakHashMap.get(cls);
                if (oniVar2 != null) {
                    while (i < readHoldCount) {
                        lock2.lock();
                        i++;
                    }
                    writeLock.unlock();
                    return oniVar2;
                }
                oni oniVarM19130a = oxh.m19130a(cls);
                weakHashMap.put(cls, oniVarM19130a);
                while (i < readHoldCount) {
                    lock2.lock();
                    i++;
                }
                writeLock.unlock();
                return oniVarM19130a;
            } catch (Throwable th) {
                while (i < readHoldCount) {
                    lock2.lock();
                    i++;
                }
                writeLock.unlock();
                throw th;
            }
        } catch (Throwable th2) {
            lock.unlock();
            throw th2;
        }
    }
}
