package p000;

import java.util.HashMap;
import java.util.Map;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes2.dex */
public enum jxk {
    f35026a(3, jxm.AAC),
    f35027b(5, jxm.AAC),
    HE_AAC(4, jxm.AAC),
    AMR_NB(1, jxm.AMR_NB),
    AMR_WB(2, jxm.AMR_WB),
    VORBIS(6, jxm.VORBIS);


    /* JADX INFO: renamed from: i */
    private static final Map f35032i = new HashMap();

    /* JADX INFO: renamed from: g */
    public final int f35034g;

    /* JADX INFO: renamed from: h */
    public final jxm f35035h;

    static {
        for (jxk jxkVar : values()) {
            f35032i.put(Integer.valueOf(jxkVar.f35034g), jxkVar);
        }
    }

    jxk(int i, jxm jxmVar) {
        this.f35034g = i;
        this.f35035h = jxmVar;
    }

    /* JADX INFO: renamed from: a */
    public static jxk m13652a(int i) {
        jxk jxkVar = (jxk) f35032i.get(Integer.valueOf(i));
        if (jxkVar != null) {
            return jxkVar;
        }
        throw new IllegalArgumentException("unknown CamcorderProfile value: " + i);
    }
}
