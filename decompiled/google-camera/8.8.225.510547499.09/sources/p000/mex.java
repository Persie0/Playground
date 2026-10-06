package p000;

import androidx.wear.widget.iZcI.hiCTUJiAxf;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class mex extends nxo implements nyx {

    /* JADX INFO: renamed from: k */
    public static final mex f40265k;

    /* JADX INFO: renamed from: p */
    private static volatile nzd f40266p;

    /* JADX INFO: renamed from: a */
    public int f40267a;

    /* JADX INFO: renamed from: b */
    public mel f40268b;

    /* JADX INFO: renamed from: c */
    public mff f40269c;

    /* JADX INFO: renamed from: e */
    public mfl f40271e;

    /* JADX INFO: renamed from: f */
    public boolean f40272f;

    /* JADX INFO: renamed from: g */
    public mey f40273g;

    /* JADX INFO: renamed from: h */
    public int f40274h;

    /* JADX INFO: renamed from: i */
    public oas f40275i;

    /* JADX INFO: renamed from: m */
    private mez f40277m;

    /* JADX INFO: renamed from: n */
    private lvc f40278n;

    /* JADX INFO: renamed from: o */
    private byte f40279o = 2;

    /* JADX INFO: renamed from: d */
    public nxy f40270d = nzg.f45063b;

    /* JADX INFO: renamed from: j */
    public String f40276j = "";

    static {
        mex mexVar = new mex();
        f40265k = mexVar;
        nxq.m18130aa(mex.class, mexVar);
    }

    private mex() {
    }

    @Override // p000.nxq
    /* JADX INFO: renamed from: a */
    protected final Object mo3994a(int i, Object obj) {
        switch (i - 1) {
            case 0:
                return Byte.valueOf(this.f40279o);
            case 1:
            default:
                this.f40279o = obj == null ? (byte) 0 : (byte) 1;
                return null;
            case 2:
                return m18129X(f40265k, "\u0001\u000b\u0000\u0001\u0003?\u000b\u0000\u0001\u0002\u0003ဉ\u0001\bဉ\u000f\u000fဉ\u001f\u0014ᐉ\u0003&ᐉ\b'ဉ\u0015-ဌ\u0014.ဇ\n8ဈ\u0017>ဉ\u0000?\u001b", new Object[]{"a", "c", hiCTUJiAxf.qxIvef, "n", "e", "m", "i", "h", kva.f37294h, "f", "j", "b", "d", pbw.class});
            case 3:
                return new mex();
            case 4:
                return new nxn(f40265k);
            case 5:
                return f40265k;
            case 6:
                nzd nxmVar = f40266p;
                if (nxmVar == null) {
                    synchronized (mex.class) {
                        nxmVar = f40266p;
                        if (nxmVar == null) {
                            nxmVar = new nxm(f40265k);
                            f40266p = nxmVar;
                        }
                        break;
                    }
                }
                return nxmVar;
        }
    }
}
