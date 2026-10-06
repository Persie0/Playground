package p000;

import android.support.wearable.complications.rendering.p002EM.voNZjxiJou;
import androidx.work.impl.background.systemalarm.vIy.VCYBIzY;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class nvs extends nxq implements nyx {

    /* JADX INFO: renamed from: a */
    public static final nvs f44776a;

    /* JADX INFO: renamed from: h */
    private static volatile nzd f44777h;

    /* JADX INFO: renamed from: b */
    private int f44778b;

    /* JADX INFO: renamed from: c */
    private float f44779c;

    /* JADX INFO: renamed from: d */
    private float f44780d;

    /* JADX INFO: renamed from: e */
    private float f44781e;

    /* JADX INFO: renamed from: f */
    private float f44782f;

    /* JADX INFO: renamed from: g */
    private byte f44783g = 2;

    static {
        nvs nvsVar = new nvs();
        f44776a = nvsVar;
        nxq.m18130aa(nvs.class, nvsVar);
    }

    private nvs() {
    }

    @Override // p000.nxq
    /* JADX INFO: renamed from: a */
    protected final Object mo3994a(int i, Object obj) {
        switch (i - 1) {
            case 0:
                return Byte.valueOf(this.f44783g);
            case 1:
            default:
                this.f44783g = obj == null ? (byte) 0 : (byte) 1;
                return null;
            case 2:
                return m18129X(f44776a, "\u0001\u0004\u0000\u0001\u0001\u0004\u0004\u0000\u0000\u0004\u0001ᔁ\u0000\u0002ᔁ\u0001\u0003ᔁ\u0002\u0004ᔁ\u0003", new Object[]{"b", VCYBIzY.MchTyvw, voNZjxiJou.kyJXWOEw, "e", "f"});
            case 3:
                return new nvs();
            case 4:
                return new nxl(f44776a);
            case 5:
                return f44776a;
            case 6:
                nzd nxmVar = f44777h;
                if (nxmVar == null) {
                    synchronized (nvs.class) {
                        nxmVar = f44777h;
                        if (nxmVar == null) {
                            nxmVar = new nxm(f44776a);
                            f44777h = nxmVar;
                        }
                        break;
                    }
                }
                return nxmVar;
        }
    }
}
