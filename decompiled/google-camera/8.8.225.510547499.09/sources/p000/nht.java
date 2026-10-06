package p000;

import com.google.android.material.snackbar.VMX.rgoX;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class nht extends nxq implements nyx {

    /* JADX INFO: renamed from: e */
    public static final nht f42542e;

    /* JADX INFO: renamed from: f */
    private static volatile nzd f42543f;

    /* JADX INFO: renamed from: a */
    public int f42544a;

    /* JADX INFO: renamed from: b */
    public float f42545b;

    /* JADX INFO: renamed from: c */
    public float f42546c;

    /* JADX INFO: renamed from: d */
    public float f42547d;

    static {
        nht nhtVar = new nht();
        f42542e = nhtVar;
        nxq.m18130aa(nht.class, nhtVar);
    }

    private nht() {
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
                return m18129X(f42542e, "\u0001\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0000\u0001ခ\u0000\u0002ခ\u0001\u0003ခ\u0002", new Object[]{"a", rgoX.FLcaWRADaDCft, "c", "d"});
            case 3:
                return new nht();
            case 4:
                return new nxl(f42542e);
            case 5:
                return f42542e;
            case 6:
                nzd nxmVar = f42543f;
                if (nxmVar == null) {
                    synchronized (nht.class) {
                        nxmVar = f42543f;
                        if (nxmVar == null) {
                            nxmVar = new nxm(f42542e);
                            f42543f = nxmVar;
                        }
                        break;
                    }
                }
                return nxmVar;
        }
    }
}
