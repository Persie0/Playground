package p000;

import com.google.android.libraries.vision.opengl.MUg.WIxTIdUIdfb;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class njc extends nxq implements nyx {

    /* JADX INFO: renamed from: g */
    public static final njc f42870g;

    /* JADX INFO: renamed from: h */
    private static volatile nzd f42871h;

    /* JADX INFO: renamed from: a */
    public int f42872a;

    /* JADX INFO: renamed from: b */
    public int f42873b;

    /* JADX INFO: renamed from: c */
    public nmd f42874c;

    /* JADX INFO: renamed from: d */
    public long f42875d;

    /* JADX INFO: renamed from: e */
    public int f42876e;

    /* JADX INFO: renamed from: f */
    public int f42877f;

    static {
        njc njcVar = new njc();
        f42870g = njcVar;
        nxq.m18130aa(njc.class, njcVar);
    }

    private njc() {
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
                return m18129X(f42870g, "\u0001\u0005\u0000\u0001\u0001\u0007\u0005\u0000\u0000\u0000\u0001ဌ\u0000\u0002ဉ\u0001\u0004ဂ\u0002\u0006ဌ\u0004\u0007ဋ\u0005", new Object[]{"a", WIxTIdUIdfb.WkzHKWI, niy.f42830d, "c", "d", "e", niy.f42831e, "f"});
            case 3:
                return new njc();
            case 4:
                return new nxl(f42870g);
            case 5:
                return f42870g;
            case 6:
                nzd nxmVar = f42871h;
                if (nxmVar == null) {
                    synchronized (njc.class) {
                        nxmVar = f42871h;
                        if (nxmVar == null) {
                            nxmVar = new nxm(f42870g);
                            f42871h = nxmVar;
                        }
                        break;
                    }
                }
                return nxmVar;
        }
    }
}
