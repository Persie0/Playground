package p000;

import com.google.android.apps.camera.brella.mediastore.p007hP.wUzNh;
import com.google.android.gms.common.annotation.HJo.JrxsYuVZZqnFC;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class pby extends nxq implements nyx {

    /* JADX INFO: renamed from: c */
    public static final pby f47374c;

    /* JADX INFO: renamed from: d */
    private static volatile nzd f47375d;

    /* JADX INFO: renamed from: a */
    public int f47376a;

    /* JADX INFO: renamed from: b */
    public boolean f47377b;

    static {
        pby pbyVar = new pby();
        f47374c = pbyVar;
        nxq.m18130aa(pby.class, pbyVar);
    }

    private pby() {
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
                return m18129X(f47374c, "\u0001\u0001\u0000\u0001\u0002\u0002\u0001\u0000\u0000\u0000\u0002ဇ\u0001", new Object[]{JrxsYuVZZqnFC.yKdBqjZnxI, wUzNh.uLl});
            case 3:
                return new pby();
            case 4:
                return new nxl(f47374c);
            case 5:
                return f47374c;
            case 6:
                nzd nxmVar = f47375d;
                if (nxmVar == null) {
                    synchronized (pby.class) {
                        nxmVar = f47375d;
                        if (nxmVar == null) {
                            nxmVar = new nxm(f47374c);
                            f47375d = nxmVar;
                        }
                        break;
                    }
                }
                return nxmVar;
        }
    }
}
