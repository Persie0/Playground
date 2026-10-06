package p000;

import java.util.HashMap;
import java.util.Map;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes2.dex */
public enum jyb {
    QUALITY_480P(2002, jxp.RES_480P),
    QUALITY_720P(2003, jxp.RES_720P),
    QUALITY_720P_3X4(2003, jxp.RES_720P_3X4),
    f35122d(2004, jxp.RES_1080P),
    QUALITY_1080P_3X4(2004, jxp.RES_1080P_3X4),
    QUALITY_2160P(2005, jxp.RES_2160P);


    /* JADX INFO: renamed from: h */
    private static final Map f35125h = new HashMap();

    /* JADX INFO: renamed from: i */
    private static final Map f35126i = new HashMap();

    /* JADX INFO: renamed from: g */
    public final int f35128g;

    /* JADX INFO: renamed from: k */
    private final jxp f35129k;

    static {
        for (jyb jybVar : values()) {
            f35125h.put(jybVar.f35129k, jybVar);
            f35126i.put(Integer.valueOf(jybVar.f35128g), jybVar);
        }
    }

    jyb(int i, jxp jxpVar) {
        this.f35128g = i;
        this.f35129k = jxpVar;
    }

    /* JADX INFO: renamed from: a */
    public static jyb m13698a(jxp jxpVar) {
        return (jyb) f35125h.get(jxpVar);
    }
}
