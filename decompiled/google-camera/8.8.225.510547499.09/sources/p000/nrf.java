package p000;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes2.dex */
public final class nrf {

    /* JADX INFO: renamed from: a */
    public static final nrf f44173a;

    /* JADX INFO: renamed from: b */
    public static final nrf f44174b;

    /* JADX INFO: renamed from: c */
    public static final nrf f44175c;

    /* JADX INFO: renamed from: d */
    public static final nrf f44176d;

    /* JADX INFO: renamed from: e */
    public static final nrf f44177e;

    /* JADX INFO: renamed from: f */
    public static final nrf f44178f;

    /* JADX INFO: renamed from: g */
    public static final nrf[] f44179g;

    /* JADX INFO: renamed from: h */
    public final int f44180h;

    /* JADX INFO: renamed from: i */
    private final String f44181i;

    static {
        nrf nrfVar = new nrf("kUnknown", -1);
        f44173a = nrfVar;
        nrf nrfVar2 = new nrf("kOff", 0);
        f44174b = nrfVar2;
        nrf nrfVar3 = new nrf("kAuto", 1);
        f44175c = nrfVar3;
        nrf nrfVar4 = new nrf("kUseSceneMode", 2);
        f44176d = nrfVar4;
        nrf nrfVar5 = new nrf("kOffKeepState", 3);
        f44177e = nrfVar5;
        nrf nrfVar6 = new nrf("kUseExtendedSceneMode", 4);
        f44178f = nrfVar6;
        f44179g = new nrf[]{nrfVar, nrfVar2, nrfVar3, nrfVar4, nrfVar5, nrfVar6};
    }

    private nrf(String str, int i) {
        this.f44181i = str;
        this.f44180h = i;
    }

    public final String toString() {
        return this.f44181i;
    }
}
