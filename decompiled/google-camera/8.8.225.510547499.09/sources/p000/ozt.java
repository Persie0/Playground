package p000;

import com.google.android.gms.dynamite.p017ho.DNTdN;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class ozt extends nxq implements nyx {

    /* JADX INFO: renamed from: f */
    public static final ozt f47075f;

    /* JADX INFO: renamed from: h */
    private static volatile nzd f47076h;

    /* JADX INFO: renamed from: a */
    public int f47077a;

    /* JADX INFO: renamed from: b */
    public long f47078b;

    /* JADX INFO: renamed from: c */
    public int f47079c;

    /* JADX INFO: renamed from: e */
    public ozx f47081e;

    /* JADX INFO: renamed from: g */
    private byte f47082g = 2;

    /* JADX INFO: renamed from: d */
    public nxy f47080d = nzg.f45063b;

    static {
        ozt oztVar = new ozt();
        f47075f = oztVar;
        nxq.m18130aa(ozt.class, oztVar);
    }

    private ozt() {
    }

    @Override // p000.nxq
    /* JADX INFO: renamed from: a */
    protected final Object mo3994a(int i, Object obj) {
        switch (i - 1) {
            case 0:
                return Byte.valueOf(this.f47082g);
            case 1:
            default:
                this.f47082g = obj == null ? (byte) 0 : (byte) 1;
                return null;
            case 2:
                return m18129X(f47075f, "\u0001\u0004\u0000\u0001\u0001\u0006\u0004\u0000\u0001\u0001\u0001စ\u0000\u0002Л\u0003ဌ\u0001\u0006ဉ\u0004", new Object[]{"a", DNTdN.BOfc, "d", ozu.class, "c", oau.f45206u, "e"});
            case 3:
                return new ozt();
            case 4:
                return new nxl(f47075f);
            case 5:
                return f47075f;
            case 6:
                nzd nxmVar = f47076h;
                if (nxmVar == null) {
                    synchronized (ozt.class) {
                        nxmVar = f47076h;
                        if (nxmVar == null) {
                            nxmVar = new nxm(f47075f);
                            f47076h = nxmVar;
                        }
                        break;
                    }
                }
                return nxmVar;
        }
    }
}
