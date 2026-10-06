package p000;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class ozr extends nxq implements nyx {

    /* JADX INFO: renamed from: b */
    public static final ozr f47067b;

    /* JADX INFO: renamed from: d */
    private static volatile nzd f47068d;

    /* JADX INFO: renamed from: c */
    private byte f47070c = 2;

    /* JADX INFO: renamed from: a */
    public nxy f47069a = nzg.f45063b;

    static {
        ozr ozrVar = new ozr();
        f47067b = ozrVar;
        nxq.m18130aa(ozr.class, ozrVar);
    }

    private ozr() {
    }

    @Override // p000.nxq
    /* JADX INFO: renamed from: a */
    protected final Object mo3994a(int i, Object obj) {
        switch (i - 1) {
            case 0:
                return Byte.valueOf(this.f47070c);
            case 1:
            default:
                this.f47070c = obj == null ? (byte) 0 : (byte) 1;
                return null;
            case 2:
                return m18129X(f47067b, "\u0001\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0001\u0001\u0001Л", new Object[]{"a", ozq.class});
            case 3:
                return new ozr();
            case 4:
                return new nxl(f47067b);
            case 5:
                return f47067b;
            case 6:
                nzd nxmVar = f47068d;
                if (nxmVar == null) {
                    synchronized (ozr.class) {
                        nxmVar = f47068d;
                        if (nxmVar == null) {
                            nxmVar = new nxm(f47067b);
                            f47068d = nxmVar;
                        }
                        break;
                    }
                }
                return nxmVar;
        }
    }
}
