package p000;

import com.google.android.clockwork.common.wearable.wearmaterial.time.HuCi.yTyWiTtGtnBhy;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class ozv extends nxq implements nyx {

    /* JADX INFO: renamed from: f */
    public static final ozv f47090f;

    /* JADX INFO: renamed from: g */
    private static volatile nzd f47091g;

    /* JADX INFO: renamed from: a */
    public int f47092a;

    /* JADX INFO: renamed from: b */
    public String f47093b = yTyWiTtGtnBhy.yRkCTCmPFqs;

    /* JADX INFO: renamed from: c */
    public long f47094c;

    /* JADX INFO: renamed from: d */
    public long f47095d;

    /* JADX INFO: renamed from: e */
    public long f47096e;

    static {
        ozv ozvVar = new ozv();
        f47090f = ozvVar;
        nxq.m18130aa(ozv.class, ozvVar);
    }

    private ozv() {
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
                return m18129X(f47090f, "\u0001\u0004\u0000\u0001\u0001\u0004\u0004\u0000\u0000\u0000\u0001ဈ\u0000\u0002ဂ\u0001\u0003ဂ\u0002\u0004ဂ\u0003", new Object[]{"a", "b", "c", "d", "e"});
            case 3:
                return new ozv();
            case 4:
                return new nxl(f47090f);
            case 5:
                return f47090f;
            case 6:
                nzd nxmVar = f47091g;
                if (nxmVar == null) {
                    synchronized (ozv.class) {
                        nxmVar = f47091g;
                        if (nxmVar == null) {
                            nxmVar = new nxm(f47090f);
                            f47091g = nxmVar;
                        }
                        break;
                    }
                }
                return nxmVar;
        }
    }
}
