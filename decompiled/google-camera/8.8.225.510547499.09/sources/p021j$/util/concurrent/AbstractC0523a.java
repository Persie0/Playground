package p021j$.util.concurrent;

/* JADX INFO: renamed from: j$.util.concurrent.a */
/* JADX INFO: loaded from: classes3.dex */
abstract class AbstractC0523a extends C0538p {

    /* JADX INFO: renamed from: i */
    final ConcurrentHashMap f33199i;

    /* JADX INFO: renamed from: j */
    C0533k f33200j;

    AbstractC0523a(C0533k[] c0533kArr, int i, int i2, ConcurrentHashMap concurrentHashMap) {
        super(c0533kArr, i, 0, i2);
        this.f33199i = concurrentHashMap;
        m12566a();
    }

    public final boolean hasMoreElements() {
        return this.f33220b != null;
    }

    public final boolean hasNext() {
        return this.f33220b != null;
    }

    public final void remove() {
        C0533k c0533k = this.f33200j;
        if (c0533k == null) {
            throw new IllegalStateException();
        }
        this.f33200j = null;
        this.f33199i.m12555h(c0533k.f33212b, null, null);
    }
}
