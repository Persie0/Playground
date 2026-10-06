package p000;

import com.google.android.libraries.performance.primes.transmitter.clearcut.Hbk.BcwGDRhrTsnlj;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class ozc extends nxq implements nyx {

    /* JADX INFO: renamed from: d */
    public static final ozc f46919d;

    /* JADX INFO: renamed from: e */
    private static volatile nzd f46920e;

    /* JADX INFO: renamed from: a */
    public int f46921a;

    /* JADX INFO: renamed from: b */
    public int f46922b;

    /* JADX INFO: renamed from: c */
    public ozd f46923c;

    static {
        ozc ozcVar = new ozc();
        f46919d = ozcVar;
        nxq.m18130aa(ozc.class, ozcVar);
    }

    private ozc() {
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
                return m18129X(f46919d, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001င\u0000\u0002ဉ\u0001", new Object[]{"a", BcwGDRhrTsnlj.vYIItJWXX, "c"});
            case 3:
                return new ozc();
            case 4:
                return new nxl(f46919d);
            case 5:
                return f46919d;
            case 6:
                nzd nxmVar = f46920e;
                if (nxmVar == null) {
                    synchronized (ozc.class) {
                        nxmVar = f46920e;
                        if (nxmVar == null) {
                            nxmVar = new nxm(f46919d);
                            f46920e = nxmVar;
                        }
                        break;
                    }
                }
                return nxmVar;
        }
    }
}
