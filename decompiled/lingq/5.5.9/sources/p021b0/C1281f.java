package p021b0;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;

/* JADX INFO: renamed from: b0.f */
/* JADX INFO: loaded from: classes.dex */
public final class C1281f {

    /* JADX INFO: renamed from: a */
    public final HashMap f7967a;

    /* JADX INFO: renamed from: b */
    public Map f7968b;

    public C1281f(int i10) {
        if (i10 == 1) {
            this.f7967a = new HashMap();
        } else {
            this.f7967a = new LinkedHashMap();
            this.f7968b = new LinkedHashMap();
        }
    }
}
