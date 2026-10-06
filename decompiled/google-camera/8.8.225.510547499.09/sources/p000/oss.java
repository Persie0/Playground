package p000;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class oss {

    /* JADX INFO: renamed from: a */
    public static final ThreadLocal f46499a = new ThreadLocal();

    /* JADX INFO: renamed from: a */
    public static final orj m19021a() {
        ThreadLocal threadLocal = f46499a;
        orj orjVar = (orj) threadLocal.get();
        if (orjVar != null) {
            return orjVar;
        }
        opt optVar = new opt(Thread.currentThread());
        threadLocal.set(optVar);
        return optVar;
    }
}
