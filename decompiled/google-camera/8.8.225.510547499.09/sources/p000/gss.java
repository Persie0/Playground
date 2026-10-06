package p000;

import java.util.HashMap;
import java.util.Map;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public enum gss {
    OFF(0),
    AUTO(1),
    MACRO(2),
    CONTINUOUS_VIDEO(3),
    CONTINUOUS_PICTURE(4),
    EDOF(5);


    /* JADX INFO: renamed from: g */
    public static final Map f26273g = new HashMap();

    /* JADX INFO: renamed from: h */
    public final int f26275h;

    static {
        for (gss gssVar : values()) {
            f26273g.put(Integer.valueOf(gssVar.f26275h), gssVar);
        }
    }

    gss(int i) {
        this.f26275h = i;
    }
}
