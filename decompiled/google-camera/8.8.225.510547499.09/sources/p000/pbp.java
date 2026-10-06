package p000;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class pbp extends nxq implements nyx {

    /* JADX INFO: renamed from: b */
    public static final pbp f47342b;

    /* JADX INFO: renamed from: c */
    private static volatile nzd f47343c;

    /* JADX INFO: renamed from: a */
    public pbs f47344a;

    static {
        pbp pbpVar = new pbp();
        f47342b = pbpVar;
        nxq.m18130aa(pbp.class, pbpVar);
    }

    private pbp() {
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
                return m18129X(f47342b, "\u0000\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0000\u0000\u0001\t", new Object[]{"a"});
            case 3:
                return new pbp();
            case 4:
                return new nxl(f47342b);
            case 5:
                return f47342b;
            case 6:
                nzd nxmVar = f47343c;
                if (nxmVar == null) {
                    synchronized (pbp.class) {
                        nxmVar = f47343c;
                        if (nxmVar == null) {
                            nxmVar = new nxm(f47342b);
                            f47343c = nxmVar;
                        }
                        break;
                    }
                }
                return nxmVar;
        }
    }
}
