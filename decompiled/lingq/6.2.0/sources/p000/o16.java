package p000;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

/* JADX INFO: loaded from: classes.dex */
public final class o16 {

    /* JADX INFO: renamed from: b */
    public static final o16 f53589b = new o16(Collections.unmodifiableMap(new HashMap()));

    /* JADX INFO: renamed from: a */
    public final Map f53590a;

    public o16(Map map) {
        this.f53590a = map;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof o16) {
            return this.f53590a.equals(((o16) obj).f53590a);
        }
        return false;
    }

    public final int hashCode() {
        return this.f53590a.hashCode();
    }

    public final String toString() {
        return this.f53590a.toString();
    }
}
