package p000;

import com.google.android.apps.camera.util.p015ui.mfv.EArqVBjecl;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class men extends nxq implements nyx {

    /* JADX INFO: renamed from: e */
    public static final men f40198e;

    /* JADX INFO: renamed from: g */
    private static volatile nzd f40199g;

    /* JADX INFO: renamed from: a */
    public int f40200a;

    /* JADX INFO: renamed from: b */
    public nxy f40201b;

    /* JADX INFO: renamed from: c */
    public nxy f40202c;

    /* JADX INFO: renamed from: d */
    public long f40203d;

    /* JADX INFO: renamed from: f */
    private String f40204f = "";

    static {
        men menVar = new men();
        f40198e = menVar;
        nxq.m18130aa(men.class, menVar);
    }

    private men() {
        nzg nzgVar = nzg.f45063b;
        this.f40201b = nzgVar;
        this.f40202c = nzgVar;
    }

    /* JADX INFO: renamed from: b */
    public static /* synthetic */ void m16337b(men menVar) {
        menVar.f40200a |= 1;
        menVar.f40204f = "camera_vkp";
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
                return m18129X(f40198e, "\u0001\u0004\u0000\u0001\u0001\u0004\u0004\u0000\u0002\u0000\u0001ဈ\u0000\u0002\u001a\u0003\u001b\u0004ဂ\u0001", new Object[]{"a", "f", EArqVBjecl.mjBmw, "c", meo.class, "d"});
            case 3:
                return new men();
            case 4:
                return new nxl(f40198e);
            case 5:
                return f40198e;
            case 6:
                nzd nxmVar = f40199g;
                if (nxmVar == null) {
                    synchronized (men.class) {
                        nxmVar = f40199g;
                        if (nxmVar == null) {
                            nxmVar = new nxm(f40198e);
                            f40199g = nxmVar;
                        }
                        break;
                    }
                }
                return nxmVar;
        }
    }
}
