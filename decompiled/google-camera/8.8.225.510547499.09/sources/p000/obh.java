package p000;

import com.google.android.libraries.vision.opengl.MUg.WIxTIdUIdfb;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class obh extends nxq implements nyx {

    /* JADX INFO: renamed from: r */
    public static final obh f45269r;

    /* JADX INFO: renamed from: s */
    private static volatile nzd f45270s;

    /* JADX INFO: renamed from: a */
    public int f45271a;

    /* JADX INFO: renamed from: b */
    public float f45272b;

    /* JADX INFO: renamed from: c */
    public float f45273c;

    /* JADX INFO: renamed from: d */
    public float f45274d;

    /* JADX INFO: renamed from: e */
    public float f45275e;

    /* JADX INFO: renamed from: f */
    public float f45276f;

    /* JADX INFO: renamed from: g */
    public float f45277g;

    /* JADX INFO: renamed from: h */
    public float f45278h;

    /* JADX INFO: renamed from: i */
    public float f45279i;

    /* JADX INFO: renamed from: j */
    public float f45280j;

    /* JADX INFO: renamed from: k */
    public float f45281k;

    /* JADX INFO: renamed from: l */
    public float f45282l;

    /* JADX INFO: renamed from: m */
    public nxy f45283m = nzg.f45063b;

    /* JADX INFO: renamed from: n */
    public nxv f45284n = nxj.f44968b;

    /* JADX INFO: renamed from: o */
    public float f45285o;

    /* JADX INFO: renamed from: p */
    public float f45286p;

    /* JADX INFO: renamed from: q */
    public float f45287q;

    static {
        obh obhVar = new obh();
        f45269r = obhVar;
        nxq.m18130aa(obh.class, obhVar);
    }

    private obh() {
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
                return m18129X(f45269r, "\u0001\u0010\u0000\u0001\u0001\u0010\u0010\u0000\u0002\u0000\u0001ခ\u0000\u0002ခ\u0001\u0003ခ\u0002\u0004ခ\u0003\u0005ခ\u0004\u0006ခ\u0005\u0007ခ\u0006\bခ\u0007\tခ\b\nခ\t\u000bခ\n\f\u001b\r$\u000eခ\u000b\u000fခ\f\u0010ခ\r", new Object[]{"a", WIxTIdUIdfb.NuamyRreN, "c", "d", "e", "f", "g", "h", "i", "j", "k", "l", "m", obo.class, "n", "o", "p", "q"});
            case 3:
                return new obh();
            case 4:
                return new nxl(f45269r);
            case 5:
                return f45269r;
            case 6:
                nzd nxmVar = f45270s;
                if (nxmVar == null) {
                    synchronized (obh.class) {
                        nxmVar = f45270s;
                        if (nxmVar == null) {
                            nxmVar = new nxm(f45269r);
                            f45270s = nxmVar;
                        }
                        break;
                    }
                }
                return nxmVar;
        }
    }
}
