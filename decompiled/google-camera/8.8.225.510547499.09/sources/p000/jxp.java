package p000;

import java.util.HashMap;
import java.util.Map;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes2.dex */
public enum jxp {
    RES_UNKNOWN(-1, -1),
    RES_QCIF(176, 144),
    RES_QVGA(320, 240),
    RES_CIF(352, 288),
    RES_480P_4X3(640, 480),
    RES_480P(720, 480),
    RES_720P(1280, 720),
    RES_720P_3X4(720, 960),
    RES_1080P(1920, 1080),
    RES_1080P_3X4(1080, 1440),
    RES_2160P(3840, 2160),
    RES_2160P_3X4(2272, 3024);


    /* JADX INFO: renamed from: m */
    public static final Map f35080m = new HashMap();

    /* JADX INFO: renamed from: o */
    private final int f35082o;

    /* JADX INFO: renamed from: p */
    private final int f35083p;

    static {
        for (jxp jxpVar : values()) {
            f35080m.put(new kbc(jxpVar.f35082o, jxpVar.f35083p), jxpVar);
        }
    }

    jxp(int i, int i2) {
        this.f35082o = i;
        this.f35083p = i2;
    }

    /* JADX INFO: renamed from: a */
    public final long m13660a() {
        return ((long) this.f35082o) * ((long) this.f35083p);
    }

    /* JADX INFO: renamed from: b */
    public final kbc m13661b() {
        return new kbc(this.f35082o, this.f35083p);
    }

    /* JADX INFO: renamed from: c */
    public final boolean m13662c() {
        return RES_1080P.equals(this) || RES_1080P_3X4.equals(this);
    }

    /* JADX INFO: renamed from: d */
    public final boolean m13663d() {
        return this == RES_2160P || this == RES_2160P_3X4;
    }
}
