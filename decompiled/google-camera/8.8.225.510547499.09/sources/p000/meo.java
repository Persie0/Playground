package p000;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class meo extends nxq implements nyx {

    /* JADX INFO: renamed from: e */
    public static final meo f40205e;

    /* JADX INFO: renamed from: g */
    private static volatile nzd f40206g;

    /* JADX INFO: renamed from: a */
    public int f40207a;

    /* JADX INFO: renamed from: b */
    public long f40208b;

    /* JADX INFO: renamed from: c */
    public long f40209c;

    /* JADX INFO: renamed from: d */
    public long f40210d;

    /* JADX INFO: renamed from: f */
    private float f40211f;

    static {
        meo meoVar = new meo();
        f40205e = meoVar;
        nxq.m18130aa(meo.class, meoVar);
    }

    private meo() {
    }

    /* JADX INFO: renamed from: b */
    public static /* synthetic */ void m16338b(meo meoVar) {
        meoVar.f40207a |= 1;
        meoVar.f40211f = 1.0f;
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
                return m18129X(f40205e, "\u0001\u0004\u0000\u0001\u0001\u0004\u0004\u0000\u0000\u0000\u0001ခ\u0000\u0002ဂ\u0001\u0003ဂ\u0002\u0004ဂ\u0003", new Object[]{"a", "f", "b", "c", "d"});
            case 3:
                return new meo();
            case 4:
                return new nxl(f40205e);
            case 5:
                return f40205e;
            case 6:
                nzd nxmVar = f40206g;
                if (nxmVar == null) {
                    synchronized (meo.class) {
                        nxmVar = f40206g;
                        if (nxmVar == null) {
                            nxmVar = new nxm(f40205e);
                            f40206g = nxmVar;
                        }
                        break;
                    }
                }
                return nxmVar;
        }
    }
}
