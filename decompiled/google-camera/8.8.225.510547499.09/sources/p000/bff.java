package p000;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class bff {

    /* JADX INFO: renamed from: a */
    public static final cvy f3083a = new cvy();

    /* JADX INFO: renamed from: b */
    private static bfe f3084b = null;

    /* JADX INFO: renamed from: a */
    public static bfd m2301a() {
        return new bfr();
    }

    /* JADX INFO: renamed from: b */
    public static void m2302b(bfd bfdVar) {
        if (!(bfdVar instanceof bfr)) {
            throw new UnsupportedOperationException("The serializing service works onlywith the XMPMeta implementation of this library");
        }
    }

    /* JADX INFO: renamed from: c */
    public static synchronized void m2303c() {
        if (f3084b == null) {
            try {
                f3084b = new bfe();
            } catch (Throwable th) {
                System.out.println(th);
            }
        }
    }
}
