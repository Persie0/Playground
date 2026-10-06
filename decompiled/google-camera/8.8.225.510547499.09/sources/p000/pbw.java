package p000;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class pbw extends nxq implements nyx {

    /* JADX INFO: renamed from: e */
    public static final pbw f47363e;

    /* JADX INFO: renamed from: f */
    private static volatile nzd f47364f;

    /* JADX INFO: renamed from: a */
    public int f47365a;

    /* JADX INFO: renamed from: b */
    public pbv f47366b;

    /* JADX INFO: renamed from: c */
    public pbx f47367c;

    /* JADX INFO: renamed from: d */
    public pby f47368d;

    static {
        pbw pbwVar = new pbw();
        f47363e = pbwVar;
        nxq.m18130aa(pbw.class, pbwVar);
    }

    private pbw() {
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
                return m18129X(f47363e, "\u0001\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0000\u0001ဉ\u0000\u0002ဉ\u0001\u0003ဉ\u0002", new Object[]{"a", "b", "c", "d"});
            case 3:
                return new pbw();
            case 4:
                return new nxl(f47363e);
            case 5:
                return f47363e;
            case 6:
                nzd nxmVar = f47364f;
                if (nxmVar == null) {
                    synchronized (pbw.class) {
                        nxmVar = f47364f;
                        if (nxmVar == null) {
                            nxmVar = new nxm(f47363e);
                            f47364f = nxmVar;
                        }
                        break;
                    }
                }
                return nxmVar;
        }
    }
}
