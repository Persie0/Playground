package p000;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class ktw extends nxq implements nyx {

    /* JADX INFO: renamed from: b */
    public static final ktw f37190b;

    /* JADX INFO: renamed from: c */
    private static volatile nzd f37191c;

    /* JADX INFO: renamed from: a */
    public nyr f37192a = nyr.f45033a;

    static {
        ktw ktwVar = new ktw();
        f37190b = ktwVar;
        nxq.m18130aa(ktw.class, ktwVar);
    }

    private ktw() {
    }

    /* JADX INFO: renamed from: b */
    public final nyr m14845b() {
        nyr nyrVar = this.f37192a;
        if (!nyrVar.f45034b) {
            this.f37192a = nyrVar.m18191a();
        }
        return this.f37192a;
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
                return m18129X(f37190b, "\u0001\u0001\u0000\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u00012", new Object[]{"a", ktv.f37189a});
            case 3:
                return new ktw();
            case 4:
                return new nxl(f37190b);
            case 5:
                return f37190b;
            case 6:
                nzd nxmVar = f37191c;
                if (nxmVar == null) {
                    synchronized (ktw.class) {
                        nxmVar = f37191c;
                        if (nxmVar == null) {
                            nxmVar = new nxm(f37190b);
                            f37191c = nxmVar;
                        }
                        break;
                    }
                }
                return nxmVar;
        }
    }
}
