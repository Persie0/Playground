package p000;

import com.google.android.play.core.common.wMe.NptsKnlVczSZ;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class pan extends nxq implements nyx {

    /* JADX INFO: renamed from: f */
    public static final pan f47234f;

    /* JADX INFO: renamed from: g */
    private static volatile nzd f47235g;

    /* JADX INFO: renamed from: a */
    public int f47236a;

    /* JADX INFO: renamed from: b */
    public String f47237b = "";

    /* JADX INFO: renamed from: c */
    public nxx f47238c = nyn.f45025b;

    /* JADX INFO: renamed from: d */
    public long f47239d;

    /* JADX INFO: renamed from: e */
    public int f47240e;

    static {
        pan panVar = new pan();
        f47234f = panVar;
        nxq.m18130aa(pan.class, panVar);
    }

    private pan() {
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
                return m18129X(f47234f, "\u0001\u0004\u0000\u0001\u0001\u0004\u0004\u0000\u0001\u0000\u0001ဈ\u0000\u0002ဂ\u0001\u0003(\u0004ဌ\u0002", new Object[]{"a", "b", NptsKnlVczSZ.MQmACxI, "c", "e", pab.f47152e});
            case 3:
                return new pan();
            case 4:
                return new nxl(f47234f);
            case 5:
                return f47234f;
            case 6:
                nzd nxmVar = f47235g;
                if (nxmVar == null) {
                    synchronized (pan.class) {
                        nxmVar = f47235g;
                        if (nxmVar == null) {
                            nxmVar = new nxm(f47234f);
                            f47235g = nxmVar;
                        }
                        break;
                    }
                }
                return nxmVar;
        }
    }
}
