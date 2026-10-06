package p000;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class obr extends nxq implements nyx {

    /* JADX INFO: renamed from: b */
    public static final obr f45357b;

    /* JADX INFO: renamed from: d */
    private static volatile nzd f45358d;

    /* JADX INFO: renamed from: c */
    private byte f45360c = 2;

    /* JADX INFO: renamed from: a */
    public nxy f45359a = nzg.f45063b;

    static {
        obr obrVar = new obr();
        f45357b = obrVar;
        nxq.m18130aa(obr.class, obrVar);
    }

    private obr() {
    }

    @Override // p000.nxq
    /* JADX INFO: renamed from: a */
    protected final Object mo3994a(int i, Object obj) {
        switch (i - 1) {
            case 0:
                return Byte.valueOf(this.f45360c);
            case 1:
            default:
                this.f45360c = obj == null ? (byte) 0 : (byte) 1;
                return null;
            case 2:
                return m18129X(f45357b, "\u0001\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0001\u0001\u0001Л", new Object[]{"a", obq.class});
            case 3:
                return new obr();
            case 4:
                return new nxl(f45357b);
            case 5:
                return f45357b;
            case 6:
                nzd nxmVar = f45358d;
                if (nxmVar == null) {
                    synchronized (obr.class) {
                        nxmVar = f45358d;
                        if (nxmVar == null) {
                            nxmVar = new nxm(f45357b);
                            f45358d = nxmVar;
                        }
                        break;
                    }
                }
                return nxmVar;
        }
    }
}
