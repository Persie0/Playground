package p000;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class pbx extends nxq implements nyx {

    /* JADX INFO: renamed from: d */
    public static final pbx f47369d;

    /* JADX INFO: renamed from: e */
    private static volatile nzd f47370e;

    /* JADX INFO: renamed from: a */
    public int f47371a;

    /* JADX INFO: renamed from: b */
    public float f47372b;

    /* JADX INFO: renamed from: c */
    public nxy f47373c = nzg.f45063b;

    static {
        pbx pbxVar = new pbx();
        f47369d = pbxVar;
        nxq.m18130aa(pbx.class, pbxVar);
    }

    private pbx() {
    }

    /* JADX INFO: renamed from: c */
    public final void m19311c() {
        nxy nxyVar = this.f47373c;
        if (nxyVar.mo17770c()) {
            return;
        }
        this.f47373c = nxq.m18127U(nxyVar);
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
                return m18129X(f47369d, "\u0001\u0002\u0000\u0001\u0003\u0004\u0002\u0000\u0001\u0000\u0003ခ\u0002\u0004\u001a", new Object[]{"a", "b", "c"});
            case 3:
                return new pbx();
            case 4:
                return new nxl(f47369d);
            case 5:
                return f47369d;
            case 6:
                nzd nxmVar = f47370e;
                if (nxmVar == null) {
                    synchronized (pbx.class) {
                        nxmVar = f47370e;
                        if (nxmVar == null) {
                            nxmVar = new nxm(f47369d);
                            f47370e = nxmVar;
                        }
                        break;
                    }
                }
                return nxmVar;
        }
    }
}
