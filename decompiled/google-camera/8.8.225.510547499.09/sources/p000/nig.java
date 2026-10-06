package p000;

import com.google.android.gms.common.annotation.HJo.JrxsYuVZZqnFC;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class nig extends nxq implements nyx {

    /* JADX INFO: renamed from: f */
    public static final nig f42686f;

    /* JADX INFO: renamed from: g */
    private static volatile nzd f42687g;

    /* JADX INFO: renamed from: a */
    public int f42688a;

    /* JADX INFO: renamed from: b */
    public boolean f42689b;

    /* JADX INFO: renamed from: c */
    public float f42690c;

    /* JADX INFO: renamed from: d */
    public int f42691d;

    /* JADX INFO: renamed from: e */
    public int f42692e;

    static {
        nig nigVar = new nig();
        f42686f = nigVar;
        nxq.m18130aa(nig.class, nigVar);
    }

    private nig() {
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
                return m18129X(f42686f, "\u0001\u0004\u0000\u0001\u0001\u0005\u0004\u0000\u0000\u0000\u0001ဇ\u0000\u0002ခ\u0001\u0003ဌ\u0002\u0005ဌ\u0003", new Object[]{"a", "b", "c", "d", nks.f43293a, JrxsYuVZZqnFC.cSsFKMg, nhr.f42522k});
            case 3:
                return new nig();
            case 4:
                return new nxl(f42686f);
            case 5:
                return f42686f;
            case 6:
                nzd nxmVar = f42687g;
                if (nxmVar == null) {
                    synchronized (nig.class) {
                        nxmVar = f42687g;
                        if (nxmVar == null) {
                            nxmVar = new nxm(f42686f);
                            f42687g = nxmVar;
                        }
                        break;
                    }
                }
                return nxmVar;
        }
    }
}
