package p000;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class nii extends nxq implements nyx {

    /* JADX INFO: renamed from: i */
    public static final nii f42702i;

    /* JADX INFO: renamed from: j */
    private static volatile nzd f42703j;

    /* JADX INFO: renamed from: a */
    public int f42704a;

    /* JADX INFO: renamed from: b */
    public int f42705b;

    /* JADX INFO: renamed from: c */
    public int f42706c;

    /* JADX INFO: renamed from: d */
    public nlx f42707d;

    /* JADX INFO: renamed from: e */
    public nlo f42708e;

    /* JADX INFO: renamed from: f */
    public nhf f42709f;

    /* JADX INFO: renamed from: g */
    public nmm f42710g;

    /* JADX INFO: renamed from: h */
    public nio f42711h;

    static {
        nii niiVar = new nii();
        f42702i = niiVar;
        nxq.m18130aa(nii.class, niiVar);
    }

    private nii() {
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
                return m18129X(f42702i, "\u0001\u0007\u0000\u0001\u0001\u000e\u0007\u0000\u0000\u0000\u0001ဌ\u0000\u0002ဌ\u0001\nဉ\u0003\u000bဉ\u0004\fဉ\u0005\rဉ\u0006\u000eဉ\u0007", new Object[]{"a", "b", nhr.f42525n, "c", nks.f43293a, "d", "e", "f", "g", "h"});
            case 3:
                return new nii();
            case 4:
                return new nxl(f42702i);
            case 5:
                return f42702i;
            case 6:
                nzd nxmVar = f42703j;
                if (nxmVar == null) {
                    synchronized (nii.class) {
                        nxmVar = f42703j;
                        if (nxmVar == null) {
                            nxmVar = new nxm(f42702i);
                            f42703j = nxmVar;
                        }
                        break;
                    }
                }
                return nxmVar;
        }
    }
}
