package p000;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class kvw extends nxq implements nyx {

    /* JADX INFO: renamed from: b */
    public static final kvw f37460b;

    /* JADX INFO: renamed from: c */
    private static volatile nzd f37461c;

    /* JADX INFO: renamed from: a */
    public nxy f37462a = nzg.f45063b;

    static {
        kvw kvwVar = new kvw();
        f37460b = kvwVar;
        nxq.m18130aa(kvw.class, kvwVar);
    }

    private kvw() {
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
                return m18129X(f37460b, "\u0001\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0001\u0000\u0001\u001b", new Object[]{"a", nvg.class});
            case 3:
                return new kvw();
            case 4:
                return new nxl(f37460b);
            case 5:
                return f37460b;
            case 6:
                nzd nxmVar = f37461c;
                if (nxmVar == null) {
                    synchronized (kvw.class) {
                        nxmVar = f37461c;
                        if (nxmVar == null) {
                            nxmVar = new nxm(f37460b);
                            f37461c = nxmVar;
                        }
                        break;
                    }
                }
                return nxmVar;
        }
    }
}
