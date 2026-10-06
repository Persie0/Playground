package p000;

import com.google.android.libraries.lens.lenslite.dynamicloading.QSK.hIAHJKEnGsNbz;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes2.dex */
public final class ocw extends nxq implements nyx {

    /* JADX INFO: renamed from: a */
    public static final ocw f45552a;

    /* JADX INFO: renamed from: h */
    private static volatile nzd f45553h;

    /* JADX INFO: renamed from: b */
    private int f45554b;

    /* JADX INFO: renamed from: c */
    private int f45555c;

    /* JADX INFO: renamed from: d */
    private int f45556d;

    /* JADX INFO: renamed from: e */
    private int f45557e;

    /* JADX INFO: renamed from: f */
    private int f45558f;

    /* JADX INFO: renamed from: g */
    private byte f45559g = 2;

    static {
        ocw ocwVar = new ocw();
        f45552a = ocwVar;
        nxq.m18130aa(ocw.class, ocwVar);
    }

    private ocw() {
    }

    @Override // p000.nxq
    /* JADX INFO: renamed from: a */
    protected final Object mo3994a(int i, Object obj) {
        switch (i - 1) {
            case 0:
                return Byte.valueOf(this.f45559g);
            case 1:
            default:
                this.f45559g = obj == null ? (byte) 0 : (byte) 1;
                return null;
            case 2:
                return m18129X(f45552a, "\u0001\u0004\u0000\u0001\u0001\u0004\u0004\u0000\u0000\u0004\u0001ᔄ\u0000\u0002ᔄ\u0001\u0003ᔄ\u0002\u0004ᔄ\u0003", new Object[]{"b", "c", "d", "e", hIAHJKEnGsNbz.tvifzwjQXB});
            case 3:
                return new ocw();
            case 4:
                return new nxl(f45552a);
            case 5:
                return f45552a;
            case 6:
                nzd nxmVar = f45553h;
                if (nxmVar == null) {
                    synchronized (ocw.class) {
                        nxmVar = f45553h;
                        if (nxmVar == null) {
                            nxmVar = new nxm(f45552a);
                            f45553h = nxmVar;
                        }
                        break;
                    }
                }
                return nxmVar;
        }
    }
}
