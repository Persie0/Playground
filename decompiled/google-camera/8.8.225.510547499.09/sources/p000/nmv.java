package p000;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class nmv extends nxq implements nyx {

    /* JADX INFO: renamed from: f */
    public static final nmv f43910f;

    /* JADX INFO: renamed from: h */
    private static volatile nzd f43911h;

    /* JADX INFO: renamed from: a */
    public int f43912a;

    /* JADX INFO: renamed from: c */
    public Object f43914c;

    /* JADX INFO: renamed from: d */
    public nms f43915d;

    /* JADX INFO: renamed from: b */
    public int f43913b = 0;

    /* JADX INFO: renamed from: g */
    private byte f43917g = 2;

    /* JADX INFO: renamed from: e */
    public nxy f43916e = nzg.f45063b;

    static {
        nmv nmvVar = new nmv();
        f43910f = nmvVar;
        nxq.m18130aa(nmv.class, nmvVar);
    }

    private nmv() {
    }

    /* JADX INFO: renamed from: b */
    public final void m17512b() {
        nxy nxyVar = this.f43916e;
        if (nxyVar.mo17770c()) {
            return;
        }
        this.f43916e = nxq.m18127U(nxyVar);
    }

    @Override // p000.nxq
    /* JADX INFO: renamed from: a */
    protected final Object mo3994a(int i, Object obj) {
        switch (i - 1) {
            case 0:
                return Byte.valueOf(this.f43917g);
            case 1:
            default:
                this.f43917g = obj == null ? (byte) 0 : (byte) 1;
                return null;
            case 2:
                return m18129X(f43910f, "\u0001\u0003\u0001\u0001\u0001\u0004\u0003\u0000\u0001\u0003\u0001ᔉ\u0000\u0002Л\u0004ᐼ\u0000", new Object[]{"c", "b", "a", "d", "e", nms.class, nmt.class});
            case 3:
                return new nmv();
            case 4:
                return new nxl(f43910f);
            case 5:
                return f43910f;
            case 6:
                nzd nxmVar = f43911h;
                if (nxmVar == null) {
                    synchronized (nmv.class) {
                        nxmVar = f43911h;
                        if (nxmVar == null) {
                            nxmVar = new nxm(f43910f);
                            f43911h = nxmVar;
                        }
                        break;
                    }
                }
                return nxmVar;
        }
    }
}
