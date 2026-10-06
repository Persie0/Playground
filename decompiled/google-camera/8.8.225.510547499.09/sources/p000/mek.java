package p000;

import com.google.android.play.core.common.wMe.NptsKnlVczSZ;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class mek extends nxq implements nyx {

    /* JADX INFO: renamed from: e */
    public static final mek f40185e;

    /* JADX INFO: renamed from: f */
    private static volatile nzd f40186f;

    /* JADX INFO: renamed from: a */
    public int f40187a;

    /* JADX INFO: renamed from: b */
    public float f40188b;

    /* JADX INFO: renamed from: c */
    public float f40189c;

    /* JADX INFO: renamed from: d */
    public float f40190d;

    static {
        mek mekVar = new mek();
        f40185e = mekVar;
        nxq.m18130aa(mek.class, mekVar);
    }

    private mek() {
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
                return m18129X(f40185e, "\u0001\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0000\u0001ခ\u0000\u0002ခ\u0001\u0003ခ\u0002", new Object[]{NptsKnlVczSZ.CQyEsD, "b", "c", "d"});
            case 3:
                return new mek();
            case 4:
                return new nxl(f40185e);
            case 5:
                return f40185e;
            case 6:
                nzd nxmVar = f40186f;
                if (nxmVar == null) {
                    synchronized (mek.class) {
                        nxmVar = f40186f;
                        if (nxmVar == null) {
                            nxmVar = new nxm(f40185e);
                            f40186f = nxmVar;
                        }
                        break;
                    }
                }
                return nxmVar;
        }
    }
}
