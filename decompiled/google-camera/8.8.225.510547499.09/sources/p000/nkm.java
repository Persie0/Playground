package p000;

import com.google.android.gms.common.annotation.HJo.JrxsYuVZZqnFC;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class nkm extends nxq implements nyx {

    /* JADX INFO: renamed from: n */
    public static final nkm f43229n;

    /* JADX INFO: renamed from: o */
    private static volatile nzd f43230o;

    /* JADX INFO: renamed from: a */
    public int f43231a;

    /* JADX INFO: renamed from: b */
    public int f43232b;

    /* JADX INFO: renamed from: c */
    public int f43233c;

    /* JADX INFO: renamed from: d */
    public int f43234d;

    /* JADX INFO: renamed from: e */
    public int f43235e;

    /* JADX INFO: renamed from: f */
    public boolean f43236f;

    /* JADX INFO: renamed from: g */
    public boolean f43237g;

    /* JADX INFO: renamed from: h */
    public int f43238h;

    /* JADX INFO: renamed from: i */
    public nxy f43239i = nzg.f45063b;

    /* JADX INFO: renamed from: j */
    public boolean f43240j;

    /* JADX INFO: renamed from: k */
    public int f43241k;

    /* JADX INFO: renamed from: l */
    public int f43242l;

    /* JADX INFO: renamed from: m */
    public int f43243m;

    static {
        nkm nkmVar = new nkm();
        f43229n = nkmVar;
        nxq.m18130aa(nkm.class, nkmVar);
    }

    private nkm() {
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
                return m18129X(f43229n, "\u0001\f\u0000\u0001\u0001\f\f\u0000\u0001\u0000\u0001င\u0000\u0002င\u0001\u0003င\u0002\u0004င\u0003\u0005ဇ\u0004\u0006ဇ\u0005\u0007ဌ\u0006\b\u001b\tဇ\u0007\nဌ\b\u000bဌ\t\fဌ\n", new Object[]{"a", JrxsYuVZZqnFC.DgvYmAoCOJ, "c", "d", "e", "f", "g", "h", njy.f43127q, "i", nkp.class, "j", "k", njy.f43128r, "l", njy.f43126p, "m", njy.f43125o});
            case 3:
                return new nkm();
            case 4:
                return new nxl(f43229n);
            case 5:
                return f43229n;
            case 6:
                nzd nxmVar = f43230o;
                if (nxmVar == null) {
                    synchronized (nkm.class) {
                        nxmVar = f43230o;
                        if (nxmVar == null) {
                            nxmVar = new nxm(f43229n);
                            f43230o = nxmVar;
                        }
                        break;
                    }
                }
                return nxmVar;
        }
    }
}
