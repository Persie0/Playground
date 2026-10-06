package p000;

import com.google.android.apps.camera.rectiface.jni.cxx.hsSUWRJfoeC;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes2.dex */
public final class ntu extends nxq implements nyx {

    /* JADX INFO: renamed from: E */
    public static final ntu f44557E;

    /* JADX INFO: renamed from: G */
    private static volatile nzd f44558G;

    /* JADX INFO: renamed from: A */
    public nto f44559A;

    /* JADX INFO: renamed from: B */
    public ntm f44560B;

    /* JADX INFO: renamed from: C */
    public ntr f44561C;

    /* JADX INFO: renamed from: F */
    private int f44563F;

    /* JADX INFO: renamed from: a */
    public ntk f44564a;

    /* JADX INFO: renamed from: f */
    public int f44569f;

    /* JADX INFO: renamed from: g */
    public boolean f44570g;

    /* JADX INFO: renamed from: i */
    public long f44572i;

    /* JADX INFO: renamed from: j */
    public long f44573j;

    /* JADX INFO: renamed from: k */
    public long f44574k;

    /* JADX INFO: renamed from: m */
    public ntt f44576m;

    /* JADX INFO: renamed from: o */
    public ntn f44578o;

    /* JADX INFO: renamed from: p */
    public ntp f44579p;

    /* JADX INFO: renamed from: q */
    public boolean f44580q;

    /* JADX INFO: renamed from: s */
    public obx f44582s;

    /* JADX INFO: renamed from: t */
    public float f44583t;

    /* JADX INFO: renamed from: x */
    public nts f44587x;

    /* JADX INFO: renamed from: y */
    public ntl f44588y;

    /* JADX INFO: renamed from: z */
    public ntq f44589z;

    /* JADX INFO: renamed from: b */
    public int f44565b = -1;

    /* JADX INFO: renamed from: c */
    public int f44566c = -1;

    /* JADX INFO: renamed from: d */
    public nxv f44567d = nxj.f44968b;

    /* JADX INFO: renamed from: e */
    public nxs f44568e = nwj.f44830b;

    /* JADX INFO: renamed from: h */
    public int f44571h = -1;

    /* JADX INFO: renamed from: l */
    public int f44575l = -1;

    /* JADX INFO: renamed from: n */
    public int f44577n = 1;

    /* JADX INFO: renamed from: r */
    public float f44581r = 1.0f;

    /* JADX INFO: renamed from: u */
    public float f44584u = -1.0f;

    /* JADX INFO: renamed from: v */
    public float f44585v = -1.0f;

    /* JADX INFO: renamed from: w */
    public nxv f44586w = nxj.f44968b;

    /* JADX INFO: renamed from: D */
    public nxw f44562D = nxr.f44982b;

    static {
        ntu ntuVar = new ntu();
        f44557E = ntuVar;
        nxq.m18130aa(ntu.class, ntuVar);
    }

    private ntu() {
        nzg nzgVar = nzg.f45063b;
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
                return m18129X(f44557E, "\u0001\u001e\u0000\u0001\u0001'\u001e\u0000\u0004\u0000\u0001ဉ\u0001\u0002င\u0002\u0003င\u0003\u0004\u0013\u0005\u0019\u0006ဌ\u0004\u0007ဇ\u0005\bင\u0006\tဂ\u0007\nဂ\b\u000bဂ\t\fင\n\rဉ\u000b\u000eဌ\f\u000fဇ\u000f\u0010ခ\u0010\u0011ဉ\u0011\u0012ခ\u0012\u0013ခ\u0013\u0014ခ\u0014\u0015\u0013\u0016ဉ\u0015\u0017ဉ\u0016\u0018ဉ\u0017\u0019ဉ\u0018\u001aဉ\u0019\u001bဉ\u001a\u001c' ဉ\r'ဉ\u000e", new Object[]{"F", "a", "b", "c", "d", "e", "f", oau.f45187b, "g", "h", "i", "j", "k", "l", "m", "n", nlu.f43684u, "q", hsSUWRJfoeC.nvPPYRH, "s", "t", "u", "v", "w", "x", "y", "z", "A", "B", "C", "D", "o", "p"});
            case 3:
                return new ntu();
            case 4:
                return new nxl(f44557E);
            case 5:
                return f44557E;
            case 6:
                nzd nxmVar = f44558G;
                if (nxmVar == null) {
                    synchronized (ntu.class) {
                        nxmVar = f44558G;
                        if (nxmVar == null) {
                            nxmVar = new nxm(f44557E);
                            f44558G = nxmVar;
                        }
                        break;
                    }
                }
                return nxmVar;
        }
    }
}
