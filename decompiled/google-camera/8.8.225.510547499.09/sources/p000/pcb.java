package p000;

import com.google.android.apps.camera.p014ui.captureframe.Tjcw.xRFdVyfdeve;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class pcb extends nxq implements nyx {

    /* JADX INFO: renamed from: d */
    public static final pcb f47386d;

    /* JADX INFO: renamed from: e */
    private static volatile nzd f47387e;

    /* JADX INFO: renamed from: a */
    public int f47388a;

    /* JADX INFO: renamed from: b */
    public nxw f47389b = nxr.f44982b;

    /* JADX INFO: renamed from: c */
    public int f47390c;

    static {
        pcb pcbVar = new pcb();
        f47386d = pcbVar;
        nxq.m18130aa(pcb.class, pcbVar);
    }

    private pcb() {
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
                return m18129X(f47386d, "\u0001\u0002\u0000\u0001\u0002\u0003\u0002\u0000\u0001\u0000\u0002,\u0003င\u0001", new Object[]{"a", xRFdVyfdeve.TdfkqeJbeztue, oau.f45191f, "c"});
            case 3:
                return new pcb();
            case 4:
                return new nxl(f47386d);
            case 5:
                return f47386d;
            case 6:
                nzd nxmVar = f47387e;
                if (nxmVar == null) {
                    synchronized (pcb.class) {
                        nxmVar = f47387e;
                        if (nxmVar == null) {
                            nxmVar = new nxm(f47386d);
                            f47387e = nxmVar;
                        }
                        break;
                    }
                }
                return nxmVar;
        }
    }
}
