package p000;

import com.google.android.libraries.lens.lenslite.api.arLu.YmzeHXaMYOLk;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class oef extends nxq implements nyx {

    /* JADX INFO: renamed from: e */
    public static final oef f45720e;

    /* JADX INFO: renamed from: i */
    private static volatile nzd f45721i;

    /* JADX INFO: renamed from: a */
    public ocx f45722a;

    /* JADX INFO: renamed from: b */
    public float f45723b;

    /* JADX INFO: renamed from: c */
    public oeg f45724c;

    /* JADX INFO: renamed from: d */
    public odh f45725d;

    /* JADX INFO: renamed from: f */
    private int f45726f;

    /* JADX INFO: renamed from: g */
    private odh f45727g;

    /* JADX INFO: renamed from: h */
    private byte f45728h = 2;

    static {
        oef oefVar = new oef();
        f45720e = oefVar;
        nxq.m18130aa(oef.class, oefVar);
    }

    private oef() {
    }

    @Override // p000.nxq
    /* JADX INFO: renamed from: a */
    protected final Object mo3994a(int i, Object obj) {
        switch (i - 1) {
            case 0:
                return Byte.valueOf(this.f45728h);
            case 1:
            default:
                this.f45728h = obj == null ? (byte) 0 : (byte) 1;
                return null;
            case 2:
                return m18129X(f45720e, "\u0001\u0005\u0000\u0001\u0001\u0007\u0005\u0000\u0000\u0002\u0001ဉ\u0000\u0002ခ\u0001\u0004ဉ\u0002\u0006ᐉ\u0004\u0007ᐉ\u0005", new Object[]{"f", "a", "b", "c", YmzeHXaMYOLk.yEDLjOOv, "g"});
            case 3:
                return new oef();
            case 4:
                return new nxl(f45720e);
            case 5:
                return f45720e;
            case 6:
                nzd nxmVar = f45721i;
                if (nxmVar == null) {
                    synchronized (oef.class) {
                        nxmVar = f45721i;
                        if (nxmVar == null) {
                            nxmVar = new nxm(f45720e);
                            f45721i = nxmVar;
                        }
                        break;
                    }
                }
                return nxmVar;
        }
    }
}
