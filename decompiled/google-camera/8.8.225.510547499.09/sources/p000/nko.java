package p000;

import com.google.android.apps.camera.legacy.app.activity.main.kuX.PMZiHihxLGEy;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class nko extends nxq implements nyx {

    /* JADX INFO: renamed from: g */
    public static final nko f43250g;

    /* JADX INFO: renamed from: h */
    private static volatile nzd f43251h;

    /* JADX INFO: renamed from: a */
    public int f43252a;

    /* JADX INFO: renamed from: b */
    public int f43253b;

    /* JADX INFO: renamed from: c */
    public int f43254c;

    /* JADX INFO: renamed from: d */
    public long f43255d;

    /* JADX INFO: renamed from: e */
    public long f43256e;

    /* JADX INFO: renamed from: f */
    public int f43257f;

    static {
        nko nkoVar = new nko();
        f43250g = nkoVar;
        nxq.m18130aa(nko.class, nkoVar);
    }

    private nko() {
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
                nxu nxuVar = nks.f43293a;
                return m18129X(f43250g, "\u0001\u0005\u0000\u0001\u0001\u0005\u0005\u0000\u0000\u0000\u0001ဌ\u0000\u0002ဌ\u0001\u0003ဂ\u0002\u0004ဂ\u0003\u0005ဌ\u0004", new Object[]{"a", "b", nxuVar, "c", nxuVar, "d", PMZiHihxLGEy.QJRvdrHJoup, "f", njy.f43130t});
            case 3:
                return new nko();
            case 4:
                return new nxl(f43250g);
            case 5:
                return f43250g;
            case 6:
                nzd nxmVar = f43251h;
                if (nxmVar == null) {
                    synchronized (nko.class) {
                        nxmVar = f43251h;
                        if (nxmVar == null) {
                            nxmVar = new nxm(f43250g);
                            f43251h = nxmVar;
                        }
                        break;
                    }
                }
                return nxmVar;
        }
    }
}
