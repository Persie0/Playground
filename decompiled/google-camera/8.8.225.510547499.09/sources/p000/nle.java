package p000;

import com.google.android.apps.camera.rectiface.jni.cxx.hsSUWRJfoeC;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class nle extends nxq implements nyx {

    /* JADX INFO: renamed from: p */
    public static final nle f43483p;

    /* JADX INFO: renamed from: q */
    private static volatile nzd f43484q;

    /* JADX INFO: renamed from: a */
    public int f43485a;

    /* JADX INFO: renamed from: c */
    public int f43487c;

    /* JADX INFO: renamed from: d */
    public int f43488d;

    /* JADX INFO: renamed from: e */
    public long f43489e;

    /* JADX INFO: renamed from: f */
    public long f43490f;

    /* JADX INFO: renamed from: g */
    public int f43491g;

    /* JADX INFO: renamed from: h */
    public int f43492h;

    /* JADX INFO: renamed from: i */
    public int f43493i;

    /* JADX INFO: renamed from: j */
    public float f43494j;

    /* JADX INFO: renamed from: l */
    public float f43496l;

    /* JADX INFO: renamed from: m */
    public float f43497m;

    /* JADX INFO: renamed from: n */
    public float f43498n;

    /* JADX INFO: renamed from: o */
    public float f43499o;

    /* JADX INFO: renamed from: b */
    public String f43486b = "";

    /* JADX INFO: renamed from: k */
    public nxy f43495k = nzg.f45063b;

    static {
        nle nleVar = new nle();
        f43483p = nleVar;
        nxq.m18130aa(nle.class, nleVar);
    }

    private nle() {
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
                return m18129X(f43483p, "\u0001\u000e\u0000\u0001\u0001\u000e\u000e\u0000\u0001\u0000\u0001ဈ\u0000\u0002င\u0001\u0003ဌ\u0002\u0004ဂ\u0003\u0005ဂ\u0004\u0006င\u0005\u0007င\u0006\bင\u0007\tခ\b\n\u001b\u000bခ\t\fခ\n\rခ\u000b\u000eခ\f", new Object[]{"a", hsSUWRJfoeC.MIjSENklVnzOmr, "c", "d", nks.f43302j, "e", "f", "g", "h", "i", "j", "k", nld.class, "l", "m", "n", "o"});
            case 3:
                return new nle();
            case 4:
                return new nxl(f43483p);
            case 5:
                return f43483p;
            case 6:
                nzd nxmVar = f43484q;
                if (nxmVar == null) {
                    synchronized (nle.class) {
                        nxmVar = f43484q;
                        if (nxmVar == null) {
                            nxmVar = new nxm(f43483p);
                            f43484q = nxmVar;
                        }
                        break;
                    }
                }
                return nxmVar;
        }
    }
}
