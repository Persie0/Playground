package p000;

import java.util.HashMap;
import java.util.Map;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes2.dex */
public enum jyd {
    QUALITY_QCIF(2, jxp.RES_QCIF),
    QUALITY_QVGA(7, jxp.RES_QVGA),
    QUALITY_CIF(3, jxp.RES_CIF),
    QUALITY_480P_4X3(4, jxp.RES_480P_4X3),
    QUALITY_480P(4, jxp.RES_480P),
    f35135f(5, jxp.RES_720P),
    QUALITY_1080P(6, jxp.RES_1080P),
    QUALITY_1080P_3X4(6, jxp.RES_1080P_3X4),
    QUALITY_2160P(8, jxp.RES_2160P),
    QUALITY_2160P_3X4(8, jxp.RES_2160P_3X4);


    /* JADX INFO: renamed from: m */
    private static final Map f35140m = new HashMap();

    /* JADX INFO: renamed from: n */
    private static final Map f35141n = new HashMap();

    /* JADX INFO: renamed from: k */
    public final int f35143k;

    /* JADX INFO: renamed from: l */
    public final jxp f35144l;

    static {
        for (jyd jydVar : values()) {
            f35140m.put(jydVar.f35144l, jydVar);
            f35141n.put(Integer.valueOf(jydVar.f35143k), jydVar);
        }
    }

    jyd(int i, jxp jxpVar) {
        this.f35143k = i;
        this.f35144l = jxpVar;
    }

    /* JADX INFO: renamed from: a */
    public static jyd m13700a(jxp jxpVar) {
        return (jyd) f35140m.get(jxpVar);
    }
}
