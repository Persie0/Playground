package p000;

import com.google.android.apps.camera.smarts.ScBZ.IuyLAqNmW;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes2.dex */
public final class ocv extends nxq implements nyx {

    /* JADX INFO: renamed from: a */
    public static final ocv f45545a;

    /* JADX INFO: renamed from: g */
    private static volatile nzd f45546g;

    /* JADX INFO: renamed from: b */
    private int f45547b;

    /* JADX INFO: renamed from: c */
    private long f45548c;

    /* JADX INFO: renamed from: d */
    private ocu f45549d;

    /* JADX INFO: renamed from: e */
    private ocw f45550e;

    /* JADX INFO: renamed from: f */
    private byte f45551f = 2;

    static {
        ocv ocvVar = new ocv();
        f45545a = ocvVar;
        nxq.m18130aa(ocv.class, ocvVar);
    }

    private ocv() {
        nzg nzgVar = nzg.f45063b;
        nwr nwrVar = nwr.f44839b;
    }

    @Override // p000.nxq
    /* JADX INFO: renamed from: a */
    protected final Object mo3994a(int i, Object obj) {
        switch (i - 1) {
            case 0:
                return Byte.valueOf(this.f45551f);
            case 1:
            default:
                this.f45551f = obj == null ? (byte) 0 : (byte) 1;
                return null;
            case 2:
                return m18129X(f45545a, "\u0001\u0003\u0000\u0001\u0001\u0018\u0003\u0000\u0000\u0003\u0001ᔂ\u0000\u0017ᐉ\b\u0018ᐉ\u0006", new Object[]{"b", IuyLAqNmW.xpjmryPdrMCxExy, "e", "d"});
            case 3:
                return new ocv();
            case 4:
                return new nxl(f45545a);
            case 5:
                return f45545a;
            case 6:
                nzd nxmVar = f45546g;
                if (nxmVar == null) {
                    synchronized (ocv.class) {
                        nxmVar = f45546g;
                        if (nxmVar == null) {
                            nxmVar = new nxm(f45545a);
                            f45546g = nxmVar;
                        }
                        break;
                    }
                }
                return nxmVar;
        }
    }
}
