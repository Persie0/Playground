package p000;

import com.google.android.libraries.lens.lenslite.api.arLu.YmzeHXaMYOLk;
import com.google.android.libraries.social.licenses.GWO.HEePJw;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes2.dex */
public final class mqm extends nxq implements nyx {

    /* JADX INFO: renamed from: o */
    public static final mqm f41417o;

    /* JADX INFO: renamed from: p */
    private static volatile nzd f41418p;

    /* JADX INFO: renamed from: a */
    public float f41419a;

    /* JADX INFO: renamed from: b */
    public int f41420b;

    /* JADX INFO: renamed from: c */
    public float f41421c;

    /* JADX INFO: renamed from: d */
    public float f41422d;

    /* JADX INFO: renamed from: e */
    public float f41423e;

    /* JADX INFO: renamed from: f */
    public float f41424f;

    /* JADX INFO: renamed from: g */
    public boolean f41425g;

    /* JADX INFO: renamed from: h */
    public float f41426h;

    /* JADX INFO: renamed from: i */
    public float f41427i;

    /* JADX INFO: renamed from: j */
    public float f41428j;

    /* JADX INFO: renamed from: k */
    public float f41429k;

    /* JADX INFO: renamed from: l */
    public float f41430l;

    /* JADX INFO: renamed from: m */
    public float f41431m;

    /* JADX INFO: renamed from: n */
    public float f41432n;

    static {
        mqm mqmVar = new mqm();
        f41417o = mqmVar;
        nxq.m18130aa(mqm.class, mqmVar);
    }

    private mqm() {
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
                return m18129X(f41417o, "\u0000\u000e\u0000\u0000\u0001\u000e\u000e\u0000\u0000\u0000\u0001\u0001\u0002\u000b\u0003\u0001\u0004\u0001\u0005\u0001\u0006\u0001\u0007\u0007\b\u0001\t\u0001\n\u0001\u000b\u0001\f\u0001\r\u0001\u000e\u0001", new Object[]{"a", "b", "c", "d", "e", YmzeHXaMYOLk.cgX, HEePJw.SoOKKoGpUnnExS, "h", "i", "j", "k", "l", "m", "n"});
            case 3:
                return new mqm();
            case 4:
                return new nxl(f41417o);
            case 5:
                return f41417o;
            case 6:
                nzd nxmVar = f41418p;
                if (nxmVar == null) {
                    synchronized (mqm.class) {
                        nxmVar = f41418p;
                        if (nxmVar == null) {
                            nxmVar = new nxm(f41417o);
                            f41418p = nxmVar;
                        }
                        break;
                    }
                }
                return nxmVar;
        }
    }
}
