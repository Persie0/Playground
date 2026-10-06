package p000;

import androidx.work.impl.workers.NHKG.pIeXJQLZLfgIN;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes2.dex */
public final class ntl extends nxq implements nyx {

    /* JADX INFO: renamed from: d */
    public static final ntl f44490d;

    /* JADX INFO: renamed from: f */
    private static volatile nzd f44491f;

    /* JADX INFO: renamed from: a */
    public int f44492a = -1;

    /* JADX INFO: renamed from: b */
    public float f44493b = -1.0f;

    /* JADX INFO: renamed from: c */
    public float f44494c = -1.0f;

    /* JADX INFO: renamed from: e */
    private int f44495e;

    static {
        ntl ntlVar = new ntl();
        f44490d = ntlVar;
        nxq.m18130aa(ntl.class, ntlVar);
    }

    private ntl() {
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
                return m18129X(f44490d, "\u0001\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0000\u0001င\u0000\u0002ခ\u0001\u0003ခ\u0002", new Object[]{"e", pIeXJQLZLfgIN.WAY, "b", "c"});
            case 3:
                return new ntl();
            case 4:
                return new nxl(f44490d);
            case 5:
                return f44490d;
            case 6:
                nzd nxmVar = f44491f;
                if (nxmVar == null) {
                    synchronized (ntl.class) {
                        nxmVar = f44491f;
                        if (nxmVar == null) {
                            nxmVar = new nxm(f44490d);
                            f44491f = nxmVar;
                        }
                        break;
                    }
                }
                return nxmVar;
        }
    }
}
