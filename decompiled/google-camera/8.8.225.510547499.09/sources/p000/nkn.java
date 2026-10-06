package p000;

import com.google.android.apps.camera.legacy.app.activity.main.kuX.PMZiHihxLGEy;
import com.google.android.material.behavior.iWN.zuAgeeF;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class nkn extends nxq implements nyx {

    /* JADX INFO: renamed from: e */
    public static final nkn f43244e;

    /* JADX INFO: renamed from: f */
    private static volatile nzd f43245f;

    /* JADX INFO: renamed from: a */
    public int f43246a;

    /* JADX INFO: renamed from: b */
    public int f43247b;

    /* JADX INFO: renamed from: c */
    public String f43248c;

    /* JADX INFO: renamed from: d */
    public String f43249d;

    static {
        nkn nknVar = new nkn();
        f43244e = nknVar;
        nxq.m18130aa(nkn.class, nknVar);
    }

    private nkn() {
        String str = PMZiHihxLGEy.eXE;
        this.f43248c = str;
        this.f43249d = str;
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
                return m18129X(f43244e, "\u0001\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0000\u0001ဌ\u0000\u0002ဈ\u0001\u0003ဈ\u0002", new Object[]{"a", "b", njy.f43129s, zuAgeeF.KOrtlv, "d"});
            case 3:
                return new nkn();
            case 4:
                return new nxl(f43244e);
            case 5:
                return f43244e;
            case 6:
                nzd nxmVar = f43245f;
                if (nxmVar == null) {
                    synchronized (nkn.class) {
                        nxmVar = f43245f;
                        if (nxmVar == null) {
                            nxmVar = new nxm(f43244e);
                            f43245f = nxmVar;
                        }
                        break;
                    }
                }
                return nxmVar;
        }
    }
}
