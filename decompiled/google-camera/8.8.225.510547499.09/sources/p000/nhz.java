package p000;

import com.google.android.libraries.social.licenses.GWO.HEePJw;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class nhz extends nxq implements nyx {

    /* JADX INFO: renamed from: f */
    public static final nhz f42626f;

    /* JADX INFO: renamed from: g */
    private static volatile nzd f42627g;

    /* JADX INFO: renamed from: a */
    public int f42628a;

    /* JADX INFO: renamed from: b */
    public nhm f42629b;

    /* JADX INFO: renamed from: c */
    public long f42630c;

    /* JADX INFO: renamed from: d */
    public long f42631d;

    /* JADX INFO: renamed from: e */
    public nif f42632e;

    static {
        nhz nhzVar = new nhz();
        f42626f = nhzVar;
        nxq.m18130aa(nhz.class, nhzVar);
    }

    private nhz() {
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
                return m18129X(f42626f, "\u0001\u0004\u0000\u0001\u0001\u0004\u0004\u0000\u0000\u0000\u0001ဉ\u0000\u0002ဂ\u0001\u0003ဂ\u0002\u0004ဉ\u0003", new Object[]{HEePJw.mxoRpgxEWsjDQ, "b", "c", "d", "e"});
            case 3:
                return new nhz();
            case 4:
                return new nxl(f42626f);
            case 5:
                return f42626f;
            case 6:
                nzd nxmVar = f42627g;
                if (nxmVar == null) {
                    synchronized (nhz.class) {
                        nxmVar = f42627g;
                        if (nxmVar == null) {
                            nxmVar = new nxm(f42626f);
                            f42627g = nxmVar;
                        }
                        break;
                    }
                }
                return nxmVar;
        }
    }
}
