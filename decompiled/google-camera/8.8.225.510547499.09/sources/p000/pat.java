package p000;

import com.google.android.apps.camera.zoomui.view.WdNM.xPAWq;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class pat extends nxq implements nyx {

    /* JADX INFO: renamed from: u */
    public static final pat f47274u;

    /* JADX INFO: renamed from: x */
    private static volatile nzd f47275x;

    /* JADX INFO: renamed from: a */
    public int f47276a;

    /* JADX INFO: renamed from: b */
    public long f47277b;

    /* JADX INFO: renamed from: e */
    public ozp f47280e;

    /* JADX INFO: renamed from: f */
    public ozr f47281f;

    /* JADX INFO: renamed from: g */
    public paf f47282g;

    /* JADX INFO: renamed from: h */
    public pao f47283h;

    /* JADX INFO: renamed from: i */
    public ozb f47284i;

    /* JADX INFO: renamed from: j */
    public pal f47285j;

    /* JADX INFO: renamed from: k */
    public ozt f47286k;

    /* JADX INFO: renamed from: l */
    public oyx f47287l;

    /* JADX INFO: renamed from: m */
    public pas f47288m;

    /* JADX INFO: renamed from: n */
    public pai f47289n;

    /* JADX INFO: renamed from: p */
    public pac f47291p;

    /* JADX INFO: renamed from: q */
    public par f47292q;

    /* JADX INFO: renamed from: r */
    public paj f47293r;

    /* JADX INFO: renamed from: s */
    public ozk f47294s;

    /* JADX INFO: renamed from: t */
    public paa f47295t;

    /* JADX INFO: renamed from: v */
    private pad f47296v;

    /* JADX INFO: renamed from: w */
    private byte f47297w = 2;

    /* JADX INFO: renamed from: c */
    public String f47278c = "";

    /* JADX INFO: renamed from: d */
    public String f47279d = "";

    /* JADX INFO: renamed from: o */
    public nxy f47290o = nzg.f45063b;

    static {
        pat patVar = new pat();
        f47274u = patVar;
        nxq.m18130aa(pat.class, patVar);
    }

    private pat() {
    }

    @Override // p000.nxq
    /* JADX INFO: renamed from: a */
    protected final Object mo3994a(int i, Object obj) {
        switch (i - 1) {
            case 0:
                return Byte.valueOf(this.f47297w);
            case 1:
            default:
                this.f47297w = obj == null ? (byte) 0 : (byte) 1;
                return null;
            case 2:
                return m18129X(f47274u, "\u0001\u0014\u0000\u0001\u0001\"\u0014\u0000\u0001\b\u0001ᐉ\u0003\u0002စ\u0000\u0003ဈ\u0001\u0005ဉ\u0018\u0006ᐉ\u0005\u0007ᐉ\u0006\bᐉ\u0019\tဉ\u0007\nᐉ\b\fဉ\n\u000eᐉ\u001b\u0010ᐉ\f\u0011ဈ\u0002\u0015ဉ\u001c\u0017ဉ\u001a\u001dᐉ\u0015\u001eဉ\u0016\u001fဉ\u0017 ဉ\u0013\"\u001b", new Object[]{"a", "e", "b", "c", "p", xPAWq.lhgcZTizgG, "g", "q", "h", "i", "j", "s", "k", "d", "t", "r", "v", "m", "n", "l", "o", ozl.class});
            case 3:
                return new pat();
            case 4:
                return new nxl(f47274u);
            case 5:
                return f47274u;
            case 6:
                nzd nxmVar = f47275x;
                if (nxmVar == null) {
                    synchronized (pat.class) {
                        nxmVar = f47275x;
                        if (nxmVar == null) {
                            nxmVar = new nxm(f47274u);
                            f47275x = nxmVar;
                        }
                        break;
                    }
                }
                return nxmVar;
        }
    }
}
