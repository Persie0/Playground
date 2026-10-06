package p000;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class niu extends nxq implements nyx {

    /* JADX INFO: renamed from: i */
    public static final niu f42792i;

    /* JADX INFO: renamed from: j */
    private static volatile nzd f42793j;

    /* JADX INFO: renamed from: a */
    public int f42794a;

    /* JADX INFO: renamed from: b */
    public float f42795b;

    /* JADX INFO: renamed from: c */
    public float f42796c;

    /* JADX INFO: renamed from: d */
    public float f42797d;

    /* JADX INFO: renamed from: e */
    public float f42798e;

    /* JADX INFO: renamed from: f */
    public float f42799f;

    /* JADX INFO: renamed from: g */
    public float f42800g;

    /* JADX INFO: renamed from: h */
    public float f42801h;

    static {
        niu niuVar = new niu();
        f42792i = niuVar;
        nxq.m18130aa(niu.class, niuVar);
    }

    private niu() {
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
                return m18129X(f42792i, "\u0001\u0007\u0000\u0001\u0001\u0007\u0007\u0000\u0000\u0000\u0001ခ\u0000\u0002ခ\u0001\u0003ခ\u0002\u0004ခ\u0003\u0005ခ\u0004\u0006ခ\u0005\u0007ခ\u0006", new Object[]{"a", "b", "c", "d", "e", "f", "g", "h"});
            case 3:
                return new niu();
            case 4:
                return new nxl(f42792i);
            case 5:
                return f42792i;
            case 6:
                nzd nxmVar = f42793j;
                if (nxmVar == null) {
                    synchronized (niu.class) {
                        nxmVar = f42793j;
                        if (nxmVar == null) {
                            nxmVar = new nxm(f42792i);
                            f42793j = nxmVar;
                        }
                        break;
                    }
                }
                return nxmVar;
        }
    }
}
