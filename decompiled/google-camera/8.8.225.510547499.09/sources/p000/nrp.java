package p000;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class nrp {

    /* JADX INFO: renamed from: a */
    public static final nrp f44267a;

    /* JADX INFO: renamed from: b */
    public static final nrp f44268b;

    /* JADX INFO: renamed from: c */
    public static final nrp f44269c;

    /* JADX INFO: renamed from: d */
    public static final nrp f44270d;

    /* JADX INFO: renamed from: e */
    public static final nrp[] f44271e;

    /* JADX INFO: renamed from: f */
    public final int f44272f;

    /* JADX INFO: renamed from: g */
    private final String f44273g;

    static {
        nrp nrpVar = new nrp("kUnknown", -1);
        f44267a = nrpVar;
        nrp nrpVar2 = new nrp("kFront", 0);
        f44268b = nrpVar2;
        nrp nrpVar3 = new nrp("kBack", 1);
        f44269c = nrpVar3;
        nrp nrpVar4 = new nrp("kExternal", 2);
        f44270d = nrpVar4;
        f44271e = new nrp[]{nrpVar, nrpVar2, nrpVar3, nrpVar4};
    }

    private nrp(String str, int i) {
        this.f44273g = str;
        this.f44272f = i;
    }

    public final String toString() {
        return this.f44273g;
    }
}
