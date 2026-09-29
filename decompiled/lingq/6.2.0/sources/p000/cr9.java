package p000;

import java.util.Map;
import kotlin.collections.AbstractC3194a;

/* JADX INFO: loaded from: classes.dex */
public final class cr9 {

    /* JADX INFO: renamed from: b */
    public static final cr9 f34432b = new cr9(AbstractC3194a.m15360M());

    /* JADX INFO: renamed from: a */
    public final Map f34433a;

    public cr9(Map map) {
        this.f34433a = map;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof cr9) {
            return fa4.m11650l(this.f34433a, ((cr9) obj).f34433a);
        }
        return false;
    }

    public final int hashCode() {
        return this.f34433a.hashCode();
    }

    public final String toString() {
        return "Tags(tags=" + this.f34433a + ')';
    }
}
