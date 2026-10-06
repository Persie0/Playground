package p000;

import com.google.android.apps.camera.cameravisionkit.olQ.BEeWZPor;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class kxd extends nxq implements nyx {

    /* JADX INFO: renamed from: h */
    public static final kxd f37618h;

    /* JADX INFO: renamed from: i */
    private static volatile nzd f37619i;

    /* JADX INFO: renamed from: a */
    public String f37620a = "";

    /* JADX INFO: renamed from: b */
    public nxy f37621b;

    /* JADX INFO: renamed from: c */
    public nxy f37622c;

    /* JADX INFO: renamed from: d */
    public String f37623d;

    /* JADX INFO: renamed from: e */
    public String f37624e;

    /* JADX INFO: renamed from: f */
    public String f37625f;

    /* JADX INFO: renamed from: g */
    public String f37626g;

    static {
        kxd kxdVar = new kxd();
        f37618h = kxdVar;
        nxq.m18130aa(kxd.class, kxdVar);
    }

    private kxd() {
        nzg nzgVar = nzg.f45063b;
        this.f37621b = nzgVar;
        this.f37622c = nzgVar;
        this.f37623d = "";
        this.f37624e = "";
        this.f37625f = "";
        this.f37626g = "";
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
                return m18129X(f37618h, "\u0000\u0007\u0000\u0000\u0001\u0007\u0007\u0000\u0002\u0000\u0001Ȉ\u0002Ț\u0003Ț\u0004Ȉ\u0005Ȉ\u0006Ȉ\u0007Ȉ", new Object[]{"a", "b", "c", "d", BEeWZPor.ScqajiBbQLMUUN, "f", "g"});
            case 3:
                return new kxd();
            case 4:
                return new nxl(f37618h);
            case 5:
                return f37618h;
            case 6:
                nzd nxmVar = f37619i;
                if (nxmVar == null) {
                    synchronized (kxd.class) {
                        nxmVar = f37619i;
                        if (nxmVar == null) {
                            nxmVar = new nxm(f37618h);
                            f37619i = nxmVar;
                        }
                        break;
                    }
                }
                return nxmVar;
        }
    }
}
