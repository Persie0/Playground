package p000;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes2.dex */
public final class odi extends nxq implements nyx {

    /* JADX INFO: renamed from: b */
    public static final odi f45622b;

    /* JADX INFO: renamed from: c */
    private static volatile nzd f45623c;

    /* JADX INFO: renamed from: a */
    public nxy f45624a = nzg.f45063b;

    static {
        odi odiVar = new odi();
        f45622b = odiVar;
        nxq.m18130aa(odi.class, odiVar);
    }

    private odi() {
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
                return m18129X(f45622b, "\u0001\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0001\u0000\u0001\u001b", new Object[]{"a", mej.class});
            case 3:
                return new odi();
            case 4:
                return new nxl(f45622b);
            case 5:
                return f45622b;
            case 6:
                nzd nxmVar = f45623c;
                if (nxmVar == null) {
                    synchronized (odi.class) {
                        nxmVar = f45623c;
                        if (nxmVar == null) {
                            nxmVar = new nxm(f45622b);
                            f45623c = nxmVar;
                        }
                        break;
                    }
                }
                return nxmVar;
        }
    }
}
