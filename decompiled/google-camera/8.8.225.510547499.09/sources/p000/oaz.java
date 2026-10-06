package p000;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class oaz extends nxq implements nyx {

    /* JADX INFO: renamed from: e */
    public static final oaz f45226e;

    /* JADX INFO: renamed from: f */
    private static volatile nzd f45227f;

    /* JADX INFO: renamed from: a */
    public int f45228a;

    /* JADX INFO: renamed from: b */
    public int f45229b;

    /* JADX INFO: renamed from: c */
    public oav f45230c;

    /* JADX INFO: renamed from: d */
    public oav f45231d;

    static {
        oaz oazVar = new oaz();
        f45226e = oazVar;
        nxq.m18130aa(oaz.class, oazVar);
    }

    private oaz() {
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
                return m18129X(f45226e, "\u0001\u0003\u0000\u0001\u0001\b\u0003\u0000\u0000\u0000\u0001ဌ\u0000\u0007ဉ\n\bဉ\u000b", new Object[]{"a", "b", oau.f45186a, "c", "d"});
            case 3:
                return new oaz();
            case 4:
                return new nxl(f45226e);
            case 5:
                return f45226e;
            case 6:
                nzd nxmVar = f45227f;
                if (nxmVar == null) {
                    synchronized (oaz.class) {
                        nxmVar = f45227f;
                        if (nxmVar == null) {
                            nxmVar = new nxm(f45226e);
                            f45227f = nxmVar;
                        }
                        break;
                    }
                }
                return nxmVar;
        }
    }
}
