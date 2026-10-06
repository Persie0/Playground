package p000;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class oce extends nxo implements nyx {

    /* JADX INFO: renamed from: c */
    public static final oce f45447c;

    /* JADX INFO: renamed from: e */
    private static volatile nzd f45448e;

    /* JADX INFO: renamed from: a */
    public int f45449a;

    /* JADX INFO: renamed from: d */
    private byte f45451d = 2;

    /* JADX INFO: renamed from: b */
    public String f45450b = "FaceAttributesClientBrainEmbedder";

    static {
        oce oceVar = new oce();
        f45447c = oceVar;
        nxq.m18130aa(oce.class, oceVar);
    }

    private oce() {
        nwr nwrVar = nwr.f44839b;
    }

    @Override // p000.nxq
    /* JADX INFO: renamed from: a */
    protected final Object mo3994a(int i, Object obj) {
        switch (i - 1) {
            case 0:
                return Byte.valueOf(this.f45451d);
            case 1:
            default:
                this.f45451d = obj == null ? (byte) 0 : (byte) 1;
                return null;
            case 2:
                return m18129X(f45447c, "\u0001\u0001\u0000\u0001\t\t\u0001\u0000\u0000\u0000\tဈ\u0000", new Object[]{"a", "b"});
            case 3:
                return new oce();
            case 4:
                return new nxn(f45447c);
            case 5:
                return f45447c;
            case 6:
                nzd nxmVar = f45448e;
                if (nxmVar == null) {
                    synchronized (oce.class) {
                        nxmVar = f45448e;
                        if (nxmVar == null) {
                            nxmVar = new nxm(f45447c);
                            f45448e = nxmVar;
                        }
                        break;
                    }
                }
                return nxmVar;
        }
    }
}
