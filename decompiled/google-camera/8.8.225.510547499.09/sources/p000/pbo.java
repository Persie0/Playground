package p000;

import com.google.android.libraries.performance.primes.transmitter.clearcut.Hbk.BcwGDRhrTsnlj;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class pbo extends nxq implements nyx {

    /* JADX INFO: renamed from: b */
    public static final pbo f47339b;

    /* JADX INFO: renamed from: c */
    private static volatile nzd f47340c;

    /* JADX INFO: renamed from: a */
    public nxy f47341a = nzg.f45063b;

    static {
        pbo pboVar = new pbo();
        f47339b = pboVar;
        nxq.m18130aa(pbo.class, pboVar);
    }

    private pbo() {
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
                return m18129X(f47339b, "\u0000\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0001\u0000\u0001\u001c", new Object[]{BcwGDRhrTsnlj.tVKhGKFSxjQDElr});
            case 3:
                return new pbo();
            case 4:
                return new nxl(f47339b);
            case 5:
                return f47339b;
            case 6:
                nzd nxmVar = f47340c;
                if (nxmVar == null) {
                    synchronized (pbo.class) {
                        nxmVar = f47340c;
                        if (nxmVar == null) {
                            nxmVar = new nxm(f47339b);
                            f47340c = nxmVar;
                        }
                        break;
                    }
                }
                return nxmVar;
        }
    }
}
