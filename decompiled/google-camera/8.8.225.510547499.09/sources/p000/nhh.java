package p000;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class nhh extends nxq implements nyx {

    /* JADX INFO: renamed from: g */
    public static final nhh f42312g;

    /* JADX INFO: renamed from: h */
    private static volatile nzd f42313h;

    /* JADX INFO: renamed from: a */
    public int f42314a;

    /* JADX INFO: renamed from: b */
    public njz f42315b;

    /* JADX INFO: renamed from: c */
    public nxy f42316c;

    /* JADX INFO: renamed from: d */
    public float f42317d;

    /* JADX INFO: renamed from: e */
    public nxy f42318e;

    /* JADX INFO: renamed from: f */
    public nhu f42319f;

    static {
        nhh nhhVar = new nhh();
        f42312g = nhhVar;
        nxq.m18130aa(nhh.class, nhhVar);
    }

    private nhh() {
        nzg nzgVar = nzg.f45063b;
        this.f42316c = nzgVar;
        this.f42318e = nzgVar;
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
                return m18129X(f42312g, "\u0001\u0005\u0000\u0001\u0002\b\u0005\u0000\u0002\u0000\u0002ဉ\u0001\u0004\u001b\u0005ခ\u0002\u0007\u001b\bဉ\u0003", new Object[]{"a", "b", "c", nin.class, "d", "e", njt.class, "f"});
            case 3:
                return new nhh();
            case 4:
                return new nxl(f42312g);
            case 5:
                return f42312g;
            case 6:
                nzd nxmVar = f42313h;
                if (nxmVar == null) {
                    synchronized (nhh.class) {
                        nxmVar = f42313h;
                        if (nxmVar == null) {
                            nxmVar = new nxm(f42312g);
                            f42313h = nxmVar;
                        }
                        break;
                    }
                }
                return nxmVar;
        }
    }
}
