package p000;

import com.google.android.material.behavior.iWN.zuAgeeF;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class nms extends nxq implements nyx {

    /* JADX INFO: renamed from: f */
    public static final nms f43891f;

    /* JADX INFO: renamed from: h */
    private static volatile nzd f43892h;

    /* JADX INFO: renamed from: a */
    public int f43893a;

    /* JADX INFO: renamed from: d */
    public long f43896d;

    /* JADX INFO: renamed from: g */
    private byte f43898g = 2;

    /* JADX INFO: renamed from: b */
    public String f43894b = "";

    /* JADX INFO: renamed from: c */
    public String f43895c = "";

    /* JADX INFO: renamed from: e */
    public nxy f43897e = nzg.f45063b;

    static {
        nms nmsVar = new nms();
        f43891f = nmsVar;
        nxq.m18130aa(nms.class, nmsVar);
    }

    private nms() {
    }

    @Override // p000.nxq
    /* JADX INFO: renamed from: a */
    protected final Object mo3994a(int i, Object obj) {
        switch (i - 1) {
            case 0:
                return Byte.valueOf(this.f43898g);
            case 1:
            default:
                this.f43898g = obj == null ? (byte) 0 : (byte) 1;
                return null;
            case 2:
                return m18129X(f43891f, "\u0001\u0004\u0000\u0001\u0001\u0004\u0004\u0000\u0001\u0002\u0001ᔈ\u0000\u0002ဈ\u0001\u0003ဂ\u0002\u0004б", new Object[]{zuAgeeF.xvDPSCTBZsk, "b", "c", "d", "e", nmr.class});
            case 3:
                return new nms();
            case 4:
                return new nxl(f43891f);
            case 5:
                return f43891f;
            case 6:
                nzd nxmVar = f43892h;
                if (nxmVar == null) {
                    synchronized (nms.class) {
                        nxmVar = f43892h;
                        if (nxmVar == null) {
                            nxmVar = new nxm(f43891f);
                            f43892h = nxmVar;
                        }
                        break;
                    }
                }
                return nxmVar;
        }
    }
}
