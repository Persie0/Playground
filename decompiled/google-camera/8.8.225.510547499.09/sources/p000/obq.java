package p000;

import com.google.android.apps.camera.p014ui.captureframe.Tjcw.xRFdVyfdeve;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class obq extends nxq implements nyx {

    /* JADX INFO: renamed from: e */
    public static final obq f45350e;

    /* JADX INFO: renamed from: g */
    private static volatile nzd f45351g;

    /* JADX INFO: renamed from: a */
    public int f45352a;

    /* JADX INFO: renamed from: b */
    public nxw f45353b;

    /* JADX INFO: renamed from: c */
    public nxv f45354c;

    /* JADX INFO: renamed from: d */
    public obu f45355d;

    /* JADX INFO: renamed from: f */
    private byte f45356f = 2;

    static {
        obq obqVar = new obq();
        f45350e = obqVar;
        nxq.m18130aa(obq.class, obqVar);
    }

    private obq() {
        nzg nzgVar = nzg.f45063b;
        this.f45353b = nxr.f44982b;
        this.f45354c = nxj.f44968b;
    }

    @Override // p000.nxq
    /* JADX INFO: renamed from: a */
    protected final Object mo3994a(int i, Object obj) {
        switch (i - 1) {
            case 0:
                return Byte.valueOf(this.f45356f);
            case 1:
            default:
                this.f45356f = obj == null ? (byte) 0 : (byte) 1;
                return null;
            case 2:
                return m18129X(f45350e, "\u0001\u0003\u0000\u0001\u0002\u0004\u0003\u0000\u0002\u0001\u0002'\u0003$\u0004ᐉ\u0000", new Object[]{"a", "b", xRFdVyfdeve.DVbqIhHyFTPY, "d"});
            case 3:
                return new obq();
            case 4:
                return new nxl(f45350e);
            case 5:
                return f45350e;
            case 6:
                nzd nxmVar = f45351g;
                if (nxmVar == null) {
                    synchronized (obq.class) {
                        nxmVar = f45351g;
                        if (nxmVar == null) {
                            nxmVar = new nxm(f45350e);
                            f45351g = nxmVar;
                        }
                        break;
                    }
                }
                return nxmVar;
        }
    }
}
