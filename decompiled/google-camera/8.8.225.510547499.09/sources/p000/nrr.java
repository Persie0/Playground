package p000;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class nrr {

    /* JADX INFO: renamed from: a */
    public static final nrr f44280a;

    /* JADX INFO: renamed from: b */
    public static final nrr f44281b;

    /* JADX INFO: renamed from: c */
    public static final nrr f44282c;

    /* JADX INFO: renamed from: d */
    public static final nrr[] f44283d;

    /* JADX INFO: renamed from: e */
    public final int f44284e;

    /* JADX INFO: renamed from: f */
    private final String f44285f;

    static {
        nrr nrrVar = new nrr("kUnknown", -1);
        f44280a = nrrVar;
        nrr nrrVar2 = new nrr("kStationary", 0);
        f44281b = nrrVar2;
        nrr nrrVar3 = new nrr("kMoving", 1);
        f44282c = nrrVar3;
        f44283d = new nrr[]{nrrVar, nrrVar2, nrrVar3};
    }

    private nrr(String str, int i) {
        this.f44285f = str;
        this.f44284e = i;
    }

    public final String toString() {
        return this.f44285f;
    }
}
