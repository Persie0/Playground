package p000;

import com.google.android.apps.camera.smarts.ScBZ.IuyLAqNmW;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes2.dex */
public final class oco extends nxq implements nyx {

    /* JADX INFO: renamed from: g */
    public static final oco f45492g;

    /* JADX INFO: renamed from: h */
    private static volatile nzd f45493h;

    /* JADX INFO: renamed from: a */
    public int f45494a;

    /* JADX INFO: renamed from: b */
    public String f45495b = "";

    /* JADX INFO: renamed from: c */
    public String f45496c = "";

    /* JADX INFO: renamed from: d */
    public String f45497d = "";

    /* JADX INFO: renamed from: e */
    public ocl f45498e;

    /* JADX INFO: renamed from: f */
    public boolean f45499f;

    static {
        oco ocoVar = new oco();
        f45492g = ocoVar;
        nxq.m18130aa(oco.class, ocoVar);
    }

    private oco() {
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
                return m18129X(f45492g, "\u0001\u0005\u0000\u0001\u0001\u0010\u0005\u0000\u0000\u0000\u0001ဈ\u0000\u0002ဈ\u0001\u0003ဈ\u0002\u0004ဉ\u0003\u0010ဇ\u0005", new Object[]{IuyLAqNmW.FFKkGooBSRJp, "b", "c", "d", "e", "f"});
            case 3:
                return new oco();
            case 4:
                return new nxl(f45492g);
            case 5:
                return f45492g;
            case 6:
                nzd nxmVar = f45493h;
                if (nxmVar == null) {
                    synchronized (oco.class) {
                        nxmVar = f45493h;
                        if (nxmVar == null) {
                            nxmVar = new nxm(f45492g);
                            f45493h = nxmVar;
                        }
                        break;
                    }
                }
                return nxmVar;
        }
    }
}
