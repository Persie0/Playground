package p000;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes2.dex */
public final class ocq extends nxo implements nyx {

    /* JADX INFO: renamed from: k */
    public static final ocq f45502k;

    /* JADX INFO: renamed from: n */
    private static volatile nzd f45503n;

    /* JADX INFO: renamed from: a */
    public int f45504a;

    /* JADX INFO: renamed from: b */
    public nuu f45505b;

    /* JADX INFO: renamed from: d */
    public nux f45507d;

    /* JADX INFO: renamed from: e */
    public ocl f45508e;

    /* JADX INFO: renamed from: f */
    public nut f45509f;

    /* JADX INFO: renamed from: g */
    public boolean f45510g;

    /* JADX INFO: renamed from: h */
    public nxy f45511h;

    /* JADX INFO: renamed from: i */
    public nxy f45512i;

    /* JADX INFO: renamed from: j */
    public nxy f45513j;

    /* JADX INFO: renamed from: m */
    private byte f45514m = 2;

    /* JADX INFO: renamed from: c */
    public String f45506c = "";

    static {
        ocq ocqVar = new ocq();
        f45502k = ocqVar;
        nxq.m18130aa(ocq.class, ocqVar);
    }

    private ocq() {
        nwr nwrVar = nwr.f44839b;
        nzg nzgVar = nzg.f45063b;
        this.f45511h = nzgVar;
        this.f45512i = nzgVar;
        this.f45513j = nzgVar;
    }

    @Override // p000.nxq
    /* JADX INFO: renamed from: a */
    protected final Object mo3994a(int i, Object obj) {
        switch (i - 1) {
            case 0:
                return Byte.valueOf(this.f45514m);
            case 1:
            default:
                this.f45514m = obj == null ? (byte) 0 : (byte) 1;
                return null;
            case 2:
                return m18129X(f45502k, "\u0001\t\u0000\u0001\u0001\u0010\t\u0000\u0003\u0001\u0001ဉ\u0000\u0002ဈ\u0001\u0005ဉ\u0004\u0006ဉ\u0006\u0007Л\b\u001b\t\u001b\nဉ\u0005\u0010ဇ\u0007", new Object[]{"a", "b", "c", "d", "f", "h", ocn.class, "i", oco.class, "j", ocp.class, "e", "g"});
            case 3:
                return new ocq();
            case 4:
                return new nxn(f45502k);
            case 5:
                return f45502k;
            case 6:
                nzd nxmVar = f45503n;
                if (nxmVar == null) {
                    synchronized (ocq.class) {
                        nxmVar = f45503n;
                        if (nxmVar == null) {
                            nxmVar = new nxm(f45502k);
                            f45503n = nxmVar;
                        }
                        break;
                    }
                }
                return nxmVar;
        }
    }
}
