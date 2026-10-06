package p000;

import com.google.android.libraries.social.licenses.GWO.HEePJw;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class nie extends nxq implements nyx {

    /* JADX INFO: renamed from: n */
    public static final nie f42666n;

    /* JADX INFO: renamed from: o */
    private static volatile nzd f42667o;

    /* JADX INFO: renamed from: a */
    public int f42668a;

    /* JADX INFO: renamed from: b */
    public long f42669b;

    /* JADX INFO: renamed from: c */
    public long f42670c;

    /* JADX INFO: renamed from: d */
    public long f42671d;

    /* JADX INFO: renamed from: e */
    public long f42672e;

    /* JADX INFO: renamed from: f */
    public long f42673f;

    /* JADX INFO: renamed from: g */
    public long f42674g;

    /* JADX INFO: renamed from: h */
    public long f42675h;

    /* JADX INFO: renamed from: i */
    public long f42676i;

    /* JADX INFO: renamed from: j */
    public nxy f42677j = nzg.f45063b;

    /* JADX INFO: renamed from: k */
    public long f42678k;

    /* JADX INFO: renamed from: l */
    public long f42679l;

    /* JADX INFO: renamed from: m */
    public long f42680m;

    static {
        nie nieVar = new nie();
        f42666n = nieVar;
        nxq.m18130aa(nie.class, nieVar);
    }

    private nie() {
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
                return m18129X(f42666n, "\u0001\f\u0000\u0001\u0001\u0011\f\u0000\u0001\u0000\u0001ဂ\u0000\u0002ဂ\u0001\u0003ဂ\u0002\u0004ဂ\t\u0005ဂ\n\u0006ဂ\f\tဂ\u0005\nဂ\u0006\u000e\u001b\u000fဂ\r\u0010ဂ\u000e\u0011ဂ\u000f", new Object[]{"a", "b", "c", "d", "g", "h", HEePJw.zSFse, "e", "f", "j", nkj.class, "k", "l", "m"});
            case 3:
                return new nie();
            case 4:
                return new nxl(f42666n);
            case 5:
                return f42666n;
            case 6:
                nzd nxmVar = f42667o;
                if (nxmVar == null) {
                    synchronized (nie.class) {
                        nxmVar = f42667o;
                        if (nxmVar == null) {
                            nxmVar = new nxm(f42666n);
                            f42667o = nxmVar;
                        }
                        break;
                    }
                }
                return nxmVar;
        }
    }
}
