package p000;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class nmt extends nxq implements nyx {

    /* JADX INFO: renamed from: b */
    public static final nmt f43899b;

    /* JADX INFO: renamed from: d */
    private static volatile nzd f43900d;

    /* JADX INFO: renamed from: c */
    private byte f43902c = 2;

    /* JADX INFO: renamed from: a */
    public nxy f43901a = nzg.f45063b;

    static {
        nmt nmtVar = new nmt();
        f43899b = nmtVar;
        nxq.m18130aa(nmt.class, nmtVar);
    }

    private nmt() {
    }

    /* JADX INFO: renamed from: b */
    public final void m17511b() {
        nxy nxyVar = this.f43901a;
        if (nxyVar.mo17770c()) {
            return;
        }
        this.f43901a = nxq.m18127U(nxyVar);
    }

    @Override // p000.nxq
    /* JADX INFO: renamed from: a */
    protected final Object mo3994a(int i, Object obj) {
        switch (i - 1) {
            case 0:
                return Byte.valueOf(this.f43902c);
            case 1:
            default:
                this.f43902c = obj == null ? (byte) 0 : (byte) 1;
                return null;
            case 2:
                return m18129X(f43899b, "\u0001\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0001\u0001\u0001Л", new Object[]{"a", nmu.class});
            case 3:
                return new nmt();
            case 4:
                return new nxl(f43899b);
            case 5:
                return f43899b;
            case 6:
                nzd nxmVar = f43900d;
                if (nxmVar == null) {
                    synchronized (nmt.class) {
                        nxmVar = f43900d;
                        if (nxmVar == null) {
                            nxmVar = new nxm(f43899b);
                            f43900d = nxmVar;
                        }
                        break;
                    }
                }
                return nxmVar;
        }
    }
}
