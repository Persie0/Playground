package p021j$.util.concurrent;

/* JADX INFO: renamed from: j$.util.concurrent.v */
/* JADX INFO: loaded from: classes3.dex */
final class C0544v extends ThreadLocal {
    C0544v() {
    }

    @Override // java.lang.ThreadLocal
    protected final Object initialValue() {
        return new ThreadLocalRandom();
    }
}
