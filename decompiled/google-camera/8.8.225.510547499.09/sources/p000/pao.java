package p000;

import com.google.android.apps.camera.jni.microvideotonemap.yUpa.qQLA;
import com.google.android.play.core.common.wMe.NptsKnlVczSZ;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class pao extends nxq implements nyx {

    /* JADX INFO: renamed from: k */
    public static final pao f47241k;

    /* JADX INFO: renamed from: l */
    private static volatile nzd f47242l;

    /* JADX INFO: renamed from: a */
    public int f47243a;

    /* JADX INFO: renamed from: b */
    public long f47244b;

    /* JADX INFO: renamed from: c */
    public long f47245c;

    /* JADX INFO: renamed from: d */
    public long f47246d;

    /* JADX INFO: renamed from: e */
    public long f47247e;

    /* JADX INFO: renamed from: f */
    public long f47248f;

    /* JADX INFO: renamed from: g */
    public long f47249g;

    /* JADX INFO: renamed from: h */
    public long f47250h;

    /* JADX INFO: renamed from: i */
    public long f47251i;

    /* JADX INFO: renamed from: j */
    public nxy f47252j = nzg.f45063b;

    static {
        pao paoVar = new pao();
        f47241k = paoVar;
        nxq.m18130aa(pao.class, paoVar);
    }

    private pao() {
    }

    /* JADX INFO: renamed from: c */
    public final void m19257c() {
        nxy nxyVar = this.f47252j;
        if (nxyVar.mo17770c()) {
            return;
        }
        this.f47252j = nxq.m18127U(nxyVar);
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
                return m18129X(f47241k, "\u0001\t\u0000\u0001\u0001\n\t\u0000\u0001\u0000\u0001ဂ\u0000\u0002ဂ\u0001\u0003ဂ\u0002\u0004ဂ\u0003\u0005ဂ\u0004\u0006ဂ\u0005\u0007ဂ\u0006\bဂ\u0007\n\u001b", new Object[]{"a", "b", "c", "d", qQLA.tri, "f", "g", NptsKnlVczSZ.mvrnodZuZSv, "i", "j", pan.class});
            case 3:
                return new pao();
            case 4:
                return new nxl(f47241k);
            case 5:
                return f47241k;
            case 6:
                nzd nxmVar = f47242l;
                if (nxmVar == null) {
                    synchronized (pao.class) {
                        nxmVar = f47242l;
                        if (nxmVar == null) {
                            nxmVar = new nxm(f47241k);
                            f47242l = nxmVar;
                        }
                        break;
                    }
                }
                return nxmVar;
        }
    }
}
