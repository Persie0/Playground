package p000;

import java.lang.ref.Reference;
import java.lang.ref.ReferenceQueue;
import java.util.List;
import java.util.concurrent.ConcurrentHashMap;

/* JADX INFO: loaded from: classes2.dex */
public final class z5c extends mdd {

    /* JADX INFO: renamed from: a */
    public final cdb f70959a = new cdb(11);

    @Override // p000.mdd
    /* JADX INFO: renamed from: c */
    public final void mo4332c(Exception exc) {
        exc.printStackTrace();
        cdb cdbVar = this.f70959a;
        ConcurrentHashMap concurrentHashMap = (ConcurrentHashMap) cdbVar.f9945b;
        ReferenceQueue referenceQueue = (ReferenceQueue) cdbVar.f9946c;
        for (Reference referencePoll = referenceQueue.poll(); referencePoll != null; referencePoll = referenceQueue.poll()) {
            concurrentHashMap.remove(referencePoll);
        }
        List<Throwable> list = (List) concurrentHashMap.get(new o5c(exc));
        if (list == null) {
            return;
        }
        synchronized (list) {
            try {
                for (Throwable th : list) {
                    System.err.print("Suppressed: ");
                    th.printStackTrace();
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }
}
