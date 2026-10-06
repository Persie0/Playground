package p000;

import com.google.android.libraries.social.licenses.GWO.HEePJw;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class pbu extends nxq implements nyx {

    /* JADX INFO: renamed from: b */
    public static final pbu f47356b;

    /* JADX INFO: renamed from: c */
    private static volatile nzd f47357c;

    /* JADX INFO: renamed from: a */
    public nxx f47358a = nyn.f45025b;

    static {
        pbu pbuVar = new pbu();
        f47356b = pbuVar;
        nxq.m18130aa(pbu.class, pbuVar);
    }

    private pbu() {
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
                return m18129X(f47356b, "\u0000\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0001\u0000\u0001%", new Object[]{HEePJw.YhLIBtmPwwi});
            case 3:
                return new pbu();
            case 4:
                return new nxl(f47356b);
            case 5:
                return f47356b;
            case 6:
                nzd nxmVar = f47357c;
                if (nxmVar == null) {
                    synchronized (pbu.class) {
                        nxmVar = f47357c;
                        if (nxmVar == null) {
                            nxmVar = new nxm(f47356b);
                            f47357c = nxmVar;
                        }
                        break;
                    }
                }
                return nxmVar;
        }
    }
}
