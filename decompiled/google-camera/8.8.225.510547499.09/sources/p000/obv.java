package p000;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class obv extends nxq implements nyx {

    /* JADX INFO: renamed from: b */
    public static final obv f45380b;

    /* JADX INFO: renamed from: c */
    private static volatile nzd f45381c;

    /* JADX INFO: renamed from: a */
    public nxy f45382a = nzg.f45063b;

    static {
        obv obvVar = new obv();
        f45380b = obvVar;
        nxq.m18130aa(obv.class, obvVar);
    }

    private obv() {
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
                return m18129X(f45380b, "\u0001\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0001\u0000\u0001\u001a", new Object[]{"a"});
            case 3:
                return new obv();
            case 4:
                return new nxl(f45380b);
            case 5:
                return f45380b;
            case 6:
                nzd nxmVar = f45381c;
                if (nxmVar == null) {
                    synchronized (obv.class) {
                        nxmVar = f45381c;
                        if (nxmVar == null) {
                            nxmVar = new nxm(f45380b);
                            f45381c = nxmVar;
                        }
                        break;
                    }
                }
                return nxmVar;
        }
    }
}
