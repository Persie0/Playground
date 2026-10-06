package p000;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class mew extends nxo implements nyx {

    /* JADX INFO: renamed from: f */
    public static final mew f40254f;

    /* JADX INFO: renamed from: k */
    private static volatile nzd f40255k;

    /* JADX INFO: renamed from: a */
    public int f40256a;

    /* JADX INFO: renamed from: b */
    public mfg f40257b;

    /* JADX INFO: renamed from: c */
    public mfn f40258c;

    /* JADX INFO: renamed from: d */
    public mfq f40259d;

    /* JADX INFO: renamed from: e */
    public meh f40260e;

    /* JADX INFO: renamed from: g */
    private nvz f40261g;

    /* JADX INFO: renamed from: h */
    private ocv f40262h;

    /* JADX INFO: renamed from: i */
    private meq f40263i;

    /* JADX INFO: renamed from: j */
    private byte f40264j = 2;

    static {
        mew mewVar = new mew();
        f40254f = mewVar;
        nxq.m18130aa(mew.class, mewVar);
    }

    private mew() {
        nzg nzgVar = nzg.f45063b;
    }

    @Override // p000.nxq
    /* JADX INFO: renamed from: a */
    protected final Object mo3994a(int i, Object obj) {
        switch (i - 1) {
            case 0:
                return Byte.valueOf(this.f40264j);
            case 1:
            default:
                this.f40264j = obj == null ? (byte) 0 : (byte) 1;
                return null;
            case 2:
                return m18129X(f40254f, "\u0001\u0007\u0000\u0001\u0002\u0015\u0007\u0000\u0000\u0004\u0002ဉ\u0001\u0004ဉ\u0003\bᐉ\u0007\nဉ\t\u000bᐉ\n\u0013ᐉ\u0011\u0015ᐉ\u0013", new Object[]{"a", "b", "c", "g", "d", "e", "h", "i"});
            case 3:
                return new mew();
            case 4:
                return new nxn(f40254f);
            case 5:
                return f40254f;
            case 6:
                nzd nxmVar = f40255k;
                if (nxmVar == null) {
                    synchronized (mew.class) {
                        nxmVar = f40255k;
                        if (nxmVar == null) {
                            nxmVar = new nxm(f40254f);
                            f40255k = nxmVar;
                        }
                        break;
                    }
                }
                return nxmVar;
        }
    }
}
