package p000;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class obm extends nxq implements nyx {

    /* JADX INFO: renamed from: f */
    public static final obm f45321f;

    /* JADX INFO: renamed from: g */
    private static volatile nzd f45322g;

    /* JADX INFO: renamed from: a */
    public int f45323a;

    /* JADX INFO: renamed from: b */
    public nxy f45324b = nzg.f45063b;

    /* JADX INFO: renamed from: c */
    public float f45325c;

    /* JADX INFO: renamed from: d */
    public int f45326d;

    /* JADX INFO: renamed from: e */
    public obn f45327e;

    static {
        obm obmVar = new obm();
        f45321f = obmVar;
        nxq.m18130aa(obm.class, obmVar);
    }

    private obm() {
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
                return m18129X(f45321f, "\u0001\u0004\u0000\u0001\u0001\u0005\u0004\u0000\u0001\u0000\u0001\u001b\u0002ခ\u0000\u0003င\u0001\u0005ဉ\u0002", new Object[]{"a", "b", obl.class, "c", "d", "e"});
            case 3:
                return new obm();
            case 4:
                return new nxl(f45321f);
            case 5:
                return f45321f;
            case 6:
                nzd nxmVar = f45322g;
                if (nxmVar == null) {
                    synchronized (obm.class) {
                        nxmVar = f45322g;
                        if (nxmVar == null) {
                            nxmVar = new nxm(f45321f);
                            f45322g = nxmVar;
                        }
                        break;
                    }
                }
                return nxmVar;
        }
    }
}
