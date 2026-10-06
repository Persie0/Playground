package p000;

import com.google.android.material.behavior.iWN.zuAgeeF;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class kxc extends nxq implements nyx {

    /* JADX INFO: renamed from: h */
    public static final kxc f37609h;

    /* JADX INFO: renamed from: i */
    private static volatile nzd f37610i;

    /* JADX INFO: renamed from: a */
    public String f37611a = "";

    /* JADX INFO: renamed from: b */
    public String f37612b = "";

    /* JADX INFO: renamed from: c */
    public String f37613c = "";

    /* JADX INFO: renamed from: d */
    public String f37614d = "";

    /* JADX INFO: renamed from: e */
    public String f37615e = "";

    /* JADX INFO: renamed from: f */
    public kxb f37616f;

    /* JADX INFO: renamed from: g */
    public kxb f37617g;

    static {
        kxc kxcVar = new kxc();
        f37609h = kxcVar;
        nxq.m18130aa(kxc.class, kxcVar);
    }

    private kxc() {
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
                return m18129X(f37609h, "\u0000\u0007\u0000\u0000\u0001\u0007\u0007\u0000\u0000\u0000\u0001Ȉ\u0002Ȉ\u0003Ȉ\u0004Ȉ\u0005Ȉ\u0006\t\u0007\t", new Object[]{"a", "b", "c", "d", zuAgeeF.ttEmbslQE, "f", "g"});
            case 3:
                return new kxc();
            case 4:
                return new nxl(f37609h);
            case 5:
                return f37609h;
            case 6:
                nzd nxmVar = f37610i;
                if (nxmVar == null) {
                    synchronized (kxc.class) {
                        nxmVar = f37610i;
                        if (nxmVar == null) {
                            nxmVar = new nxm(f37609h);
                            f37610i = nxmVar;
                        }
                        break;
                    }
                }
                return nxmVar;
        }
    }
}
