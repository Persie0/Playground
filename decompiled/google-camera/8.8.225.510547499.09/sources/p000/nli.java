package p000;

import com.google.android.material.snackbar.VMX.rgoX;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class nli extends nxq implements nyx {

    /* JADX INFO: renamed from: i */
    public static final nli f43518i;

    /* JADX INFO: renamed from: j */
    private static volatile nzd f43519j;

    /* JADX INFO: renamed from: a */
    public int f43520a;

    /* JADX INFO: renamed from: b */
    public int f43521b;

    /* JADX INFO: renamed from: c */
    public String f43522c = "";

    /* JADX INFO: renamed from: d */
    public boolean f43523d;

    /* JADX INFO: renamed from: e */
    public boolean f43524e;

    /* JADX INFO: renamed from: f */
    public boolean f43525f;

    /* JADX INFO: renamed from: g */
    public boolean f43526g;

    /* JADX INFO: renamed from: h */
    public boolean f43527h;

    static {
        nli nliVar = new nli();
        f43518i = nliVar;
        nxq.m18130aa(nli.class, nliVar);
    }

    private nli() {
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
                return m18129X(f43518i, "\u0001\u0007\u0000\u0001\u0001\u0007\u0007\u0000\u0000\u0000\u0001ဌ\u0000\u0002ဈ\u0001\u0003ဇ\u0002\u0004ဇ\u0003\u0005ဇ\u0004\u0006ဇ\u0005\u0007ဇ\u0006", new Object[]{"a", rgoX.nPYFmR, nks.f43304l, "c", "d", "e", "f", "g", "h"});
            case 3:
                return new nli();
            case 4:
                return new nxl(f43518i);
            case 5:
                return f43518i;
            case 6:
                nzd nxmVar = f43519j;
                if (nxmVar == null) {
                    synchronized (nli.class) {
                        nxmVar = f43519j;
                        if (nxmVar == null) {
                            nxmVar = new nxm(f43518i);
                            f43519j = nxmVar;
                        }
                        break;
                    }
                }
                return nxmVar;
        }
    }
}
