package p000;

import com.google.android.apps.camera.zoomui.view.WdNM.xPAWq;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class cnv extends nxq implements nyx {

    /* JADX INFO: renamed from: b */
    public static final cnv f6392b;

    /* JADX INFO: renamed from: c */
    private static volatile nzd f6393c;

    /* JADX INFO: renamed from: a */
    public nxy f6394a = nzg.f45063b;

    static {
        cnv cnvVar = new cnv();
        f6392b = cnvVar;
        nxq.m18130aa(cnv.class, cnvVar);
    }

    private cnv() {
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
                return m18129X(f6392b, "\u0000\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0001\u0000\u0001\u001b", new Object[]{xPAWq.QXZimdnvztIP, cnu.class});
            case 3:
                return new cnv();
            case 4:
                return new nxl(f6392b);
            case 5:
                return f6392b;
            case 6:
                nzd nxmVar = f6393c;
                if (nxmVar == null) {
                    synchronized (cnv.class) {
                        nxmVar = f6393c;
                        if (nxmVar == null) {
                            nxmVar = new nxm(f6392b);
                            f6393c = nxmVar;
                        }
                        break;
                    }
                }
                return nxmVar;
        }
    }
}
