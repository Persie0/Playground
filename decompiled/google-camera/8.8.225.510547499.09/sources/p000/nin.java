package p000;

import com.google.android.clockwork.common.wearable.wearmaterial.selectioncontrol.eMjB.VzWFSVj;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class nin extends nxq implements nyx {

    /* JADX INFO: renamed from: f */
    public static final nin f42736f;

    /* JADX INFO: renamed from: g */
    private static volatile nzd f42737g;

    /* JADX INFO: renamed from: a */
    public int f42738a;

    /* JADX INFO: renamed from: b */
    public long f42739b;

    /* JADX INFO: renamed from: c */
    public int f42740c;

    /* JADX INFO: renamed from: d */
    public float f42741d;

    /* JADX INFO: renamed from: e */
    public int f42742e;

    static {
        nin ninVar = new nin();
        f42736f = ninVar;
        nxq.m18130aa(nin.class, ninVar);
    }

    private nin() {
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
                return m18129X(f42736f, "\u0001\u0004\u0000\u0001\u0001\u0004\u0004\u0000\u0000\u0000\u0001ဂ\u0000\u0002ဌ\u0001\u0003ခ\u0002\u0004ဌ\u0003", new Object[]{"a", "b", "c", nhr.f42530s, VzWFSVj.EZtKUzfmoj, "e", kva.f37302p});
            case 3:
                return new nin();
            case 4:
                return new nxl(f42736f);
            case 5:
                return f42736f;
            case 6:
                nzd nxmVar = f42737g;
                if (nxmVar == null) {
                    synchronized (nin.class) {
                        nxmVar = f42737g;
                        if (nxmVar == null) {
                            nxmVar = new nxm(f42736f);
                            f42737g = nxmVar;
                        }
                        break;
                    }
                }
                return nxmVar;
        }
    }
}
