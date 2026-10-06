package p000;

import androidx.work.impl.diagnostics.p003tK.KMNlNMe;
import com.google.android.material.behavior.iWN.zuAgeeF;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class odq extends nxq implements nyx {

    /* JADX INFO: renamed from: r */
    public static final odq f45654r;

    /* JADX INFO: renamed from: w */
    private static volatile nzd f45655w;

    /* JADX INFO: renamed from: a */
    public int f45656a;

    /* JADX INFO: renamed from: c */
    public int f45658c;

    /* JADX INFO: renamed from: d */
    public boolean f45659d;

    /* JADX INFO: renamed from: e */
    public boolean f45660e;

    /* JADX INFO: renamed from: f */
    public int f45661f;

    /* JADX INFO: renamed from: g */
    public int f45662g;

    /* JADX INFO: renamed from: h */
    public boolean f45663h;

    /* JADX INFO: renamed from: i */
    public boolean f45664i;

    /* JADX INFO: renamed from: j */
    public boolean f45665j;

    /* JADX INFO: renamed from: k */
    public int f45666k;

    /* JADX INFO: renamed from: l */
    public String f45667l;

    /* JADX INFO: renamed from: m */
    public String f45668m;

    /* JADX INFO: renamed from: n */
    public String f45669n;

    /* JADX INFO: renamed from: o */
    public boolean f45670o;

    /* JADX INFO: renamed from: p */
    public boolean f45671p;

    /* JADX INFO: renamed from: q */
    public oed f45672q;

    /* JADX INFO: renamed from: s */
    private int f45673s;

    /* JADX INFO: renamed from: t */
    private oec f45674t;

    /* JADX INFO: renamed from: u */
    private oee f45675u;

    /* JADX INFO: renamed from: v */
    private byte f45676v = 2;

    /* JADX INFO: renamed from: b */
    public nxy f45657b = nzg.f45063b;

    static {
        odq odqVar = new odq();
        f45654r = odqVar;
        nxq.m18130aa(odq.class, odqVar);
    }

    private odq() {
        String str = KMNlNMe.pftsdAgnAa;
        this.f45667l = str;
        this.f45668m = str;
        this.f45669n = str;
    }

    @Override // p000.nxq
    /* JADX INFO: renamed from: a */
    protected final Object mo3994a(int i, Object obj) {
        switch (i - 1) {
            case 0:
                return Byte.valueOf(this.f45676v);
            case 1:
            default:
                this.f45676v = obj == null ? (byte) 0 : (byte) 1;
                return null;
            case 2:
                return m18129X(f45654r, "\u0001\u0012\u0000\u0002\u00076\u0012\u0000\u0001\u0001\u0007ဉ\u0013\bင\u0006\u000eဌ\u0005\u0016ဉ\u001b\u0018Л\u001eဇ\u0019\u001fဇ\t ဇ\u0001%ဈ\u0016&ဈ\u0017'ဈ\u0018(ဇ\u001a)ဇ\r*ဉ\".ဇ\u00020ဇ\f5ဌ\u00006ဌ\u000e", new Object[]{"a", "s", "t", "g", "f", oau.f45199n, "q", "b", oce.class, "o", "h", "d", "l", "m", "n", "p", zuAgeeF.belMtjCDLxp, "u", "e", zuAgeeF.WhPbaZhysuuMS, "c", oau.f45186a, "k", oau.f45198m});
            case 3:
                return new odq();
            case 4:
                return new nxl(f45654r);
            case 5:
                return f45654r;
            case 6:
                nzd nxmVar = f45655w;
                if (nxmVar == null) {
                    synchronized (odq.class) {
                        nxmVar = f45655w;
                        if (nxmVar == null) {
                            nxmVar = new nxm(f45654r);
                            f45655w = nxmVar;
                        }
                        break;
                    }
                }
                return nxmVar;
        }
    }
}
