package p000;

import androidx.work.impl.background.systemalarm.vIy.VCYBIzY;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class odo extends nxq implements nyx {

    /* JADX INFO: renamed from: d */
    public static final odo f45645d;

    /* JADX INFO: renamed from: e */
    private static volatile nzd f45646e;

    /* JADX INFO: renamed from: a */
    public int f45647a;

    /* JADX INFO: renamed from: b */
    public nxv f45648b = nxj.f44968b;

    /* JADX INFO: renamed from: c */
    public float f45649c;

    static {
        odo odoVar = new odo();
        f45645d = odoVar;
        nxq.m18130aa(odo.class, odoVar);
    }

    private odo() {
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
                return m18129X(f45645d, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0001\u0000\u0001$\u0002ခ\u0000", new Object[]{VCYBIzY.qZMcWASO, "b", "c"});
            case 3:
                return new odo();
            case 4:
                return new nxl(f45645d);
            case 5:
                return f45645d;
            case 6:
                nzd nxmVar = f45646e;
                if (nxmVar == null) {
                    synchronized (odo.class) {
                        nxmVar = f45646e;
                        if (nxmVar == null) {
                            nxmVar = new nxm(f45645d);
                            f45646e = nxmVar;
                        }
                        break;
                    }
                }
                return nxmVar;
        }
    }
}
