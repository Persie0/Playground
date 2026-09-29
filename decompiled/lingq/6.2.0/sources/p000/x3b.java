package p000;

/* JADX INFO: loaded from: classes2.dex */
public final class x3b implements Comparable {

    /* JADX INFO: renamed from: a */
    public final int f67733a;

    /* JADX INFO: renamed from: b */
    public final t3b f67734b;

    public x3b(int i, t3b t3bVar) {
        this.f67733a = i;
        this.f67734b = t3bVar;
    }

    @Override // java.lang.Comparable
    public final int compareTo(Object obj) {
        return Integer.compare(this.f67733a, ((x3b) obj).f67733a);
    }
}
