package p000;

import com.google.android.apps.camera.cameravisionkit.olQ.BEeWZPor;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class nka extends nxq implements nyx {

    /* JADX INFO: renamed from: d */
    public static final nka f43156d;

    /* JADX INFO: renamed from: e */
    private static volatile nzd f43157e;

    /* JADX INFO: renamed from: a */
    public int f43158a;

    /* JADX INFO: renamed from: b */
    public nkb f43159b;

    /* JADX INFO: renamed from: c */
    public int f43160c;

    static {
        nka nkaVar = new nka();
        f43156d = nkaVar;
        nxq.m18130aa(nka.class, nkaVar);
    }

    private nka() {
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
                return m18129X(f43156d, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001ဉ\u0000\u0002ဌ\u0001", new Object[]{"a", BEeWZPor.ITpkhgKK, "c", njy.f43113c});
            case 3:
                return new nka();
            case 4:
                return new nxl(f43156d);
            case 5:
                return f43156d;
            case 6:
                nzd nxmVar = f43157e;
                if (nxmVar == null) {
                    synchronized (nka.class) {
                        nxmVar = f43157e;
                        if (nxmVar == null) {
                            nxmVar = new nxm(f43156d);
                            f43157e = nxmVar;
                        }
                        break;
                    }
                }
                return nxmVar;
        }
    }
}
