package p000;

import com.google.android.play.core.common.wMe.NptsKnlVczSZ;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes2.dex */
public final class odb extends nxq implements nyx {

    /* JADX INFO: renamed from: k */
    public static final odb f45576k;

    /* JADX INFO: renamed from: l */
    private static volatile nzd f45577l;

    /* JADX INFO: renamed from: a */
    public int f45578a;

    /* JADX INFO: renamed from: b */
    public int f45579b;

    /* JADX INFO: renamed from: c */
    public int f45580c;

    /* JADX INFO: renamed from: d */
    public long f45581d;

    /* JADX INFO: renamed from: e */
    public long f45582e;

    /* JADX INFO: renamed from: f */
    public long f45583f;

    /* JADX INFO: renamed from: g */
    public long f45584g;

    /* JADX INFO: renamed from: h */
    public long f45585h;

    /* JADX INFO: renamed from: i */
    public long f45586i;

    /* JADX INFO: renamed from: j */
    public long f45587j;

    static {
        odb odbVar = new odb();
        f45576k = odbVar;
        nxq.m18130aa(odb.class, odbVar);
    }

    private odb() {
        nxj nxjVar = nxj.f44968b;
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
                return m18129X(f45576k, "\u0001\t\u0000\u0001\u0001\u0010\t\u0000\u0000\u0000\u0001ဌ\u0000\u0004ဂ\u0004\u0005ဂ\u0005\u0006ဂ\u0006\u0007ဂ\u0007\bဂ\b\tဂ\t\nဂ\n\u0010င\u0002", new Object[]{"a", "b", oau.f45197l, "d", "e", NptsKnlVczSZ.rlxVltcZvytI, "g", "h", "i", "j", "c"});
            case 3:
                return new odb();
            case 4:
                return new nxl(f45576k);
            case 5:
                return f45576k;
            case 6:
                nzd nxmVar = f45577l;
                if (nxmVar == null) {
                    synchronized (odb.class) {
                        nxmVar = f45577l;
                        if (nxmVar == null) {
                            nxmVar = new nxm(f45576k);
                            f45577l = nxmVar;
                        }
                        break;
                    }
                }
                return nxmVar;
        }
    }
}
