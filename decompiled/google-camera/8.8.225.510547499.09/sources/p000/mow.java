package p000;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
final class mow extends ThreadLocal {
    @Override // java.lang.ThreadLocal
    protected final /* bridge */ /* synthetic */ Object initialValue() {
        lij.m15455y();
        moy moyVar = new moy();
        Thread threadCurrentThread = Thread.currentThread();
        synchronized (moz.f41222a) {
            moz.f41222a.put(threadCurrentThread, moyVar);
        }
        return moyVar;
    }
}
