package p000;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes2.dex */
public final class ivi extends nxq implements nyx {

    /* JADX INFO: renamed from: b */
    public static final ivi f32269b;

    /* JADX INFO: renamed from: c */
    private static volatile nzd f32270c;

    /* JADX INFO: renamed from: a */
    public nxy f32271a = nzg.f45063b;

    static {
        ivi iviVar = new ivi();
        f32269b = iviVar;
        nxq.m18130aa(ivi.class, iviVar);
    }

    private ivi() {
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
                return m18129X(f32269b, "\u0001\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0001\u0000\u0001\u001a", new Object[]{"a"});
            case 3:
                return new ivi();
            case 4:
                return new nxl(f32269b);
            case 5:
                return f32269b;
            case 6:
                nzd nxmVar = f32270c;
                if (nxmVar == null) {
                    synchronized (ivi.class) {
                        nxmVar = f32270c;
                        if (nxmVar == null) {
                            nxmVar = new nxm(f32269b);
                            f32270c = nxmVar;
                        }
                        break;
                    }
                }
                return nxmVar;
        }
    }
}
