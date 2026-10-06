package p000;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class nrz {

    /* JADX INFO: renamed from: a */
    public static final nrz f44325a;

    /* JADX INFO: renamed from: b */
    public static final nrz f44326b;

    /* JADX INFO: renamed from: c */
    public static final nrz f44327c;

    /* JADX INFO: renamed from: d */
    public static final nrz f44328d;

    /* JADX INFO: renamed from: e */
    public static final nrz[] f44329e;

    /* JADX INFO: renamed from: g */
    private static int f44330g;

    /* JADX INFO: renamed from: f */
    public final int f44331f;

    /* JADX INFO: renamed from: h */
    private final String f44332h;

    static {
        nrz nrzVar = new nrz("kRaw10", 0);
        f44325a = nrzVar;
        nrz nrzVar2 = new nrz("kRaw16", 2);
        f44326b = nrzVar2;
        nrz nrzVar3 = new nrz("kRawRgb16");
        f44327c = nrzVar3;
        nrz nrzVar4 = new nrz("kRawPlanar16");
        f44328d = nrzVar4;
        f44329e = new nrz[]{nrzVar, nrzVar2, nrzVar3, nrzVar4};
        f44330g = 0;
    }

    private nrz(String str) {
        this.f44332h = str;
        int i = f44330g;
        f44330g = i + 1;
        this.f44331f = i;
    }

    private nrz(String str, int i) {
        this.f44332h = str;
        this.f44331f = i;
        f44330g = i + 1;
    }

    public final String toString() {
        return this.f44332h;
    }
}
