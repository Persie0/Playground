package p000;

import com.google.android.apps.camera.cameravisionkit.olQ.BEeWZPor;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class ozb extends nxq implements nyx {

    /* JADX INFO: renamed from: c */
    public static final ozb f46914c;

    /* JADX INFO: renamed from: e */
    private static volatile nzd f46915e;

    /* JADX INFO: renamed from: a */
    public int f46916a;

    /* JADX INFO: renamed from: b */
    public oza f46917b;

    /* JADX INFO: renamed from: d */
    private byte f46918d = 2;

    static {
        ozb ozbVar = new ozb();
        f46914c = ozbVar;
        nxq.m18130aa(ozb.class, ozbVar);
    }

    private ozb() {
    }

    @Override // p000.nxq
    /* JADX INFO: renamed from: a */
    protected final Object mo3994a(int i, Object obj) {
        switch (i - 1) {
            case 0:
                return Byte.valueOf(this.f46918d);
            case 1:
            default:
                this.f46918d = obj == null ? (byte) 0 : (byte) 1;
                return null;
            case 2:
                return m18129X(f46914c, "\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0001\u0001ᐉ\u0000", new Object[]{"a", BEeWZPor.tGCoHam});
            case 3:
                return new ozb();
            case 4:
                return new nxl(f46914c);
            case 5:
                return f46914c;
            case 6:
                nzd nxmVar = f46915e;
                if (nxmVar == null) {
                    synchronized (ozb.class) {
                        nxmVar = f46915e;
                        if (nxmVar == null) {
                            nxmVar = new nxm(f46914c);
                            f46915e = nxmVar;
                        }
                        break;
                    }
                }
                return nxmVar;
        }
    }
}
