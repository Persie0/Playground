package p000;

import com.google.android.apps.camera.rectiface.jni.cxx.hsSUWRJfoeC;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class nkb extends nxq implements nyx {

    /* JADX INFO: renamed from: e */
    public static final nkb f43161e;

    /* JADX INFO: renamed from: f */
    private static volatile nzd f43162f;

    /* JADX INFO: renamed from: a */
    public int f43163a;

    /* JADX INFO: renamed from: b */
    public int f43164b;

    /* JADX INFO: renamed from: c */
    public int f43165c;

    /* JADX INFO: renamed from: d */
    public int f43166d;

    static {
        nkb nkbVar = new nkb();
        f43161e = nkbVar;
        nxq.m18130aa(nkb.class, nkbVar);
    }

    private nkb() {
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
                return m18129X(f43161e, "\u0001\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0000\u0001ဌ\u0000\u0002ဌ\u0001\u0003ဌ\u0002", new Object[]{hsSUWRJfoeC.yOVAwWsffFUYlT, "b", njy.f43116f, "c", njy.f43115e, "d", njy.f43114d});
            case 3:
                return new nkb();
            case 4:
                return new nxl(f43161e);
            case 5:
                return f43161e;
            case 6:
                nzd nxmVar = f43162f;
                if (nxmVar == null) {
                    synchronized (nkb.class) {
                        nxmVar = f43162f;
                        if (nxmVar == null) {
                            nxmVar = new nxm(f43161e);
                            f43162f = nxmVar;
                        }
                        break;
                    }
                }
                return nxmVar;
        }
    }
}
