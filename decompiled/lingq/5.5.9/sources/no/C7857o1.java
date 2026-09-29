package no;

/* JADX INFO: renamed from: no.o1 */
/* JADX INFO: loaded from: classes2.dex */
public final class C7857o1 {

    /* JADX INFO: renamed from: a */
    public static final ThreadLocal<AbstractC7847l0> f42954a = new ThreadLocal<>();

    /* JADX INFO: renamed from: a */
    public static AbstractC7847l0 m15607a() {
        ThreadLocal<AbstractC7847l0> threadLocal = f42954a;
        AbstractC7847l0 c7825e = threadLocal.get();
        if (c7825e == null) {
            c7825e = new C7825e(Thread.currentThread());
            threadLocal.set(c7825e);
        }
        return c7825e;
    }
}
