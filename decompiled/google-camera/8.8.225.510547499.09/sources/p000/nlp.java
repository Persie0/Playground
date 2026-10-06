package p000;

import androidx.work.impl.workers.NHKG.pIeXJQLZLfgIN;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class nlp extends nxq implements nyx {

    /* JADX INFO: renamed from: f */
    public static final nlp f43563f;

    /* JADX INFO: renamed from: g */
    private static volatile nzd f43564g;

    /* JADX INFO: renamed from: a */
    public int f43565a;

    /* JADX INFO: renamed from: b */
    public long f43566b;

    /* JADX INFO: renamed from: c */
    public float f43567c;

    /* JADX INFO: renamed from: d */
    public float f43568d;

    /* JADX INFO: renamed from: e */
    public float f43569e;

    static {
        nlp nlpVar = new nlp();
        f43563f = nlpVar;
        nxq.m18130aa(nlp.class, nlpVar);
    }

    private nlp() {
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
                return m18129X(f43563f, "\u0001\u0004\u0000\u0001\u0001\u0004\u0004\u0000\u0000\u0000\u0001ဂ\u0000\u0002ခ\u0001\u0003ခ\u0002\u0004ခ\u0003", new Object[]{pIeXJQLZLfgIN.USLWYFHC, "b", "c", "d", "e"});
            case 3:
                return new nlp();
            case 4:
                return new nxl(f43563f);
            case 5:
                return f43563f;
            case 6:
                nzd nxmVar = f43564g;
                if (nxmVar == null) {
                    synchronized (nlp.class) {
                        nxmVar = f43564g;
                        if (nxmVar == null) {
                            nxmVar = new nxm(f43563f);
                            f43564g = nxmVar;
                        }
                        break;
                    }
                }
                return nxmVar;
        }
    }
}
