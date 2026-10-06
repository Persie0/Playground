package p000;

import androidx.wear.widget.iZcI.hiCTUJiAxf;
import com.google.p020vr.vrcore.controller.api.DJK.rmwTRjObXLGH;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class obf extends nxo implements nyx {

    /* JADX INFO: renamed from: n */
    public static final obf f45245n;

    /* JADX INFO: renamed from: p */
    private static volatile nzd f45246p;

    /* JADX INFO: renamed from: a */
    public int f45247a;

    /* JADX INFO: renamed from: c */
    public int f45249c;

    /* JADX INFO: renamed from: d */
    public long f45250d;

    /* JADX INFO: renamed from: e */
    public long f45251e;

    /* JADX INFO: renamed from: f */
    public long f45252f;

    /* JADX INFO: renamed from: h */
    public int f45254h;

    /* JADX INFO: renamed from: i */
    public int f45255i;

    /* JADX INFO: renamed from: j */
    public obd f45256j;

    /* JADX INFO: renamed from: o */
    private byte f45259o = 2;

    /* JADX INFO: renamed from: b */
    public String f45248b = "";

    /* JADX INFO: renamed from: g */
    public String f45253g = "";

    /* JADX INFO: renamed from: k */
    public nxx f45257k = nyn.f45025b;

    /* JADX INFO: renamed from: m */
    public String f45258m = "";

    static {
        obf obfVar = new obf();
        f45245n = obfVar;
        nxq.m18130aa(obf.class, obfVar);
    }

    private obf() {
    }

    /* JADX INFO: renamed from: f */
    public final void m18400f() {
        nxx nxxVar = this.f45257k;
        if (nxxVar.mo17770c()) {
            return;
        }
        this.f45257k = nxq.m18126T(nxxVar);
    }

    @Override // p000.nxq
    /* JADX INFO: renamed from: a */
    protected final Object mo3994a(int i, Object obj) {
        switch (i - 1) {
            case 0:
                return Byte.valueOf(this.f45259o);
            case 1:
            default:
                this.f45259o = obj == null ? (byte) 0 : (byte) 1;
                return null;
            case 2:
                return m18129X(f45245n, "\u0001\u000b\u0000\u0001\u0001\r\u000b\u0000\u0001\u0000\u0001ဈ\u0000\u0002ဂ\u0002\u0003ဂ\u0003\u0004ဂ\u0004\u0005ဈ\u0005\u0006ဌ\u0006\u0007ဌ\u0007\t\u0014\u000bဈ\u000b\fင\u0001\rဉ\t", new Object[]{"a", "b", "d", "e", "f", "g", "h", oau.f45192g, "i", oau.f45191f, hiCTUJiAxf.nHHKJKRhNpXcANJ, "m", "c", rmwTRjObXLGH.DsIhaZPP});
            case 3:
                return new obf();
            case 4:
                return new nxn(f45245n);
            case 5:
                return f45245n;
            case 6:
                nzd nxmVar = f45246p;
                if (nxmVar == null) {
                    synchronized (obf.class) {
                        nxmVar = f45246p;
                        if (nxmVar == null) {
                            nxmVar = new nxm(f45245n);
                            f45246p = nxmVar;
                        }
                        break;
                    }
                }
                return nxmVar;
        }
    }
}
