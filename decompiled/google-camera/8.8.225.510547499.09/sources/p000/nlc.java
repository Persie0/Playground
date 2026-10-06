package p000;

import com.google.android.libraries.performance.primes.transmitter.clearcut.Hbk.BcwGDRhrTsnlj;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class nlc extends nxq implements nyx {

    /* JADX INFO: renamed from: f */
    public static final nlc f43448f;

    /* JADX INFO: renamed from: g */
    private static volatile nzd f43449g;

    /* JADX INFO: renamed from: a */
    public int f43450a;

    /* JADX INFO: renamed from: b */
    public float f43451b;

    /* JADX INFO: renamed from: c */
    public float f43452c;

    /* JADX INFO: renamed from: d */
    public float f43453d;

    /* JADX INFO: renamed from: e */
    public float f43454e;

    static {
        nlc nlcVar = new nlc();
        f43448f = nlcVar;
        nxq.m18130aa(nlc.class, nlcVar);
    }

    private nlc() {
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
                return m18129X(f43448f, "\u0001\u0004\u0000\u0001\u0001\u0004\u0004\u0000\u0000\u0000\u0001ခ\u0000\u0002ခ\u0001\u0003ခ\u0002\u0004ခ\u0003", new Object[]{"a", "b", "c", BcwGDRhrTsnlj.dTCYCva, "e"});
            case 3:
                return new nlc();
            case 4:
                return new nxl(f43448f);
            case 5:
                return f43448f;
            case 6:
                nzd nxmVar = f43449g;
                if (nxmVar == null) {
                    synchronized (nlc.class) {
                        nxmVar = f43449g;
                        if (nxmVar == null) {
                            nxmVar = new nxm(f43448f);
                            f43449g = nxmVar;
                        }
                        break;
                    }
                }
                return nxmVar;
        }
    }
}
