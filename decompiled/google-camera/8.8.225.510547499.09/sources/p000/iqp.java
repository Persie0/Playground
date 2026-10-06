package p000;

import com.google.android.gms.common.annotation.HJo.JrxsYuVZZqnFC;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class iqp extends nxq implements nyx {

    /* JADX INFO: renamed from: d */
    public static final iqp f31811d;

    /* JADX INFO: renamed from: e */
    private static volatile nzd f31812e;

    /* JADX INFO: renamed from: a */
    public float f31813a;

    /* JADX INFO: renamed from: b */
    public float f31814b;

    /* JADX INFO: renamed from: c */
    public float f31815c;

    static {
        iqp iqpVar = new iqp();
        f31811d = iqpVar;
        nxq.m18130aa(iqp.class, iqpVar);
    }

    private iqp() {
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
                return m18129X(f31811d, "\u0000\u0003\u0000\u0000\u0001\u0003\u0003\u0000\u0000\u0000\u0001\u0001\u0002\u0001\u0003\u0001", new Object[]{"a", "b", JrxsYuVZZqnFC.hXUIroKfkS});
            case 3:
                return new iqp();
            case 4:
                return new nxl(f31811d);
            case 5:
                return f31811d;
            case 6:
                nzd nxmVar = f31812e;
                if (nxmVar == null) {
                    synchronized (iqp.class) {
                        nxmVar = f31812e;
                        if (nxmVar == null) {
                            nxmVar = new nxm(f31811d);
                            f31812e = nxmVar;
                        }
                        break;
                    }
                }
                return nxmVar;
        }
    }
}
