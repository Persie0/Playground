package p000;

import java.util.ArrayList;
import java.util.Map;

/* JADX INFO: loaded from: classes3.dex */
public final class oe5 {

    /* JADX INFO: renamed from: a */
    public final Map f54242a;

    /* JADX INFO: renamed from: b */
    public final ArrayList f54243b;

    public oe5(Map map, ArrayList arrayList) {
        map.getClass();
        this.f54242a = map;
        this.f54243b = arrayList;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof oe5)) {
            return false;
        }
        oe5 oe5Var = (oe5) obj;
        return fa4.m11650l(this.f54242a, oe5Var.f54242a) && this.f54243b.equals(oe5Var.f54243b);
    }

    public final int hashCode() {
        return this.f54243b.hashCode() + (this.f54242a.hashCode() * 31);
    }

    public final String toString() {
        return "LippData(tokenTranslationsBySentenceIndex=" + this.f54242a + ", sentenceTranslations=" + this.f54243b + ")";
    }
}
