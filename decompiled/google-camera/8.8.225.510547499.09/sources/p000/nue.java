package p000;

import com.google.android.libraries.vision.opengl.MUg.WIxTIdUIdfb;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes2.dex */
public final class nue extends nxq implements nyx {

    /* JADX INFO: renamed from: d */
    public static final nue f44640d;

    /* JADX INFO: renamed from: e */
    private static volatile nzd f44641e;

    /* JADX INFO: renamed from: a */
    public nuf f44642a;

    /* JADX INFO: renamed from: b */
    public nwg f44643b;

    /* JADX INFO: renamed from: c */
    public int f44644c;

    static {
        nue nueVar = new nue();
        f44640d = nueVar;
        nxq.m18130aa(nue.class, nueVar);
    }

    private nue() {
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
                return m18129X(f44640d, "\u0000\u0003\u0000\u0000\u0001\u0003\u0003\u0000\u0000\u0000\u0001\t\u0002\t\u0003\u0004", new Object[]{"a", WIxTIdUIdfb.BBieMTFgoXjVolB, "c"});
            case 3:
                return new nue();
            case 4:
                return new nxl(f44640d);
            case 5:
                return f44640d;
            case 6:
                nzd nxmVar = f44641e;
                if (nxmVar == null) {
                    synchronized (nue.class) {
                        nxmVar = f44641e;
                        if (nxmVar == null) {
                            nxmVar = new nxm(f44640d);
                            f44641e = nxmVar;
                        }
                        break;
                    }
                }
                return nxmVar;
        }
    }
}
