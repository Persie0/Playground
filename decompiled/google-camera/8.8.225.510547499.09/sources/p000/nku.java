package p000;

import com.google.android.apps.camera.rectiface.jni.cxx.hsSUWRJfoeC;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class nku extends nxq implements nyx {

    /* JADX INFO: renamed from: g */
    public static final nku f43324g;

    /* JADX INFO: renamed from: h */
    private static volatile nzd f43325h;

    /* JADX INFO: renamed from: a */
    public int f43326a;

    /* JADX INFO: renamed from: b */
    public int f43327b;

    /* JADX INFO: renamed from: c */
    public long f43328c;

    /* JADX INFO: renamed from: d */
    public long f43329d;

    /* JADX INFO: renamed from: e */
    public long f43330e;

    /* JADX INFO: renamed from: f */
    public long f43331f;

    static {
        nku nkuVar = new nku();
        f43324g = nkuVar;
        nxq.m18130aa(nku.class, nkuVar);
    }

    private nku() {
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
                return m18129X(f43324g, "\u0001\u0005\u0000\u0001\u0001\u0005\u0005\u0000\u0000\u0000\u0001ဌ\u0000\u0002ဂ\u0001\u0003ဂ\u0002\u0004ဂ\u0003\u0005ဂ\u0004", new Object[]{"a", "b", nks.f43295c, "c", hsSUWRJfoeC.StEBTO, "e", "f"});
            case 3:
                return new nku();
            case 4:
                return new nxl(f43324g);
            case 5:
                return f43324g;
            case 6:
                nzd nxmVar = f43325h;
                if (nxmVar == null) {
                    synchronized (nku.class) {
                        nxmVar = f43325h;
                        if (nxmVar == null) {
                            nxmVar = new nxm(f43324g);
                            f43325h = nxmVar;
                        }
                        break;
                    }
                }
                return nxmVar;
        }
    }
}
