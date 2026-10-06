package p000;

import com.google.android.play.core.common.wMe.NptsKnlVczSZ;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes2.dex */
public final class ivj extends nxq implements nyx {

    /* JADX INFO: renamed from: c */
    public static final ivj f32272c;

    /* JADX INFO: renamed from: f */
    private static volatile nzd f32273f;

    /* JADX INFO: renamed from: a */
    public int f32274a;

    /* JADX INFO: renamed from: b */
    public ivi f32275b;

    /* JADX INFO: renamed from: d */
    private ivg f32276d;

    /* JADX INFO: renamed from: e */
    private ivh f32277e;

    static {
        ivj ivjVar = new ivj();
        f32272c = ivjVar;
        nxq.m18130aa(ivj.class, ivjVar);
    }

    private ivj() {
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
                return m18129X(f32272c, "\u0001\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0000\u0001ဉ\u0000\u0002ဉ\u0001\u0003ဉ\u0002", new Object[]{NptsKnlVczSZ.etYryLReGItAaae, "d", "b", "e"});
            case 3:
                return new ivj();
            case 4:
                return new nxl(f32272c);
            case 5:
                return f32272c;
            case 6:
                nzd nxmVar = f32273f;
                if (nxmVar == null) {
                    synchronized (ivj.class) {
                        nxmVar = f32273f;
                        if (nxmVar == null) {
                            nxmVar = new nxm(f32272c);
                            f32273f = nxmVar;
                        }
                        break;
                    }
                }
                return nxmVar;
        }
    }
}
