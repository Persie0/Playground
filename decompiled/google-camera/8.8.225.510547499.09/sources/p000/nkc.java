package p000;

import com.google.android.material.snackbar.VMX.rgoX;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class nkc extends nxq implements nyx {

    /* JADX INFO: renamed from: h */
    public static final nkc f43167h;

    /* JADX INFO: renamed from: i */
    private static volatile nzd f43168i;

    /* JADX INFO: renamed from: a */
    public int f43169a;

    /* JADX INFO: renamed from: b */
    public nkd f43170b;

    /* JADX INFO: renamed from: c */
    public int f43171c;

    /* JADX INFO: renamed from: d */
    public int f43172d;

    /* JADX INFO: renamed from: e */
    public long f43173e;

    /* JADX INFO: renamed from: f */
    public long f43174f;

    /* JADX INFO: renamed from: g */
    public long f43175g;

    static {
        nkc nkcVar = new nkc();
        f43167h = nkcVar;
        nxq.m18130aa(nkc.class, nkcVar);
    }

    private nkc() {
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
                return m18129X(f43167h, "\u0001\u0006\u0000\u0001\u0001\u0006\u0006\u0000\u0000\u0000\u0001ဉ\u0000\u0002ဌ\u0001\u0003ဌ\u0002\u0004ဂ\u0003\u0005ဂ\u0004\u0006ဃ\u0005", new Object[]{rgoX.OPeo, "b", "c", njy.f43118h, "d", njy.f43117g, "e", "f", "g"});
            case 3:
                return new nkc();
            case 4:
                return new nxl(f43167h);
            case 5:
                return f43167h;
            case 6:
                nzd nxmVar = f43168i;
                if (nxmVar == null) {
                    synchronized (nkc.class) {
                        nxmVar = f43168i;
                        if (nxmVar == null) {
                            nxmVar = new nxm(f43167h);
                            f43168i = nxmVar;
                        }
                        break;
                    }
                }
                return nxmVar;
        }
    }
}
