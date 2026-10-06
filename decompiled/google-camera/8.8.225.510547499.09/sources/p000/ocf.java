package p000;

import com.google.android.apps.camera.jni.tracking.yRU.CswIK;
import com.google.android.apps.camera.rectiface.jni.cxx.hsSUWRJfoeC;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class ocf extends nxq implements nyx {

    /* JADX INFO: renamed from: g */
    public static final ocf f45452g;

    /* JADX INFO: renamed from: h */
    private static volatile nzd f45453h;

    /* JADX INFO: renamed from: a */
    public int f45454a;

    /* JADX INFO: renamed from: b */
    public int f45455b;

    /* JADX INFO: renamed from: c */
    public int f45456c;

    /* JADX INFO: renamed from: d */
    public float f45457d;

    /* JADX INFO: renamed from: e */
    public float f45458e;

    /* JADX INFO: renamed from: f */
    public float f45459f;

    static {
        ocf ocfVar = new ocf();
        f45452g = ocfVar;
        nxq.m18130aa(ocf.class, ocfVar);
    }

    private ocf() {
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
                return m18129X(f45452g, "\u0001\u0005\u0000\u0001\u0001\u0005\u0005\u0000\u0000\u0000\u0001င\u0000\u0002င\u0001\u0003ခ\u0002\u0004ခ\u0003\u0005ခ\u0004", new Object[]{"a", "b", hsSUWRJfoeC.YvFjDpDaaHXYOjJ, "d", "e", CswIK.GkjC});
            case 3:
                return new ocf();
            case 4:
                return new nxl(f45452g);
            case 5:
                return f45452g;
            case 6:
                nzd nxmVar = f45453h;
                if (nxmVar == null) {
                    synchronized (ocf.class) {
                        nxmVar = f45453h;
                        if (nxmVar == null) {
                            nxmVar = new nxm(f45452g);
                            f45453h = nxmVar;
                        }
                        break;
                    }
                }
                return nxmVar;
        }
    }
}
