package p000;

import com.google.android.apps.camera.evcomp.AZCp.HRLmc;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class njh extends nxq implements nyx {

    /* JADX INFO: renamed from: f */
    public static final njh f42917f;

    /* JADX INFO: renamed from: g */
    private static volatile nzd f42918g;

    /* JADX INFO: renamed from: a */
    public int f42919a;

    /* JADX INFO: renamed from: b */
    public int f42920b;

    /* JADX INFO: renamed from: c */
    public long f42921c;

    /* JADX INFO: renamed from: d */
    public long f42922d;

    /* JADX INFO: renamed from: e */
    public int f42923e;

    static {
        njh njhVar = new njh();
        f42917f = njhVar;
        nxq.m18130aa(njh.class, njhVar);
    }

    private njh() {
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
                return m18129X(f42917f, "\u0001\u0004\u0000\u0001\u0001\u0004\u0004\u0000\u0000\u0000\u0001ဌ\u0000\u0002ဂ\u0001\u0003ဂ\u0002\u0004င\u0003", new Object[]{"a", "b", niy.f42836j, "c", HRLmc.yDnYx, "e"});
            case 3:
                return new njh();
            case 4:
                return new nxl(f42917f);
            case 5:
                return f42917f;
            case 6:
                nzd nxmVar = f42918g;
                if (nxmVar == null) {
                    synchronized (njh.class) {
                        nxmVar = f42918g;
                        if (nxmVar == null) {
                            nxmVar = new nxm(f42917f);
                            f42918g = nxmVar;
                        }
                        break;
                    }
                }
                return nxmVar;
        }
    }
}
