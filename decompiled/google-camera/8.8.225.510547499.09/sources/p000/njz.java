package p000;

import com.google.android.apps.camera.cameravisionkit.olQ.BEeWZPor;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class njz extends nxq implements nyx {

    /* JADX INFO: renamed from: t */
    public static final njz f43133t;

    /* JADX INFO: renamed from: u */
    private static volatile nzd f43134u;

    /* JADX INFO: renamed from: a */
    public int f43135a;

    /* JADX INFO: renamed from: b */
    public long f43136b;

    /* JADX INFO: renamed from: c */
    public long f43137c;

    /* JADX INFO: renamed from: d */
    public long f43138d;

    /* JADX INFO: renamed from: e */
    public long f43139e;

    /* JADX INFO: renamed from: f */
    public long f43140f;

    /* JADX INFO: renamed from: g */
    public long f43141g;

    /* JADX INFO: renamed from: h */
    public long f43142h;

    /* JADX INFO: renamed from: i */
    public long f43143i;

    /* JADX INFO: renamed from: j */
    public long f43144j;

    /* JADX INFO: renamed from: k */
    public long f43145k;

    /* JADX INFO: renamed from: l */
    public long f43146l;

    /* JADX INFO: renamed from: m */
    public boolean f43147m;

    /* JADX INFO: renamed from: n */
    public int f43148n;

    /* JADX INFO: renamed from: o */
    public nlp f43149o;

    /* JADX INFO: renamed from: p */
    public int f43150p;

    /* JADX INFO: renamed from: q */
    public long f43151q;

    /* JADX INFO: renamed from: r */
    public long f43152r;

    /* JADX INFO: renamed from: s */
    public nlj f43153s;

    static {
        njz njzVar = new njz();
        f43133t = njzVar;
        nxq.m18130aa(njz.class, njzVar);
    }

    private njz() {
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
                return m18129X(f43133t, "\u0001\u0012\u0000\u0001\u0001\u0014\u0012\u0000\u0000\u0000\u0001ဂ\u0000\u0002ဂ\u0001\u0003ဂ\u0002\u0004ဂ\u0003\u0005ဂ\u0004\u0006ဂ\u0005\u0007ဂ\u0006\bဂ\u0007\tဂ\b\fဂ\u000b\rဂ\f\u000eဇ\r\u000fဌ\u000e\u0010ဉ\u000f\u0011ဌ\u0010\u0012ဂ\u0011\u0013ဂ\u0012\u0014ဉ\u0013", new Object[]{"a", "b", "c", "d", "e", "f", "g", "h", "i", "j", "k", "l", "m", BEeWZPor.pViqvTTPSq, njy.f43112b, "o", "p", njy.f43111a, "q", "r", "s"});
            case 3:
                return new njz();
            case 4:
                return new nxl(f43133t);
            case 5:
                return f43133t;
            case 6:
                nzd nxmVar = f43134u;
                if (nxmVar == null) {
                    synchronized (njz.class) {
                        nxmVar = f43134u;
                        if (nxmVar == null) {
                            nxmVar = new nxm(f43133t);
                            f43134u = nxmVar;
                        }
                        break;
                    }
                }
                return nxmVar;
        }
    }
}
