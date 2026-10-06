package p000;

import com.google.android.apps.camera.app.silentfeedback.p004ip.TVkaNXnfP;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class nvg extends nxq implements nyx {

    /* JADX INFO: renamed from: c */
    public static final nvg f44740c;

    /* JADX INFO: renamed from: d */
    private static volatile nzd f44741d;

    /* JADX INFO: renamed from: a */
    public int f44742a = 0;

    /* JADX INFO: renamed from: b */
    public Object f44743b;

    static {
        nvg nvgVar = new nvg();
        f44740c = nvgVar;
        nxq.m18130aa(nvg.class, nvgVar);
    }

    private nvg() {
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
                return m18129X(f44740c, "\u0001\u0007\u0001\u0000\u0001\u0007\u0007\u0000\u0000\u0000\u0001ြ\u0000\u0002ြ\u0000\u0003ြ\u0000\u0004ြ\u0000\u0005ြ\u0000\u0006ြ\u0000\u0007ြ\u0000", new Object[]{TVkaNXnfP.otqK, "a", nva.class, nvf.class, nve.class, nuz.class, nvd.class, nvc.class, nvb.class});
            case 3:
                return new nvg();
            case 4:
                return new nxl(f44740c);
            case 5:
                return f44740c;
            case 6:
                nzd nxmVar = f44741d;
                if (nxmVar == null) {
                    synchronized (nvg.class) {
                        nxmVar = f44741d;
                        if (nxmVar == null) {
                            nxmVar = new nxm(f44740c);
                            f44741d = nxmVar;
                        }
                        break;
                    }
                }
                return nxmVar;
        }
    }
}
