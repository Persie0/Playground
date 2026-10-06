package p000;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class nrq {

    /* JADX INFO: renamed from: a */
    public static final nrq f44274a;

    /* JADX INFO: renamed from: b */
    public static final nrq f44275b;

    /* JADX INFO: renamed from: c */
    public static final nrq f44276c;

    /* JADX INFO: renamed from: d */
    public static final nrq[] f44277d;

    /* JADX INFO: renamed from: e */
    public final int f44278e;

    /* JADX INFO: renamed from: f */
    private final String f44279f;

    static {
        nrq nrqVar = new nrq("kUnknown", -1);
        f44274a = nrqVar;
        nrq nrqVar2 = new nrq("kOff", 0);
        f44275b = nrqVar2;
        nrq nrqVar3 = new nrq("kOn", 1);
        f44276c = nrqVar3;
        f44277d = new nrq[]{nrqVar, nrqVar2, nrqVar3};
    }

    private nrq(String str, int i) {
        this.f44279f = str;
        this.f44278e = i;
    }

    public final String toString() {
        return this.f44279f;
    }
}
