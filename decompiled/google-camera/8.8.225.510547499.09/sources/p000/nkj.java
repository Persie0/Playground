package p000;

import com.google.android.gms.common.annotation.HJo.JrxsYuVZZqnFC;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class nkj extends nxq implements nyx {

    /* JADX INFO: renamed from: d */
    public static final nkj f43213d;

    /* JADX INFO: renamed from: e */
    private static volatile nzd f43214e;

    /* JADX INFO: renamed from: a */
    public int f43215a;

    /* JADX INFO: renamed from: b */
    public long f43216b;

    /* JADX INFO: renamed from: c */
    public long f43217c;

    static {
        nkj nkjVar = new nkj();
        f43213d = nkjVar;
        nxq.m18130aa(nkj.class, nkjVar);
    }

    private nkj() {
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
                return m18129X(f43213d, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001ဂ\u0000\u0002ဂ\u0001", new Object[]{JrxsYuVZZqnFC.wxKOcclMuBu, "b", "c"});
            case 3:
                return new nkj();
            case 4:
                return new nxl(f43213d);
            case 5:
                return f43213d;
            case 6:
                nzd nxmVar = f43214e;
                if (nxmVar == null) {
                    synchronized (nkj.class) {
                        nxmVar = f43214e;
                        if (nxmVar == null) {
                            nxmVar = new nxm(f43213d);
                            f43214e = nxmVar;
                        }
                        break;
                    }
                }
                return nxmVar;
        }
    }
}
