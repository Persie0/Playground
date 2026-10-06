package p000;

import com.google.android.gms.dynamite.p017ho.DNTdN;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class njx extends nxq implements nyx {

    /* JADX INFO: renamed from: g */
    public static final njx f43103g;

    /* JADX INFO: renamed from: h */
    private static volatile nzd f43104h;

    /* JADX INFO: renamed from: a */
    public int f43105a;

    /* JADX INFO: renamed from: c */
    public boolean f43107c;

    /* JADX INFO: renamed from: d */
    public int f43108d;

    /* JADX INFO: renamed from: f */
    public int f43110f;

    /* JADX INFO: renamed from: b */
    public String f43106b = "";

    /* JADX INFO: renamed from: e */
    public String f43109e = "";

    static {
        njx njxVar = new njx();
        f43103g = njxVar;
        nxq.m18130aa(njx.class, njxVar);
    }

    private njx() {
    }

    @Override // p000.nxq
    /* JADX INFO: renamed from: a */
    protected final Object mo3994a(int i, Object obj) {
        switch (i - 1) {
            case 0:
                return (byte) 1;
            case 1:
            default:
                return null;
            case 2:
                return m18129X(f43103g, "\u0001\u0005\u0000\u0001\u0001\u0005\u0005\u0000\u0000\u0000\u0001ဈ\u0000\u0002ဇ\u0001\u0003ဌ\u0002\u0004ဈ\u0003\u0005ဋ\u0004", new Object[]{"a", "b", DNTdN.lSr, "d", kva.f37304r, "e", "f"});
            case 3:
                return new njx();
            case 4:
                return new nxl(f43103g);
            case 5:
                return f43103g;
            case 6:
                nzd nxmVar = f43104h;
                if (nxmVar == null) {
                    synchronized (njx.class) {
                        nxmVar = f43104h;
                        if (nxmVar == null) {
                            nxmVar = new nxm(f43103g);
                            f43104h = nxmVar;
                        }
                        break;
                    }
                }
                return nxmVar;
        }
    }
}
