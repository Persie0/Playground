package p000;

import com.google.android.apps.camera.evcomp.AZCp.HRLmc;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class odx extends nxq implements nyx {

    /* JADX INFO: renamed from: a */
    public static final odx f45685a;

    /* JADX INFO: renamed from: d */
    private static volatile nzd f45686d;

    /* JADX INFO: renamed from: b */
    private nyr f45687b = nyr.f45033a;

    /* JADX INFO: renamed from: c */
    private nyr f45688c = nyr.f45033a;

    static {
        odx odxVar = new odx();
        f45685a = odxVar;
        nxq.m18130aa(odx.class, odxVar);
    }

    private odx() {
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
                return m18129X(f45685a, "\u0001\u0002\u0000\u0000\u0001\u0002\u0002\u0002\u0000\u0000\u00012\u00022", new Object[]{"b", odw.f45684a, HRLmc.SjO, odv.f45683a});
            case 3:
                return new odx();
            case 4:
                return new nxl(f45685a);
            case 5:
                return f45685a;
            case 6:
                nzd nxmVar = f45686d;
                if (nxmVar == null) {
                    synchronized (odx.class) {
                        nxmVar = f45686d;
                        if (nxmVar == null) {
                            nxmVar = new nxm(f45685a);
                            f45686d = nxmVar;
                        }
                        break;
                    }
                }
                return nxmVar;
        }
    }
}
