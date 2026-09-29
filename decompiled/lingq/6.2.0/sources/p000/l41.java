package p000;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

/* JADX INFO: loaded from: classes.dex */
public final class l41 {

    /* JADX INFO: renamed from: b */
    public static final l41 f49011b = new l41(new HashMap());

    /* JADX INFO: renamed from: a */
    public final Map f49012a;

    public l41(HashMap map) {
        this.f49012a = Collections.unmodifiableMap(map);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof l41) {
            return this.f49012a.equals(((l41) obj).f49012a);
        }
        return false;
    }

    public final int hashCode() {
        return this.f49012a.hashCode();
    }
}
