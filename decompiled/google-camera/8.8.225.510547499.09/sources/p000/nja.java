package p000;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class nja extends nxq implements nyx {

    /* JADX INFO: renamed from: i */
    public static final nja f42855i;

    /* JADX INFO: renamed from: j */
    private static volatile nzd f42856j;

    /* JADX INFO: renamed from: a */
    public int f42857a;

    /* JADX INFO: renamed from: b */
    public String f42858b = "";

    /* JADX INFO: renamed from: c */
    public int f42859c;

    /* JADX INFO: renamed from: d */
    public int f42860d;

    /* JADX INFO: renamed from: e */
    public int f42861e;

    /* JADX INFO: renamed from: f */
    public int f42862f;

    /* JADX INFO: renamed from: g */
    public int f42863g;

    /* JADX INFO: renamed from: h */
    public long f42864h;

    static {
        nja njaVar = new nja();
        f42855i = njaVar;
        nxq.m18130aa(nja.class, njaVar);
    }

    private nja() {
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
                return m18129X(f42855i, "\u0001\u0007\u0000\u0001\u0001\u0007\u0007\u0000\u0000\u0000\u0001ဈ\u0000\u0002င\u0001\u0003င\u0002\u0004င\u0003\u0005င\u0004\u0006င\u0005\u0007ဂ\u0006", new Object[]{"a", "b", "c", "d", "e", "f", "g", "h"});
            case 3:
                return new nja();
            case 4:
                return new nxl(f42855i);
            case 5:
                return f42855i;
            case 6:
                nzd nxmVar = f42856j;
                if (nxmVar == null) {
                    synchronized (nja.class) {
                        nxmVar = f42856j;
                        if (nxmVar == null) {
                            nxmVar = new nxm(f42855i);
                            f42856j = nxmVar;
                        }
                        break;
                    }
                }
                return nxmVar;
        }
    }
}
