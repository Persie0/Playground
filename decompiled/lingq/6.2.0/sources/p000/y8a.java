package p000;

/* JADX INFO: loaded from: classes.dex */
public final class y8a {

    /* JADX INFO: renamed from: a */
    public final long f69483a;

    /* JADX INFO: renamed from: b */
    public final long f69484b;

    /* JADX INFO: renamed from: c */
    public final boolean f69485c;

    public y8a(long j, long j2, boolean z) {
        this.f69483a = j;
        this.f69484b = j2;
        this.f69485c = z;
    }

    /* JADX INFO: renamed from: a */
    public final y8a m24987a(y8a y8aVar) {
        return new y8a(gq6.m12825f(this.f69483a, y8aVar.f69483a), Math.max(this.f69484b, y8aVar.f69484b), this.f69485c || y8aVar.f69485c);
    }
}
