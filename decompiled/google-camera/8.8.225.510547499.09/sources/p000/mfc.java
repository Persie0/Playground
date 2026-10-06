package p000;

import com.google.android.libraries.camera.jni.graphics.bVLS.aJFPpVSaoDO;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class mfc extends nxq implements nyx {

    /* JADX INFO: renamed from: b */
    public static final mfc f40303b;

    /* JADX INFO: renamed from: c */
    private static volatile nzd f40304c;

    /* JADX INFO: renamed from: a */
    public nxy f40305a = nzg.f45063b;

    static {
        mfc mfcVar = new mfc();
        f40303b = mfcVar;
        nxq.m18130aa(mfc.class, mfcVar);
    }

    private mfc() {
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
                return m18129X(f40303b, "\u0001\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0001\u0000\u0001\u001b", new Object[]{aJFPpVSaoDO.OUsRpWdgadORhk, mfb.class});
            case 3:
                return new mfc();
            case 4:
                return new nxl(f40303b);
            case 5:
                return f40303b;
            case 6:
                nzd nxmVar = f40304c;
                if (nxmVar == null) {
                    synchronized (mfc.class) {
                        nxmVar = f40304c;
                        if (nxmVar == null) {
                            nxmVar = new nxm(f40303b);
                            f40304c = nxmVar;
                        }
                        break;
                    }
                }
                return nxmVar;
        }
    }
}
