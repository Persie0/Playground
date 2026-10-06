package p000;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class nxp implements Comparable {

    /* JADX INFO: renamed from: a */
    public final int f44977a;

    /* JADX INFO: renamed from: b */
    public final oaj f44978b;

    public nxp(int i, oaj oajVar) {
        this.f44977a = i;
        this.f44978b = oajVar;
    }

    /* JADX INFO: renamed from: a */
    public final oak m18122a() {
        return this.f44978b.f45150s;
    }

    @Override // java.lang.Comparable
    public final /* bridge */ /* synthetic */ int compareTo(Object obj) {
        return this.f44977a - ((nxp) obj).f44977a;
    }
}
