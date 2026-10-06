package p000;

import com.google.android.play.core.common.wMe.NptsKnlVczSZ;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class nuy extends nxq implements nyx {

    /* JADX INFO: renamed from: b */
    public static final nuy f44716b;

    /* JADX INFO: renamed from: d */
    private static volatile nzd f44717d;

    /* JADX INFO: renamed from: a */
    public nvi f44718a;

    /* JADX INFO: renamed from: c */
    private int f44719c;

    static {
        nuy nuyVar = new nuy();
        f44716b = nuyVar;
        nxq.m18130aa(nuy.class, nuyVar);
    }

    private nuy() {
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
                return m18129X(f44716b, "\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001ဉ\u0000", new Object[]{"c", NptsKnlVczSZ.GsdAiFolD});
            case 3:
                return new nuy();
            case 4:
                return new nxl(f44716b);
            case 5:
                return f44716b;
            case 6:
                nzd nxmVar = f44717d;
                if (nxmVar == null) {
                    synchronized (nuy.class) {
                        nxmVar = f44717d;
                        if (nxmVar == null) {
                            nxmVar = new nxm(f44716b);
                            f44717d = nxmVar;
                        }
                        break;
                    }
                }
                return nxmVar;
        }
    }
}
