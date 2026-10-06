package p000;

import com.google.android.libraries.social.licenses.GWO.HEePJw;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class oza extends nxq implements nyx {

    /* JADX INFO: renamed from: k */
    public static final oza f46901k;

    /* JADX INFO: renamed from: m */
    private static volatile nzd f46902m;

    /* JADX INFO: renamed from: a */
    public int f46903a;

    /* JADX INFO: renamed from: b */
    public int f46904b;

    /* JADX INFO: renamed from: c */
    public long f46905c;

    /* JADX INFO: renamed from: f */
    public ozk f46908f;

    /* JADX INFO: renamed from: g */
    public int f46909g;

    /* JADX INFO: renamed from: h */
    public long f46910h;

    /* JADX INFO: renamed from: i */
    public ozj f46911i;

    /* JADX INFO: renamed from: j */
    public long f46912j;

    /* JADX INFO: renamed from: l */
    private byte f46913l = 2;

    /* JADX INFO: renamed from: d */
    public String f46906d = "";

    /* JADX INFO: renamed from: e */
    public String f46907e = "";

    static {
        oza ozaVar = new oza();
        f46901k = ozaVar;
        nxq.m18130aa(oza.class, ozaVar);
    }

    private oza() {
        nzg nzgVar = nzg.f45063b;
    }

    @Override // p000.nxq
    /* JADX INFO: renamed from: a */
    protected final Object mo3994a(int i, Object obj) {
        switch (i - 1) {
            case 0:
                return Byte.valueOf(this.f46913l);
            case 1:
            default:
                this.f46913l = obj == null ? (byte) 0 : (byte) 1;
                return null;
            case 2:
                return m18129X(f46901k, "\u0001\t\u0000\u0001\u0001\u000b\t\u0000\u0000\u0001\u0001ဌ\u0000\u0002ဌ\u0005\u0003ဂ\u0006\u0006ဉ\u0007\u0007ဂ\b\bစ\u0001\tဈ\u0002\nဈ\u0003\u000bᐉ\u0004", new Object[]{"a", "b", oau.f45203r, "g", oau.f45203r, "h", "i", HEePJw.iaT, "c", "d", "e", "f"});
            case 3:
                return new oza();
            case 4:
                return new nxl(f46901k);
            case 5:
                return f46901k;
            case 6:
                nzd nxmVar = f46902m;
                if (nxmVar == null) {
                    synchronized (oza.class) {
                        nxmVar = f46902m;
                        if (nxmVar == null) {
                            nxmVar = new nxm(f46901k);
                            f46902m = nxmVar;
                        }
                        break;
                    }
                }
                return nxmVar;
        }
    }
}
