package p021j$.util.stream;

/* JADX INFO: renamed from: j$.util.stream.e */
/* JADX INFO: loaded from: classes3.dex */
abstract class AbstractC0661e {

    /* JADX INFO: renamed from: a */
    protected int f33403a;

    /* JADX INFO: renamed from: b */
    protected int f33404b;

    /* JADX INFO: renamed from: c */
    protected long[] f33405c;

    protected AbstractC0661e() {
    }

    public abstract void clear();

    public final long count() {
        int i = this.f33404b;
        return i == 0 ? this.f33403a : this.f33405c[i] + ((long) this.f33403a);
    }
}
