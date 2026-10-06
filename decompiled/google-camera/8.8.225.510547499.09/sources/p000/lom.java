package p000;

import com.google.android.apps.camera.app.silentfeedback.p004ip.TVkaNXnfP;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class lom extends nxq implements nyx {

    /* JADX INFO: renamed from: i */
    public static final lom f38808i;

    /* JADX INFO: renamed from: j */
    public static final ktz f38809j;

    /* JADX INFO: renamed from: k */
    private static volatile nzd f38810k;

    /* JADX INFO: renamed from: a */
    public int f38811a;

    /* JADX INFO: renamed from: d */
    public boolean f38814d;

    /* JADX INFO: renamed from: h */
    public boolean f38818h;

    /* JADX INFO: renamed from: b */
    public String f38812b = "";

    /* JADX INFO: renamed from: c */
    public String f38813c = "";

    /* JADX INFO: renamed from: e */
    public String f38815e = "";

    /* JADX INFO: renamed from: f */
    public String f38816f = "";

    /* JADX INFO: renamed from: g */
    public nxw f38817g = nxr.f44982b;

    static {
        lom lomVar = new lom();
        f38808i = lomVar;
        nxq.m18130aa(lom.class, lomVar);
        f38809j = nxq.m18133af(loe.f38797c, lomVar, lomVar, 334728578, oaj.f45141k);
    }

    private lom() {
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
                return m18129X(f38808i, "\u0001\u0007\u0000\u0001\u0001\u0007\u0007\u0000\u0001\u0000\u0001ဈ\u0000\u0002ဈ\u0001\u0003ဇ\u0002\u0004ဈ\u0003\u0005ဈ\u0004\u0006'\u0007ဇ\u0005", new Object[]{"a", "b", TVkaNXnfP.tWSQ, "d", "e", "f", "g", "h"});
            case 3:
                return new lom();
            case 4:
                return new nxl(f38808i);
            case 5:
                return f38808i;
            case 6:
                nzd nxmVar = f38810k;
                if (nxmVar == null) {
                    synchronized (lom.class) {
                        nxmVar = f38810k;
                        if (nxmVar == null) {
                            nxmVar = new nxm(f38808i);
                            f38810k = nxmVar;
                        }
                        break;
                    }
                }
                return nxmVar;
        }
    }
}
