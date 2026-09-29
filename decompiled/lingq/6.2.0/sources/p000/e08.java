package p000;

import java.util.Map;

/* JADX INFO: loaded from: classes3.dex */
public final class e08 {

    /* JADX INFO: renamed from: a */
    public final Map f36540a;

    /* JADX INFO: renamed from: b */
    public final Map f36541b;

    public e08(Map map, Map map2) {
        map.getClass();
        map2.getClass();
        this.f36540a = map;
        this.f36541b = map2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof e08)) {
            return false;
        }
        e08 e08Var = (e08) obj;
        return fa4.m11650l(this.f36540a, e08Var.f36540a) && fa4.m11650l(this.f36541b, e08Var.f36541b);
    }

    public final int hashCode() {
        return this.f36541b.hashCode() + (this.f36540a.hashCode() * 31);
    }

    public final String toString() {
        return "ReaderTranslationState(sentenceTranslations=" + this.f36540a + ", sentenceTranslationsByIndex=" + this.f36541b + ")";
    }
}
