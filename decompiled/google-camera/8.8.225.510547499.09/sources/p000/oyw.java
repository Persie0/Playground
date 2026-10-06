package p000;

import androidx.wear.widget.iZcI.hiCTUJiAxf;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class oyw extends nxq implements nyx {

    /* JADX INFO: renamed from: j */
    public static final oyw f46872j;

    /* JADX INFO: renamed from: k */
    private static volatile nzd f46873k;

    /* JADX INFO: renamed from: a */
    public int f46874a;

    /* JADX INFO: renamed from: b */
    public String f46875b = "";

    /* JADX INFO: renamed from: c */
    public int f46876c;

    /* JADX INFO: renamed from: d */
    public int f46877d;

    /* JADX INFO: renamed from: e */
    public int f46878e;

    /* JADX INFO: renamed from: f */
    public long f46879f;

    /* JADX INFO: renamed from: g */
    public long f46880g;

    /* JADX INFO: renamed from: h */
    public long f46881h;

    /* JADX INFO: renamed from: i */
    public boolean f46882i;

    static {
        oyw oywVar = new oyw();
        f46872j = oywVar;
        nxq.m18130aa(oyw.class, oywVar);
    }

    private oyw() {
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
                return m18129X(f46872j, "\u0001\b\u0000\u0001\u0001\b\b\u0000\u0000\u0000\u0001ဈ\u0000\u0002ဌ\u0001\u0003င\u0002\u0004ဌ\u0003\u0005ဂ\u0004\u0006ဂ\u0005\u0007ဂ\u0006\bဇ\u0007", new Object[]{"a", "b", "c", oau.f45202q, hiCTUJiAxf.eMcJx, "e", oau.f45201p, "f", "g", "h", "i"});
            case 3:
                return new oyw();
            case 4:
                return new nxl(f46872j);
            case 5:
                return f46872j;
            case 6:
                nzd nxmVar = f46873k;
                if (nxmVar == null) {
                    synchronized (oyw.class) {
                        nxmVar = f46873k;
                        if (nxmVar == null) {
                            nxmVar = new nxm(f46872j);
                            f46873k = nxmVar;
                        }
                        break;
                    }
                }
                return nxmVar;
        }
    }
}
