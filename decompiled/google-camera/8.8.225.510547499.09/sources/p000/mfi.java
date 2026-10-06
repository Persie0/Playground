package p000;

import com.google.android.apps.camera.util.p015ui.mfv.EArqVBjecl;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class mfi extends nxq implements nyx {

    /* JADX INFO: renamed from: f */
    public static final mfi f40330f;

    /* JADX INFO: renamed from: g */
    private static volatile nzd f40331g;

    /* JADX INFO: renamed from: a */
    public int f40332a;

    /* JADX INFO: renamed from: c */
    public Object f40334c;

    /* JADX INFO: renamed from: d */
    public float f40335d;

    /* JADX INFO: renamed from: b */
    public int f40333b = 0;

    /* JADX INFO: renamed from: e */
    public String f40336e = "";

    static {
        mfi mfiVar = new mfi();
        f40330f = mfiVar;
        nxq.m18130aa(mfi.class, mfiVar);
    }

    private mfi() {
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
                return m18129X(f40330f, "\u0001\u0004\u0001\u0001\u0001\u0004\u0004\u0000\u0000\u0000\u0001ျ\u0000\u0002ခ\u0002\u0003ျ\u0000\u0004ဈ\u0003", new Object[]{"c", "b", "a", "d", EArqVBjecl.qiURLKVZ});
            case 3:
                return new mfi();
            case 4:
                return new nxl(f40330f);
            case 5:
                return f40330f;
            case 6:
                nzd nxmVar = f40331g;
                if (nxmVar == null) {
                    synchronized (mfi.class) {
                        nxmVar = f40331g;
                        if (nxmVar == null) {
                            nxmVar = new nxm(f40330f);
                            f40331g = nxmVar;
                        }
                        break;
                    }
                }
                return nxmVar;
        }
    }
}
