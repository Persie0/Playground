package p000;

import androidx.wear.widget.iZcI.hiCTUJiAxf;
import com.google.android.apps.camera.legacy.app.activity.main.kuX.PMZiHihxLGEy;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class cny extends nxq implements nyx {

    /* JADX INFO: renamed from: j */
    public static final cny f6400j;

    /* JADX INFO: renamed from: m */
    private static volatile nzd f6401m;

    /* JADX INFO: renamed from: a */
    public int f6402a;

    /* JADX INFO: renamed from: b */
    public int f6403b;

    /* JADX INFO: renamed from: c */
    public int f6404c;

    /* JADX INFO: renamed from: d */
    public int f6405d;

    /* JADX INFO: renamed from: e */
    public nzw f6406e;

    /* JADX INFO: renamed from: f */
    public nzw f6407f;

    /* JADX INFO: renamed from: g */
    public int f6408g;

    /* JADX INFO: renamed from: i */
    public boolean f6410i;

    /* JADX INFO: renamed from: k */
    private int f6411k;

    /* JADX INFO: renamed from: l */
    private nyr f6412l = nyr.f45033a;

    /* JADX INFO: renamed from: h */
    public nxy f6409h = nzg.f45063b;

    static {
        cny cnyVar = new cny();
        f6400j = cnyVar;
        nxq.m18130aa(cny.class, cnyVar);
    }

    private cny() {
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
                return m18129X(f6400j, "\u0000\n\u0000\u0001\u0001\n\n\u0001\u0001\u0000\u0001\u0004\u0002\u0004\u0003\u0004\u0004\f\u0005\t\u0006\t\u0007\u0004\b2\t\u001b\nဇ\u0000", new Object[]{"k", "a", "b", "c", PMZiHihxLGEy.ePWIKpZboeAxUb, "e", hiCTUJiAxf.FLOHLBCRhyuQKyU, "g", "l", cnx.f6399a, "h", coa.class, "i"});
            case 3:
                return new cny();
            case 4:
                return new nxl(f6400j);
            case 5:
                return f6400j;
            case 6:
                nzd nxmVar = f6401m;
                if (nxmVar == null) {
                    synchronized (cny.class) {
                        nxmVar = f6401m;
                        if (nxmVar == null) {
                            nxmVar = new nxm(f6400j);
                            f6401m = nxmVar;
                        }
                        break;
                    }
                }
                return nxmVar;
        }
    }
}
