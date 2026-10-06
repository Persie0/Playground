package p000;

import androidx.wear.widget.iZcI.hiCTUJiAxf;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class lqn extends nxq implements nyx {

    /* JADX INFO: renamed from: g */
    public static final lqn f38985g;

    /* JADX INFO: renamed from: i */
    private static volatile nzd f38986i;

    /* JADX INFO: renamed from: a */
    public String f38987a = "";

    /* JADX INFO: renamed from: b */
    public boolean f38988b;

    /* JADX INFO: renamed from: c */
    public int f38989c;

    /* JADX INFO: renamed from: d */
    public boolean f38990d;

    /* JADX INFO: renamed from: e */
    public boolean f38991e;

    /* JADX INFO: renamed from: f */
    public boolean f38992f;

    /* JADX INFO: renamed from: h */
    private int f38993h;

    static {
        lqn lqnVar = new lqn();
        f38985g = lqnVar;
        nxq.m18130aa(lqn.class, lqnVar);
    }

    private lqn() {
        nzg nzgVar = nzg.f45063b;
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
                return m18129X(f38985g, "\u0001\u0006\u0000\u0001\u0001\u0007\u0006\u0000\u0000\u0000\u0001ဈ\u0000\u0002ဇ\u0001\u0004ဌ\u0002\u0005ဇ\u0003\u0006ဇ\u0005\u0007ဇ\u0004", new Object[]{"h", hiCTUJiAxf.TGDOZnsHqVnAerz, "b", "c", nlu.f43681r, "d", "f", "e"});
            case 3:
                return new lqn();
            case 4:
                return new nxl(f38985g);
            case 5:
                return f38985g;
            case 6:
                nzd nxmVar = f38986i;
                if (nxmVar == null) {
                    synchronized (lqn.class) {
                        nxmVar = f38986i;
                        if (nxmVar == null) {
                            nxmVar = new nxm(f38985g);
                            f38986i = nxmVar;
                        }
                        break;
                    }
                }
                return nxmVar;
        }
    }
}
