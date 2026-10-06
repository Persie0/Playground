package p000;

import com.google.android.apps.camera.p014ui.captureframe.Tjcw.gBCSQzBeB;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class obu extends nxq implements nyx {

    /* JADX INFO: renamed from: e */
    public static final obu f45373e;

    /* JADX INFO: renamed from: g */
    private static volatile nzd f45374g;

    /* JADX INFO: renamed from: a */
    public int f45375a;

    /* JADX INFO: renamed from: b */
    public int f45376b;

    /* JADX INFO: renamed from: c */
    public obs f45377c;

    /* JADX INFO: renamed from: f */
    private byte f45379f = 2;

    /* JADX INFO: renamed from: d */
    public nxy f45378d = nzg.f45063b;

    static {
        obu obuVar = new obu();
        f45373e = obuVar;
        nxq.m18130aa(obu.class, obuVar);
    }

    private obu() {
    }

    @Override // p000.nxq
    /* JADX INFO: renamed from: a */
    protected final Object mo3994a(int i, Object obj) {
        switch (i - 1) {
            case 0:
                return Byte.valueOf(this.f45379f);
            case 1:
            default:
                this.f45379f = obj == null ? (byte) 0 : (byte) 1;
                return null;
            case 2:
                return m18129X(f45373e, "\u0001\u0003\u0000\u0001\u0001\u0005\u0003\u0000\u0001\u0000\u0001ဌ\u0000\u0003ဉ\u0002\u0005\u001b", new Object[]{"a", "b", oau.f45195j, "c", gBCSQzBeB.fAD, obt.class});
            case 3:
                return new obu();
            case 4:
                return new nxl(f45373e);
            case 5:
                return f45373e;
            case 6:
                nzd nxmVar = f45374g;
                if (nxmVar == null) {
                    synchronized (obu.class) {
                        nxmVar = f45374g;
                        if (nxmVar == null) {
                            nxmVar = new nxm(f45373e);
                            f45374g = nxmVar;
                        }
                        break;
                    }
                }
                return nxmVar;
        }
    }
}
