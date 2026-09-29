package p000;

import java.util.Map;

/* JADX INFO: loaded from: classes3.dex */
public final class b27 {

    /* JADX INFO: renamed from: a */
    public final Map f7794a;

    /* JADX INFO: renamed from: b */
    public final Map f7795b;

    public b27(Map map, Map map2) {
        map.getClass();
        map2.getClass();
        this.f7794a = map;
        this.f7795b = map2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof b27)) {
            return false;
        }
        b27 b27Var = (b27) obj;
        return fa4.m11650l(this.f7794a, b27Var.f7794a) && fa4.m11650l(this.f7795b, b27Var.f7795b);
    }

    public final int hashCode() {
        return this.f7795b.hashCode() + (this.f7794a.hashCode() * 31);
    }

    public final String toString() {
        return "PageComputeResult(highlights=" + this.f7794a + ", sentenceVocabulary=" + this.f7795b + ")";
    }
}
