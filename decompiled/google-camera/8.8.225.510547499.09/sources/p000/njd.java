package p000;

import com.google.android.libraries.lens.lenslite.api.arLu.YmzeHXaMYOLk;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class njd extends nxq implements nyx {

    /* JADX INFO: renamed from: l */
    public static final njd f42878l;

    /* JADX INFO: renamed from: m */
    private static volatile nzd f42879m;

    /* JADX INFO: renamed from: a */
    public int f42880a;

    /* JADX INFO: renamed from: b */
    public int f42881b;

    /* JADX INFO: renamed from: c */
    public int f42882c;

    /* JADX INFO: renamed from: d */
    public String f42883d = "";

    /* JADX INFO: renamed from: e */
    public boolean f42884e;

    /* JADX INFO: renamed from: f */
    public boolean f42885f;

    /* JADX INFO: renamed from: g */
    public boolean f42886g;

    /* JADX INFO: renamed from: h */
    public long f42887h;

    /* JADX INFO: renamed from: i */
    public int f42888i;

    /* JADX INFO: renamed from: j */
    public nhc f42889j;

    /* JADX INFO: renamed from: k */
    public long f42890k;

    static {
        njd njdVar = new njd();
        f42878l = njdVar;
        nxq.m18130aa(njd.class, njdVar);
    }

    private njd() {
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
                return m18129X(f42878l, "\u0001\n\u0000\u0001\u0001\u000e\n\u0000\u0000\u0000\u0001ဌ\u0000\u0006ဌ\u0005\u0007ဈ\u0006\bဇ\u0007\tဇ\b\nဇ\t\u000bဂ\n\fဌ\u000b\rဉ\f\u000eဃ\r", new Object[]{"a", "b", niy.f42832f, "c", nks.f43293a, "d", "e", "f", YmzeHXaMYOLk.tHEWVyKY, "h", "i", niy.f42833g, "j", "k"});
            case 3:
                return new njd();
            case 4:
                return new nxl(f42878l);
            case 5:
                return f42878l;
            case 6:
                nzd nxmVar = f42879m;
                if (nxmVar == null) {
                    synchronized (njd.class) {
                        nxmVar = f42879m;
                        if (nxmVar == null) {
                            nxmVar = new nxm(f42878l);
                            f42879m = nxmVar;
                        }
                        break;
                    }
                }
                return nxmVar;
        }
    }
}
